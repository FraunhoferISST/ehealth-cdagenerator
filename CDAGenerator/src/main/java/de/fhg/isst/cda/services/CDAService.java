package de.fhg.isst.cda.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.hl7.v3.cda.*;
import org.xml.sax.SAXException;

import de.fhg.isst.cda.CDADocument;
import de.fhg.isst.cda.choices.Person;
import de.fhg.isst.cda.choices.author.AuthoringDevice;
import de.fhg.isst.cda.choices.body.NonXMLBody;
import de.fhg.isst.cda.choices.body.StructuredBody;
import de.fhg.isst.cda.choices.clinicalstatements.Act;
import de.fhg.isst.cda.choices.clinicalstatements.Component4;
import de.fhg.isst.cda.choices.clinicalstatements.Consumable;
import de.fhg.isst.cda.choices.clinicalstatements.Criterion;
import de.fhg.isst.cda.choices.clinicalstatements.Encounter;
import de.fhg.isst.cda.choices.clinicalstatements.ManufacturedProduct;
import de.fhg.isst.cda.choices.clinicalstatements.Observation;
import de.fhg.isst.cda.choices.clinicalstatements.ObservationMedia;
import de.fhg.isst.cda.choices.clinicalstatements.ObservationRange;
import de.fhg.isst.cda.choices.clinicalstatements.OrganizationPartOf;
import de.fhg.isst.cda.choices.clinicalstatements.Organizer;
import de.fhg.isst.cda.choices.clinicalstatements.Precondition;
import de.fhg.isst.cda.choices.clinicalstatements.Procedure;
import de.fhg.isst.cda.choices.clinicalstatements.Product;
import de.fhg.isst.cda.choices.clinicalstatements.Reference;
import de.fhg.isst.cda.choices.clinicalstatements.ReferenceRange;
import de.fhg.isst.cda.choices.clinicalstatements.RegionOfInterest;
import de.fhg.isst.cda.choices.clinicalstatements.SubstanceAdministration;
import de.fhg.isst.cda.choices.clinicalstatements.Supply;
import de.fhg.isst.cda.choices.drugorothermaterial.LabeledDrug;
import de.fhg.isst.cda.choices.drugorothermaterial.Material;
import de.fhg.isst.cda.choices.entity.Device;
import de.fhg.isst.cda.choices.entity.PlayingEntity;
import de.fhg.isst.cda.choices.externalactchoice.ExternalAct;
import de.fhg.isst.cda.choices.externalactchoice.ExternalDocument;
import de.fhg.isst.cda.choices.externalactchoice.ExternalObservation;
import de.fhg.isst.cda.choices.externalactchoice.ExternalProcedure;
import de.fhg.isst.cda.choices.guardian.Organization;
import de.fhg.isst.cda.choices.informant.AssignedEntity;
import de.fhg.isst.cda.choices.informant.RelatedEntity;
import de.fhg.isst.cda.classes.Address;
import de.fhg.isst.cda.classes.AssignedAuthor;
import de.fhg.isst.cda.classes.AssociatedEntity;
import de.fhg.isst.cda.classes.Authenticator;
import de.fhg.isst.cda.classes.Author;
import de.fhg.isst.cda.classes.Authorization;
import de.fhg.isst.cda.classes.ClinicalStatement;
import de.fhg.isst.cda.classes.Code;
import de.fhg.isst.cda.classes.Component2;
import de.fhg.isst.cda.classes.Component3;
import de.fhg.isst.cda.classes.Component5;
import de.fhg.isst.cda.classes.ComponentOf;
import de.fhg.isst.cda.classes.Consent;
import de.fhg.isst.cda.classes.Custodian;
import de.fhg.isst.cda.classes.DataEnterer;
import de.fhg.isst.cda.classes.DocumentationOf;
import de.fhg.isst.cda.classes.EffectiveTime;
import de.fhg.isst.cda.classes.EncompassingEncounter;
import de.fhg.isst.cda.classes.EncounterParticipant;
import de.fhg.isst.cda.classes.Entity;
import de.fhg.isst.cda.classes.Entry;
import de.fhg.isst.cda.classes.EntryRelationship;
import de.fhg.isst.cda.classes.Guardian;
import de.fhg.isst.cda.classes.HealthCareFacility;
import de.fhg.isst.cda.classes.ID;
import de.fhg.isst.cda.classes.InFulfillmentOf;
import de.fhg.isst.cda.classes.Informant;
import de.fhg.isst.cda.classes.InformationRecipient;
import de.fhg.isst.cda.classes.IntendedRecipient;
import de.fhg.isst.cda.classes.LanguageCommunication;
import de.fhg.isst.cda.classes.LegalAuthenticator;
import de.fhg.isst.cda.classes.Location;
import de.fhg.isst.cda.classes.MaintainedEntity;
import de.fhg.isst.cda.classes.Order;
import de.fhg.isst.cda.classes.ParentDocument;
import de.fhg.isst.cda.classes.Participant;
import de.fhg.isst.cda.classes.Participant2;
import de.fhg.isst.cda.classes.ParticipantRole;
import de.fhg.isst.cda.classes.Patient;
import de.fhg.isst.cda.classes.PatientRole;
import de.fhg.isst.cda.classes.Performer;
import de.fhg.isst.cda.classes.Performer2;
import de.fhg.isst.cda.classes.Place;
import de.fhg.isst.cda.classes.ProviderOrganization;
import de.fhg.isst.cda.classes.Quantity;
import de.fhg.isst.cda.classes.RecordTarget;
import de.fhg.isst.cda.classes.RelatedDocument;
import de.fhg.isst.cda.classes.RelatedSubject;
import de.fhg.isst.cda.classes.ResponsibleParty;
import de.fhg.isst.cda.classes.Section;
import de.fhg.isst.cda.classes.ServiceEvent;
import de.fhg.isst.cda.classes.Specimen;
import de.fhg.isst.cda.classes.SpecimenRole;
import de.fhg.isst.cda.classes.Subject;
import de.fhg.isst.cda.classes.SubjectPerson;
import de.fhg.isst.cda.classes.Telecom;
import de.fhg.isst.cda.exceptions.MissingAttributeException;
import de.fhg.isst.cda.exceptions.MissingNodeException;
import java.io.Serializable;
import java.io.StringWriter;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Element;

// TODO: Auto-generated Javadoc
/**
 * The Class CDAService.
 */
public class CDAService {

	/** The doc. */
	private POCDMT000040ClinicalDocument doc;

	/** The factory. */
	private ObjectFactory factory;

	/**
	 * Instantiates a new CDA Service.
	 */
	public CDAService() {
		this.factory = new ObjectFactory();
	}
	
	/**
	 * Save.
	 * 
	 * @param xmlPath
	 *            the xml path
	 * @param mapDocument
	 *            the map document
	 * @throws MissingAttributeException
	 *             the missing attribute exception
	 * @throws MissingNodeException
	 *             the missing node exception
	 * @throws FileNotFoundException
	 *             the file not found exception
	 * @throws JAXBException
	 *             the jAXB exception
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public void save(String xmlPath, CDADocument mapDocument) throws MissingAttributeException, MissingNodeException, FileNotFoundException,
			JAXBException, IOException {
		POCDMT000040ClinicalDocument saveDoc = this.generate(mapDocument);
                
		OutputStream os = new FileOutputStream(xmlPath);
		JAXBContext jaxbcontext = JAXBContext.newInstance(POCDMT000040ClinicalDocument.class);
		Marshaller marshaller = jaxbcontext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		marshaller.marshal(saveDoc, os);
		os.close();
	}
        /**
         * Save.
         * 
         * @param file
         * @param mapDocument
         * @throws MissingAttributeException
         * @throws MissingNodeException
         * @throws FileNotFoundException
         * @throws JAXBException
         * @throws IOException 
         */
        public void save(File file, CDADocument mapDocument)throws MissingAttributeException, MissingNodeException, FileNotFoundException,
			JAXBException, IOException {
		POCDMT000040ClinicalDocument saveDoc = this.generate(mapDocument);
                
		OutputStream os = new FileOutputStream(file);
		JAXBContext jaxbcontext = JAXBContext.newInstance(POCDMT000040ClinicalDocument.class);
		Marshaller marshaller = jaxbcontext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		marshaller.marshal(saveDoc, os);
		os.close();
        }
		
		public String getCdaString(CDADocument mapDocument)throws MissingAttributeException, MissingNodeException, FileNotFoundException,
			JAXBException, IOException {
			POCDMT000040ClinicalDocument saveDoc = this.generate(mapDocument);

			StringWriter writer = new StringWriter();
			JAXBContext jaxbcontext = JAXBContext.newInstance(POCDMT000040ClinicalDocument.class);
			Marshaller marshaller = jaxbcontext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			marshaller.marshal(saveDoc, writer);
			
			return writer.toString();
        }

	/**
	 * Prints the.
	 * 
	 * @param mapDocument
	 *            the map document
	 * @throws MissingAttributeException
	 *             the missing attribute exception
	 * @throws MissingNodeException
	 *             the missing node exception
	 * @throws FileNotFoundException
	 *             the file not found exception
	 * @throws JAXBException
	 *             the jAXB exception
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public void print(CDADocument mapDocument) throws MissingAttributeException, MissingNodeException, FileNotFoundException, JAXBException,
			IOException {
		POCDMT000040ClinicalDocument printDoc = this.generate(mapDocument);
		JAXBContext jaxbcontext = JAXBContext.newInstance(POCDMT000040ClinicalDocument.class);
		Marshaller marshaller = jaxbcontext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		marshaller.marshal(printDoc, System.out);
	}

	/**
	 * Validate.
	 * 
	 * @param xsdPath
	 *            the xsd path
	 * @param xmlPath
	 *            the xml path
	 * @return true, if successful
	 */
	public boolean validate(String xsdPath, String xmlPath) {
		boolean state = false;
		try {
			SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			Schema schema = factory.newSchema(new File(xsdPath));
			Validator validator = schema.newValidator();
			validator.validate(new StreamSource(new File(xmlPath)));
			state = true;
		} catch (SAXException | IOException e) {
			e.printStackTrace();
		}
		return state;
	}

	/**
	 * Generate.
	 * 
	 * @param mapDocument
	 *            the map document
	 * @return the POCDMT000040ClinicalDocument
	 * @throws MissingNodeException
	 *             the missing node exception
	 * @throws MissingAttributeException
	 *             the missing attribute exception
	 */
	private POCDMT000040ClinicalDocument generate(CDADocument mapDocument) throws MissingNodeException, MissingAttributeException {
		// CDA Document variables
		this.doc = new POCDMT000040ClinicalDocument();
                
                if (!mapDocument.getRealmCode().isEmpty()) {
                    for (Code realmCode : mapDocument.getRealmCode()){
                        doc.getRealmCode().add(this.createCDACS(realmCode));
                    }
                }
                               
		POCDMT000040InfrastructureRootTypeId cdaTypeId = factory.createPOCDMT000040InfrastructureRootTypeId();
		ID mapTypeId = mapDocument.getTypeID();
		cdaTypeId.setRoot(mapTypeId.getRoot());
		cdaTypeId.setExtension(mapTypeId.getExtensions());
		this.doc.setTypeId(cdaTypeId);
                
                if (!mapDocument.getTemplateID().isEmpty()){
                    for (ID templateID : mapDocument.getTemplateID()){
                        doc.getTemplateId().add(this.createCDAId(templateID));
                    }
                }

		this.doc.setClassCode(ActClinicalDocument.fromValue(mapDocument.getClassCode().getValue()));
		this.doc.getMoodCode().add(mapDocument.getMoodCode().getValue());

		if (mapDocument.getId() == null) {
			throw new MissingAttributeException("ClinicalDocument.ID");
		}
		this.doc.setId(new II(mapDocument.getId().getRoot(), mapDocument.getId().getExtensions()));

		if (mapDocument.getCode() == null) {
			throw new MissingAttributeException("ClinicalDocument.code");
		}
		this.doc.setCode(this.createCDACE(mapDocument.getCode()));

		if (mapDocument.getTitle() != null) {
			ST title = factory.createST();
			title.getContent().add(mapDocument.getTitle());
			this.doc.setTitle(title);
		}

		if (mapDocument.getEffectiveTime() == null) {
			throw new MissingAttributeException("ClinicalDocument.effectiveTime");
		}
		TS effectiveTime = factory.createTS();
		effectiveTime.setValue(mapDocument.getEffectiveTime().getValue());
		this.doc.setEffectiveTime(effectiveTime);

		if (mapDocument.getConfidentialityCode() == null) {
			throw new MissingAttributeException("ClinicalDocument.confidentialityCode");
		}
		CE confidentialityCode = factory.createCE();
		confidentialityCode.setCode(mapDocument.getConfidentialityCode().getCode());
		confidentialityCode.setCodeSystem(mapDocument.getConfidentialityCode().getCodeSystem());
		confidentialityCode.setCodeSystemName(mapDocument.getConfidentialityCode().getCodeSystemName());
		confidentialityCode.setCodeSystemVersion(mapDocument.getConfidentialityCode().getCodeSystemVersion());
		confidentialityCode.setDisplayName(mapDocument.getConfidentialityCode().getDisplayName());
		if(mapDocument.getConfidentialityCode().getOriginalText() != null) {
			ED originalText = new ED();
			originalText.getContent().add(mapDocument.getConfidentialityCode().getOriginalText());
			confidentialityCode.setOriginalText(originalText);
		}
		this.doc.setConfidentialityCode(confidentialityCode);

		if (mapDocument.getLanguageCode() != null) {
			this.doc.setLanguageCode(this.createCDACS(mapDocument.getLanguageCode()));
		}

		if (mapDocument.getSetID() != null) {
			this.doc.setSetId(this.createCDAId(mapDocument.getSetID()));
		}

		if (mapDocument.getVersionNumber() != null) {
			INT versionNumber = factory.createINT();
			versionNumber.setValue(new BigInteger(mapDocument.getVersionNumber().getValue()));
			this.doc.setVersionNumber(versionNumber);
		}

		if (mapDocument.getCopyTime() != null) {
			TS copyTime = factory.createTS();
			copyTime.setValue(mapDocument.getCopyTime().getValue());
			this.doc.setCopyTime(copyTime);
		}

		if (mapDocument.getRecordTarget() == null) {
			throw new MissingNodeException("RecordTarget");
		}

		// recordTarget
		if (!mapDocument.getRecordTarget().isEmpty()) {
			for (RecordTarget mapRecordTarget : mapDocument.getRecordTarget()) {
				POCDMT000040RecordTarget cdaRecordTarget = factory.createPOCDMT000040RecordTarget();

				if (mapRecordTarget.getTypeCode() == null) {
					throw new MissingAttributeException("RecordTarget.TypeCode");
				}
				cdaRecordTarget.getTypeCode().add(mapRecordTarget.getTypeCode());

				if (mapRecordTarget.getContextControlCode() == null) {
					throw new MissingAttributeException("RecordTarget.ContextControlCode");
				}
				cdaRecordTarget.setContextControlCode(mapRecordTarget.getContextControlCode());

				if (!mapRecordTarget.getPatientRoles().isEmpty()) {
					for (PatientRole mapPatientRole : mapRecordTarget.getPatientRoles()) {
						POCDMT000040PatientRole cdaPatientRole = factory.createPOCDMT000040PatientRole();

						if (mapPatientRole.getClassCode() == null) {
							throw new MissingAttributeException("PatientRole.ClassCode");
						}
						cdaPatientRole.getClassCode().add(mapPatientRole.getClassCode());

						if (mapPatientRole.getIds().isEmpty()) {
							throw new MissingAttributeException("RecordTarget.Id");
						}
						for (ID mapId : mapPatientRole.getIds()) {
							cdaPatientRole.getId().add(this.createCDAId(mapId));
						}

						if (!mapPatientRole.getAddrs().isEmpty()) {
							for (Address mapAddress : mapPatientRole.getAddrs()) {
								cdaPatientRole.getAddr().add(this.createCDAAddress(mapAddress));
							}
						}

						if (!mapPatientRole.getTelecoms().isEmpty()) {
							for (Telecom mapTelecom : mapPatientRole.getTelecoms()) {
								cdaPatientRole.getTelecom().add(this.createCDATelecom(mapTelecom));
							}
						}

						if (mapPatientRole.getPatient() != null) {
							POCDMT000040Patient cdaPatient = factory.createPOCDMT000040Patient();
							Patient mapPatient = mapPatientRole.getPatient();

							if (mapPatient.getClassCode() == null) {
								throw new MissingAttributeException("Patient.ClassCode");
							}
							cdaPatient.getClassCode().add(mapPatient.getClassCode());

							if (mapPatient.getDeterminerCode() == null) {
								throw new MissingAttributeException("Patient.DeterminerCode");
							}
							cdaPatient.setDeterminerCode(mapPatient.getDeterminerCode());

							if (mapPatient.getId() != null) {
								cdaPatient.setId(this.createCDAId(mapPatient.getId()));
							}
							if (mapPatient.getGivenName() != null || mapPatient.getFamilyName() != null) {
								cdaPatient.getName().add(
										this.createCDAName(mapPatient.getGivenName(), mapPatient.getFamilyName(), mapPatient.getPrefix(), mapPatient.getSuffix()));
							}
							if (mapPatient.getAdministrativeGenderCode() != null) {
								cdaPatient.setAdministrativeGenderCode(this.createCDACE(mapPatient.getAdministrativeGenderCode()));
							}
							if (mapPatient.getBirthTime() != null) {
								TS birthTime = factory.createTS();
								birthTime.setValue(mapPatient.getBirthTime());
								cdaPatient.setBirthTime(birthTime);
							}

							if (mapPatient.getMaritalStatusCode() != null) {
								cdaPatient.setMaritalStatusCode(this.createCDACE(mapPatient.getMaritalStatusCode()));
							}

							if (mapPatient.getReligiousAffiliationCode() != null) {
								cdaPatient.setReligiousAffiliationCode(this.createCDACE(mapPatient.getReligiousAffiliationCode()));
							}

							if (mapPatient.getRaceCode() != null) {
								cdaPatient.setRaceCode(this.createCDACE(mapPatient.getRaceCode()));
							}

							if (mapPatient.getEthnicGroupCode() != null) {
								cdaPatient.setEthnicGroupCode(this.createCDACE(mapPatient.getEthnicGroupCode()));
							}

							if (!mapPatient.getGuardians().isEmpty()) {
								for (Guardian mapGuardian : mapPatient.getGuardians()) {
									POCDMT000040Guardian cdaGuardian = new POCDMT000040Guardian();
									CE guardianClassCode = factory.createCE();

									if (mapGuardian.getClassCode() == null) {
										throw new MissingAttributeException("Guardian.ClassCode");
									}
									guardianClassCode.setCode(mapGuardian.getClassCode());
									cdaGuardian.setCode(guardianClassCode);

									if (!mapGuardian.getIds().isEmpty()) {
										for (ID mapId : mapGuardian.getIds()) {
											cdaGuardian.getId().add(this.createCDAId(mapId));
										}
										cdaGuardian.setTypeId(cdaTypeId);
									}

									if (mapGuardian.getCode() != null) {
										cdaGuardian.setCode(this.createCDACE(mapGuardian.getCode()));
									}

									if (!mapGuardian.getAddresses().isEmpty()) {
										for (Address mapAddress : mapGuardian.getAddresses()) {
											cdaGuardian.getAddr().add(this.createCDAAddress(mapAddress));
										}
									}

									if (!mapGuardian.getTelecoms().isEmpty()) {
										for (Telecom mapTelecom : mapGuardian.getTelecoms()) {
											cdaGuardian.getTelecom().add(this.createCDATelecom(mapTelecom));
										}
									}
									cdaPatient.getGuardian().add(cdaGuardian);

									if (mapGuardian.getGuardianChoice() instanceof Person) {
										POCDMT000040Person cdaGuardianPerson = factory.createPOCDMT000040Person();
										Person mapGuardianPerson = (Person) mapGuardian.getGuardianChoice();
										if (mapGuardianPerson.getClassCode() == null) {
											throw new MissingAttributeException("GuardianPerson.ClassCode");
										}
										cdaGuardianPerson.getClassCode().add(mapGuardianPerson.getClassCode());

										if (mapGuardianPerson.getDeterminerCode() == null) {
											throw new MissingAttributeException("GuardianPerson.DeterminerCode");
										}
										cdaGuardianPerson.setDeterminerCode(mapGuardianPerson.getDeterminerCode());

										if (mapGuardianPerson.getGivenName() != null || mapGuardianPerson.getFamilyName() != null) {
											cdaGuardianPerson.getName().add(
													this.createCDAName(mapGuardianPerson.getGivenName(), mapGuardianPerson.getFamilyName(), mapGuardianPerson.getPrefix(),
															mapGuardianPerson.getSuffix()));
										}
										cdaGuardian.setGuardianPerson(cdaGuardianPerson);

									} else if (mapGuardian.getGuardianChoice() instanceof Organization) {
										Organization mapGuardianOrganization = (Organization) mapGuardian.getGuardianChoice();
										cdaGuardian.setGuardianOrganization(this.createCDAOrganization(mapGuardianOrganization));
									} else {
										throw new MissingNodeException("Choice: Guardian.GuardianOrganization or Guardian.GuardianPerson");
									}
								}
							}

							if (mapPatient.getBirthPlace() != null) {
								POCDMT000040Birthplace birthPlace = factory.createPOCDMT000040Birthplace();
								birthPlace.getClassCode().add("BIRTHPL");

								POCDMT000040Place place = factory.createPOCDMT000040Place();
								place.setClassCode(EntityClassPlace.PLC);
								if (mapPatient.getBirthPlace().getDeterminerCode() == null) {
									throw new MissingAttributeException("Place.DeterminerCode");
								}
								place.setDeterminerCode(mapPatient.getBirthPlace().getDeterminerCode());
								if (mapPatient.getBirthPlace().getName() != null) {
									place.setName(this.createCDAName(mapPatient.getBirthPlace().getName(), "","", ""));
								}
								if (!mapPatientRole.getAddrs().isEmpty()) {
									for (Address mapAddress : mapPatientRole.getAddrs()) {
										place.setAddr(this.createCDAAddress(mapAddress));
									}
								}
								birthPlace.setPlace(place);
								cdaPatient.setBirthplace(birthPlace);
							}

							cdaPatientRole.setPatient(cdaPatient);
							if (!mapPatientRole.getLanguageCommunications().isEmpty()) {
								POCDMT000040LanguageCommunication cdaLanguageCommunication = factory.createPOCDMT000040LanguageCommunication();
								for (LanguageCommunication mapLanguageCommunication : mapPatientRole.getLanguageCommunications()) {

									if (mapLanguageCommunication.getLanguageCode() != null) {
										cdaLanguageCommunication.setLanguageCode(this.createCDACS((Code) mapLanguageCommunication.getLanguageCode()));
									}
									if (mapLanguageCommunication.getModeCode() != null) {
										cdaLanguageCommunication.setModeCode(this.createCDACE(mapLanguageCommunication.getModeCode()));
									}
									if (mapLanguageCommunication.getProficiencyLevelCode() != null) {
										cdaLanguageCommunication.setProficiencyLevelCode(this.createCDACE(mapLanguageCommunication
												.getProficiencyLevelCode()));
									}
									if (mapLanguageCommunication.getPreferenceInd() != null) {
										BL prefrenceInd = factory.createBL();
										prefrenceInd.setValue(mapLanguageCommunication.getPreferenceInd().getValue());
										cdaLanguageCommunication.setPreferenceInd(prefrenceInd);
									}
								}
							}

							if (mapDocument.getProviderOrganization() != null) {
								POCDMT000040Organization cdaProviderOrganization = factory.createPOCDMT000040Organization();
								ProviderOrganization mapProviderOrganization = mapDocument.getProviderOrganization();
								cdaProviderOrganization.setClassCode("ORG");
								cdaProviderOrganization.setDeterminerCode("INSTANCE");

								if (!mapProviderOrganization.getIds().isEmpty()) {
									for (ID mapId : mapProviderOrganization.getIds()) {
										cdaProviderOrganization.getId().add(this.createCDAId(mapId));
									}
								}

								if (mapProviderOrganization.getName() != null) {
									ON providerOrganizationName = factory.createON();
									providerOrganizationName.getContent().add(mapProviderOrganization.getName());
									cdaProviderOrganization.getName().add(providerOrganizationName);
								}

								if (!mapProviderOrganization.getTelecoms().isEmpty()) {
									for (Telecom mapTelecom : mapProviderOrganization.getTelecoms()) {
										cdaProviderOrganization.getTelecom().add(this.createCDATelecom(mapTelecom));
									}
								}

								if (!mapProviderOrganization.getAddrs().isEmpty()) {
									for (Address mapAddress : mapProviderOrganization.getAddrs()) {
										cdaProviderOrganization.getAddr().add(this.createCDAAddress(mapAddress));
									}
								}
								if (mapProviderOrganization.getStandardIndustryClassCode() != null) {
									cdaProviderOrganization.setStandardIndustryClassCode(this.createCDACE(mapProviderOrganization
											.getStandardIndustryClassCode()));
								}

								POCDMT000040OrganizationPartOf cdaOrganizationPartOf = factory.createPOCDMT000040OrganizationPartOf();
								OrganizationPartOf mapOrganizationPartOf = mapProviderOrganization.getOrganizationPartOf();

								cdaOrganizationPartOf.getClassCode().add("PART");

								if (!mapOrganizationPartOf.getIds().isEmpty()) {
									for (ID mapId : mapOrganizationPartOf.getIds()) {
										if (mapId.getRoot() != null && mapId.getExtensions() != null) {
											cdaOrganizationPartOf.getId().add(this.createCDAId(mapId));
										} else if (mapId.getNullFlavour() != null) {
											II cdaId = factory.createII();
											cdaId.getNullFlavor().add(mapId.getNullFlavour());
											cdaOrganizationPartOf.getId().add(cdaId);
										} else {
											throw new MissingAttributeException("OrganizationPartOf.ID");
										}
									}
								}

								if (mapOrganizationPartOf.getCode() != null) {
									cdaOrganizationPartOf.setCode(this.createCDACE(mapOrganizationPartOf.getCode()));
								}

								if (mapOrganizationPartOf.getStatusCode() != null) {
									cdaOrganizationPartOf.setStatusCode(this.createCDACS(new Code(mapOrganizationPartOf.getStatusCode().getValue(), "")));
								}

								if (mapOrganizationPartOf.getEffectiveTime() != null) {
									IVLTS organizationPartOfEffectiveTime = factory.createIVLTS();
									organizationPartOfEffectiveTime.setValue(mapOrganizationPartOf.getEffectiveTime());
									cdaOrganizationPartOf.setEffectiveTime(organizationPartOfEffectiveTime);
								}

								if (mapOrganizationPartOf.getWholeOrganization() != null) {
									POCDMT000040Organization cdaWholeOrganization = factory.createPOCDMT000040Organization();
									cdaWholeOrganization.setClassCode("ORG");
									cdaWholeOrganization.setDeterminerCode("INSTANCE");
									if (!mapOrganizationPartOf.getWholeOrganization().getIds().isEmpty()) {
										for (ID mapId : mapProviderOrganization.getIds()) {
											cdaWholeOrganization.getId().add(this.createCDAId(mapId));
										}
									}

									if (mapOrganizationPartOf.getWholeOrganization().getName() != null) {
										ON wholeOrganizationName = factory.createON();
										wholeOrganizationName.getContent().add(mapOrganizationPartOf.getWholeOrganization().getName());
										cdaWholeOrganization.getName().add(wholeOrganizationName);
									}

									if (!mapOrganizationPartOf.getWholeOrganization().getTelecoms().isEmpty()) {
										for (Telecom mapTelecom : mapOrganizationPartOf.getWholeOrganization().getTelecoms()) {
											cdaWholeOrganization.getTelecom().add(this.createCDATelecom(mapTelecom));
										}
									}

									if (!mapOrganizationPartOf.getWholeOrganization().getAddrs().isEmpty()) {
										for (Address mapAddress : mapOrganizationPartOf.getWholeOrganization().getAddrs()) {
											cdaWholeOrganization.getAddr().add(this.createCDAAddress(mapAddress));
										}
									}
									if (mapOrganizationPartOf.getWholeOrganization().getStandardIndustryClassCode() != null) {
										cdaWholeOrganization.setStandardIndustryClassCode(this.createCDACE(mapOrganizationPartOf
												.getWholeOrganization().getStandardIndustryClassCode()));
									}
									cdaOrganizationPartOf.setWholeOrganization(cdaWholeOrganization);
								}

								cdaPatientRole.setProviderOrganization(cdaProviderOrganization);
								cdaProviderOrganization.setAsOrganizationPartOf(cdaOrganizationPartOf);
							}
							cdaPatientRole.setPatient(cdaPatient);
						}
						cdaRecordTarget.setPatientRole(cdaPatientRole);
					}
				} else {
					throw new MissingNodeException("RecordTarget.patientRole");
				}
				this.doc.getRecordTarget().add(cdaRecordTarget);
			}
		} else {
			throw new MissingNodeException("CDADocument.RecordTarget");
		}

		// author
		if (!mapDocument.getAuthors().isEmpty()) {
			for (Author mapAuthor : mapDocument.getAuthors()) {
				this.doc.getAuthor().add(this.createCDAAuthor(mapAuthor));
			}
		} else {
			throw new MissingNodeException("CDADocument.Autor");
		}

		// dataEnterer
		if (mapDocument.getDataEnterer() != null) {
			POCDMT000040DataEnterer cdaDataEnterer = factory.createPOCDMT000040DataEnterer();
			DataEnterer mapDataEnterer = mapDocument.getDataEnterer();

			if (mapDataEnterer.getTypeCode() == null) {
				throw new MissingAttributeException("DataEnterer.TypeCode");
			}
			cdaDataEnterer.getTypeCode().add(mapDataEnterer.getTypeCode());

			if (mapDataEnterer.getContextControlCode() == null) {
				throw new MissingAttributeException("DataEnterer.ContextControlCode");
			}
			cdaDataEnterer.setContextControlCode(mapDataEnterer.getContextControlCode());

			if (mapDataEnterer.getTime() != null) {
				TS dataEntererTime = factory.createTS();
				dataEntererTime.setValue(mapDataEnterer.getTime());
				cdaDataEnterer.setTime(dataEntererTime);
			}

			if (mapDataEnterer.getAssignedEntity() != null) {
				POCDMT000040AssignedEntity cdaAssignedEntity = factory.createPOCDMT000040AssignedEntity();
				AssignedEntity mapAssignedEntity = mapDataEnterer.getAssignedEntity();
				cdaAssignedEntity.setClassCode("ASSIGNED");

				if (mapAssignedEntity.getIds().isEmpty()) {
					throw new MissingAttributeException("AssignedEntity.ID");
				}

				for (ID mapId : mapAssignedEntity.getIds()) {
					cdaAssignedEntity.getId().add(this.createCDAId(mapId));
				}

				if (mapAssignedEntity.getCode() != null) {
					cdaAssignedEntity.setCode(this.createCDACE(mapAssignedEntity.getCode()));
				}

				if (!mapAssignedEntity.getAddresses().isEmpty()) {
					for (Address mapAddress : mapAssignedEntity.getAddresses()) {
						cdaAssignedEntity.getAddr().add(this.createCDAAddress(mapAddress));
					}
				}

				if (!mapAssignedEntity.getTelecoms().isEmpty()) {
					for (Telecom mapTelecom : mapAssignedEntity.getTelecoms()) {
						cdaAssignedEntity.getTelecom().add(this.createCDATelecom(mapTelecom));
					}
				}

				if (mapAssignedEntity.getAssignedPerson() != null) {
					POCDMT000040Person cdaAssignedPerson = factory.createPOCDMT000040Person();
					Person mapAssignedPerson = mapAssignedEntity.getAssignedPerson();
					cdaAssignedPerson.getClassCode().add("PSN");
					cdaAssignedPerson.setDeterminerCode("INSTANCE");

					if (mapAssignedPerson.getGivenName() != null || mapAssignedPerson.getFamilyName() != null
							|| mapAssignedPerson.getSuffix() != null) {
						cdaAssignedPerson.getName()
								.add(this.createCDAName(mapAssignedPerson.getGivenName(), mapAssignedPerson.getFamilyName(), mapAssignedPerson.getPrefix(),
										mapAssignedPerson.getSuffix()));
					}

					cdaAssignedEntity.setAssignedPerson(cdaAssignedPerson);
				}

				if (mapAssignedEntity.getRepresentedOrganization() != null) {
					cdaAssignedEntity.setRepresentedOrganization(this.createCDAOrganization(mapAssignedEntity.getRepresentedOrganization()));
				}
				cdaDataEnterer.setAssignedEntity(cdaAssignedEntity);
			}
			this.doc.setDataEnterer(cdaDataEnterer);
		}

		// informant
		if (!mapDocument.getInformants().isEmpty()) {
			for (Informant mapInformant : mapDocument.getInformants()) {
				POCDMT000040Informant12 cdaInformant = factory.createPOCDMT000040Informant12();

				if (mapInformant.getTypeCode().getValue() == null) {
					throw new MissingAttributeException("Informant.TypeCode");
				}
				cdaInformant.getTypeCode().add(mapInformant.getTypeCode().getValue());

				if (mapInformant.getContextControlCode() == null) {
					throw new MissingAttributeException("Informant.ContextControlCode");
				}
				cdaInformant.setContextControlCode(mapInformant.getContextControlCode().getValue());

				if (mapInformant.getInformantChoice() instanceof AssignedEntity) {
					cdaInformant.setAssignedEntity(this.createCDAAssignedEntity((AssignedEntity) mapInformant.getInformantChoice()));
				} else if (mapInformant.getInformantChoice() instanceof RelatedEntity) {
					POCDMT000040RelatedEntity cdaInformantRelatedEntity = factory.createPOCDMT000040RelatedEntity();
					RelatedEntity mapInformantRelatedEntity = (RelatedEntity) mapInformant.getInformantChoice();

//					cdaInformantRelatedEntity.getClassCode().add("CNE");
					if (mapInformantRelatedEntity.getClassCode() != null) {
						cdaInformantRelatedEntity.getClassCode().add(mapInformantRelatedEntity.getClassCode());
					} else {
						throw new MissingAttributeException("RelatedEntity needs ClassCode.");
					}
					
					if (mapInformantRelatedEntity.getCode() != null) {
						cdaInformantRelatedEntity.setCode(this.createCDACE(mapInformantRelatedEntity.getCode()));
					}

					if (!mapInformantRelatedEntity.getAddresses().isEmpty()) {
						for (Address mapAddress : mapInformantRelatedEntity.getAddresses()) {
							cdaInformantRelatedEntity.getAddr().add(this.createCDAAddress(mapAddress));
						}
					}

					if (!mapInformantRelatedEntity.getTelecoms().isEmpty()) {
						for (Telecom mapTelecom : mapInformantRelatedEntity.getTelecoms()) {
							cdaInformantRelatedEntity.getTelecom().add(this.createCDATelecom(mapTelecom));
						}
					}

					if (mapInformantRelatedEntity.getEffectiveTime() != null) {
						IVLTS cdaRelatedEntityEffectiveTime = factory.createIVLTS();
						cdaRelatedEntityEffectiveTime.setValue(mapInformantRelatedEntity.getEffectiveTime().getValue());
						cdaInformantRelatedEntity.setEffectiveTime(cdaRelatedEntityEffectiveTime);
					}

					if (mapInformantRelatedEntity.getRelatedPerson() != null) {
						POCDMT000040Person cdaRelatedPerson = factory.createPOCDMT000040Person();
						Person mapRelatedPerson = mapInformantRelatedEntity.getRelatedPerson();

						cdaRelatedPerson.getClassCode().add("PSN");
						cdaRelatedPerson.setDeterminerCode("INSTANCE");

						if (mapRelatedPerson.getGivenName() != null || mapRelatedPerson.getFamilyName() != null
								|| mapRelatedPerson.getSuffix() != null) {
							cdaRelatedPerson.getName().add(
									this.createCDAName(mapRelatedPerson.getGivenName(), mapRelatedPerson.getFamilyName(), mapRelatedPerson.getPrefix(),
											mapRelatedPerson.getSuffix()));
						}

						cdaInformantRelatedEntity.setRelatedPerson(cdaRelatedPerson);
					}

					cdaInformant.setRelatedEntity(cdaInformantRelatedEntity);
				} else {
					throw new MissingNodeException("Choice: Informant.AssignedEntity or Informant.RelatedEntity");
				}

				this.doc.getInformant().add(cdaInformant);
			}
		}

		// custodian
		if (mapDocument.getCustodian() != null) {
			POCDMT000040Custodian cdaCustodian = factory.createPOCDMT000040Custodian();
			Custodian mapCustodian = mapDocument.getCustodian();

			if (mapCustodian.getTypeCode() == null) {
				throw new MissingAttributeException("Custodian.TypeCode");
			}
			cdaCustodian.getTypeCode().add(mapCustodian.getTypeCode());

			if (mapCustodian.getAssignedCustodian() == null) {
				throw new MissingNodeException("Custodian.AssignedCustodian");
			}

			if (mapCustodian.getAssignedCustodian().getClassCode() != null) {
				POCDMT000040AssignedCustodian cdaAssignedCustodian = factory.createPOCDMT000040AssignedCustodian();
				cdaAssignedCustodian.setClassCode(mapCustodian.getAssignedCustodian().getClassCode());
				cdaCustodian.setAssignedCustodian(cdaAssignedCustodian);
			} else if (mapCustodian.getAssignedCustodian().getNullFlavor() != null) {
				cdaCustodian.getAssignedCustodian().getNullFlavor()
						.add(mapCustodian.getAssignedCustodian().getNullFlavor().getSimpleType().toString());
			} else {
				throw new MissingAttributeException("AssignedCustodian.Code");
			}

			if (mapCustodian.getAssignedCustodian().getRepresentedCustodianOrganization() != null) {
				POCDMT000040CustodianOrganization cdaCustodianOrganization = factory.createPOCDMT000040CustodianOrganization();
				Organization mapCustodianOrganization = mapCustodian.getAssignedCustodian().getRepresentedCustodianOrganization();

				if (mapCustodianOrganization.getClassCode() == null) {
					throw new MissingAttributeException("RepresentedCustodianOrganization.ClassCode");
				}
				cdaCustodianOrganization.setClassCode(mapCustodianOrganization.getClassCode());

				if (mapCustodianOrganization.getDeterminerCode() == null) {
					throw new MissingAttributeException("RepresentedCustodianOrganization.DeterminerCode");
				}
				cdaCustodianOrganization.setDeterminerCode(mapCustodianOrganization.getDeterminerCode());

				if (!mapCustodianOrganization.getIds().isEmpty()) {
					for (ID mapId : mapCustodianOrganization.getIds()) {
						if (mapId.getRoot() != null && mapId.getExtensions() != null) {
							cdaCustodianOrganization.getId().add(this.createCDAId(mapId));
						} else if (mapId.getNullFlavour() != null) {
							II cdaId = factory.createII();
							cdaId.getNullFlavor().add(mapId.getNullFlavour());
							cdaCustodianOrganization.getId().add(cdaId);
						} else {
							throw new MissingAttributeException("CustodianOrganization.ID");
						}
					}
				}

				if (mapCustodianOrganization.getName() != null) {
					ON custodianOrganizationName = factory.createON();
					custodianOrganizationName.getContent().add(mapCustodianOrganization.getName());
					cdaCustodianOrganization.setName(custodianOrganizationName);
				}

				if (!mapCustodianOrganization.getTelecoms().isEmpty()) {
					for (Telecom mapTelecom : mapCustodianOrganization.getTelecoms()) {
						cdaCustodianOrganization.setTelecom(this.createCDATelecom(mapTelecom));
					}
				}

				if (!mapCustodianOrganization.getAddrs().isEmpty()) {
					for (Address mapAddress : mapCustodianOrganization.getAddrs()) {
						cdaCustodianOrganization.setAddr(this.createCDAAddress(mapAddress));
					}
				}

				cdaCustodian.getAssignedCustodian().setRepresentedCustodianOrganization(cdaCustodianOrganization);
			}
			this.doc.setCustodian(cdaCustodian);
		} else {
			throw new MissingNodeException("CDADocument.Custodian");
		}

		// informationRecipient
		if (!mapDocument.getInformationRecipients().isEmpty()) {
			for (InformationRecipient mapInformationRecipient : mapDocument.getInformationRecipients()) {
				POCDMT000040InformationRecipient cdaInformationRecipient = factory.createPOCDMT000040InformationRecipient();
				cdaInformationRecipient.setTypeCode(XInformationRecipient.fromValue(mapInformationRecipient.getTypeCode().getValue()));

				if (mapInformationRecipient.getIntendedRecipient() == null) {
					throw new MissingNodeException("InformationRecipient.IntendedRecipient");
				}

				POCDMT000040IntendedRecipient cdaIntendedRecipient = factory.createPOCDMT000040IntendedRecipient();
				IntendedRecipient mapIntendedRecipient = mapInformationRecipient.getIntendedRecipient();

				if (mapIntendedRecipient.getClassCode() == null) {
					throw new MissingAttributeException("IntendedRecipient.ClassCode");
				}
				cdaIntendedRecipient.setClassCode(XInformationRecipientRole.valueOf(mapIntendedRecipient.getClassCode().getValue()));

				if (!mapIntendedRecipient.getIds().isEmpty()) {
					for (ID mapId : mapIntendedRecipient.getIds()) {
						cdaIntendedRecipient.getId().add(this.createCDAId(mapId));
					}
				}

				if (!mapIntendedRecipient.getAddresses().isEmpty()) {
					for (Address mapAddress : mapIntendedRecipient.getAddresses()) {
						cdaIntendedRecipient.getAddr().add(this.createCDAAddress(mapAddress));
					}
				}

				if (!mapIntendedRecipient.getTelecoms().isEmpty()) {
					for (Telecom mapTelecom : mapIntendedRecipient.getTelecoms()) {
						cdaIntendedRecipient.getTelecom().add(this.createCDATelecom(mapTelecom));
					}
				}

				if (mapIntendedRecipient.getInformationRecipient() != null) {
					POCDMT000040Person cdaIntendedInformationRecipient = factory.createPOCDMT000040Person();
					Person mapIntendedInformationRecipient = mapIntendedRecipient.getInformationRecipient();

					cdaIntendedInformationRecipient.getClassCode().add("PSN");
					cdaIntendedInformationRecipient.setDeterminerCode("INSTANCE");

					if (mapIntendedInformationRecipient.getGivenName() != null || mapIntendedInformationRecipient.getFamilyName() != null
							|| mapIntendedInformationRecipient.getSuffix() != null) {
						cdaIntendedInformationRecipient.getName().add(
								this.createCDAName(mapIntendedInformationRecipient.getGivenName(), mapIntendedInformationRecipient.getFamilyName(), 
                                                                                mapIntendedInformationRecipient.getPrefix(),
										mapIntendedInformationRecipient.getSuffix()));
					}

					cdaIntendedRecipient.setInformationRecipient(cdaIntendedInformationRecipient);
				}

				if (mapIntendedRecipient.getReceivedOrganization() != null) {
					cdaIntendedRecipient.setReceivedOrganization(this.createCDAOrganization(mapIntendedRecipient.getReceivedOrganization()));
				}

				cdaInformationRecipient.setIntendedRecipient(cdaIntendedRecipient);
				this.doc.getInformationRecipient().add(cdaInformationRecipient);
			}
		}

		// legalAuthenticator
		if (mapDocument.getLegalAuthenticator() != null) {
			POCDMT000040LegalAuthenticator cdaLegalAuthenticator = factory.createPOCDMT000040LegalAuthenticator();
			LegalAuthenticator mapLegalAuthenticator = mapDocument.getLegalAuthenticator();

			if (mapLegalAuthenticator.getTime() == null) {
				throw new MissingAttributeException("LegalAuthenticator.Time");
			}

			TS legalAuthenticatorTime = factory.createTS();
			legalAuthenticatorTime.setValue(mapLegalAuthenticator.getTime());
			cdaLegalAuthenticator.setTime(legalAuthenticatorTime);

			if (mapLegalAuthenticator.getSignatureCode() == null) {
				throw new MissingAttributeException("LegalAuthenticator.SignatureCode");
			}

			cdaLegalAuthenticator.setSignatureCode(this.createCDACS(mapLegalAuthenticator.getSignatureCode()));

			if (mapLegalAuthenticator.getAssignedEntity() == null) {
				throw new MissingNodeException("LegalAuthenticator.AssignedEntity");
			}
			cdaLegalAuthenticator.setAssignedEntity(this.createCDAAssignedEntity(mapLegalAuthenticator.getAssignedEntity()));
			this.doc.setLegalAuthenticator(cdaLegalAuthenticator);
		}

		// authenticator
		if (!mapDocument.getAuthenticators().isEmpty()) {
			for (Authenticator mapAuthenticator : mapDocument.getAuthenticators()) {
				POCDMT000040Authenticator cdaAuthenticator = factory.createPOCDMT000040Authenticator();

				cdaAuthenticator.getTypeCode().add("AUTHEN");

				if (mapAuthenticator.getTime() == null) {
					throw new MissingAttributeException("Authenticator.Time");
				}
				TS authenticatorTime = factory.createTS();
				authenticatorTime.setValue(mapAuthenticator.getTime());
				cdaAuthenticator.setTime(authenticatorTime);

				if (mapAuthenticator.getSignatureCode() == null) {
					throw new MissingAttributeException("Authenticator.SignatureCode");
				}
				cdaAuthenticator.setSignatureCode(this.createCDACS(mapAuthenticator.getSignatureCode()));

				if (mapAuthenticator.getAssignedEntity() == null) {
					throw new MissingNodeException("Authenticator.AssignedEntity");
				}
				cdaAuthenticator.setAssignedEntity(this.createCDAAssignedEntity(mapAuthenticator.getAssignedEntity()));

				this.doc.getAuthenticator().add(cdaAuthenticator);
			}
		}

		//TODO
		// participant
		if (!mapDocument.getParticipants().isEmpty()) {
			for (Participant mapParticipant : mapDocument.getParticipants()) {
				POCDMT000040Participant1 cdaParticipant = factory.createPOCDMT000040Participant1();

				if (mapParticipant.getTypeCode() == null) {
					throw new MissingAttributeException("Participant.TypeCode");
				}
				cdaParticipant.getTypeCode().add(mapParticipant.getTypeCode());

				if (mapParticipant.getFunctionCode() != null) {
					cdaParticipant.setFunctionCode(this.createCDACE(mapParticipant.getFunctionCode()));
				}

				cdaParticipant.setContextControlCode("OP");

				if (mapParticipant.getTime().getHigh()!=null||mapParticipant.getTime().getLow()!=null) {
                                    IVLTS cdaParticipantTime = factory.createIVLTS();
                                    
                                    if (mapParticipant.getTime().getLow()!=null)
                                    {
                                        IVXBTS cdaParticipantTimeLowValue = factory.createIVXBTS();
				    	cdaParticipantTimeLowValue.setValue(mapParticipant.getTime().getLow());
					JAXBElement<IVXBTS> cdaParticipantTimeLow = factory.createIVLTSLow(cdaParticipantTimeLowValue);
					cdaParticipantTime.getRest().add(cdaParticipantTimeLow);
                                    }
                                    
                                    if (mapParticipant.getTime().getHigh()!=null){
                                            IVXBTS cdaParticipantTimeHighValue = factory.createIVXBTS();
                                            cdaParticipantTimeHighValue.setValue(mapParticipant.getTime().getHigh());
                                            JAXBElement<IVXBTS> cdaParticipantTimeHigh = factory.createIVLTSHigh(cdaParticipantTimeHighValue);
                                            cdaParticipantTime.getRest().add(cdaParticipantTimeHigh);
                                        }
				    
                                    cdaParticipant.setTime(cdaParticipantTime);
					
					
					
				}

				if (mapParticipant.getAssociatedEntity() != null) {
					POCDMT000040AssociatedEntity cdaParticipantAssociatedEntity = factory.createPOCDMT000040AssociatedEntity();
					AssociatedEntity mapParticipantAssociatedEntity = mapParticipant.getAssociatedEntity();

					if (mapParticipantAssociatedEntity.getClassCode() == null) {
						throw new MissingAttributeException("AssociatedEntity.ClassCode");
					}

					cdaParticipantAssociatedEntity.getClassCode().add(mapParticipantAssociatedEntity.getClassCode());

					if (!mapParticipantAssociatedEntity.getIds().isEmpty()) {
						for (ID mapId : mapParticipantAssociatedEntity.getIds()) {
							cdaParticipantAssociatedEntity.getId().add(this.createCDAId(mapId));
						}
					}

					if (mapParticipantAssociatedEntity.getCode() != null) {
						cdaParticipantAssociatedEntity.setCode(this.createCDACE(mapParticipantAssociatedEntity.getCode()));
					}

					if (!mapParticipantAssociatedEntity.getAddresses().isEmpty()) {
						for (Address mapAddress : mapParticipantAssociatedEntity.getAddresses()) {
							cdaParticipantAssociatedEntity.getAddr().add(this.createCDAAddress(mapAddress));
						}
					}

					if (!mapParticipantAssociatedEntity.getTelecoms().isEmpty()) {
						for (Telecom mapTelecom : mapParticipantAssociatedEntity.getTelecoms()) {
							cdaParticipantAssociatedEntity.getTelecom().add(this.createCDATelecom(mapTelecom));
						}
					}

					if (mapParticipantAssociatedEntity.getAssociatedPerson() != null) {

						POCDMT000040Person cdaAssociatedPerson = factory.createPOCDMT000040Person();
						if (mapParticipantAssociatedEntity.getAssociatedPerson().getClassCode() == null) {
							throw new MissingAttributeException("AssociatedPerson.ClassCode");
						}
						cdaAssociatedPerson.getClassCode().add(mapParticipantAssociatedEntity.getAssociatedPerson().getClassCode());

						if (mapParticipantAssociatedEntity.getAssociatedPerson().getDeterminerCode() == null) {
							throw new MissingAttributeException("AssociatedPerson.DeterminerCode");
						}
						cdaAssociatedPerson.setDeterminerCode(mapParticipantAssociatedEntity.getAssociatedPerson().getDeterminerCode());

						if (mapParticipantAssociatedEntity.getAssociatedPerson().getGivenName() != null
								|| mapParticipantAssociatedEntity.getAssociatedPerson().getFamilyName() != null
								|| mapParticipantAssociatedEntity.getAssociatedPerson().getSuffix() != null) {
							cdaAssociatedPerson.getName().add(
									this.createCDAName(mapParticipantAssociatedEntity.getAssociatedPerson().getGivenName(),
											mapParticipantAssociatedEntity.getAssociatedPerson().getFamilyName(), 
                                                                                        mapParticipantAssociatedEntity.getAssociatedPerson().getPrefix(), 
                                                                                        mapParticipantAssociatedEntity.getAssociatedPerson().getSuffix()));
						}

						cdaParticipantAssociatedEntity.setAssociatedPerson(cdaAssociatedPerson);
					}

					if (mapParticipantAssociatedEntity.getScopingOrganization() != null) {
						cdaParticipantAssociatedEntity.setScopingOrganization(this.createCDAOrganization(mapParticipantAssociatedEntity
								.getScopingOrganization()));
					}

					cdaParticipant.setAssociatedEntity(cdaParticipantAssociatedEntity);
				}

				this.doc.getParticipant().add(cdaParticipant);
			}
		}

			// InFulfillmentOf
			if (!mapDocument.getInFulfillmentOf().isEmpty()) {
				for (InFulfillmentOf mapInFulfillmentOf : mapDocument.getInFulfillmentOf()) {
					POCDMT000040InFulfillmentOf cdaInFulfillmentOf = factory.createPOCDMT000040InFulfillmentOf();

					if (mapInFulfillmentOf.getTypeCode() == null) {
						throw new MissingAttributeException("InFulfillmentOf.TypeCode");
					}
					cdaInFulfillmentOf.setTypeCode(ActRelationshipFulfills.fromValue(mapInFulfillmentOf.getTypeCode().getValue()));

					if (!mapInFulfillmentOf.getOrders().isEmpty()) {
						for (Order mapOrder : mapInFulfillmentOf.getOrders()) {
							POCDMT000040Order cdaOrder = factory.createPOCDMT000040Order();

							if (mapOrder.getClassCode() == null) {
								throw new MissingAttributeException("Order.ClassCode");
							}
							cdaOrder.getClassCode().add(mapOrder.getClassCode());

							if (mapOrder.getMoodCode() == null) {
								throw new MissingAttributeException("Order.MoodCode");
							}
							cdaOrder.getMoodCode().add(mapOrder.getMoodCode());

							if (mapOrder.getIds().isEmpty()) {
								throw new MissingAttributeException("Order.Id");
							}
							for (ID mapId : mapOrder.getIds()) {
								cdaOrder.getId().add(this.createCDAId(mapId));
							}

							if (mapOrder.getCode() != null) {
								cdaOrder.setCode(this.createCDACE(mapOrder.getCode()));
							}

							if (mapOrder.getPriorityCode() != null) {
								cdaOrder.setPriorityCode(this.createCDACE(mapOrder.getPriorityCode()));
							}

							cdaInFulfillmentOf.setOrder(cdaOrder);
							this.doc.getInFulfillmentOf().add(cdaInFulfillmentOf);
						}
					} else {
						throw new MissingNodeException("InFulfillmentOf.Order");
					}

				}
			}

			// documentationOf
			if (!mapDocument.getDocumentationOf().isEmpty()) {
				for (DocumentationOf mapDocumentationOf : mapDocument.getDocumentationOf()) {
					POCDMT000040DocumentationOf cdaDocumentationOf = factory.createPOCDMT000040DocumentationOf();

					if (mapDocumentationOf.getTypeCode() == null) {
						throw new MissingAttributeException("DocumentationOf.TypeCode");
					}
					cdaDocumentationOf.getTypeCode().add(mapDocumentationOf.getTypeCode());

					if (!mapDocumentationOf.getServiceEvents().isEmpty()) {
						for (ServiceEvent mapServiceEvent : mapDocumentationOf.getServiceEvents()) {

							POCDMT000040ServiceEvent cdaServiceEvent = factory.createPOCDMT000040ServiceEvent();

							if (mapServiceEvent.getClassCode() == null) {
								throw new MissingAttributeException("ServiceEvent.ClassCode");
							}
							cdaServiceEvent.getClassCode().add(mapServiceEvent.getClassCode());

							if (mapServiceEvent.getMoodCode() == null) {
								throw new MissingAttributeException("ServiceEvent.MoodCode");
							}
							cdaServiceEvent.getMoodCode().add(mapServiceEvent.getMoodCode());

							if (!mapServiceEvent.getIds().isEmpty()) {
								for (ID mapId : mapServiceEvent.getIds()) {
									cdaServiceEvent.getId().add(this.createCDAId(mapId));
								}
							}

							if (mapServiceEvent.getCode() != null) {
								cdaServiceEvent.setCode(this.createCDACE(mapServiceEvent.getCode()));
							}

							if (mapServiceEvent.getEffectiveTime() != null) {
								IVLTS serviceEventeffectiveTime = factory.createIVLTS();
								serviceEventeffectiveTime.setValue(mapServiceEvent.getEffectiveTime().getValue());
								cdaServiceEvent.setEffectiveTime(serviceEventeffectiveTime);
							}

							if (!mapServiceEvent.getPerformers().isEmpty()) {
								for (Performer mapPerformer : mapServiceEvent.getPerformers()) {
									POCDMT000040Performer1 cdaPerformer = factory.createPOCDMT000040Performer1();

									if (mapPerformer.getTypeCode() == null) {
										throw new MissingAttributeException("Performer.TypeCode");
									}
									cdaPerformer.setTypeCode(XServiceEventPerformer.fromValue(mapPerformer.getTypeCode().getValue()));

									if (mapPerformer.getFunctionCode() != null) {
										cdaPerformer.setFunctionCode(this.createCDACE(mapPerformer.getFunctionCode()));
									}

									if (mapPerformer.getTime() != null) {
										IVLTS performerTime = factory.createIVLTS();
										performerTime.setValue(mapPerformer.getTime());
										cdaPerformer.setTime(performerTime);
									}

									if (mapPerformer.getAssignedEntity() == null) {
										throw new MissingNodeException("DocumentationOf.ServiceEvent.Performer.AssignedEntity");
									}

									cdaPerformer.setAssignedEntity(this.createCDAAssignedEntity(mapPerformer.getAssignedEntity()));
									cdaServiceEvent.getPerformer().add(cdaPerformer);
								}
							}

							cdaDocumentationOf.setServiceEvent(cdaServiceEvent);
						}
					}
					this.doc.getDocumentationOf().add(cdaDocumentationOf);
				}
			}

			// relatedDocument
			if (!mapDocument.getRelatedDocuments().isEmpty()) {
				for (RelatedDocument mapRelatedDocument : mapDocument.getRelatedDocuments()) {
					POCDMT000040RelatedDocument cdaRelatedDocument = factory.createPOCDMT000040RelatedDocument();

					if (mapRelatedDocument.getTypeCode() == null) {
						throw new MissingAttributeException("RelatedDocument.TypeCode");
					}
					cdaRelatedDocument.setTypeCode(XActRelationshipDocument.fromValue(mapRelatedDocument.getTypeCode().getValue()));

					if (mapRelatedDocument.getParentDocument() == null) {
						throw new MissingNodeException("RelatedDocument.ParentDocument");
					}
					POCDMT000040ParentDocument cdaParentDocument = factory.createPOCDMT000040ParentDocument();
					ParentDocument mapParentDocument = mapRelatedDocument.getParentDocument();

					if (mapParentDocument.getClassCode() == null) {
						throw new MissingAttributeException("ParentDocument.ClassCode");
					}
					cdaParentDocument.setClassCode(ActClinicalDocument.valueOf(mapParentDocument.getClassCode().getValue()));

					if (mapParentDocument.getMoodCode() == null) {
						throw new MissingAttributeException("ParentDocument.MoodCode");
					}
					cdaParentDocument.getMoodCode().add(mapParentDocument.getMoodCode());

					if (mapParentDocument.getIds().isEmpty()) {
						throw new MissingAttributeException("ParentDocument.ID");
					}
					for (ID mapId : mapParentDocument.getIds()) {
						cdaParentDocument.getId().add(this.createCDAId(mapId));
					}

					if (mapParentDocument.getCode() != null) {
						cdaParentDocument.setCode(this.createCDACE(mapParentDocument.getCode()));
					}

					if (mapParentDocument.getText() != null) {
						ED parentDocumentED = factory.createED();
						parentDocumentED.getContent().add(mapParentDocument.getText());
						cdaParentDocument.setText(parentDocumentED);
					}

					if (mapParentDocument.getSetId() != null) {
						cdaParentDocument.setSetId(this.createCDAId(mapParentDocument.getSetId()));
					}

					if (mapParentDocument.getVersionNumber() != null) {
						INT parentDocumentVersionNumber = factory.createINT();
						parentDocumentVersionNumber.setValue(mapParentDocument.getVersionNumber());
					}

					cdaRelatedDocument.setParentDocument(cdaParentDocument);
					this.doc.getRelatedDocument().add(cdaRelatedDocument);
				}
			}

			// authorization
			if (!mapDocument.getAuthorizations().isEmpty()) {
				for (Authorization mapAuthorization : mapDocument.getAuthorizations()) {
					POCDMT000040Authorization cdaAuthorization = factory.createPOCDMT000040Authorization();

					if (mapAuthorization.getTypeCode() == null) {
						throw new MissingAttributeException("Authorization.TypeCode");
					}
					cdaAuthorization.getTypeCode().add(mapAuthorization.getTypeCode());

					if (!mapAuthorization.getConsents().isEmpty()) {
						for (Consent mapConsent : mapAuthorization.getConsents()) {
							POCDMT000040Consent cdaConsent = factory.createPOCDMT000040Consent();

							if (mapConsent.getClassCode() == null) {
								throw new MissingAttributeException("Consent.ClassCode");
							}
							cdaConsent.getClassCode().add(mapConsent.getClassCode());

							if (mapConsent.getMoodCode() == null) {
								throw new MissingAttributeException("Consent.MoodCode");
							}
							cdaConsent.getMoodCode().add(mapConsent.getMoodCode());

							if (!mapConsent.getIds().isEmpty()) {
								for (ID mapId : mapConsent.getIds()) {
									cdaConsent.getId().add(this.createCDAId(mapId));
								}
							}

							if (mapConsent.getCode() != null) {
								cdaConsent.setCode(this.createCDACE(mapConsent.getCode()));
							}

							if (mapConsent.getStatusCode() != null) {
								cdaConsent.setStatusCode(this.createCDACS(new Code(mapConsent.getStatusCode().getValue(), "")));
							}

							cdaAuthorization.setConsent(cdaConsent);
							this.doc.getAuthorization().add(cdaAuthorization);
						}
					} else {
						throw new MissingNodeException("Authorization.Consent");
					}
				}
			}

			// componentOf
			if (mapDocument.getComponentOf() != null) {
				POCDMT000040Component1 cdaComponentOf = factory.createPOCDMT000040Component1();
				ComponentOf mapComponentOf = mapDocument.getComponentOf();

				if (mapComponentOf.getTypeCode() == null) {
					throw new MissingAttributeException("ComponentOf.TypeCode");
				}
				cdaComponentOf.setTypeCode(ActRelationshipHasComponent.valueOf(mapComponentOf.getTypeCode().getValue()));

				if (mapComponentOf.getEncompassingEncounter() == null) {
					throw new MissingNodeException("ComponentOf.EncompassingEncounter");
				}
				POCDMT000040EncompassingEncounter cdaEncompassingEncounter = factory.createPOCDMT000040EncompassingEncounter();
				EncompassingEncounter mapEncompassingEncounter = mapComponentOf.getEncompassingEncounter();

				if (mapEncompassingEncounter.getClassCode() == null) {
					throw new MissingAttributeException("EncompassingEncounter.ClassCode");
				}
				cdaEncompassingEncounter.getClassCode().add("ENC");

				if (mapEncompassingEncounter.getMoodCode() == null) {
					throw new MissingAttributeException("EncompassingEncounter.MoodCode");
				}
				cdaEncompassingEncounter.getMoodCode().add("EVN");

				if (!mapEncompassingEncounter.getIds().isEmpty()) {
					for (ID mapId : mapEncompassingEncounter.getIds()) {
						cdaEncompassingEncounter.getId().add(this.createCDAId(mapId));
					}
				}

				if (mapEncompassingEncounter.getCode() != null) {
					cdaEncompassingEncounter.setCode(this.createCDACE(mapEncompassingEncounter.getCode()));
				}

				if (mapEncompassingEncounter.getEffectiveTime() == null) {
					throw new MissingAttributeException("ComponentOf.EncompassingEncounter.EffectiveTime");
				}
				IVLTS encompassingEncounterEffectiveTime = factory.createIVLTS();
				encompassingEncounterEffectiveTime.setValue(mapComponentOf.getEncompassingEncounter().getEffectiveTime().getValue());
				cdaEncompassingEncounter.setEffectiveTime(encompassingEncounterEffectiveTime);

				if (mapEncompassingEncounter.getDischargeDispositionCode() != null) {
					cdaEncompassingEncounter.setDischargeDispositionCode(this.createCDACE(mapEncompassingEncounter.getDischargeDispositionCode()));
				}

				if (mapEncompassingEncounter.getResponsibleParty() != null) {
					POCDMT000040ResponsibleParty cdaResponsibleParty = factory.createPOCDMT000040ResponsibleParty();
					ResponsibleParty mapResponsibleParty = mapEncompassingEncounter.getResponsibleParty();
					if (mapResponsibleParty.getTypeCode() == null) {
						throw new MissingAttributeException("Responsibleparty.TypeCode");
					}
					cdaResponsibleParty.getTypeCode().add(mapResponsibleParty.getTypeCode());

					if (mapResponsibleParty.getAssignedEntity() == null) {
						throw new MissingNodeException("ResponsibleParty.AssignedEntity");
					}
					cdaResponsibleParty.setAssignedEntity(this.createCDAAssignedEntity(mapResponsibleParty.getAssignedEntity()));

					cdaEncompassingEncounter.setResponsibleParty(cdaResponsibleParty);
				}

				if (!mapEncompassingEncounter.getEncounterParticipants().isEmpty()) {
					for (EncounterParticipant mapEncounterParticipant : mapEncompassingEncounter.getEncounterParticipants()) {
						POCDMT000040EncounterParticipant cdaEncounterParticipant = factory.createPOCDMT000040EncounterParticipant();

						if (mapEncounterParticipant.getTypeCode() == null) {
							throw new MissingAttributeException("EncounterParticipant.TypeCode");
						}
						cdaEncounterParticipant.setTypeCode(XEncounterParticipant.fromValue(mapEncounterParticipant.getTypeCode().getValue()));

						if (mapEncounterParticipant.getTime() != null) {
							IVLTS encounterParticipantTime = factory.createIVLTS();
							encompassingEncounterEffectiveTime.setValue(mapEncounterParticipant.getTime());
							cdaEncounterParticipant.setTime(encounterParticipantTime);
						}

						if (mapEncounterParticipant.getAssignedEntity() == null) {
							throw new MissingNodeException("EncounterParticipant.AssignedEntity");
						}
						cdaEncounterParticipant.setAssignedEntity(this.createCDAAssignedEntity(mapEncounterParticipant.getAssignedEntity()));
						cdaEncompassingEncounter.getEncounterParticipant().add(cdaEncounterParticipant);
					}
				}

				if (mapEncompassingEncounter.getLocation() != null) {
					POCDMT000040Location cdaLocation = factory.createPOCDMT000040Location();
					Location mapLocation = mapEncompassingEncounter.getLocation();

					if (mapLocation.getTypeCode() == null) {
						throw new MissingAttributeException("Location.TypeCode");
					}
					cdaLocation.setTypeCode(ParticipationTargetLocation.fromValue(mapLocation.getTypeCode().getValue()));

					if (mapLocation.getHealthCareFacility() == null) {
						throw new MissingNodeException("Location.HealthCareFacility");
					}
					POCDMT000040HealthCareFacility cdaHealthCareFacility = factory.createPOCDMT000040HealthCareFacility();
					HealthCareFacility mapHealthCareFacility = mapLocation.getHealthCareFacility();

					if (mapHealthCareFacility.getClassCode() == null) {
						throw new MissingAttributeException("HealthCareFacility.ClassCode");
					}
					cdaHealthCareFacility.setClassCode(RoleClassServiceDeliveryLocation.valueOf(mapHealthCareFacility.getClassCode().getValue()));

					if (!mapHealthCareFacility.getIds().isEmpty()) {
						for (ID mapId : mapHealthCareFacility.getIds()) {
							cdaHealthCareFacility.getId().add(this.createCDAId(mapId));
						}
					}

					if (mapHealthCareFacility.getCode() != null) {
						cdaHealthCareFacility.setCode(this.createCDACE(mapHealthCareFacility.getCode()));
					}

					if (mapHealthCareFacility.getLocation() != null) {
						POCDMT000040Place cdaHealthCareFacilityPlace = factory.createPOCDMT000040Place();
						Place mapHealthCareFacilityPlace = mapHealthCareFacility.getLocation();

						if (mapHealthCareFacility.getClassCode() == null) {
							throw new MissingAttributeException("HealthCareFacilityPlace.ClassCode");
						}
						cdaHealthCareFacilityPlace.setClassCode(EntityClassPlace.valueOf(mapHealthCareFacilityPlace.getClassCode().getValue()));
						if (mapHealthCareFacilityPlace.getDeterminerCode() == null) {
							throw new MissingAttributeException("Place.DeterminerCode");
						}
						cdaHealthCareFacilityPlace.setDeterminerCode(mapHealthCareFacilityPlace.getDeterminerCode());

						if (mapHealthCareFacilityPlace.getName() != null) {
							cdaHealthCareFacilityPlace.setName(this.createCDAName(mapHealthCareFacilityPlace.getName(), "","", ""));
						}
						if (mapHealthCareFacilityPlace.getAddress() != null) {
							cdaHealthCareFacilityPlace.setAddr(this.createCDAAddress(mapHealthCareFacilityPlace.getAddress()));
						}

						cdaHealthCareFacility.setLocation(cdaHealthCareFacilityPlace);
					}
					if (mapHealthCareFacility.getServiceProviderOrganization() != null) {
						cdaHealthCareFacility.setServiceProviderOrganization(this.createCDAOrganization(mapHealthCareFacility
								.getServiceProviderOrganization()));
					}

					cdaLocation.setHealthCareFacility(cdaHealthCareFacility);
					cdaEncompassingEncounter.setLocation(cdaLocation);
				}
				cdaComponentOf.setEncompassingEncounter(cdaEncompassingEncounter);
				this.doc.setComponentOf(cdaComponentOf);
			}
		

		// component
		if (mapDocument.getComponent() != null) {
			POCDMT000040Component2 cdaComponent2 = factory.createPOCDMT000040Component2();
			Component2 mapComponent2 = mapDocument.getComponent();

			if (mapComponent2.getTypeCode() == null) {
				throw new MissingAttributeException("Component2.TypeCode");
			}

			cdaComponent2.setTypeCode(ActRelationshipHasComponent.fromValue(mapComponent2.getTypeCode().getValue()));
			cdaComponent2.setContextConductionInd(mapComponent2.isContextConductionInd());

			if (mapComponent2.getBodyChoice() instanceof NonXMLBody) {
				POCDMT000040NonXMLBody cdaNonXMLBody = factory.createPOCDMT000040NonXMLBody();
				NonXMLBody mapNonXMLBody = (NonXMLBody) mapComponent2.getBodyChoice();

				if (mapNonXMLBody.getClassCode() == null) {
					throw new MissingAttributeException("NonXMLBody.ClassCode");
				}
				cdaNonXMLBody.getClassCode().add(mapNonXMLBody.getClassCode());

				if (mapNonXMLBody.getMoodCode() == null) {
					throw new MissingAttributeException("NonXMLBody.MoodCode");
				}
				cdaNonXMLBody.getMoodCode().add(mapNonXMLBody.getMoodCode());

				if (mapNonXMLBody.getText() == null) {
					throw new MissingAttributeException("Component.NonXMLBody.Text");
				}
				ED nonXMLBodyText = factory.createED();
				nonXMLBodyText.getContent().add(mapNonXMLBody.getText());
				cdaNonXMLBody.setText(nonXMLBodyText);

				if (mapNonXMLBody.getConfidentialityCode() != null) {
					cdaNonXMLBody.setConfidentialityCode(this.createCDACE(mapNonXMLBody.getConfidentialityCode()));
				}

				if (mapNonXMLBody.getLanguageCode() != null) {
					cdaNonXMLBody.setLanguageCode(this.createCDACS(mapNonXMLBody.getLanguageCode()));
				}

				cdaComponent2.setNonXMLBody(cdaNonXMLBody);
			} else if (mapComponent2.getBodyChoice() instanceof StructuredBody) {
				POCDMT000040StructuredBody cdaStructuredBody = factory.createPOCDMT000040StructuredBody();
				StructuredBody mapStructuredBody = (StructuredBody) mapComponent2.getBodyChoice();

				if (mapStructuredBody.getClassCode() == null) {
					throw new MissingAttributeException("StructuredBody.ClassCode");
				}
				cdaStructuredBody.getClassCode().add(mapStructuredBody.getClassCode());

				if (mapStructuredBody.getMoodCode() == null) {
					throw new MissingAttributeException("StructuredBody.MoodCode");
				}
				cdaStructuredBody.getMoodCode().add(mapStructuredBody.getMoodCode());

				if (mapStructuredBody.getConfidentialityCode() != null) {
					cdaStructuredBody.setConfidentialityCode(this.createCDACE(mapStructuredBody.getConfidentialityCode()));
				}

				if (mapStructuredBody.getLanguageCode() != null) {
					cdaStructuredBody.setLanguageCode(this.createCDACS(mapStructuredBody.getLanguageCode()));
				}

				if (!mapStructuredBody.getComponent3().isEmpty()) {
					for (Component3 mapComponent3 : mapStructuredBody.getComponent3()) {

						POCDMT000040Component3 cdaComponent3 = factory.createPOCDMT000040Component3();
						if (mapComponent3.getTypeCode() == null) {
							throw new MissingAttributeException("Component3.TypeCode");
						}
						cdaComponent3.setTypeCode(ActRelationshipHasComponent.fromValue(mapComponent3.getTypeCode().getValue()));
						cdaComponent3.setContextConductionInd(mapComponent3.isContextConductionInd());

						// section
						if (mapComponent3.getSection() == null) {
							throw new MissingNodeException("StructuredBody.Component.Section");
						}
						POCDMT000040Section cdaSection = this.createCDASection(mapComponent3.getSection(), mapDocument);
						cdaComponent3.setSection(cdaSection);

						// entry
						if (!mapComponent3.getSection().getEntries().isEmpty()) {
							for (Entry mapEntry : mapComponent3.getSection().getEntries()) {
								POCDMT000040Entry cdaEntry = factory.createPOCDMT000040Entry();

                                                                if (!mapEntry.getTemplateId().isEmpty()){
                                                                    for (ID templateId : mapEntry.getTemplateId())
                                                                    {
                                                                         cdaEntry.getTemplateId().add(createCDAId(templateId));
                                                                    }
                                                                }
                                                                
								if (mapEntry.getTypeCode() == null) {
									throw new MissingAttributeException("Entry.TypeCode");
								}
								cdaEntry.setTypeCode(XActRelationshipEntry.fromValue(mapEntry.getTypeCode().getValue()));
								cdaEntry.setContextConductionInd(mapEntry.isContextConductionInd());

								// clinicalStatement
								if (mapEntry.getClinicalStatement() != null) {
									ClinicalStatement mapClinicalStatement = mapEntry.getClinicalStatement();
									if (mapClinicalStatement instanceof Act) {
										cdaEntry.setAct(this.createCDAAct((Act) mapClinicalStatement));
									} else if (mapClinicalStatement instanceof Encounter) {
										cdaEntry.setEncounter(this.createCDAEncounter((Encounter) mapClinicalStatement));
									} else if (mapClinicalStatement instanceof Observation) {
										cdaEntry.setObservation(this.createCDAObservation((Observation) mapClinicalStatement));
									} else if (mapClinicalStatement instanceof ObservationMedia) {
										cdaEntry.setObservationMedia(this.createCDAObservationMedia((ObservationMedia) mapClinicalStatement));
									} else if (mapClinicalStatement instanceof Organizer) {
										cdaEntry.setOrganizer(this.createCDAOrganizer((Organizer) mapClinicalStatement));
									} else if (mapClinicalStatement instanceof Procedure) {
										cdaEntry.setProcedure(this.createCDAProcedure((Procedure) mapClinicalStatement));
									} else if (mapClinicalStatement instanceof RegionOfInterest) {
										cdaEntry.setRegionOfInterest(this.createCDARegionOfInterest((RegionOfInterest) mapClinicalStatement));
									} else if (mapClinicalStatement instanceof SubstanceAdministration) {
										cdaEntry.setSubstanceAdministration(this
												.createCDASubstanceAdministration((SubstanceAdministration) mapClinicalStatement));
									} else if (mapClinicalStatement instanceof Supply) {
										cdaEntry.setSupply(this.createCDASupply((Supply) mapClinicalStatement));
									} else {
										throw new MissingNodeException(
												"Choice: Act or Encounter or Observation or ObservationMedia or Organizer or Procedure or RegionOfInterest or SubstanceAdministration or Supply");
									}
								} else {
									throw new MissingNodeException("Entry.ClinicalStatement");
								}
								cdaSection.getEntry().add(cdaEntry);
//								cdaComponent3.setSection(cdaSection);
								
							}
							cdaStructuredBody.getComponent().add(cdaComponent3);
						} else {
							throw new MissingNodeException("Section.Entry");
						}
					}
				} else {
					throw new MissingNodeException("StructuredBody.Component");
				}

				cdaComponent2.setStructuredBody(cdaStructuredBody);
			} else {
				throw new MissingNodeException("Choice: Component.NonXMLBody or Component.StructuredBody");
			}
			this.doc.setComponent(cdaComponent2);
		} else {
			throw new MissingNodeException("CDADocument.Component");
		}
		return this.doc;
	}

	/**
	 * Creates the cdacs.
	 * 
	 * @param mapCode
	 *            the map code
	 * @return the cs
	 */
	private CS createCDACS(Code mapCode) {
		CS code = factory.createCS();
		code.setCode(mapCode.getCode());
		code.setCodeSystem(mapCode.getCodeSystem());
		code.setCodeSystemName(mapCode.getCodeSystemName());
		code.setCodeSystemVersion(mapCode.getCodeSystemVersion());
		code.setDisplayName(mapCode.getDisplayName());

		return code;
	}

	/**
	 * Creates the cdasc.
	 * 
	 * @param mapCode
	 *            the map code
	 * @return the sc
	 */
	private SC createCDASC(Code mapCode) {
		SC code = factory.createSC();
		code.setCode(mapCode.getCode());
		code.setCodeSystem(mapCode.getCodeSystem());
		code.setCodeSystemName(mapCode.getCodeSystemName());
		code.setCodeSystemVersion(mapCode.getCodeSystemVersion());
		code.setDisplayName(mapCode.getDisplayName());

		return code;

	}

	/**
	 * Creates the cdace.
	 * 
	 * @param mapCode
	 *            the map code
	 * @return the ce
	 */
	private CE createCDACE(Code mapCode) {
		CE code = factory.createCE();
		code.setCode(mapCode.getCode());
		code.setCodeSystem(mapCode.getCodeSystem());
		code.setCodeSystemName(mapCode.getCodeSystemName());
		code.setCodeSystemVersion(mapCode.getCodeSystemVersion());
		code.setDisplayName(mapCode.getDisplayName());

		return code;
	}

	/**
	 * Creates the cda name.
	 * 
	 * @param givenName
	 *            the given name
	 * @param familyName
	 *            the family name
	 * @param suffix
	 *            the suffix
	 * @return the pn
	 */
	private PN createCDAName(String givenName, String familyName, String prefix, String suffix) {
		PN name = this.factory.createPN();
		EnGiven engiven = factory.createEnGiven();
		EnFamily enfamily = factory.createEnFamily();
                EnPrefix enprefix = factory.createEnPrefix();
		EnSuffix ensuffix = factory.createEnSuffix();

		engiven.getContent().add(givenName);
		enfamily.getContent().add(familyName);

		name.getContent().add(factory.createENGiven(engiven));
		name.getContent().add(factory.createENFamily(enfamily));

		if (suffix != null) {
			ensuffix.getContent().add(suffix);
			name.getContent().add(factory.createENSuffix(ensuffix));
		}
                
                if (prefix != null){
                    enprefix.getContent().add(prefix);
                    name.getContent().add(factory.createENPrefix(enprefix));
                }

		return name;
	}

	/**
	 * Creates the cda telecom.
	 * 
	 * @param mapTelecom
	 *            the map telecom
	 * @return the tel
	 */
	private TEL createCDATelecom(Telecom mapTelecom) {
		TEL tel = factory.createTEL();
		tel.getUse().add(mapTelecom.getUse().getDescription());
		tel.setValue(mapTelecom.getValue());
		return tel;
	}

	/**
	 * Creates the cda address.
	 * 
	 * @param mapAddress
	 *            the map address
	 * @return the ad
	 */
	private AD createCDAAddress(Address mapAddress) {
		AD address = factory.createAD();
		if (mapAddress.getCountry() != null) {
			AdxpCountry country = factory.createAdxpCountry();
			country.getContent().add(mapAddress.getCountry());
			address.getContent().add(factory.createADCountry(country));
		}

		if (mapAddress.getCity() != null) {
			AdxpCity city = factory.createAdxpCity();
			city.getContent().add(mapAddress.getCity());
			address.getContent().add(factory.createADCity(city));
		}

		if (mapAddress.getPostalCode() != null) {
			AdxpPostalCode postalCode = factory.createAdxpPostalCode();
			postalCode.getContent().add(mapAddress.getPostalCode());
			address.getContent().add(factory.createADPostalCode(postalCode));
		}

		if (mapAddress.getAddressLine() != null) {
			AdxpStreetAddressLine streetAddressLine = factory.createAdxpStreetAddressLine();
			streetAddressLine.getContent().add(mapAddress.getAddressLine());
			address.getContent().add(factory.createADStreetAddressLine(streetAddressLine));
		}
		return address;
	}

	/**
	 * Creates the cda id.
	 * 
	 * @param mapId
	 *            the map id
	 * @return the ii
	 */
	private II createCDAId(ID mapId) {
		II id = factory.createII();
		id.setRoot(mapId.getRoot());
		id.setExtension(mapId.getExtensions());
		return id;
	}

	/**
	 * Creates the cda manufactured product.
	 * 
	 * @param mapManufacturedProduct
	 *            the map manufactured product
	 * @return the pOCDM t000040 manufactured product
	 * @throws MissingNodeException
	 *             the missing node exception
	 * @throws MissingAttributeException
	 *             the missing attribute exception
	 */
	private POCDMT000040ManufacturedProduct createCDAManufacturedProduct(ManufacturedProduct mapManufacturedProduct) throws MissingNodeException,
			MissingAttributeException {
		POCDMT000040ManufacturedProduct cdaManufacturedProduct = factory.createPOCDMT000040ManufacturedProduct();

		if (mapManufacturedProduct.getClassCode() == null) {
			throw new MissingAttributeException("ManufacturedProduct.ClassCode");
		}
		cdaManufacturedProduct.setClassCode(RoleClassManufacturedProduct.fromValue(mapManufacturedProduct.getClassCode().getValue()));

		if (!mapManufacturedProduct.getIds().isEmpty()) {
			for (ID mapId : mapManufacturedProduct.getIds()) {
				cdaManufacturedProduct.getId().add(this.createCDAId(mapId));
			}
		}

		if (mapManufacturedProduct.getDrugOrOtherMaterialChoice() instanceof LabeledDrug) {
			POCDMT000040LabeledDrug cdaLabeledDrug = factory.createPOCDMT000040LabeledDrug();
			LabeledDrug mapLabeledDrug = (LabeledDrug) mapManufacturedProduct.getDrugOrOtherMaterialChoice();

			if (mapLabeledDrug.getClassCode() == null) {
				throw new MissingAttributeException("LabeledDrug.ClassCode");
			}
			cdaLabeledDrug.setClassCode(mapLabeledDrug.getClassCode());

			if (mapLabeledDrug.getDeterminerCode() == null) {
				throw new MissingAttributeException("LabeledDrug.DeterminerCode");
			}
			cdaLabeledDrug.setDeterminerCode(EntityDeterminerDetermined.fromValue(mapLabeledDrug.getDeterminerCode().getValue()));

			if (mapLabeledDrug.getCode() != null) {
				cdaLabeledDrug.setCode(this.createCDACE(mapLabeledDrug.getCode()));
			}

			if (mapLabeledDrug.getName() != null) {
				EN mapLabeledDrugName = factory.createEN();
				mapLabeledDrugName.getContent().add(mapLabeledDrug.getName());
				cdaLabeledDrug.setName(mapLabeledDrugName);
			}

			cdaManufacturedProduct.setManufacturedLabeledDrug(cdaLabeledDrug);
		} else if (mapManufacturedProduct.getDrugOrOtherMaterialChoice() instanceof Material) {
			POCDMT000040Material cdaMaterial = factory.createPOCDMT000040Material();
			Material mapMaterial = (Material) mapManufacturedProduct.getDrugOrOtherMaterialChoice();

			if (mapMaterial.getClassCode() == null) {
				throw new MissingAttributeException("ManufacturedProduct.ManufacturedMaterial.ClassCode");
			}
			cdaMaterial.setClassCode(mapMaterial.getClassCode());

			if (mapMaterial.getDeterminerCode() == null) {
				throw new MissingAttributeException("ManufacturedProduct.ManufacturedMaterial.ClassCode");
			}
			cdaMaterial.setDeterminerCode(EntityDeterminerDetermined.fromValue(mapMaterial.getDeterminerCode().getValue()));

			if (mapMaterial.getCode() != null) {
				cdaMaterial.setCode(this.createCDACE(mapMaterial.getCode()));
			}

			if (mapMaterial.getName() != null) {
				EN mapMaterialName = factory.createEN();
				mapMaterialName.getContent().add(mapMaterial.getName());
				cdaMaterial.setName(mapMaterialName);
			}

			if (mapMaterial.getLotNumberText() != null) {
				ST mapMaterialLotNumberText = factory.createST();
				mapMaterialLotNumberText.getContent().add(mapMaterial.getLotNumberText());
				cdaMaterial.setLotNumberText(mapMaterialLotNumberText);
			}

			cdaManufacturedProduct.setManufacturedMaterial(cdaMaterial);
		} else {
			throw new MissingNodeException("Choice: ManufacturedLabeledDrug or ManufacturedMaterial");
		}

		if (mapManufacturedProduct.getManufacturerOrganization() != null) {
			cdaManufacturedProduct.setManufacturerOrganization(this.createCDAOrganization(mapManufacturedProduct.getManufacturerOrganization()));
		}

		return cdaManufacturedProduct;
	}

	/**
	 * Creates the cda section.
	 * 
	 * @param mapSection
	 *            the map section
	 * @param mapDocument
	 *            the map document
	 * @return the pOCDM t000040 section
	 * @throws MissingNodeException
	 *             the missing node exception
	 * @throws MissingAttributeException
	 *             the missing attribute exception
	 */
	private POCDMT000040Section createCDASection(Section mapSection, CDADocument mapDocument) throws MissingNodeException, MissingAttributeException {
		POCDMT000040Section cdaSection = factory.createPOCDMT000040Section();

		if (mapSection.getClassCode() == null) {
			throw new MissingAttributeException("Section.ClassCode");
		}
		cdaSection.getClassCode().add(mapSection.getClassCode());

		if (mapSection.getMoodCode() == null) {
			throw new MissingAttributeException("Section.MoodCode");
		}
		cdaSection.getMoodCode().add(mapSection.getMoodCode());

                if (!mapSection.getTemplateId().isEmpty()){
                    for (ID templateId : mapSection.getTemplateId()){
                        cdaSection.getTemplateId().add(this.createCDAId(templateId));
                    }
                }
                
		if (mapSection.getId() != null) {
			cdaSection.setId(this.createCDAId(mapSection.getId()));
		}

		if (mapSection.getCode() != null) {
			cdaSection.setCode(this.createCDACE(mapSection.getCode()));
		}

		if (mapSection.getTitle() != null) {
			ST sectionTitle = factory.createST();
			sectionTitle.getContent().add(mapSection.getTitle());
			cdaSection.setTitle(sectionTitle);
		}

		if (mapSection.getText() != null) {
			StrucDocText sectionText = factory.createStrucDocText();
			sectionText.getContent().add(mapSection.getText());
			cdaSection.setText(sectionText);
		}

		if (mapSection.getConfidentialityCode() != null) {
			cdaSection.setConfidentialityCode(this.createCDACE(mapSection.getConfidentialityCode()));
		}

		if (mapSection.getLanguageCode() != null) {
			cdaSection.setLanguageCode(this.createCDACS(mapSection.getLanguageCode()));
		}

		if (mapSection.getSubject() != null) {
			cdaSection.setSubject(this.createCDASubject(mapSection.getSubject()));
			if (!mapSection.getAuthors().isEmpty()) {
				POCDMT000040Author cdaAuthor = factory.createPOCDMT000040Author();
				for (Author mapAuthor : mapDocument.getAuthors()) {
					cdaAuthor.getTypeCode().add("AUT");

					if (mapAuthor.getFunctionCode() != null) {
						cdaAuthor.setFunctionCode(this.createCDACE(mapAuthor.getFunctionCode()));
					}

					if (mapAuthor.getContextControlCode() == null) {
						throw new MissingAttributeException("Author.ContextControlCode");
					}
					cdaAuthor.setContextControlCode(mapAuthor.getContextControlCode());

					if (mapAuthor.getTime() == null) {
						throw new MissingAttributeException("Author.Time");
					}
					TS time = factory.createTS();
					time.setValue(mapAuthor.getTime());
					cdaAuthor.setTime(time);

					if (mapAuthor.getAssignedAuthor() == null) {
						throw new MissingNodeException("Author.AssignedAuthor");
					}
					POCDMT000040AssignedAuthor cdaAssignedAuthor = factory.createPOCDMT000040AssignedAuthor();
					AssignedAuthor mapAssignedAuthor = mapAuthor.getAssignedAuthor();

					cdaAssignedAuthor.setClassCode("ASSIGNED");

					if (mapAssignedAuthor.getIds().isEmpty()) {
						throw new MissingAttributeException("AssignedAuthor.Id");
					}

					if (!mapAssignedAuthor.getIds().isEmpty()) {
						for (ID mapId : mapAssignedAuthor.getIds()) {
							if (mapId.getRoot() != null && mapId.getExtensions() != null) {
								cdaAssignedAuthor.getId().add(this.createCDAId(mapId));
							} else if (mapId.getNullFlavour() != null) {
								II cdaId = factory.createII();
								cdaId.getNullFlavor().add(mapId.getNullFlavour());
								cdaAssignedAuthor.getId().add(cdaId);
							} else {
								throw new MissingAttributeException("AssignedAuthor.ID");
							}
						}
					}

					if (mapAssignedAuthor.getCode() != null) {
						cdaAssignedAuthor.setCode(this.createCDACE(mapAssignedAuthor.getCode()));
					}

					if (mapAssignedAuthor.getAddresses() != null) {
						for (Address mapAddress : mapAssignedAuthor.getAddresses()) {
							cdaAssignedAuthor.getAddr().add(this.createCDAAddress(mapAddress));
						}
					}

					if (mapAssignedAuthor.getTelecoms() != null) {
						for (Telecom mapTelecom : mapAssignedAuthor.getTelecoms()) {
							cdaAssignedAuthor.getTelecom().add(this.createCDATelecom(mapTelecom));
						}
					}

					if (mapAssignedAuthor.getAuthorChoice() instanceof Person) {
						POCDMT000040Person cdaAssignedPerson = factory.createPOCDMT000040Person();
						Person mapAssignedPerson = (Person) mapAssignedAuthor.getAuthorChoice();
						cdaAssignedPerson.getClassCode().add("PSN");
						cdaAssignedPerson.setDeterminerCode("INSTANCE");

						if (mapAssignedPerson.getGivenName() == null && mapAssignedPerson.getFamilyName() == null) {
							throw new MissingAttributeException("AssignedPerson.Name");
						}
						cdaAssignedPerson.getName()
								.add(this.createCDAName(mapAssignedPerson.getGivenName(), mapAssignedPerson.getFamilyName(),
                                                                                mapAssignedPerson.getPrefix(),
										mapAssignedPerson.getSuffix()));
						cdaAssignedAuthor.setAssignedPerson(cdaAssignedPerson);
						cdaAuthor.setAssignedAuthor(cdaAssignedAuthor);
					} else if (mapAssignedAuthor.getAuthorChoice() instanceof AuthoringDevice) {
						POCDMT000040AuthoringDevice cdaAuthoringDevice = factory.createPOCDMT000040AuthoringDevice();
						AuthoringDevice mapAssignedAuthoringDevice = (AuthoringDevice) mapAssignedAuthor.getAuthorChoice();

						if (mapAssignedAuthoringDevice.getClassCode() == null) {
							throw new MissingAttributeException("AuthoringDevice.ClassCode");
						}
						cdaAuthoringDevice.setClassCode(EntityClassDevice.fromValue(mapAssignedAuthoringDevice.getClassCode().getValue()));

						if (mapAssignedAuthoringDevice.getDeterminerCode() == null) {
							throw new MissingAttributeException("AuthoringDevice.DeterminerCode");
						}
						cdaAuthoringDevice.setDeterminerCode(mapAssignedAuthoringDevice.getDeterminerCode());

						if (mapAssignedAuthoringDevice.getCode() != null) {
							cdaAuthoringDevice.setCode(this.createCDACE(mapAssignedAuthoringDevice.getCode()));
						}

						if (mapAssignedAuthoringDevice.getManufacturerModelName() != null) {
							cdaAuthoringDevice.setManufacturerModelName(this.createCDASC(mapAssignedAuthoringDevice.getManufacturerModelName()));
						}

						if (mapAssignedAuthoringDevice.getSoftwareName() != null) {
							cdaAuthoringDevice.setSoftwareName(this.createCDASC(mapAssignedAuthoringDevice.getSoftwareName()));
						}

						if (!mapAssignedAuthoringDevice.getAsMaintainedEntity().isEmpty()) {
							POCDMT000040MaintainedEntity cdaMaintainedEntity = factory.createPOCDMT000040MaintainedEntity();
							for (MaintainedEntity mapMaintainedEntity : mapAssignedAuthoringDevice.getAsMaintainedEntity()) {
								cdaMaintainedEntity.getClassCode().add("MNT");

								IVLTS maintainedEntityEffectiveTime = factory.createIVLTS();
								maintainedEntityEffectiveTime.setValue(mapMaintainedEntity.getEffectiveTime());
								cdaMaintainedEntity.setEffectiveTime(maintainedEntityEffectiveTime);

								POCDMT000040Person maintainingPerson = factory.createPOCDMT000040Person();
								maintainingPerson.getClassCode().add("PSN");
								maintainingPerson.setDeterminerCode("INSTANCE");
								if (mapMaintainedEntity.getMaintainingPerson().getGivenName() != null
										|| mapMaintainedEntity.getMaintainingPerson().getFamilyName() != null
										|| mapMaintainedEntity.getMaintainingPerson().getSuffix() != null) {
									maintainingPerson.getName().add(
											this.createCDAName(mapMaintainedEntity.getMaintainingPerson().getGivenName(), mapMaintainedEntity
													.getMaintainingPerson().getFamilyName(),
                                                                                                        mapMaintainedEntity.getMaintainingPerson().getPrefix(),
                                                                                                        mapMaintainedEntity.getMaintainingPerson().getSuffix()));
								}
								cdaMaintainedEntity.setMaintainingPerson(maintainingPerson);
								cdaAuthoringDevice.getAsMaintainedEntity().add(cdaMaintainedEntity);
							}
						}
						cdaAssignedAuthor.setAssignedAuthoringDevice(cdaAuthoringDevice);
					} else {
						throw new MissingNodeException("Choice: AssignedAuthor.AssignedPerson or AssignedAuthor.AssignedAuthoringDevice");
					}

					if (!mapSection.getComponents5().isEmpty()) {
						for (Component5 mapComponent5 : mapSection.getComponents5()) {
							cdaSection.getComponent().add(this.createCDAComponent5(mapComponent5, mapDocument));
						}
					}

					if (mapAssignedAuthor.getRepresentedOrganization() != null) {
						cdaAssignedAuthor.setRepresentedOrganization(this.createCDAOrganization(mapAssignedAuthor.getRepresentedOrganization()));
					}
					cdaAuthor.setAssignedAuthor(cdaAssignedAuthor);
					cdaSection.getAuthor().add(cdaAuthor);
				}
			}

			if (!mapSection.getInformants().isEmpty()) {
				for (Informant mapInformant : mapSection.getInformants()) {
					cdaSection.getInformant().add(this.createCDAInformant12(mapInformant));
				}
			}
		}
		return cdaSection;
	}

	/**
	 * Creates the cda playing entity.
	 * 
	 * @param mapPlayingEntity
	 *            the map playing entity
	 * @return the pOCDM t000040 playing entity
	 * @throws MissingAttributeException
	 *             the missing attribute exception
	 */
	private POCDMT000040PlayingEntity createCDAPlayingEntity(PlayingEntity mapPlayingEntity) throws MissingAttributeException {
		POCDMT000040PlayingEntity cdaPlayingEntity = factory.createPOCDMT000040PlayingEntity();

		if (mapPlayingEntity.getClassCode() == null) {
			throw new MissingAttributeException("PlayingEntity.ClassCode");
		}
		cdaPlayingEntity.getClassCode().add(mapPlayingEntity.getClassCode());

		if (mapPlayingEntity.getDeterminerCode() == null) {
			throw new MissingAttributeException("PlayingEntity.DeterminerCode");
		}
		cdaPlayingEntity.setDeterminerCode(mapPlayingEntity.getDeterminerCode());

		if (mapPlayingEntity.getCode() != null) {
			cdaPlayingEntity.setCode(this.createCDACE(mapPlayingEntity.getCode()));
		}

		if (!mapPlayingEntity.getQuantities().isEmpty()) {
			for (Quantity mapQuantity : mapPlayingEntity.getQuantities()) {
				PQ cdaQuantity = factory.createPQ();
				cdaQuantity.setUnit(mapQuantity.getUnit());
				cdaQuantity.setValue(mapQuantity.getValue());
				cdaPlayingEntity.getQuantity().add(cdaQuantity);
			}
		}

		if (mapPlayingEntity.getGivenName() != null || mapPlayingEntity.getFamilyName() != null || mapPlayingEntity.getSuffix() != null) {
			cdaPlayingEntity.getName().add(
					this.createCDAName(mapPlayingEntity.getGivenName(), mapPlayingEntity.getFamilyName(), mapPlayingEntity.getPrefix(), mapPlayingEntity.getSuffix()));
		}

		if (mapPlayingEntity.getDesc() != null) {
			ED specimenPlayingEntityDesc = factory.createED();
			specimenPlayingEntityDesc.getContent().add(mapPlayingEntity.getDesc());
			cdaPlayingEntity.setDesc(specimenPlayingEntityDesc);
		}

		return cdaPlayingEntity;
	}

	/**
	 * Creates the cda organization.
	 * 
	 * @param mapOrganization
	 *            the map organization
	 * @return the pOCDM t000040 organization
	 */
	private POCDMT000040Organization createCDAOrganization(Organization mapOrganization) {
		POCDMT000040Organization cdaOrganization = factory.createPOCDMT000040Organization();
		cdaOrganization.setClassCode("ORG");
		cdaOrganization.setDeterminerCode("INSTANCE");
		if (!mapOrganization.getIds().isEmpty()) {
			for (ID mapId : mapOrganization.getIds()) {
				cdaOrganization.getId().add(this.createCDAId(mapId));
			}
		}

		if (mapOrganization.getName() != null) {
			ON wholeOrganizationName = factory.createON();
			wholeOrganizationName.getContent().add(mapOrganization.getName());
			cdaOrganization.getName().add(wholeOrganizationName);
		}

		if (!mapOrganization.getTelecoms().isEmpty()) {
			for (Telecom mapTelecom : mapOrganization.getTelecoms()) {
				cdaOrganization.getTelecom().add(this.createCDATelecom(mapTelecom));
			}
		}

		if (!mapOrganization.getAddrs().isEmpty()) {
			for (Address mapAddress : mapOrganization.getAddrs()) {
				cdaOrganization.getAddr().add(this.createCDAAddress(mapAddress));
			}
		}
		if (mapOrganization.getStandardIndustryClassCode() != null) {
			cdaOrganization.setStandardIndustryClassCode(this.createCDACE(mapOrganization.getStandardIndustryClassCode()));
		}
		return cdaOrganization;
	}

	/**
	 * Creates the cda assigned entity.
	 * 
	 * @param mapAssignedEntity
	 *            the map assigned entity
	 * @return the pOCDM t000040 assigned entity
	 * @throws MissingAttributeException
	 *             the missing attribute exception
	 */
	private POCDMT000040AssignedEntity createCDAAssignedEntity(AssignedEntity mapAssignedEntity) throws MissingAttributeException {
		POCDMT000040AssignedEntity cdaAssignedEntity = factory.createPOCDMT000040AssignedEntity();
		cdaAssignedEntity.setClassCode("ASSIGNED");

		if (mapAssignedEntity.getIds().isEmpty()) {
			throw new MissingAttributeException("AssignedEntity.ID");
		}

		for (ID mapId : mapAssignedEntity.getIds()) {
			cdaAssignedEntity.getId().add(this.createCDAId(mapId));
		}

		if (mapAssignedEntity.getCode() != null) {
			cdaAssignedEntity.setCode(this.createCDACE(mapAssignedEntity.getCode()));
		}

		if (!mapAssignedEntity.getAddresses().isEmpty()) {
			for (Address mapAddress : mapAssignedEntity.getAddresses()) {
				cdaAssignedEntity.getAddr().add(this.createCDAAddress(mapAddress));
			}
		}

		if (!mapAssignedEntity.getTelecoms().isEmpty()) {
			for (Telecom mapTelecom : mapAssignedEntity.getTelecoms()) {
				cdaAssignedEntity.getTelecom().add(this.createCDATelecom(mapTelecom));
			}
		}

		return cdaAssignedEntity;
	}

	/**
	 * Creates the cda subject.
	 * 
	 * @param mapSubject
	 *            the map subject
	 * @return the pOCDM t000040 subject
	 * @throws MissingNodeException
	 *             the missing node exception
	 * @throws MissingAttributeException
	 *             the missing attribute exception
	 */
	private POCDMT000040Subject createCDASubject(Subject mapSubject) throws MissingNodeException, MissingAttributeException {
		POCDMT000040Subject cdaSubject = factory.createPOCDMT000040Subject();
		if (mapSubject.getTypeCode() == null) {
			throw new MissingAttributeException("Subject.TypeCode");
		}
		cdaSubject.setTypeCode(ParticipationTargetSubject.fromValue(mapSubject.getTypeCode().getValue()));

		if (mapSubject.getContextControlCode() == null) {
			throw new MissingAttributeException("Component.Section.Subject.ContextControlCode");
		}

		cdaSubject.setContextControlCode(mapSubject.getContextControlCode());

		if (mapSubject.getAwarenessCode() != null) {
			cdaSubject.setAwarenessCode(this.createCDACE(mapSubject.getAwarenessCode()));
		}

		if (mapSubject.getRelatedSubject() == null) {
			throw new MissingNodeException("Component.Section.Subject.RelatedSubject");
		}
		POCDMT000040RelatedSubject cdaRelatedSubject = factory.createPOCDMT000040RelatedSubject();
		RelatedSubject mapRelatedSubject = mapSubject.getRelatedSubject();

		if (mapRelatedSubject.getClassCode() == null) {
			throw new MissingAttributeException("RelatedSubject.ClassCode");
		}
		cdaRelatedSubject.setClassCode(XDocumentSubject.fromValue(mapRelatedSubject.getClassCode().getValue()));

		if (mapRelatedSubject.getCode() != null) {
			cdaRelatedSubject.setCode(this.createCDACE(mapRelatedSubject.getCode()));
		}

		if (!mapRelatedSubject.getAddrs().isEmpty()) {
			for (Address mapAddress : mapRelatedSubject.getAddrs()) {
				cdaRelatedSubject.getAddr().add(this.createCDAAddress(mapAddress));
			}
		}

		if (!mapRelatedSubject.getTelecoms().isEmpty()) {
			for (Telecom mapTelecom : mapRelatedSubject.getTelecoms()) {
				cdaRelatedSubject.getTelecom().add(this.createCDATelecom(mapTelecom));
			}
		}

		if (mapRelatedSubject.getSubjectPerson() != null) {
			POCDMT000040SubjectPerson cdaSubjectPerson = factory.createPOCDMT000040SubjectPerson();
			SubjectPerson mapSubjectPerson = mapRelatedSubject.getSubjectPerson();

			cdaSubjectPerson.getClassCode().add(mapSubjectPerson.getClassCode());
			cdaSubjectPerson.setDeterminerCode(mapSubjectPerson.getDeterminerCode());

			if (mapSubjectPerson.getGivenName() != null || mapSubjectPerson.getFamilyName() != null || mapSubjectPerson.getSuffix() != null) {
				cdaSubjectPerson.getName().add(
						this.createCDAName(mapSubjectPerson.getGivenName(), mapSubjectPerson.getFamilyName(),mapSubjectPerson.getPrefix(), mapSubjectPerson.getSuffix()));
			}

			cdaRelatedSubject.setSubject(cdaSubjectPerson);
		}
		cdaSubject.setRelatedSubject(cdaRelatedSubject);
		return cdaSubject;
	}

	/**
	 * Creates the cda specimen.
	 * 
	 * @param mapSpecimen
	 *            the map specimen
	 * @return the pOCDM t000040 specimen
	 * @throws MissingNodeException
	 *             the missing node exception
	 * @throws MissingAttributeException
	 *             the missing attribute exception
	 */
	private POCDMT000040Specimen createCDASpecimen(Specimen mapSpecimen) throws MissingNodeException, MissingAttributeException {
		POCDMT000040Specimen cdaSpecimen = factory.createPOCDMT000040Specimen();

		if (mapSpecimen.getTypeCode() == null) {
			throw new MissingAttributeException("Specimen.TypeCode");
		}
		cdaSpecimen.getTypeCode().add(mapSpecimen.getTypeCode());

		if (!mapSpecimen.getSpecimenRoles().isEmpty()) {
			for (SpecimenRole mapSpecimenRole : mapSpecimen.getSpecimenRoles()) {
				POCDMT000040SpecimenRole cdaSpecimenRole = factory.createPOCDMT000040SpecimenRole();

				if (mapSpecimenRole.getClassCode() == null) {
					throw new MissingAttributeException("SpecimenRole.ClassCode");
				}
				cdaSpecimenRole.setClassCode(RoleClassSpecimen.fromValue(mapSpecimenRole.getClassCode().getValue()));

				if (!mapSpecimenRole.getIds().isEmpty()) {
					for (ID mapId : mapSpecimenRole.getIds()) {
						cdaSpecimenRole.getId().add(this.createCDAId(mapId));
					}
				}

				if (mapSpecimenRole.getSpecimenPlayingEntity() != null) {
					cdaSpecimenRole.setSpecimenPlayingEntity(this.createCDAPlayingEntity(mapSpecimenRole.getSpecimenPlayingEntity()));
				}

				cdaSpecimen.setSpecimenRole(cdaSpecimenRole);
			}
		} else {
			throw new MissingNodeException("Specimen.SpecimenRole");
		}

		return cdaSpecimen;
	}

	/**
	 * Creates the cda performer2.
	 * 
	 * @param mapPerformer
	 *            the map performer
	 * @return the pOCDM t000040 performer2
	 * @throws MissingNodeException
	 *             the missing node exception
	 * @throws MissingAttributeException
	 *             the missing attribute exception
	 */
	private POCDMT000040Performer2 createCDAPerformer2(Performer2 mapPerformer) throws MissingNodeException, MissingAttributeException {
		POCDMT000040Performer2 cdaPerformer2 = factory.createPOCDMT000040Performer2();

		if (mapPerformer.getTypeCode() == null) {
			throw new MissingAttributeException("Performer2.TypeCode");
		}
		cdaPerformer2.setTypeCode(ParticipationPhysicalPerformer.valueOf(mapPerformer.getTypeCode().getValue()));

		if (mapPerformer.getTime() != null) {
			IVLTS mapPerformerTime = factory.createIVLTS();
			mapPerformerTime.setValue(mapPerformer.getTime());
			cdaPerformer2.setTime(mapPerformerTime);
		}

		if (mapPerformer.getModeCode() != null) {
			cdaPerformer2.setModeCode(this.createCDACE(mapPerformer.getModeCode()));
		}

		if (mapPerformer.getAssignedEntity() == null) {
			throw new MissingNodeException("Performer.AssignedEntity");
		}
		cdaPerformer2.setAssignedEntity(this.createCDAAssignedEntity(mapPerformer.getAssignedEntity()));

		return cdaPerformer2;
	}

	/**
	 * Creates the cda author.
	 * 
	 * @param mapAuthor
	 *            the map author
	 * @return the pOCDM t000040 author
	 * @throws MissingNodeException
	 *             the missing node exception
	 * @throws MissingAttributeException
	 *             the missing attribute exception
	 */
	private POCDMT000040Author createCDAAuthor(Author mapAuthor) throws MissingNodeException, MissingAttributeException {
		POCDMT000040Author cdaAuthor = factory.createPOCDMT000040Author();

		if (mapAuthor.getTypeCode() == null) {
			throw new MissingAttributeException("Author.TypeCode");
		}
		cdaAuthor.getTypeCode().add(mapAuthor.getTypeCode());

		if (mapAuthor.getFunctionCode() != null) {
			cdaAuthor.setFunctionCode(this.createCDACE(mapAuthor.getFunctionCode()));
		}

		if (mapAuthor.getContextControlCode() == null) {
			throw new MissingAttributeException("Author.ContextControlCode");
		}
		cdaAuthor.setContextControlCode(mapAuthor.getContextControlCode());

		if (mapAuthor.getTime() == null) {
			throw new MissingAttributeException("Author.Time");
		}
		TS time = factory.createTS();
		time.setValue(mapAuthor.getTime());
		cdaAuthor.setTime(time);

		if (mapAuthor.getAssignedAuthor() == null) {
			throw new MissingNodeException("Author.AssignedAuthor");
		}
		POCDMT000040AssignedAuthor cdaAssignedAuthor = factory.createPOCDMT000040AssignedAuthor();
		AssignedAuthor mapAssignedAuthor = mapAuthor.getAssignedAuthor();

		if (mapAssignedAuthor.getClassCode() == null) {
			throw new MissingAttributeException("AssignedAuthor.ClassCode");
		}
		cdaAssignedAuthor.setClassCode(mapAssignedAuthor.getClassCode());

		if (mapAssignedAuthor.getIds().isEmpty()) {
			throw new MissingAttributeException("AssignedAuthor.Id");
		}

		if (!mapAssignedAuthor.getIds().isEmpty()) {
			for (ID mapId : mapAssignedAuthor.getIds()) {
				if (mapId.getRoot() != null && mapId.getExtensions() != null) {
					cdaAssignedAuthor.getId().add(this.createCDAId(mapId));
				} else if (mapId.getNullFlavour() != null) {
					II cdaId = factory.createII();
					cdaId.getNullFlavor().add(mapId.getNullFlavour());
					cdaAssignedAuthor.getId().add(cdaId);
				} else {
					throw new MissingAttributeException("AssignedAuthor.ID");
				}
			}
		}

		if (mapAssignedAuthor.getCode() != null) {
			cdaAssignedAuthor.setCode(this.createCDACE(mapAssignedAuthor.getCode()));
		}

		if (mapAssignedAuthor.getAddresses() != null) {
			for (Address mapAddress : mapAssignedAuthor.getAddresses()) {
				cdaAssignedAuthor.getAddr().add(this.createCDAAddress(mapAddress));
			}
		}

		if (mapAssignedAuthor.getTelecoms() != null) {
			for (Telecom mapTelecom : mapAssignedAuthor.getTelecoms()) {
				cdaAssignedAuthor.getTelecom().add(this.createCDATelecom(mapTelecom));
			}
		}

		if (mapAssignedAuthor.getAuthorChoice() instanceof Person) {
			POCDMT000040Person cdaAssignedPerson = factory.createPOCDMT000040Person();
			Person mapAssignedPerson = (Person) mapAssignedAuthor.getAuthorChoice();
			cdaAssignedPerson.getClassCode().add("PSN");
			cdaAssignedPerson.setDeterminerCode("INSTANCE");

			if (mapAssignedPerson.getGivenName() == null && mapAssignedPerson.getFamilyName() == null) {
				throw new MissingAttributeException("AssignedPerson.Name");
			}
			cdaAssignedPerson.getName().add(
					this.createCDAName(mapAssignedPerson.getGivenName(), mapAssignedPerson.getFamilyName(), mapAssignedPerson.getPrefix(), mapAssignedPerson.getSuffix()));
			cdaAssignedAuthor.setAssignedPerson(cdaAssignedPerson);
			cdaAuthor.setAssignedAuthor(cdaAssignedAuthor);
		} else if (mapAssignedAuthor.getAuthorChoice() instanceof AuthoringDevice) {
			POCDMT000040AuthoringDevice cdaAuthoringDevice = factory.createPOCDMT000040AuthoringDevice();
			AuthoringDevice mapAssignedAuthoringDevice = (AuthoringDevice) mapAssignedAuthor.getAuthorChoice();
			cdaAuthoringDevice.setClassCode(EntityClassDevice.DEV);
			cdaAuthoringDevice.setDeterminerCode("INSTANCE");

			if (mapAssignedAuthoringDevice.getCode() != null) {
				cdaAuthoringDevice.setCode(this.createCDACE(mapAssignedAuthoringDevice.getCode()));
			}

			if (mapAssignedAuthoringDevice.getManufacturerModelName() != null) {
				cdaAuthoringDevice.setManufacturerModelName(this.createCDASC(mapAssignedAuthoringDevice.getManufacturerModelName()));
			}

			if (mapAssignedAuthoringDevice.getSoftwareName() != null) {
				cdaAuthoringDevice.setSoftwareName(this.createCDASC(mapAssignedAuthoringDevice.getSoftwareName()));
			}

			if (!mapAssignedAuthoringDevice.getAsMaintainedEntity().isEmpty()) {
				POCDMT000040MaintainedEntity cdaMaintainedEntity = factory.createPOCDMT000040MaintainedEntity();
				for (MaintainedEntity mapMaintainedEntity : mapAssignedAuthoringDevice.getAsMaintainedEntity()) {
					cdaMaintainedEntity.getClassCode().add("MNT");

					IVLTS maintainedEntityEffectiveTime = factory.createIVLTS();
					maintainedEntityEffectiveTime.setValue(mapMaintainedEntity.getEffectiveTime());
					cdaMaintainedEntity.setEffectiveTime(maintainedEntityEffectiveTime);

					POCDMT000040Person maintainingPerson = factory.createPOCDMT000040Person();
					maintainingPerson.getClassCode().add("PSN");
					maintainingPerson.setDeterminerCode("INSTANCE");
					if (mapMaintainedEntity.getMaintainingPerson().getGivenName() != null
							|| mapMaintainedEntity.getMaintainingPerson().getFamilyName() != null
							|| mapMaintainedEntity.getMaintainingPerson().getSuffix() != null) {
						maintainingPerson.getName().add(
								this.createCDAName(mapMaintainedEntity.getMaintainingPerson().getGivenName(), mapMaintainedEntity
										.getMaintainingPerson().getFamilyName(),
                                                                        mapMaintainedEntity.getMaintainingPerson().getPrefix(),
                                                                        mapMaintainedEntity.getMaintainingPerson().getSuffix()));
					}
					cdaMaintainedEntity.setMaintainingPerson(maintainingPerson);
					cdaAuthoringDevice.getAsMaintainedEntity().add(cdaMaintainedEntity);
				}
			}
			cdaAssignedAuthor.setAssignedAuthoringDevice(cdaAuthoringDevice);
		} else {
			throw new MissingNodeException("Choice: AssignedAuthor.AssignedPerson or AssignedAuthor.AssignedAuthoringDevice");
		}

		if (mapAssignedAuthor.getRepresentedOrganization() != null) {
			cdaAssignedAuthor.setRepresentedOrganization(this.createCDAOrganization(mapAssignedAuthor.getRepresentedOrganization()));
		}
		cdaAuthor.setAssignedAuthor(cdaAssignedAuthor);
		return cdaAuthor;
	}

	/**
	 * Creates the cda informant12.
	 * 
	 * @param mapInformant
	 *            the map informant
	 * @return the pOCDM t000040 informant12
	 * @throws MissingNodeException
	 *             the missing node exception
	 * @throws MissingAttributeException
	 *             the missing attribute exception
	 */
	private POCDMT000040Informant12 createCDAInformant12(Informant mapInformant) throws MissingNodeException, MissingAttributeException {
		POCDMT000040Informant12 cdaInformant = factory.createPOCDMT000040Informant12();
		cdaInformant.getTypeCode().add(mapInformant.getTypeCode().getValue());
		cdaInformant.setContextControlCode(mapInformant.getContextControlCode().getValue());

		if (mapInformant.getInformantChoice() instanceof AssignedEntity) {
			cdaInformant.setAssignedEntity(this.createCDAAssignedEntity((AssignedEntity) mapInformant.getInformantChoice()));
		} else if (mapInformant.getInformantChoice() instanceof RelatedEntity) {
			POCDMT000040RelatedEntity cdaInformantRelatedEntity = factory.createPOCDMT000040RelatedEntity();
			RelatedEntity mapInformantRelatedEntity = (RelatedEntity) mapInformant.getInformantChoice();

//			cdaInformantRelatedEntity.getClassCode().add("CNE");
			if (mapInformantRelatedEntity.getClassCode() != null) {
				cdaInformantRelatedEntity.getClassCode().add(mapInformantRelatedEntity.getClassCode());
			} else {
				throw new MissingAttributeException("RelatedEntity needs ClassCode.");
			}
			
			if (mapInformantRelatedEntity.getCode() != null) {
				cdaInformantRelatedEntity.setCode(this.createCDACE(mapInformantRelatedEntity.getCode()));
			}

			if (!mapInformantRelatedEntity.getAddresses().isEmpty()) {
				for (Address mapAddress : mapInformantRelatedEntity.getAddresses()) {
					cdaInformantRelatedEntity.getAddr().add(this.createCDAAddress(mapAddress));
				}
			}

			if (!mapInformantRelatedEntity.getTelecoms().isEmpty()) {
				for (Telecom mapTelecom : mapInformantRelatedEntity.getTelecoms()) {
					cdaInformantRelatedEntity.getTelecom().add(this.createCDATelecom(mapTelecom));
				}
			}

			if (mapInformantRelatedEntity.getEffectiveTime() != null) {
				IVLTS cdaRelatedEntityEffectiveTime = factory.createIVLTS();
				cdaRelatedEntityEffectiveTime.setValue(mapInformantRelatedEntity.getEffectiveTime().getValue());
				cdaInformantRelatedEntity.setEffectiveTime(cdaRelatedEntityEffectiveTime);
			}

			if (mapInformantRelatedEntity.getRelatedPerson() != null) {
				POCDMT000040Person cdaRelatedPerson = factory.createPOCDMT000040Person();
				Person mapRelatedPerson = mapInformantRelatedEntity.getRelatedPerson();

				cdaRelatedPerson.getClassCode().add("PSN");
				cdaRelatedPerson.setDeterminerCode("INSTANCE");

				if (mapRelatedPerson.getGivenName() != null || mapRelatedPerson.getFamilyName() != null || mapRelatedPerson.getSuffix() != null) {
					cdaRelatedPerson.getName().add(
							this.createCDAName(mapRelatedPerson.getGivenName(), mapRelatedPerson.getFamilyName(), mapRelatedPerson.getPrefix(), mapRelatedPerson.getSuffix()));
				}

				cdaInformantRelatedEntity.setRelatedPerson(cdaRelatedPerson);
			}

			cdaInformant.setRelatedEntity(cdaInformantRelatedEntity);
		} else {
			throw new MissingNodeException("Choice: Informant.AssignedEntity or Informant.RelatedEntity");
		}
		return cdaInformant;
	}

	/**
	 * Creates the cda participant2.
	 * 
	 * @param mapParticipant
	 *            the map participant
	 * @return the pOCDM t000040 participant2
	 * @throws MissingNodeException
	 *             the missing node exception
	 * @throws MissingAttributeException
	 *             the missing attribute exception
	 */
	private POCDMT000040Participant2 createCDAParticipant2(Participant2 mapParticipant) throws MissingNodeException, MissingAttributeException {
		POCDMT000040Participant2 cdaParticipant2 = factory.createPOCDMT000040Participant2();

		if (mapParticipant.getTypeCode() == null) {
			throw new MissingAttributeException("Participant.TypeCode");
		}
		cdaParticipant2.getTypeCode().add(mapParticipant.getTypeCode());

		if (mapParticipant.getContextControlCode() == null) {
			throw new MissingAttributeException("Participant.ContextControlCode");
		}
		cdaParticipant2.setContextControlCode(mapParticipant.getContextControlCode());

		if (mapParticipant.getTime() != null) {
			IVLTS mapParticipantTime = factory.createIVLTS();
			mapParticipantTime.setValue(mapParticipant.getTime());
			cdaParticipant2.setTime(mapParticipantTime);
		}

		if (mapParticipant.getAwarenessCode() != null) {
			cdaParticipant2.setAwarenessCode(this.createCDACE(mapParticipant.getAwarenessCode()));
		}

		// participantRole
		if (!mapParticipant.getParticipantRoles().isEmpty()) {
			for (ParticipantRole mapParticipantRole : mapParticipant.getParticipantRoles()) {
				POCDMT000040ParticipantRole cdaParticipantRole = factory.createPOCDMT000040ParticipantRole();

				if (mapParticipantRole.getClassCode() == null) {
					throw new MissingAttributeException("Participant.ParticipantRole.ClassCode");
				}
				cdaParticipantRole.getClassCode().add(mapParticipantRole.getClassCode());

				if (!mapParticipantRole.getIds().isEmpty()) {
					for (ID mapId : mapParticipantRole.getIds()) {
						cdaParticipantRole.getId().add(this.createCDAId(mapId));
					}
				}

				if (mapParticipantRole.getCode() != null) {
					cdaParticipantRole.setCode(this.createCDACE(mapParticipantRole.getCode()));
				}

				if (!mapParticipantRole.getAddrs().isEmpty()) {
					for (Address mapAddress : mapParticipantRole.getAddrs()) {
						cdaParticipantRole.getAddr().add(this.createCDAAddress(mapAddress));
					}
				}

				if (!mapParticipantRole.getTelecoms().isEmpty()) {
					for (Telecom mapTelecom : mapParticipantRole.getTelecoms()) {
						cdaParticipantRole.getTelecom().add(this.createCDATelecom(mapTelecom));
					}
				}

				if (mapParticipantRole.getEntityChoice() instanceof Device) {
					POCDMT000040Device cdaPlayingDevice = factory.createPOCDMT000040Device();
					Device mapPlayingDevice = (Device) mapParticipantRole.getEntityChoice();

					if (mapPlayingDevice.getClassCode() == null) {
						throw new MissingAttributeException("PlayingDevice.ClassCode");
					}
					cdaPlayingDevice.setClassCode(EntityClassDevice.fromValue(mapPlayingDevice.getClassCode().getValue()));

					if (mapPlayingDevice.getDeterminerCode() == null) {
						throw new MissingAttributeException("PlayingDevice.DeterminerCode");
					}
					cdaPlayingDevice.setDeterminerCode(mapPlayingDevice.getDeterminerCode());

					if (mapPlayingDevice.getCode() != null) {
						cdaPlayingDevice.setCode(this.createCDACE(mapPlayingDevice.getCode()));
					}

					if (mapPlayingDevice.getManufacturerModelName() != null) {
						cdaPlayingDevice.setManufacturerModelName(this.createCDASC(mapPlayingDevice.getManufacturerModelName()));
					}

					if (mapPlayingDevice.getSoftwareName() != null) {
						cdaPlayingDevice.setSoftwareName(this.createCDASC(mapPlayingDevice.getSoftwareName()));
					}

					cdaParticipantRole.setPlayingDevice(cdaPlayingDevice);
				} else if (mapParticipantRole.getEntityChoice() instanceof PlayingEntity) {
					cdaParticipantRole.setPlayingEntity(this.createCDAPlayingEntity((PlayingEntity) mapParticipantRole.getEntityChoice()));
				}

				if (mapParticipantRole.getScopingEntity() != null) {
					POCDMT000040Entity cdaScopingEntity = factory.createPOCDMT000040Entity();
					Entity mapScopingEntity = mapParticipantRole.getScopingEntity();

					if (mapScopingEntity.getClassCode() == null) {
						throw new MissingAttributeException("ScopingEntity.ClassCode");
					}
					cdaScopingEntity.getClassCode().add(mapScopingEntity.getClassCode());

					if (mapScopingEntity.getDeterminerCode() == null) {
						throw new MissingAttributeException("ScopingEntity.DeterminerCode");
					}
					cdaScopingEntity.setDeterminerCode(mapScopingEntity.getDeterminerCode());

					if (!mapScopingEntity.getIds().isEmpty()) {
						for (ID mapId : mapScopingEntity.getIds()) {
							cdaScopingEntity.getId().add(this.createCDAId(mapId));
						}
					}

					if (mapScopingEntity.getCode() != null) {
						cdaScopingEntity.setCode(this.createCDACE(mapScopingEntity.getCode()));
					}

					if (mapScopingEntity.getDesc() != null) {
						ED mapScopingEntityDesc = factory.createED();
						mapScopingEntityDesc.getContent().add(mapScopingEntity.getDesc());
						cdaScopingEntity.setDesc(mapScopingEntityDesc);
					}

					cdaParticipantRole.setScopingEntity(cdaScopingEntity);
				}

				cdaParticipant2.setParticipantRole(cdaParticipantRole);
			}
		} else {
			throw new MissingNodeException("Participant.ParticipantRole");
		}
		return cdaParticipant2;
	}

	/**
	 * Creates the cda entry relationship.
	 * 
	 * @param mapEntryRelationship
	 *            the map entry relationship
	 * @return the pOCDM t000040 entry relationship
	 * @throws MissingNodeException
	 *             the missing node exception
	 * @throws MissingAttributeException
	 *             the missing attribute exception
	 */
	private POCDMT000040EntryRelationship createCDAEntryRelationship(EntryRelationship mapEntryRelationship) throws MissingNodeException,
			MissingAttributeException {
		POCDMT000040EntryRelationship cdaEntryRelationship = factory.createPOCDMT000040EntryRelationship();

		if (mapEntryRelationship.getTypeCode() == null) {
			throw new MissingAttributeException("EntryRelationship.TypeCode");
		}
		cdaEntryRelationship.setTypeCode(XActRelationshipEntryRelationship.valueOf(mapEntryRelationship.getTypeCode().getValue()));

		if (mapEntryRelationship.isInversionInd()) {
			cdaEntryRelationship.setInversionInd(mapEntryRelationship.isInversionInd());
		}

		cdaEntryRelationship.setContextConductionInd(mapEntryRelationship.isContextConductionInd());

		if (mapEntryRelationship.getSequenceNumber() != null) {
			INT mapEntryRelationshipSequenzNumber = factory.createINT();
			mapEntryRelationshipSequenzNumber.setValue(mapEntryRelationship.getSequenceNumber());
			cdaEntryRelationship.setSequenceNumber(mapEntryRelationshipSequenzNumber);
		}

		if (mapEntryRelationship.isNegationInd()) {
			cdaEntryRelationship.setNegationInd(mapEntryRelationship.isNegationInd());
		}

		if (mapEntryRelationship.isSeperateableInd()) {
			BL mapEntryRelationshipSeperateable = factory.createBL();
			mapEntryRelationshipSeperateable.setValue(mapEntryRelationship.isSeperateableInd());
			cdaEntryRelationship.setSeperatableInd(mapEntryRelationshipSeperateable);
		}

		if (mapEntryRelationship.getClinicalStatement() != null) {
			if (mapEntryRelationship.getClinicalStatement() instanceof Act) {
				cdaEntryRelationship.setAct(this.createCDAAct((Act) mapEntryRelationship.getClinicalStatement()));
				
			} else if (mapEntryRelationship.getClinicalStatement() instanceof Encounter) {
				cdaEntryRelationship.setEncounter(this.createCDAEncounter((Encounter) mapEntryRelationship.getClinicalStatement()));
			} else if (mapEntryRelationship.getClinicalStatement() instanceof Observation) {
				cdaEntryRelationship.setObservation(this.createCDAObservation((Observation) mapEntryRelationship.getClinicalStatement()));
			} else if (mapEntryRelationship.getClinicalStatement() instanceof ObservationMedia) {
				cdaEntryRelationship.setObservationMedia(this.createCDAObservationMedia((ObservationMedia) mapEntryRelationship
						.getClinicalStatement()));
			} else if (mapEntryRelationship.getClinicalStatement() instanceof Organizer) {
				cdaEntryRelationship.setOrganizer(this.createCDAOrganizer((Organizer) mapEntryRelationship.getClinicalStatement()));
			} else if (mapEntryRelationship.getClinicalStatement() instanceof Procedure) {
				cdaEntryRelationship.setProcedure(this.createCDAProcedure((Procedure) mapEntryRelationship.getClinicalStatement()));
			} else if (mapEntryRelationship.getClinicalStatement() instanceof RegionOfInterest) {
				cdaEntryRelationship.setRegionOfInterest(this.createCDARegionOfInterest((RegionOfInterest) mapEntryRelationship
						.getClinicalStatement()));
			} else if (mapEntryRelationship.getClinicalStatement() instanceof SubstanceAdministration) {
				cdaEntryRelationship.setSubstanceAdministration(this.createCDASubstanceAdministration((SubstanceAdministration) mapEntryRelationship
						.getClinicalStatement()));
			} else if (mapEntryRelationship.getClinicalStatement() instanceof Supply) {
				cdaEntryRelationship.setSupply(this.createCDASupply((Supply) mapEntryRelationship.getClinicalStatement()));
			} else {
				throw new MissingNodeException(
						"Choice: Act or Encounter or Observation or ObservationMedia or Organizer or Procedure or RegionOfInterest or SubstanceAdministration or Supply");
			}
		} else {
			throw new MissingNodeException("EntryRelationship.ClinicalStatement");
		}
		return cdaEntryRelationship;
	}

	/**
	 * Creates the cda reference.
	 * 
	 * @param mapReference
	 *            the map reference
	 * @return the pOCDM t000040 reference
	 * @throws MissingNodeException
	 *             the missing node exception
	 * @throws MissingAttributeException
	 *             the missing attribute exception
	 */
	private POCDMT000040Reference createCDAReference(Reference mapReference) throws MissingNodeException, MissingAttributeException {
		POCDMT000040Reference cdaReference = factory.createPOCDMT000040Reference();

		if (mapReference.getTypeCode() == null) {
			throw new MissingAttributeException("Reference.TypeCode");
		}
		cdaReference.setTypeCode(XActRelationshipExternalReference.fromValue(mapReference.getTypeCode().getValue()));

		if (mapReference.isSeperatableInd()) {
			BL mapReferenceSeperatable = factory.createBL();
			mapReferenceSeperatable.setValue(mapReference.isSeperatableInd());
			cdaReference.setSeperatableInd(mapReferenceSeperatable);
		}

		if (mapReference.getExternalActChoice() instanceof ExternalAct) {
			POCDMT000040ExternalAct cdaExternalAct = factory.createPOCDMT000040ExternalAct();
			ExternalAct mapExternalAct = (ExternalAct) mapReference.getExternalActChoice();

			if (mapExternalAct.getClassCode() == null) {
				throw new MissingAttributeException("ExternalAct.ClassCode");
			}
			cdaExternalAct.getClassCode().add(mapExternalAct.getClassCode());

			if (mapExternalAct.getMoodCode() == null) {
				throw new MissingAttributeException("ExternalAct.MoodCode");
			}
			cdaExternalAct.getMoodCode().add(mapExternalAct.getMoodCode());

			if (!mapExternalAct.getIds().isEmpty()) {
				for (ID mapId : mapExternalAct.getIds()) {
					cdaExternalAct.getId().add(this.createCDAId(mapId));
				}
			}

			if (mapExternalAct.getCode() != null) {
				cdaExternalAct.setCode(this.createCDACE(mapExternalAct.getCode()));
			}

			if (mapExternalAct.getText() != null) {
				ED mapExternalActText = factory.createED();
				mapExternalActText.getContent().add(mapExternalAct.getText());
				cdaExternalAct.setText(mapExternalActText);
			}

			cdaReference.setExternalAct(cdaExternalAct);
		} else if (mapReference.getExternalActChoice() instanceof ExternalObservation) {
			POCDMT000040ExternalObservation cdaExternalObservation = factory.createPOCDMT000040ExternalObservation();
			ExternalObservation mapExternalObservation = (ExternalObservation) mapReference.getExternalActChoice();

			if (mapExternalObservation.getClassCode() == null) {
				throw new MissingAttributeException("ExternalObservation.ClassCode");
			}
			cdaExternalObservation.getClassCode().add(mapExternalObservation.getClassCode());

			if (mapExternalObservation.getMoodCode() == null) {
				throw new MissingAttributeException("ExternalObservation.MoodCode");
			}
			cdaExternalObservation.getMoodCode().add(mapExternalObservation.getMoodCode());

			if (!mapExternalObservation.getIds().isEmpty()) {
				for (ID mapId : mapExternalObservation.getIds()) {
					cdaExternalObservation.getId().add(this.createCDAId(mapId));
				}
			}

			if (mapExternalObservation.getCode() != null) {
				cdaExternalObservation.setCode(this.createCDACE(mapExternalObservation.getCode()));
			}

			if (mapExternalObservation.getText() != null) {
				ED mapExternalActText = factory.createED();
				mapExternalActText.getContent().add(mapExternalObservation.getText());
				cdaExternalObservation.setText(mapExternalActText);
			}

			cdaReference.setExternalObservation(cdaExternalObservation);
		} else if (mapReference.getExternalActChoice() instanceof ExternalProcedure) {
			POCDMT000040ExternalProcedure cdaExternalProcedure = factory.createPOCDMT000040ExternalProcedure();
			ExternalProcedure mapExternalProcedure = (ExternalProcedure) mapReference.getExternalActChoice();

			if (mapExternalProcedure.getClassCode() == null) {
				throw new MissingAttributeException("ExternalProcedure.ClassCode");
			}
			cdaExternalProcedure.getClassCode().add(mapExternalProcedure.getClassCode());

			if (mapExternalProcedure.getMoodCode() == null) {
				throw new MissingAttributeException("ExternalProcedure.MoodCode");
			}
			cdaExternalProcedure.getMoodCode().add(mapExternalProcedure.getMoodCode());

			if (!mapExternalProcedure.getIds().isEmpty()) {
				for (ID mapId : mapExternalProcedure.getIds()) {
					cdaExternalProcedure.getId().add(this.createCDAId(mapId));
				}
			}

			if (mapExternalProcedure.getCode() != null) {
				cdaExternalProcedure.setCode(this.createCDACE(mapExternalProcedure.getCode()));
			}

			if (mapExternalProcedure.getText() != null) {
				ED mapExternalActText = factory.createED();
				mapExternalActText.getContent().add(mapExternalProcedure.getText());
				cdaExternalProcedure.setText(mapExternalActText);
			}

			cdaReference.setExternalProcedure(cdaExternalProcedure);
		} else if (mapReference.getExternalActChoice() instanceof ExternalDocument) {
			POCDMT000040ExternalDocument cdaExternalDocument = factory.createPOCDMT000040ExternalDocument();
			ExternalDocument mapExternalDocument = (ExternalDocument) mapReference.getExternalActChoice();

			cdaExternalDocument.setClassCode("DOC");
			cdaExternalDocument.getMoodCode().add("EVN");

			if (!mapExternalDocument.getIds().isEmpty()) {
				for (ID mapId : mapExternalDocument.getIds()) {
					cdaExternalDocument.getId().add(this.createCDAId(mapId));
				}
			}

			if (mapExternalDocument.getCode() != null) {
				cdaExternalDocument.setCode(this.createCDACE(mapExternalDocument.getCode()));
			}

			if (mapExternalDocument.getText() != null) {
				ED mapExternalActText = factory.createED();
				mapExternalActText.getContent().add(mapExternalDocument.getText());
				cdaExternalDocument.setText(mapExternalActText);
			}

			if (mapExternalDocument.getSetID() != null) {
				cdaExternalDocument.setSetId(this.createCDAId(mapExternalDocument.getSetID()));
			}

			if (mapExternalDocument.getVersionNumber() != null) {
				INT mapExternalDocumentINT = factory.createINT();
				mapExternalDocumentINT.setValue(mapExternalDocument.getVersionNumber());
				cdaExternalDocument.setVersionNumber(mapExternalDocumentINT);
			}

			cdaReference.setExternalDocument(cdaExternalDocument);
		} else {
			throw new MissingNodeException(
					"Choice: Reference.ExternalAct or Reference.ExternalObservation or Reference.ExternalProcedure or Reference.ExternalDocument");
		}

		return cdaReference;
	}

	/**
	 * Creates the cda precondition.
	 * 
	 * @param mapPrecondition
	 *            the map precondition
	 * @return the pOCDM t000040 precondition
	 * @throws MissingNodeException
	 *             the missing node exception
	 * @throws MissingAttributeException
	 *             the missing attribute exception
	 */
	private POCDMT000040Precondition createCDAPrecondition(Precondition mapPrecondition) throws MissingNodeException, MissingAttributeException {
		POCDMT000040Precondition cdaPrecondition = factory.createPOCDMT000040Precondition();
		cdaPrecondition.getTypeCode().add("PRCN");

		if (!mapPrecondition.getCriterions().isEmpty()) {
			for (Criterion mapCriterion : mapPrecondition.getCriterions()) {
				POCDMT000040Criterion cdaCriterion = factory.createPOCDMT000040Criterion();

				if (mapCriterion.getClassCode() == null) {
					throw new MissingAttributeException("Criterion.ClassCode");
				}
				cdaCriterion.getClassCode().add(mapCriterion.getClassCode());

				if (mapCriterion.getMoodCode() == null) {
					throw new MissingAttributeException("Criterion.MoodCode");
				}
				cdaCriterion.getMoodCode().add(mapCriterion.getMoodCode());

				if (mapCriterion.getCode() != null) {
					cdaCriterion.setCode(this.createCDACE(mapCriterion.getCode()));
				}

				if (mapCriterion.getText() != null) {
					ED mapCriterionText = factory.createED();
					mapCriterionText.getContent().add(mapCriterion.getText());
					cdaCriterion.setText(mapCriterionText);
				}

				if (mapCriterion.getValue() != null) {
					ED mapCriterionValue = factory.createED();
					mapCriterionValue.getContent().add(mapCriterion.getValue());
					cdaCriterion.setValue(mapCriterionValue);
				}

				cdaPrecondition.setCriterion(cdaCriterion);
			}
		} else {
			throw new MissingNodeException("Precondition.Criterion");
		}

		return cdaPrecondition;
	}

	/**
	 * Creates the cda act.
	 * 
	 * @param mapAct
	 *            the map act
	 * @return the pOCDM t000040 act
	 * @throws MissingNodeException
	 *             the missing node exception
	 * @throws MissingAttributeException
	 *             the missing attribute exception
	 */
	private POCDMT000040Act createCDAAct(Act mapAct) throws MissingNodeException, MissingAttributeException {
		POCDMT000040Act cdaAct = factory.createPOCDMT000040Act();

		if (mapAct.getClassCode() == null) {
			throw new MissingAttributeException("Act.ClassCode");
		}
		cdaAct.setClassCode(XActClassDocumentEntryAct.valueOf(mapAct.getClassCode().getValue()));

		if (mapAct.getMoodCode() == null) {
			throw new MissingAttributeException("Act.MoodCode");
		}
		cdaAct.setMoodCode(XDocumentActMood.valueOf(mapAct.getMoodCode().getValue()));

		if (!mapAct.getIds().isEmpty()) {
			for (ID mapId : mapAct.getIds()) {
				cdaAct.getId().add(this.createCDAId(mapId));
			}
		}

		if (mapAct.getCode() == null) {
			throw new MissingAttributeException("Act.Code");
		}
		cdaAct.setCode(this.createCDACE(mapAct.getCode()));

		if (mapAct.isNegationInd()) {
			cdaAct.setNegationInd(mapAct.isNegationInd());
		}

		if (mapAct.getText() != null) {
			ED mapActText = factory.createED();
			mapActText.getContent().add(mapAct.getText());
			cdaAct.setText(mapActText);
		}

		if (mapAct.getStatusCode() != null) {
			cdaAct.setStatusCode(this.createCDACS(new Code(mapAct.getStatusCode().getValue(), "")));
		}

		if (mapAct.getEffectiveTime() != null) {
			IVLTS mapActEffectiveTime = factory.createIVLTS();
			mapActEffectiveTime.setValue(mapAct.getEffectiveTime().getValue());
			cdaAct.setEffectiveTime(mapActEffectiveTime);
		}

		if (mapAct.getPriorityCode() != null) {
			cdaAct.setPriorityCode(this.createCDACE(mapAct.getPriorityCode()));
		}

		if (mapAct.getLanguageCode() != null) {
			cdaAct.setLanguageCode(this.createCDACS(mapAct.getLanguageCode()));
		}

		if (!mapAct.getEntryRelationships().isEmpty()) {
			for (EntryRelationship mapEntryRelationship : mapAct.getEntryRelationships()) {
				cdaAct.getEntryRelationship().add(this.createCDAEntryRelationship(mapEntryRelationship));
			}
		}
		if (!mapAct.getEntryRelationships().isEmpty()) {
			for (EntryRelationship mapEntryRelationship : mapAct.getEntryRelationships()) {
				cdaAct.getEntryRelationship().add(this.createCDAEntryRelationship(mapEntryRelationship));
			}
		}

		if (!mapAct.getSpecimens().isEmpty()) {
			for (Specimen mapSpecimen : mapAct.getSpecimens()) {
				cdaAct.getSpecimen().add(this.createCDASpecimen(mapSpecimen));
			}
		}

		if (!mapAct.getPerformers2().isEmpty()) {
			for (Performer2 mapPerformer : mapAct.getPerformers2()) {
				cdaAct.getPerformer().add(this.createCDAPerformer2(mapPerformer));
			}
		}

		if (!mapAct.getAuthors().isEmpty()) {
			for (Author mapAuthor : mapAct.getAuthors()) {
				cdaAct.getAuthor().add(this.createCDAAuthor(mapAuthor));
			}
		}

		if (!mapAct.getParticipants2().isEmpty()) {
			for (Participant2 mapParticipant : mapAct.getParticipants2()) {
				cdaAct.getParticipant().add(this.createCDAParticipant2(mapParticipant));
			}
		}

		if (!mapAct.getReferences().isEmpty()) {
			for (Reference mapReference : mapAct.getReferences()) {
				cdaAct.getReference().add(this.createCDAReference(mapReference));
			}
		}

		if (!mapAct.getPreconditions().isEmpty()) {
			for (Precondition mapPrecondition : mapAct.getPreconditions()) {
				cdaAct.getPrecondition().add(this.createCDAPrecondition(mapPrecondition));
			}
		}
		return cdaAct;
	}

	/**
	 * Creates the cda encounter.
	 * 
	 * @param mapEncounter
	 *            the map encounter
	 * @return the pOCDM t000040 encounter
	 * @throws MissingNodeException
	 *             the missing node exception
	 * @throws MissingAttributeException
	 *             the missing attribute exception
	 */
	private POCDMT000040Encounter createCDAEncounter(Encounter mapEncounter) throws MissingNodeException, MissingAttributeException {
		POCDMT000040Encounter cdaEncounter = factory.createPOCDMT000040Encounter();

		if (mapEncounter.getClassCode() == null) {
			throw new MissingAttributeException("Encounter.ClassCode");
		}
		cdaEncounter.getClassCode().add(mapEncounter.getClassCode());

		if (mapEncounter.getMoodCode() == null) {
			throw new MissingAttributeException("Encounter.MoodCode");
		}
		cdaEncounter.setMoodCode(XDocumentEncounterMood.fromValue(mapEncounter.getMoodCode().getValue()));

		if (!mapEncounter.getIds().isEmpty()) {
			for (ID mapId : mapEncounter.getIds()) {
				cdaEncounter.getId().add(this.createCDAId(mapId));
			}
		}

		if (mapEncounter.getCode() != null) {
			cdaEncounter.setCode(this.createCDACE(mapEncounter.getCode()));
		}

		if (mapEncounter.getText() != null) {
			ED mapEncounterText = factory.createED();
			mapEncounterText.getContent().add(mapEncounter.getText());
			cdaEncounter.setText(mapEncounterText);
		}

		if (mapEncounter.getStatusCode() != null) {
			cdaEncounter.setStatusCode(this.createCDACS(new Code(mapEncounter.getStatusCode().getValue(), "")));
		}

		if (mapEncounter.getEffectiveTime() != null) {
			IVLTS mapEncounterEffectiveTime = factory.createIVLTS();
			mapEncounterEffectiveTime.setValue(mapEncounter.getEffectiveTime().getValue());
			cdaEncounter.setEffectiveTime(mapEncounterEffectiveTime);
		}

		if (mapEncounter.getPriorityCode() != null) {
			cdaEncounter.setPriorityCode(this.createCDACE(mapEncounter.getPriorityCode()));
		}

		if (!mapEncounter.getEntryRelationships().isEmpty()) {
			for (EntryRelationship mapEntryRelationship : mapEncounter.getEntryRelationships()) {
				cdaEncounter.getEntryRelationship().add(this.createCDAEntryRelationship(mapEntryRelationship));
			}
		}

		if (!mapEncounter.getEntryRelationships().isEmpty()) {
			for (EntryRelationship mapEntryRelationship : mapEncounter.getEntryRelationships()) {
				cdaEncounter.getEntryRelationship().add(this.createCDAEntryRelationship(mapEntryRelationship));
			}
		}

		if (!mapEncounter.getSpecimens().isEmpty()) {
			for (Specimen mapSpecimen : mapEncounter.getSpecimens()) {
				cdaEncounter.getSpecimen().add(this.createCDASpecimen(mapSpecimen));
			}
		}

		if (!mapEncounter.getPerformers2().isEmpty()) {
			for (Performer2 mapPerformer : mapEncounter.getPerformers2()) {
				cdaEncounter.getPerformer().add(this.createCDAPerformer2(mapPerformer));
			}
		}

		if (!mapEncounter.getAuthors().isEmpty()) {
			for (Author mapAuthor : mapEncounter.getAuthors()) {
				cdaEncounter.getAuthor().add(this.createCDAAuthor(mapAuthor));
			}
		}

		if (!mapEncounter.getParticipants2().isEmpty()) {
			for (Participant2 mapParticipant : mapEncounter.getParticipants2()) {
				cdaEncounter.getParticipant().add(this.createCDAParticipant2(mapParticipant));
			}
		}

		if (!mapEncounter.getReferences().isEmpty()) {
			for (Reference mapReference : mapEncounter.getReferences()) {
				cdaEncounter.getReference().add(this.createCDAReference(mapReference));
			}
		}

		if (!mapEncounter.getPreconditions().isEmpty()) {
			for (Precondition mapPrecondition : mapEncounter.getPreconditions()) {
				cdaEncounter.getPrecondition().add(this.createCDAPrecondition(mapPrecondition));
			}
		}

		return cdaEncounter;
	}

	/**
	 * Creates the cda observation.
	 * 
	 * @param mapObservation
	 *            the map observation
	 * @return the pOCDM t000040 observation
	 * @throws MissingNodeException
	 *             the missing node exception
	 * @throws MissingAttributeException
	 *             the missing attribute exception
	 */
	private POCDMT000040Observation createCDAObservation(Observation mapObservation) throws MissingNodeException, MissingAttributeException {
		POCDMT000040Observation cdaObservation = factory.createPOCDMT000040Observation();

		if (mapObservation.getClassCode() == null) {
			throw new MissingAttributeException("Observation.ClassCode");
		}
		cdaObservation.getClassCode().add(mapObservation.getClassCode());

		if (mapObservation.getMoodCode() == null) {
			throw new MissingAttributeException("Observation.MoodCode");
		}
		cdaObservation.setMoodCode(XActMoodDocumentObservation.valueOf(mapObservation.getMoodCode().getValue()));

		if (!mapObservation.getIds().isEmpty()) {
			for (ID mapId : mapObservation.getIds()) {
				cdaObservation.getId().add(this.createCDAId(mapId));
			}
		}

					if (!mapObservation.getTemplateId().isEmpty()){
						for (ID templateId : mapObservation.getTemplateId())
						{
							cdaObservation.getTemplateId().add(createCDAId(templateId));
						}
					}

		if (mapObservation.getCode() != null) {
			cdaObservation.setCode(this.createCDACE(mapObservation.getCode()));
		}

		if (mapObservation.isNegationInd()) {
			cdaObservation.setNegationInd(mapObservation.isNegationInd());
		}

		if (mapObservation.getDerivationExpr() != null) {
			ST mapObservationDerivationExpr = factory.createST();
			mapObservationDerivationExpr.getContent().add(mapObservation.getDerivationExpr());
			cdaObservation.setDerivationExpr(mapObservationDerivationExpr);
		}

		if (mapObservation.getText() != null) {
			ED mapObservationText = factory.createED();
			mapObservationText.getContent().add(mapObservation.getText());
			cdaObservation.setText(mapObservationText);
		}

		if (mapObservation.getStatusCode() != null) {
			CS cs = new CS();
			cs.setCode(mapObservation.getStatusCode().getValue());
			cdaObservation.setStatusCode(cs);
		}

		if (mapObservation.getEffectiveTime() != null) {
			IVLTS mapObservationText = factory.createIVLTS();
			mapObservationText.setValue(mapObservation.getEffectiveTime().getValue());
			cdaObservation.setEffectiveTime(mapObservationText);
		}

		if (mapObservation.getPriorityCode() != null) {
			cdaObservation.setPriorityCode(this.createCDACE(mapObservation.getPriorityCode()));
		}

		if (mapObservation.getRepeatNumber() != null) {
			IVLINT mapObservationRepeatNumber = factory.createIVLINT();
			mapObservationRepeatNumber.setValue(mapObservation.getRepeatNumber());
			cdaObservation.setRepeatNumber(mapObservationRepeatNumber);
		}

		if (mapObservation.getLanguageCode() != null) {
			cdaObservation.setLanguageCode(this.createCDACS(mapObservation.getLanguageCode()));
		}

		if (mapObservation.getValue()!=null) {
			if (mapObservation.getValue() instanceof String) {
				ED mapObservationValue = factory.createED();
				String value = (String) mapObservation.getValue();
				if(value.equals("CDA_CONSENT_SAML"))
				{
					mapObservationValue.setMediaType("text/xml");
					mapObservationValue.setRepresentation(BinaryDataEncoding.TXT);
				}
				mapObservationValue.getContent().add(value);	
				cdaObservation.getValue().add(mapObservationValue);
			}
			else if (mapObservation.getValue() instanceof Code) {
				CD cdaCode = factory.createCD();
				cdaCode.setCode(((Code)mapObservation.getValue()).getCode());
				cdaCode.setCodeSystem(((Code)mapObservation.getValue()).getCodeSystem());
				cdaCode.setCodeSystemName(((Code)mapObservation.getValue()).getCodeSystemName());
				cdaCode.setCodeSystemVersion(((Code)mapObservation.getValue()).getCodeSystemVersion());
				cdaObservation.getValue().add(cdaCode);
			}
			else if (mapObservation.getValue() instanceof Boolean) {
				BL bl = factory.createBL();
				bl.setValue((Boolean) mapObservation.getValue());
				cdaObservation.getValue().add(bl);
			} 
		}

		if (!mapObservation.getInterpretationCodes().isEmpty()) {
			for (Code mapCode : mapObservation.getInterpretationCodes()) {
				cdaObservation.getInterpretationCode().add(this.createCDACE(mapCode));
			}
		}

		if (!mapObservation.getMethodCodes().isEmpty()) {
			for (Code mapCode : mapObservation.getMethodCodes()) {
				cdaObservation.getMethodCode().add(this.createCDACE(mapCode));
			}
		}

		if (!mapObservation.getTargetSiteCodes().isEmpty()) {
			for (Code mapCode : mapObservation.getTargetSiteCodes()) {
				cdaObservation.getTargetSiteCode().add(this.createCDACE(mapCode));
			}
		}

		if (!mapObservation.getReferenceRanges().isEmpty()) {
			for (ReferenceRange mapReferenceRange : mapObservation.getReferenceRanges()) {
				POCDMT000040ReferenceRange cdaReferenceRange = factory.createPOCDMT000040ReferenceRange();

				if (mapReferenceRange.getTypeCode() == null) {
					throw new MissingAttributeException("Observation.ReferenceRange.TypeCode");
				}
				cdaReferenceRange.getTypeCode().add(mapReferenceRange.getTypeCode());

				if (!mapReferenceRange.getObservationRanges().isEmpty()) {
					for (ObservationRange mapObservationRange : mapReferenceRange.getObservationRanges()) {
						POCDMT000040ObservationRange cdaObservationRange = factory.createPOCDMT000040ObservationRange();

						if (mapObservationRange.getClassCode() == null) {
							throw new MissingAttributeException("Observation.ReferenceRange.ObservationRange.ClassCode");
						}
						cdaObservationRange.getClassCode().add(mapObservationRange.getClassCode());

						if (mapObservationRange.getMoodCode() == null) {
							throw new MissingAttributeException("Observation.ReferenceRange.ObservationRange.MoodCode");
						}
						cdaObservationRange.getMoodCode().add(mapObservationRange.getMoodCode());

						if (mapObservationRange.getCode() != null) {
							cdaObservationRange.setCode(this.createCDACE(mapObservationRange.getCode()));
						}

						if (mapObservationRange.getText() != null) {
							ED mapObservationRangeText = factory.createED();
							mapObservationRangeText.getContent().add(mapObservationRange.getText());
							cdaObservationRange.setText(mapObservationRangeText);
						}

						if (mapObservationRange.getValue() != null) {
							ED mapObservationRangeValue = factory.createED();
							mapObservationRangeValue.getContent().add(mapObservationRange.getValue());
							cdaObservationRange.setValue(mapObservationRangeValue);
						}

						if (mapObservationRange.getInterpretationCode() != null) {
							cdaObservationRange.setInterpretationCode(this.createCDACE(mapObservationRange.getInterpretationCode()));
						}

						cdaReferenceRange.setObservationRange(cdaObservationRange);
					}

				} else {
					throw new MissingNodeException("Observation.ReferenceRange.ObservationRange");
				}

				cdaObservation.getReferenceRange().add(cdaReferenceRange);
			}
		}

		if (!mapObservation.getEntryRelationships().isEmpty()) {
			for (EntryRelationship mapEntryRelationship : mapObservation.getEntryRelationships()) {
				cdaObservation.getEntryRelationship().add(this.createCDAEntryRelationship(mapEntryRelationship));
			}
		}

		if (!mapObservation.getSpecimens().isEmpty()) {
			for (Specimen mapSpecimen : mapObservation.getSpecimens()) {
				cdaObservation.getSpecimen().add(this.createCDASpecimen(mapSpecimen));
			}
		}

		if (!mapObservation.getPerformers2().isEmpty()) {
			for (Performer2 mapPerformer : mapObservation.getPerformers2()) {
				cdaObservation.getPerformer().add(this.createCDAPerformer2(mapPerformer));
			}
		}

		if (!mapObservation.getAuthors().isEmpty()) {
			for (Author mapAuthor : mapObservation.getAuthors()) {
				cdaObservation.getAuthor().add(this.createCDAAuthor(mapAuthor));
			}
		}

		if (!mapObservation.getParticipants2().isEmpty()) {
			for (Participant2 mapParticipant : mapObservation.getParticipants2()) {
				cdaObservation.getParticipant().add(this.createCDAParticipant2(mapParticipant));
			}
		}

		if (!mapObservation.getReferences().isEmpty()) {
			for (Reference mapReference : mapObservation.getReferences()) {
				cdaObservation.getReference().add(this.createCDAReference(mapReference));
			}
		}

		if (!mapObservation.getPreconditions().isEmpty()) {
			for (Precondition mapPrecondition : mapObservation.getPreconditions()) {
				cdaObservation.getPrecondition().add(this.createCDAPrecondition(mapPrecondition));
			}
		}

		return cdaObservation;
	}

	/**
	 * Creates the cda observation media.
	 * 
	 * @param mapObservationMedia
	 *            the map observation media
	 * @return the pOCDM t000040 observation media
	 * @throws MissingNodeException
	 *             the missing node exception
	 * @throws MissingAttributeException
	 *             the missing attribute exception
	 */
	private POCDMT000040ObservationMedia createCDAObservationMedia(ObservationMedia mapObservationMedia) throws MissingNodeException,
			MissingAttributeException {
		POCDMT000040ObservationMedia cdaObservationMedia = factory.createPOCDMT000040ObservationMedia();

		if (mapObservationMedia.getClassCode() == null) {
			throw new MissingAttributeException("ObservationMedia.ClassCode");
		}
		cdaObservationMedia.getClassCode().add(mapObservationMedia.getClassCode());

		if (mapObservationMedia.getMoodCode() == null) {
			throw new MissingAttributeException("ObservationMedia.MoodCode");
		}
		cdaObservationMedia.getMoodCode().add(mapObservationMedia.getMoodCode());

		if (!mapObservationMedia.getIds().isEmpty()) {
			for (ID mapId : mapObservationMedia.getIds()) {
				cdaObservationMedia.getId().add(this.createCDAId(mapId));
			}
		}

		if (mapObservationMedia.getLanguageCode() != null) {
			cdaObservationMedia.setLanguageCode(this.createCDACS(mapObservationMedia.getLanguageCode()));
		}

		if (mapObservationMedia.getValue() == null) {
			throw new MissingAttributeException("ObservationMedia.Value");
		}
		ED mapObservationMediaValue = factory.createED();
		mapObservationMediaValue.getContent().add(mapObservationMedia.getValue());
		cdaObservationMedia.setValue(mapObservationMediaValue);

		if (!mapObservationMedia.getEntryRelationships().isEmpty()) {
			for (EntryRelationship mapEntryRelationship : mapObservationMedia.getEntryRelationships()) {
				cdaObservationMedia.getEntryRelationship().add(this.createCDAEntryRelationship(mapEntryRelationship));
			}
		}

		if (!mapObservationMedia.getEntryRelationships().isEmpty()) {
			for (EntryRelationship mapEntryRelationship : mapObservationMedia.getEntryRelationships()) {
				cdaObservationMedia.getEntryRelationship().add(this.createCDAEntryRelationship(mapEntryRelationship));
			}
		}

		if (!mapObservationMedia.getSpecimens().isEmpty()) {
			for (Specimen mapSpecimen : mapObservationMedia.getSpecimens()) {
				cdaObservationMedia.getSpecimen().add(this.createCDASpecimen(mapSpecimen));
			}
		}

		if (!mapObservationMedia.getPerformers2().isEmpty()) {
			for (Performer2 mapPerformer : mapObservationMedia.getPerformers2()) {
				cdaObservationMedia.getPerformer().add(this.createCDAPerformer2(mapPerformer));
			}
		}

		if (!mapObservationMedia.getAuthors().isEmpty()) {
			for (Author mapAuthor : mapObservationMedia.getAuthors()) {
				cdaObservationMedia.getAuthor().add(this.createCDAAuthor(mapAuthor));
			}
		}

		if (!mapObservationMedia.getParticipants2().isEmpty()) {
			for (Participant2 mapParticipant : mapObservationMedia.getParticipants2()) {
				cdaObservationMedia.getParticipant().add(this.createCDAParticipant2(mapParticipant));
			}
		}

		if (!mapObservationMedia.getReferences().isEmpty()) {
			for (Reference mapReference : mapObservationMedia.getReferences()) {
				cdaObservationMedia.getReference().add(this.createCDAReference(mapReference));
			}
		}

		if (!mapObservationMedia.getPreconditions().isEmpty()) {
			for (Precondition mapPrecondition : mapObservationMedia.getPreconditions()) {
				cdaObservationMedia.getPrecondition().add(this.createCDAPrecondition(mapPrecondition));
			}
		}

		return cdaObservationMedia;
	}

	/**
	 * Creates the cda organizer.
	 * 
	 * @param mapOrganizer
	 *            the map organizer
	 * @return the pOCDM t000040 organizer
	 * @throws MissingNodeException
	 *             the missing node exception
	 * @throws MissingAttributeException
	 *             the missing attribute exception
	 */
	private POCDMT000040Organizer createCDAOrganizer(Organizer mapOrganizer) throws MissingNodeException, MissingAttributeException {
		POCDMT000040Organizer cdaOrganizer = factory.createPOCDMT000040Organizer();

		if (mapOrganizer.getClassCode() == null) {
			throw new MissingAttributeException("Organizer.ClassCode");
		}
		cdaOrganizer.setClassCode(XActClassDocumentEntryOrganizer.valueOf(mapOrganizer.getClassCode().getValue()));

		if (mapOrganizer.getMoodCode() == null) {
			throw new MissingAttributeException("Organizer.MoodCode");
		}
		cdaOrganizer.getMoodCode().add(mapOrganizer.getMoodCode());

		if (!mapOrganizer.getIds().isEmpty()) {
			for (ID mapId : mapOrganizer.getIds()) {
				cdaOrganizer.getId().add(this.createCDAId(mapId));
			}
		}

		if (mapOrganizer.getCode() != null) {
			cdaOrganizer.setCode(this.createCDACE(mapOrganizer.getCode()));
		}

		if (mapOrganizer.getStatusCode() == null) {
			throw new MissingAttributeException("Organizer.StatusCode");
		}
		cdaOrganizer.setStatusCode(this.createCDACS(new Code(mapOrganizer.getStatusCode().getValue(), "")));

		if (mapOrganizer.getEffectiveTime() != null) {
			IVLTS mapOrganizerEffectiveTime = factory.createIVLTS();
			mapOrganizerEffectiveTime.setValue(mapOrganizer.getEffectiveTime().getValue());
			cdaOrganizer.setEffectiveTime(mapOrganizerEffectiveTime);
		}

		if (!mapOrganizer.getComponents4().isEmpty()) {
			for (Component4 mapComponent4 : mapOrganizer.getComponents4()) {
				POCDMT000040Component4 cdaComponent4 = factory.createPOCDMT000040Component4();

				if (mapComponent4.getTypeCode() == null) {
					throw new MissingAttributeException("Organizer.Component.TypeCode");
				}
				cdaComponent4.setTypeCode(ActRelationshipHasComponent.valueOf(mapComponent4.getTypeCode().getValue()));

				cdaComponent4.setContextConductionInd(mapComponent4.isContextConductionInd());

				if (mapComponent4.getSequenceNumber() != null) {
					INT mapComponent4SequenceNumber = factory.createINT();
					mapComponent4SequenceNumber.setValue(mapComponent4.getSequenceNumber());
					cdaComponent4.setSequenceNumber(mapComponent4SequenceNumber);
				}

				if (mapComponent4.isSeperateableInd()) {
					BL mapComponent4SeperateableInd = factory.createBL();
					mapComponent4SeperateableInd.setValue(mapComponent4.isContextConductionInd());
					cdaComponent4.setSeperatableInd(mapComponent4SeperateableInd);
				}
				for (ClinicalStatement mapClinicalStatement : mapComponent4.getClinicalStatements()) {
					if (mapClinicalStatement instanceof Act) {
						cdaComponent4.setAct(this.createCDAAct((Act) mapClinicalStatement));
					} else if (mapClinicalStatement instanceof Encounter) {
						cdaComponent4.setEncounter(this.createCDAEncounter((Encounter) mapClinicalStatement));
					} else if (mapClinicalStatement instanceof Observation) {
						cdaComponent4.setObservation(this.createCDAObservation((Observation) mapClinicalStatement));
					} else if (mapClinicalStatement instanceof ObservationMedia) {
						cdaComponent4.setObservationMedia(this.createCDAObservationMedia((ObservationMedia) mapClinicalStatement));
					} else if (mapClinicalStatement instanceof Organizer) {
						cdaComponent4.setOrganizer(this.createCDAOrganizer((Organizer) mapClinicalStatement));
					} else if (mapClinicalStatement instanceof Procedure) {
						cdaComponent4.setProcedure(this.createCDAProcedure((Procedure) mapClinicalStatement));
					} else if (mapClinicalStatement instanceof RegionOfInterest) {
						cdaComponent4.setRegionOfInterest(this.createCDARegionOfInterest((RegionOfInterest) mapClinicalStatement));
					} else if (mapClinicalStatement instanceof SubstanceAdministration) {
						cdaComponent4.setSubstanceAdministration(this
								.createCDASubstanceAdministration((SubstanceAdministration) mapClinicalStatement));
					} else if (mapClinicalStatement instanceof Supply) {
						cdaComponent4.setSupply(this.createCDASupply((Supply) mapClinicalStatement));
					} else {
						throw new MissingNodeException(
								"Choice: Act or Encounter or Observation or ObservationMedia or Organizer or Procedure or RegionOfInterest or SubstanceAdministration or Supply");
					}
				}

				cdaOrganizer.getComponent().add(cdaComponent4);
			}

			if (!mapOrganizer.getSpecimens().isEmpty()) {
				for (Specimen mapSpecimen : mapOrganizer.getSpecimens()) {
					cdaOrganizer.getSpecimen().add(this.createCDASpecimen(mapSpecimen));
				}
			}

			if (!mapOrganizer.getPerformers2().isEmpty()) {
				for (Performer2 mapPerformer : mapOrganizer.getPerformers2()) {
					cdaOrganizer.getPerformer().add(this.createCDAPerformer2(mapPerformer));
				}
			}

			if (!mapOrganizer.getAuthors().isEmpty()) {
				for (Author mapAuthor : mapOrganizer.getAuthors()) {
					cdaOrganizer.getAuthor().add(this.createCDAAuthor(mapAuthor));
				}
			}

			if (!mapOrganizer.getParticipants2().isEmpty()) {
				for (Participant2 mapParticipant : mapOrganizer.getParticipants2()) {
					cdaOrganizer.getParticipant().add(this.createCDAParticipant2(mapParticipant));
				}
			}

			if (!mapOrganizer.getReferences().isEmpty()) {
				for (Reference mapReference : mapOrganizer.getReferences()) {
					cdaOrganizer.getReference().add(this.createCDAReference(mapReference));
				}
			}

			if (!mapOrganizer.getPreconditions().isEmpty()) {
				for (Precondition mapPrecondition : mapOrganizer.getPreconditions()) {
					cdaOrganizer.getPrecondition().add(this.createCDAPrecondition(mapPrecondition));
				}
			}
		}
		return cdaOrganizer;
	}

	/**
	 * Creates the cda procedure.
	 * 
	 * @param mapProcedure
	 *            the map procedure
	 * @return the pOCDM t000040 procedure
	 * @throws MissingNodeException
	 *             the missing node exception
	 * @throws MissingAttributeException
	 *             the missing attribute exception
	 */
	private POCDMT000040Procedure createCDAProcedure(Procedure mapProcedure) throws MissingNodeException, MissingAttributeException {
		POCDMT000040Procedure cdaProcedure = factory.createPOCDMT000040Procedure();

		if (mapProcedure.getClassCode() == null) {
			throw new MissingAttributeException("Procedure.ClassCode");
		}
		cdaProcedure.getClassCode().add(mapProcedure.getClassCode());

		if (mapProcedure.getMoodCode() == null) {
			throw new MissingAttributeException("Procedure.MoodCode");
		}
		cdaProcedure.setMoodCode(XDocumentProcedureMood.fromValue(mapProcedure.getMoodCode().getValue()));

		if (!mapProcedure.getIds().isEmpty()) {
			for (ID mapId : mapProcedure.getIds()) {
				cdaProcedure.getId().add(this.createCDAId(mapId));
			}
		}

		if (mapProcedure.getCode() != null) {
			cdaProcedure.setCode(this.createCDACE(mapProcedure.getCode()));
		}

		if (mapProcedure.isNegationInd()) {
			cdaProcedure.setNegationInd(mapProcedure.isNegationInd());
		}

		if (mapProcedure.getText() != null) {
			ED mapProcedureText = factory.createED();
			mapProcedureText.getContent().add(mapProcedure.getText());
			cdaProcedure.setText(mapProcedureText);
		}

		if (mapProcedure.getStatusCode() != null) {
			cdaProcedure.setStatusCode(this.createCDACS(new Code(mapProcedure.getStatusCode().getValue(), "")));
		}

		if (mapProcedure.getEffectiveTime() != null) {
			IVLTS mapProcedureEffectiveTime = factory.createIVLTS();
			mapProcedureEffectiveTime.setValue(mapProcedure.getEffectiveTime().getValue());
			cdaProcedure.setEffectiveTime(mapProcedureEffectiveTime);
		}

		if (mapProcedure.getPriorityCode() != null) {
			cdaProcedure.setPriorityCode(this.createCDACE(mapProcedure.getPriorityCode()));
		}

		if (mapProcedure.getLanguageCode() != null) {
			cdaProcedure.setLanguageCode(this.createCDACS(mapProcedure.getLanguageCode()));
		}

		if (!mapProcedure.getMethodCodes().isEmpty()) {
			for (Code mapCode : mapProcedure.getMethodCodes()) {
				cdaProcedure.getMethodCode().add(this.createCDACE(mapCode));
			}
		}

		if (!mapProcedure.getApproachSiteCodes().isEmpty()) {
			for (Code mapCode : mapProcedure.getMethodCodes()) {
				cdaProcedure.getApproachSiteCode().add(this.createCDACE(mapCode));
			}
		}

		if (!mapProcedure.getTargetSiteCode().isEmpty()) {
			for (Code mapCode : mapProcedure.getTargetSiteCode()) {
				cdaProcedure.getApproachSiteCode().add(this.createCDACE(mapCode));
			}
		}

		if (!mapProcedure.getEntryRelationships().isEmpty()) {
			for (EntryRelationship mapEntryRelationship : mapProcedure.getEntryRelationships()) {
				cdaProcedure.getEntryRelationship().add(this.createCDAEntryRelationship(mapEntryRelationship));
			}
		}

		if (!mapProcedure.getEntryRelationships().isEmpty()) {
			for (EntryRelationship mapEntryRelationship : mapProcedure.getEntryRelationships()) {
				cdaProcedure.getEntryRelationship().add(this.createCDAEntryRelationship(mapEntryRelationship));
			}
		}

		if (!mapProcedure.getSpecimens().isEmpty()) {
			for (Specimen mapSpecimen : mapProcedure.getSpecimens()) {
				cdaProcedure.getSpecimen().add(this.createCDASpecimen(mapSpecimen));
			}
		}

		if (!mapProcedure.getPerformers2().isEmpty()) {
			for (Performer2 mapPerformer : mapProcedure.getPerformers2()) {
				cdaProcedure.getPerformer().add(this.createCDAPerformer2(mapPerformer));
			}
		}

		if (!mapProcedure.getAuthors().isEmpty()) {
			for (Author mapAuthor : mapProcedure.getAuthors()) {
				cdaProcedure.getAuthor().add(this.createCDAAuthor(mapAuthor));
			}
		}

		if (!mapProcedure.getParticipants2().isEmpty()) {
			for (Participant2 mapParticipant : mapProcedure.getParticipants2()) {
				cdaProcedure.getParticipant().add(this.createCDAParticipant2(mapParticipant));
			}
		}

		if (!mapProcedure.getReferences().isEmpty()) {
			for (Reference mapReference : mapProcedure.getReferences()) {
				cdaProcedure.getReference().add(this.createCDAReference(mapReference));
			}
		}

		if (!mapProcedure.getPreconditions().isEmpty()) {
			for (Precondition mapPrecondition : mapProcedure.getPreconditions()) {
				cdaProcedure.getPrecondition().add(this.createCDAPrecondition(mapPrecondition));
			}
		}

		return cdaProcedure;
	}

	/**
	 * Creates the cda region of interest.
	 * 
	 * @param mapRegionOfInterest
	 *            the map region of interest
	 * @return the pOCDM t000040 region of interest
	 * @throws MissingNodeException
	 *             the missing node exception
	 * @throws MissingAttributeException
	 *             the missing attribute exception
	 */
	private POCDMT000040RegionOfInterest createCDARegionOfInterest(RegionOfInterest mapRegionOfInterest) throws MissingNodeException,
			MissingAttributeException {
		POCDMT000040RegionOfInterest cdaRegionOfInterest = factory.createPOCDMT000040RegionOfInterest();

		if (mapRegionOfInterest.getClassCode() == null) {
			throw new MissingAttributeException("RegionOfInterest.ClassCode");
		}
		cdaRegionOfInterest.getClassCode().add(mapRegionOfInterest.getClassCode());

		if (mapRegionOfInterest.getMoodCode() == null) {
			throw new MissingAttributeException("RegionOfInterest.MoodCode");
		}
		cdaRegionOfInterest.getMoodCode().add(mapRegionOfInterest.getMoodCode());

		if (mapRegionOfInterest.getIds().isEmpty()) {
			throw new MissingAttributeException("RegionOfInterest.ID");
		}
		for (ID mapId : mapRegionOfInterest.getIds()) {
			cdaRegionOfInterest.getId().add(this.createCDAId(mapId));
		}

		if (mapRegionOfInterest.getCode() == null) {
			throw new MissingAttributeException("RegionOfInterest.Code");
		}
		cdaRegionOfInterest.setCode(this.createCDACS(mapRegionOfInterest.getCode()));

		if (mapRegionOfInterest.getValues().isEmpty()) {
			throw new MissingAttributeException("RegionOfInterest.Value");
		}
		for (BigInteger mapValue : mapRegionOfInterest.getValues()) {
			POCDMT000040RegionOfInterestValue mapRegionOfInterestValue = factory.createPOCDMT000040RegionOfInterestValue();
			mapRegionOfInterestValue.setValue(mapValue);
			cdaRegionOfInterest.getValue().add(mapRegionOfInterestValue);
		}

		if (!mapRegionOfInterest.getEntryRelationships().isEmpty()) {
			for (EntryRelationship mapEntryRelationship : mapRegionOfInterest.getEntryRelationships()) {
				cdaRegionOfInterest.getEntryRelationship().add(this.createCDAEntryRelationship(mapEntryRelationship));
			}
		}
		if (!mapRegionOfInterest.getEntryRelationships().isEmpty()) {
			for (EntryRelationship mapEntryRelationship : mapRegionOfInterest.getEntryRelationships()) {
				cdaRegionOfInterest.getEntryRelationship().add(this.createCDAEntryRelationship(mapEntryRelationship));
			}
		}

		if (!mapRegionOfInterest.getSpecimens().isEmpty()) {
			for (Specimen mapSpecimen : mapRegionOfInterest.getSpecimens()) {
				cdaRegionOfInterest.getSpecimen().add(this.createCDASpecimen(mapSpecimen));
			}
		}

		if (!mapRegionOfInterest.getPerformers2().isEmpty()) {
			for (Performer2 mapPerformer : mapRegionOfInterest.getPerformers2()) {
				cdaRegionOfInterest.getPerformer().add(this.createCDAPerformer2(mapPerformer));
			}
		}

		if (!mapRegionOfInterest.getAuthors().isEmpty()) {
			for (Author mapAuthor : mapRegionOfInterest.getAuthors()) {
				cdaRegionOfInterest.getAuthor().add(this.createCDAAuthor(mapAuthor));
			}
		}

		if (!mapRegionOfInterest.getParticipants2().isEmpty()) {
			for (Participant2 mapParticipant : mapRegionOfInterest.getParticipants2()) {
				cdaRegionOfInterest.getParticipant().add(this.createCDAParticipant2(mapParticipant));
			}
		}

		if (!mapRegionOfInterest.getReferences().isEmpty()) {
			for (Reference mapReference : mapRegionOfInterest.getReferences()) {
				cdaRegionOfInterest.getReference().add(this.createCDAReference(mapReference));
			}
		}

		if (!mapRegionOfInterest.getPreconditions().isEmpty()) {
			for (Precondition mapPrecondition : mapRegionOfInterest.getPreconditions()) {
				cdaRegionOfInterest.getPrecondition().add(this.createCDAPrecondition(mapPrecondition));
			}
		}

		return cdaRegionOfInterest;
	}

	/**
	 * Creates the cda substance administration.
	 * 
	 * @param mapSubstanceAdministration
	 *            the map substance administration
	 * @return the pOCDM t000040 substance administration
	 * @throws MissingNodeException
	 *             the missing node exception
	 * @throws MissingAttributeException
	 *             the missing attribute exception
	 */
	private POCDMT000040SubstanceAdministration createCDASubstanceAdministration(SubstanceAdministration mapSubstanceAdministration)
			throws MissingNodeException, MissingAttributeException {
		POCDMT000040SubstanceAdministration cdaSubstanceAdministration = factory.createPOCDMT000040SubstanceAdministration();

		if (mapSubstanceAdministration.getClassCode() == null) {
			throw new MissingAttributeException("SubstanceAdministration.ClassCode");
		}
		cdaSubstanceAdministration.getClassCode().add(mapSubstanceAdministration.getClassCode());

		if (mapSubstanceAdministration.getMoodCode() == null) {
			throw new MissingAttributeException("SubstanceAdministration.MoodCode");
		}
		cdaSubstanceAdministration.setMoodCode(XDocumentSubstanceMood.valueOf(mapSubstanceAdministration.getMoodCode().getValue()));

		if (!mapSubstanceAdministration.getIds().isEmpty()) {
			for (ID mapId : mapSubstanceAdministration.getIds()) {
				cdaSubstanceAdministration.getId().add(this.createCDAId(mapId));
			}
		}

		if (mapSubstanceAdministration.getCode() != null) {
			cdaSubstanceAdministration.setCode(this.createCDACE(mapSubstanceAdministration.getCode()));
		}

		if (mapSubstanceAdministration.isNegationInd()) {
			cdaSubstanceAdministration.setNegationInd(mapSubstanceAdministration.isNegationInd());
		}

		if (mapSubstanceAdministration.getText() != null) {
			ED mapSubstanceAdministrationText = factory.createED();
			mapSubstanceAdministrationText.getContent().add(mapSubstanceAdministration.getText());
			cdaSubstanceAdministration.setText(mapSubstanceAdministrationText);
		}

		if (mapSubstanceAdministration.getStatusCode() != null) {
			Code sc = new Code(mapSubstanceAdministration.getStatusCode().toString());
			cdaSubstanceAdministration.setStatusCode(this.createCDACS(sc));
		}

		if(mapSubstanceAdministration.getEffectiveTime() != null) {
//		    SXCMTS cdaEffectiveTime = factory.createSXCMTS();
//		    cdaEffectiveTime.setValue(mapSubstanceAdministration.getEffectiveTime().getValue());
//		    cdaSubstanceAdministration.getEffectiveTime().add(cdaEffectiveTime);
		    
		    
		    IVXBTS cdaSubstanceHighValue = factory.createIVXBTS();
		    cdaSubstanceHighValue.setValue(mapSubstanceAdministration.getEffectiveTime().getHigh());
		    JAXBElement<IVXBTS> cdaSubstanceHigh = factory.createIVLTSHigh(cdaSubstanceHighValue);
			
		    IVXBTS cdaSubstanceLowValue = factory.createIVXBTS();
		    cdaSubstanceLowValue.setValue(mapSubstanceAdministration.getEffectiveTime().getLow());
		    JAXBElement<IVXBTS> cdaSubstanceLow = factory.createIVLTSLow(cdaSubstanceLowValue);
			
		    IVLTS cdaSubstanceEffectiveTime = factory.createIVLTS();
		    cdaSubstanceEffectiveTime.getRest().add(cdaSubstanceLow);
		    cdaSubstanceEffectiveTime.getRest().add(cdaSubstanceHigh);
			
//			cdaParticipant.setTime(cdaParticipantTime);
		    
		    cdaSubstanceAdministration.getEffectiveTime().add(cdaSubstanceEffectiveTime);
		    
		}
		
//		if (!mapSubstanceAdministration.getEffectiveTimes().isEmpty()) {
//			for (EffectiveTime mapEffectiveTime : mapSubstanceAdministration.getEffectiveTimes()) {
//				SXCMTS cdaEffectiveTime = factory.createSXCMTS();
//				cdaEffectiveTime.setValue(mapEffectiveTime.getValue());
//				cdaSubstanceAdministration.getEffectiveTime().add(cdaEffectiveTime);
//			}
//		}

		if (mapSubstanceAdministration.getPriorityCode() != null) {
			cdaSubstanceAdministration.setPriorityCode(this.createCDACE(mapSubstanceAdministration.getPriorityCode()));
		}

		if (mapSubstanceAdministration.getRepeatNumber() != null) {
			IVLINT mapSubstanceAdministrationRepeatNumber = factory.createIVLINT();
			mapSubstanceAdministrationRepeatNumber.setValue(mapSubstanceAdministration.getRepeatNumber());
			cdaSubstanceAdministration.setRepeatNumber(mapSubstanceAdministrationRepeatNumber);
		}

		if (mapSubstanceAdministration.getRouteCode() != null) {
			cdaSubstanceAdministration.setRouteCode(this.createCDACE(mapSubstanceAdministration.getRouteCode()));
		}

		if (!mapSubstanceAdministration.getApproachSiteCodes().isEmpty()) {
			for (Code mapCode : mapSubstanceAdministration.getApproachSiteCodes()) {
				cdaSubstanceAdministration.getApproachSiteCode().add(this.createCDACE(mapCode));
			}
		}

		if (mapSubstanceAdministration.getDoseQuantity() != null) {
			IVLPQ cdaIVLPQ = factory.createIVLPQ();
			cdaIVLPQ.setValue(mapSubstanceAdministration.getDoseQuantity().getValue());
			cdaIVLPQ.setUnit(mapSubstanceAdministration.getDoseQuantity().getUnit());
			cdaIVLPQ.setOperator(SetOperator.fromValue(mapSubstanceAdministration.getDoseQuantity().getSetOperator().getValue()));

			cdaSubstanceAdministration.setDoseQuantity(cdaIVLPQ);
		}

		if (mapSubstanceAdministration.getRateQuantity() != null) {
			IVLPQ cdaIVLPQ = factory.createIVLPQ();
			cdaIVLPQ.setValue(mapSubstanceAdministration.getRateQuantity().getValue());
			cdaIVLPQ.setUnit(mapSubstanceAdministration.getRateQuantity().getUnit());
			cdaIVLPQ.setOperator(SetOperator.fromValue(mapSubstanceAdministration.getRateQuantity().getSetOperator().getValue()));

			cdaSubstanceAdministration.setRateQuantity(cdaIVLPQ);
		}

		if (mapSubstanceAdministration.getMaxDoseQuantity() != null) {
			PQ cdaDenominator = factory.createPQ();
			cdaDenominator.setValue(mapSubstanceAdministration.getMaxDoseQuantity().getDenominator().getValue());
			cdaDenominator.setUnit(mapSubstanceAdministration.getMaxDoseQuantity().getDenominator().getUnit());

			PQ cdaNumerator = factory.createPQ();
			cdaNumerator.setValue(mapSubstanceAdministration.getMaxDoseQuantity().getEnumerator().getValue());
			cdaNumerator.setUnit(mapSubstanceAdministration.getMaxDoseQuantity().getEnumerator().getUnit());

			RTOPQPQ cdaRTOPQPQ = factory.createRTOPQPQ();
			cdaRTOPQPQ.setDenominator(cdaDenominator);
			cdaRTOPQPQ.setNumerator(cdaNumerator);
			cdaSubstanceAdministration.setMaxDoseQuantity(cdaRTOPQPQ);
		}

		if (mapSubstanceAdministration.getAdministrationUnitCode() != null) {
			cdaSubstanceAdministration.setAdministrationUnitCode(this.createCDACE(mapSubstanceAdministration.getAdministrationUnitCode()));
		}

		if (mapSubstanceAdministration.getConsumable() != null) {
			POCDMT000040Consumable cdaConsumable = factory.createPOCDMT000040Consumable();
			Consumable mapConsumable = mapSubstanceAdministration.getConsumable();
			if (mapConsumable.getTypeCode() == null) {
				throw new MissingAttributeException("Consumable.TypeCode");
			}
			cdaConsumable.getTypeCode().add(mapConsumable.getTypeCode());

			if (mapConsumable.getManufacturedProduct() != null) {
				cdaConsumable.setManufacturedProduct(this.createCDAManufacturedProduct(mapConsumable.getManufacturedProduct()));
			} else {
				throw new MissingNodeException("Consumable.ManufacturedProduct");
			}

			cdaSubstanceAdministration.setConsumable(cdaConsumable);
		} else {
			throw new MissingNodeException("SubstanceAdministration.Consumable");
		}

		if (!mapSubstanceAdministration.getEntryRelationships().isEmpty()) {
			for (EntryRelationship mapEntryRelationship : mapSubstanceAdministration.getEntryRelationships()) {
				cdaSubstanceAdministration.getEntryRelationship().add(this.createCDAEntryRelationship(mapEntryRelationship));
			}
		}

		if (!mapSubstanceAdministration.getEntryRelationships().isEmpty()) {
			for (EntryRelationship mapEntryRelationship : mapSubstanceAdministration.getEntryRelationships()) {
				cdaSubstanceAdministration.getEntryRelationship().add(this.createCDAEntryRelationship(mapEntryRelationship));
			}
		}

		if (!mapSubstanceAdministration.getSpecimens().isEmpty()) {
			for (Specimen mapSpecimen : mapSubstanceAdministration.getSpecimens()) {
				cdaSubstanceAdministration.getSpecimen().add(this.createCDASpecimen(mapSpecimen));
			}
		}

		if (!mapSubstanceAdministration.getPerformers2().isEmpty()) {
			for (Performer2 mapPerformer : mapSubstanceAdministration.getPerformers2()) {
				cdaSubstanceAdministration.getPerformer().add(this.createCDAPerformer2(mapPerformer));
			}
		}

		if (!mapSubstanceAdministration.getAuthors().isEmpty()) {
			for (Author mapAuthor : mapSubstanceAdministration.getAuthors()) {
				cdaSubstanceAdministration.getAuthor().add(this.createCDAAuthor(mapAuthor));
			}
		}

		if (!mapSubstanceAdministration.getParticipants2().isEmpty()) {
			for (Participant2 mapParticipant : mapSubstanceAdministration.getParticipants2()) {
				cdaSubstanceAdministration.getParticipant().add(this.createCDAParticipant2(mapParticipant));
			}
		}

		if (!mapSubstanceAdministration.getReferences().isEmpty()) {
			for (Reference mapReference : mapSubstanceAdministration.getReferences()) {
				cdaSubstanceAdministration.getReference().add(this.createCDAReference(mapReference));
			}
		}

		if (!mapSubstanceAdministration.getPreconditions().isEmpty()) {
			for (Precondition mapPrecondition : mapSubstanceAdministration.getPreconditions()) {
				cdaSubstanceAdministration.getPrecondition().add(this.createCDAPrecondition(mapPrecondition));
			}
		}

		return cdaSubstanceAdministration;
	}

	/**
	 * Creates the cda supply.
	 * 
	 * @param mapSupply
	 *            the map supply
	 * @return the pOCDM t000040 supply
	 * @throws MissingNodeException
	 *             the missing node exception
	 * @throws MissingAttributeException
	 *             the missing attribute exception
	 */
	private POCDMT000040Supply createCDASupply(Supply mapSupply) throws MissingNodeException, MissingAttributeException {
		POCDMT000040Supply cdaSupply = factory.createPOCDMT000040Supply();

		if (mapSupply.getClassCode() == null) {
			throw new MissingAttributeException("Supply.ClassCode");
		}
		cdaSupply.setClassCode(ActClassSupply.fromValue(mapSupply.getClassCode().getValue()));

		if (mapSupply.getMoodCode() == null) {
			throw new MissingAttributeException("Supply.MoodCode");
		}
		cdaSupply.setMoodCode(XDocumentSubstanceMood.fromValue(mapSupply.getMoodCode().getValue()));

		if (!mapSupply.getIds().isEmpty()) {
			for (ID mapId : mapSupply.getIds()) {
				cdaSupply.getId().add(this.createCDAId(mapId));
			}
		}

		if (mapSupply.getCode() != null) {
			cdaSupply.setCode(this.createCDACE(mapSupply.getCode()));
		}

		if (mapSupply.getText() != null) {
			ED mapSupplyText = factory.createED();
			mapSupplyText.getContent().add(mapSupply.getText());
			cdaSupply.setText(mapSupplyText);
		}

		if (mapSupply.getStatusCode() != null) {
			cdaSupply.setStatusCode(this.createCDACS(new Code(mapSupply.getStatusCode().getValue(), "")));
		}

		if (mapSupply.getEffectiveTimes() != null) {
			for (EffectiveTime mapEffectiveTime : mapSupply.getEffectiveTimes()) {
				SXCMTS cdaEffectiveTime = factory.createSXCMTS();
				cdaEffectiveTime.setValue(mapEffectiveTime.getValue());
				cdaSupply.getEffectiveTime().add(cdaEffectiveTime);
			}
		}

		if (!mapSupply.getPriorityCodes().isEmpty()) {
			for (Code mapCode : mapSupply.getPriorityCodes()) {
				cdaSupply.getPriorityCode().add(this.createCDACE(mapCode));
			}
		}

		if (mapSupply.getRepeatNumber() != null) {
			IVLINT mapSupplyRepeatNumber = factory.createIVLINT();
			mapSupplyRepeatNumber.setValue(mapSupply.getRepeatNumber());
			cdaSupply.setRepeatNumber(mapSupplyRepeatNumber);
		}

		if (mapSupply.isIndependentInd()) {
			BL mapSupplyIndependentInd = factory.createBL();
			mapSupplyIndependentInd.setValue(mapSupply.isIndependentInd());
			cdaSupply.setIndependentInd(mapSupplyIndependentInd);
		}

		if (mapSupply.getQuantity() != null) {
			PQ cdaPQ = factory.createPQ();
			cdaPQ.setUnit(mapSupply.getQuantity().getUnit());
			cdaPQ.setValue(mapSupply.getQuantity().getValue());
			cdaSupply.setQuantity(cdaPQ);
		}

		if (mapSupply.getExpectedUseTime() != null) {
			IVLTS mapSupplyExpectedUseTime = factory.createIVLTS();
			mapSupplyExpectedUseTime.setValue(mapSupply.getExpectedUseTime().getValue());
			cdaSupply.setExpectedUseTime(mapSupplyExpectedUseTime);
		}

		if (mapSupply.getProduct() != null) {
			POCDMT000040Product cdaProduct = factory.createPOCDMT000040Product();
			Product mapProduct = mapSupply.getProduct();

			if (mapProduct.getTypeCode() == null) {
				throw new MissingAttributeException("Supply.Product.TypeCode");
			}
			cdaProduct.getTypeCode().add(mapProduct.getTypeCode());

			if (mapProduct.getManufacturedProduct() != null) {
				cdaProduct.setManufacturedProduct(this.createCDAManufacturedProduct(mapProduct.getManufacturedProduct()));
			}

			cdaSupply.setProduct(cdaProduct);
		}
		if (!mapSupply.getEntryRelationships().isEmpty()) {
			for (EntryRelationship mapEntryRelationship : mapSupply.getEntryRelationships()) {
				cdaSupply.getEntryRelationship().add(this.createCDAEntryRelationship(mapEntryRelationship));
			}
		}
		if (!mapSupply.getEntryRelationships().isEmpty()) {
			for (EntryRelationship mapEntryRelationship : mapSupply.getEntryRelationships()) {
				cdaSupply.getEntryRelationship().add(this.createCDAEntryRelationship(mapEntryRelationship));
			}
		}

		if (!mapSupply.getSpecimens().isEmpty()) {
			for (Specimen mapSpecimen : mapSupply.getSpecimens()) {
				cdaSupply.getSpecimen().add(this.createCDASpecimen(mapSpecimen));
			}
		}

		if (!mapSupply.getPerformers2().isEmpty()) {
			for (Performer2 mapPerformer : mapSupply.getPerformers2()) {
				cdaSupply.getPerformer().add(this.createCDAPerformer2(mapPerformer));
			}
		}

		if (!mapSupply.getAuthors().isEmpty()) {
			for (Author mapAuthor : mapSupply.getAuthors()) {
				cdaSupply.getAuthor().add(this.createCDAAuthor(mapAuthor));
			}
		}

		if (!mapSupply.getParticipants2().isEmpty()) {
			for (Participant2 mapParticipant : mapSupply.getParticipants2()) {
				cdaSupply.getParticipant().add(this.createCDAParticipant2(mapParticipant));
			}
		}

		if (!mapSupply.getReferences().isEmpty()) {
			for (Reference mapReference : mapSupply.getReferences()) {
				cdaSupply.getReference().add(this.createCDAReference(mapReference));
			}
		}

		if (!mapSupply.getPreconditions().isEmpty()) {
			for (Precondition mapPrecondition : mapSupply.getPreconditions()) {
				cdaSupply.getPrecondition().add(this.createCDAPrecondition(mapPrecondition));
			}
		}

		return cdaSupply;
	}

	/**
	 * Creates the cda component5.
	 * 
	 * @param mapComponent5
	 *            the map component5
	 * @param mapDocument
	 *            the map document
	 * @return the pOCDM t000040 component5
	 * @throws MissingNodeException
	 *             the missing node exception
	 * @throws MissingAttributeException
	 *             the missing attribute exception
	 */
	private POCDMT000040Component5 createCDAComponent5(Component5 mapComponent5, CDADocument mapDocument) throws MissingNodeException,
			MissingAttributeException {
		POCDMT000040Component5 cdaComponent5 = factory.createPOCDMT000040Component5();

		if (mapComponent5.getTypeCode() == null) {
			throw new MissingAttributeException("Component5.TypeCode");
		}
		cdaComponent5.setTypeCode(ActRelationshipHasComponent.valueOf(mapComponent5.getTypeCode().getValue()));

		if (mapComponent5.isContextConductionInd()) {
			cdaComponent5.setContextConductionInd(mapComponent5.isContextConductionInd());
		}

		if (mapComponent5.getSection() != null) {
			cdaComponent5.setSection(this.createCDASection(mapComponent5.getSection(), mapDocument));

		} else {
			throw new MissingNodeException("Component5.Section");
		}
		return cdaComponent5;
	}
}