package de.fhg.isst.cda.services;

import static org.junit.Assert.*;

import java.io.IOException;
import java.math.BigInteger;

import javax.xml.bind.JAXBException;

import org.hl7.v3.cda.ActRelationshipFulfills;
import org.hl7.v3.cda.XActRelationshipExternalReference;
import org.junit.Test;

import de.fhg.isst.cda.CDADocument;
import de.fhg.isst.cda.choices.Person;
import de.fhg.isst.cda.choices.author.AuthoringDevice;
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
import de.fhg.isst.cda.classes.AssignedCustodian;
import de.fhg.isst.cda.classes.AssociatedEntity;
import de.fhg.isst.cda.classes.Authenticator;
import de.fhg.isst.cda.classes.Author;
import de.fhg.isst.cda.classes.Authorization;
import de.fhg.isst.cda.classes.Code;
import de.fhg.isst.cda.classes.Component2;
import de.fhg.isst.cda.classes.Component3;
import de.fhg.isst.cda.classes.ComponentOf;
import de.fhg.isst.cda.classes.ConfidentialityCode;
import de.fhg.isst.cda.classes.Consent;
import de.fhg.isst.cda.classes.CopyTime;
import de.fhg.isst.cda.classes.Custodian;
import de.fhg.isst.cda.classes.DataEnterer;
import de.fhg.isst.cda.classes.DocumentationOf;
import de.fhg.isst.cda.classes.EffectiveTime;
import de.fhg.isst.cda.classes.EncompassingEncounter;
import de.fhg.isst.cda.classes.EncounterParticipant;
import de.fhg.isst.cda.classes.Entity;
import de.fhg.isst.cda.classes.Entry;
import de.fhg.isst.cda.classes.Guardian;
import de.fhg.isst.cda.classes.HealthCareFacility;
import de.fhg.isst.cda.classes.ID;
import de.fhg.isst.cda.classes.InFulfillmentOf;
import de.fhg.isst.cda.classes.Informant;
import de.fhg.isst.cda.classes.InformationRecipient;
import de.fhg.isst.cda.classes.IntendedRecipient;
import de.fhg.isst.cda.classes.LanguageCode;
import de.fhg.isst.cda.classes.LegalAuthenticator;
import de.fhg.isst.cda.classes.Location;
import de.fhg.isst.cda.classes.MaintainedEntity;
import de.fhg.isst.cda.classes.Order;
import de.fhg.isst.cda.classes.ParentDocument;
import de.fhg.isst.cda.classes.Participant;
import de.fhg.isst.cda.classes.Participant2;
import de.fhg.isst.cda.classes.ParticipantRole;
import de.fhg.isst.cda.classes.ParticipationTargetLocation;
import de.fhg.isst.cda.classes.Patient;
import de.fhg.isst.cda.classes.PatientRole;
import de.fhg.isst.cda.classes.Performer;
import de.fhg.isst.cda.classes.Performer2;
import de.fhg.isst.cda.classes.Place;
import de.fhg.isst.cda.classes.Quantity;
import de.fhg.isst.cda.classes.Ratio;
import de.fhg.isst.cda.classes.RecordTarget;
import de.fhg.isst.cda.classes.RelatedDocument;
import de.fhg.isst.cda.classes.RelatedSubject;
import de.fhg.isst.cda.classes.RepresentedCustodianOrganization;
import de.fhg.isst.cda.classes.RepresentedOrganization;
import de.fhg.isst.cda.classes.ResponsibleParty;
import de.fhg.isst.cda.classes.RoleClassServiceDeliveryLocation;
import de.fhg.isst.cda.classes.Section;
import de.fhg.isst.cda.classes.ServiceEvent;
import de.fhg.isst.cda.classes.Specimen;
import de.fhg.isst.cda.classes.SpecimenRole;
import de.fhg.isst.cda.classes.Subject;
import de.fhg.isst.cda.classes.SubjectPerson;
import de.fhg.isst.cda.classes.Telecom;
import de.fhg.isst.cda.classes.VersionNumber;
import de.fhg.isst.cda.classes.XActRelationshipEntry;
import de.fhg.isst.cda.classes.XServiceEventPerformer;
import de.fhg.isst.cda.enumerations.ActClassSupply;
import de.fhg.isst.cda.enumerations.ActClinicalDocument;
import de.fhg.isst.cda.enumerations.ActRelationshipHasComponent;
import de.fhg.isst.cda.enumerations.EntityClassDevice;
import de.fhg.isst.cda.enumerations.EntityClassPlace;
import de.fhg.isst.cda.enumerations.EntityDeterminerDetermined;
import de.fhg.isst.cda.enumerations.ParticipationInformationGenerator;
import de.fhg.isst.cda.enumerations.ParticipationPhysicalPerformer;
import de.fhg.isst.cda.enumerations.ParticipationTargetSubject;
import de.fhg.isst.cda.enumerations.RoleClassManufacturedProduct;
import de.fhg.isst.cda.enumerations.RoleClassSpecimen;
import de.fhg.isst.cda.enumerations.StatusCode;
import de.fhg.isst.cda.enumerations.TelecomUse;
import de.fhg.isst.cda.enumerations.XActClassDocumentEntryAct;
import de.fhg.isst.cda.enumerations.XActClassDocumentEntryOrganizer;
import de.fhg.isst.cda.enumerations.XActMoodDocumentObservation;
import de.fhg.isst.cda.enumerations.XActRelationshipDocument;
import de.fhg.isst.cda.enumerations.XDocumentActMood;
import de.fhg.isst.cda.enumerations.XDocumentEncounterMood;
import de.fhg.isst.cda.enumerations.XDocumentProcedureMood;
import de.fhg.isst.cda.enumerations.XDocumentSubject;
import de.fhg.isst.cda.enumerations.XDocumentSubstanceMood;
import de.fhg.isst.cda.enumerations.XEncounterParticipant;
import de.fhg.isst.cda.enumerations.XInformationRecipient;
import de.fhg.isst.cda.enumerations.XInformationRecipientRole;
import de.fhg.isst.cda.exceptions.MissingAttributeException;
import de.fhg.isst.cda.exceptions.MissingNodeException;
import de.fhg.isst.cda.services.CDAService;

// TODO: Auto-generated Javadoc
/**
 * The Class TestCDA.
 */
public class CDAServiceTest {

	/** The xml path. */
	private final String XML_PATH = "src/main/resources/testCDA.xml";
	private final String XSD_PATH = "src/main/resources/Schemadatei/CDA.xsd";
	/**
	 * Test CDA.
	 */
	
	@Test
	public void testCDA() {

		CDAService service = new CDAService();
		CDADocument doc = new CDADocument();

		/*
		 * Muster Objekte
		 */
		// Code
		Code code1 = new Code();
		code1.setCode("GIM");
		code1.setCodeSystem("2.16.840.1.113883.5.10588");
		code1.setDisplayName("General internal medicine clinic");

		// ID
		ID id = new ID();
		id.setRoot("2.16.840.1.113883.19.4");
		id.setExtensions("c266");

		// Address
		Address address = new Address();
		address.setCountry("Deutschland");
		address.setAddressLine("Kölnerstr. 95");
		address.setCity("Düren");
		address.setPostalCode("52351");

		// Telecom
		Telecom telecom = new Telecom();
		telecom.setUse(TelecomUse.WORKPLACE);
		telecom.setValue("tel:0241.123456");

		// organizationpartOf
		OrganizationPartOf organizationPartOf = new OrganizationPartOf();
		organizationPartOf.setClassCode("PRF");
		organizationPartOf.getIds().add(id);
		organizationPartOf.setCode(code1);
		organizationPartOf.setStatusCode(StatusCode.ACTIVE);
		organizationPartOf.setEffectiveTime("201312161830");

		// organization
		Organization organization = new Organization();
		organization.setClassCode("ORG");
		organization.setDeterminerCode("INSTANCE");
		organization.getIds().add(id);
		organization.setName("Organisation");
		organization.getTelecoms().add(telecom);
		organization.getAddrs().add(address);
		organization.setStandardIndustryClassCode(code1);
		organization.setOrganizationPartOf(organizationPartOf);

		// representedOrganization
		RepresentedOrganization representedOrganization = new RepresentedOrganization();
		representedOrganization.setClassCode("ORG");
		representedOrganization.setDeterminerCode("INSTANCE");
		representedOrganization.getIds().add(id);
		representedOrganization.setName("Organisation");
		representedOrganization.getTelecoms().add(telecom);
		representedOrganization.getAddrs().add(address);
		representedOrganization.setStandardIndustryClassCode(code1);
		representedOrganization.setOrganizationPartOf(organizationPartOf);

		// representedCustodianOrganization
		RepresentedCustodianOrganization representedCustodianOrganization = new RepresentedCustodianOrganization();
		representedCustodianOrganization.setClassCode("ORG");
		representedCustodianOrganization.setDeterminerCode("INSTANCE");
		representedCustodianOrganization.getIds().add(id);
		representedCustodianOrganization.setName("RepresentedOrganization");
		representedCustodianOrganization.getTelecoms().add(telecom);
		representedCustodianOrganization.getAddrs().add(address);

		// assignedPerson
		Person person = new Person();
		person.setClassCode("PSN");
		person.setDeterminerCode("INSTANCE");
		person.setFamilyName("Test");
		person.setGivenName("Test");
		person.setSuffix("Test");

		// Patient
		Patient patient = new Patient();
		patient.setClassCode("PSN");
		patient.setDeterminerCode("INSTANCE");
		patient.setId(id);
		patient.setFamilyName("Test");
		patient.setGivenName("Test");
		patient.setSuffix("Test");
		patient.setAdministrativeGenderCode(new Code("M"));
		patient.setBirthTime("19801301");
		patient.setMaritalStatusCode(code1);
		patient.setReligiousAffiliationCode(code1);
		patient.setRaceCode(code1);
		patient.setEthnicGroupCode(code1);

		Guardian guardian = new Guardian();
		// guardian.setClassCode("GUARD");
		guardian.getIds().add(id);
		guardian.setCode(code1);
		guardian.getAddresses().add(address);
		guardian.getTelecoms().add(telecom);

		// INFO Choice GuardianOrganization OR GuardianPerson
		// guardian.setGuardianChoice(person);
		guardian.setGuardianChoice(organization);
		patient.getGuardians().add(guardian);

		// AssignedEntity
		AssignedEntity assignedEntity = new AssignedEntity();
		assignedEntity.setClassCode("ASSIGNED");
		assignedEntity.getIds().add(id);
		assignedEntity.setCode(code1);
		assignedEntity.getAddresses().add(address);
		assignedEntity.getTelecoms().add(telecom);
		assignedEntity.setRepresentedOrganization(organization);
		assignedEntity.setAssignedPerson(person);

		// IntendedRecipient
		IntendedRecipient intendedRecipient = new IntendedRecipient();
		intendedRecipient.setClassCode(XInformationRecipientRole.ASSIGNED);
		intendedRecipient.getIds().add(id);
		intendedRecipient.getAddresses().add(address);
		intendedRecipient.getTelecoms().add(telecom);
		intendedRecipient.setReceivedOrganization(organization);
		intendedRecipient.setInformationRecipient(person);

		// AssignedAuthoringDevice
		AuthoringDevice assignedAuthoringDevice = new AuthoringDevice();
		assignedAuthoringDevice.setClassCode(EntityClassDevice.DEV);
		assignedAuthoringDevice.setDeterminerCode("INSTANCE");
		assignedAuthoringDevice.setCode(code1);
		assignedAuthoringDevice.setManufacturerModelName(code1);
		assignedAuthoringDevice.setSoftwareName(code1);

		MaintainedEntity maintainedEntity = new MaintainedEntity();
		maintainedEntity.setClassCode("Blub");
		maintainedEntity.setEffectiveTime("201316121830");
		maintainedEntity.setMaintainingPerson(person);

		assignedAuthoringDevice.getAsMaintainedEntity().add(maintainedEntity);

		// Author
		Author author = new Author();
		author.setTypeCode("AUT");
		author.setFunctionCode(code1);
		author.setContextControlCode("OP");
		author.setTime("201316121830");

		AssignedAuthor assignedAuthor = new AssignedAuthor();
		assignedAuthor.setClassCode("ASSIGNED");
		assignedAuthor.getIds().add(id);
		assignedAuthor.setCode(code1);
		assignedAuthor.getAddresses().add(address);
		assignedAuthor.getTelecoms().add(telecom);

		// INFO Choice AssignedAuthoringDevice OR RepresentedOrganization
		// assignedAuthor.setAuthorChoice(person);
		assignedAuthor.setAuthorChoice(assignedAuthoringDevice);

		assignedAuthor.setRepresentedOrganization(representedOrganization);
		author.setAssignedAuthor(assignedAuthor);

		// AssignedCustodian
		AssignedCustodian assignedCustodian = new AssignedCustodian();
		assignedCustodian.setClassCode("ASSIGNED");
		assignedCustodian.setRepresentedCustodianOrganization(representedCustodianOrganization);

		// RelatedEntity
		RelatedEntity relatedEntity = new RelatedEntity();
		relatedEntity.setClassCode("STD");
		relatedEntity.getAddresses().add(address);
		relatedEntity.getTelecoms().add(telecom);
		relatedEntity.setEffectiveTime(new EffectiveTime("201316121830"));
		relatedEntity.setRelatedPerson(person);

		// AssociatedEntity
		AssociatedEntity associatedEntity = new AssociatedEntity();
		associatedEntity.setClassCode("CODE");
		associatedEntity.getIds().add(id);
		associatedEntity.setCode(code1);
		associatedEntity.getAddresses().add(address);
		associatedEntity.getTelecoms().add(telecom);
		associatedEntity.setAssociatedPerson(person);
		associatedEntity.setScopingOrganization(organization);

		// VersionNumber
		BigInteger versionNumber = new BigInteger("5");

		// Subject
		Subject subject = new Subject();
		subject.setTypeCode(ParticipationTargetSubject.SBJ);
		subject.setContextControlCode("OP");
		subject.setAwarenessCode(code1);

		RelatedSubject relatedSubject = new RelatedSubject();
		relatedSubject.setClassCode(XDocumentSubject.PAT);
		relatedSubject.setCode(code1);
		relatedSubject.getAddrs().add(address);
		relatedSubject.getTelecoms().add(telecom);

		SubjectPerson subjectPerson = new SubjectPerson();
		subjectPerson.setClassCode("PSN");
		subjectPerson.setDeterminerCode("INSTANCE");
		subjectPerson.setFamilyName("Test");
		subjectPerson.setGivenName("Test");
		subjectPerson.setSuffix("Test");

		relatedSubject.setSubjectPerson(subjectPerson);
		subject.setRelatedSubject(relatedSubject);

		// Performer2
		Performer2 performer2 = new Performer2();
		performer2.setTypeCode(ParticipationPhysicalPerformer.PRF);
		performer2.setTime("1513");
		performer2.setModeCode(code1);
		performer2.setAssignedEntity(assignedEntity);

		// Quantity
		Quantity quantity = new Quantity();
		quantity.setUnit("ml");
		quantity.setValue("10");

		// playingEntity
		PlayingEntity playingEntity = new PlayingEntity();
		playingEntity.setClassCode("ENT");
		playingEntity.setDeterminerCode("INSTANCE");
		playingEntity.setCode(code1);
		playingEntity.getQuantities().add(quantity);
		playingEntity.setFamilyName("Test");
		playingEntity.setGivenName("Test");
		playingEntity.setSuffix("Test");
		playingEntity.setDesc("Beschreibung");

		// Specimen
		Specimen specimen = new Specimen();
		specimen.setTypeCode("SPC");

		SpecimenRole specimenRole = new SpecimenRole();
		specimenRole.setClassCode(RoleClassSpecimen.SPEC);
		specimenRole.getIds().add(id);

		specimenRole.setSpecimenPlayingEntity(playingEntity);
		specimen.getSpecimenRoles().add(specimenRole);

		// PlayingDevice
		Device playingDevice = new Device();
		playingDevice.setClassCode(EntityClassDevice.DEV);
		playingDevice.setDeterminerCode("INSTANCE");
		playingDevice.setCode(code1);
		playingDevice.setManufacturerModelName(code1);
		playingDevice.setSoftwareName(code1);

		// Participant2
		Participant2 participant2 = new Participant2();
		participant2.setTypeCode("PRF");
		participant2.setContextControlCode("OP");
		participant2.setTime("1400");
		participant2.setAwarenessCode(code1);

		ParticipantRole participantRole = new ParticipantRole();
		participantRole.setClassCode("ROL");
		participantRole.getIds().add(id);
		participantRole.setCode(code1);
		participantRole.getAddrs().add(address);
		participantRole.getTelecoms().add(telecom);

		Entity scopingEntity = new Entity();
		scopingEntity.setClassCode("ENT");
		scopingEntity.setDeterminerCode("INSTANCE");
		scopingEntity.getIds().add(id);
		scopingEntity.setCode(code1);
		scopingEntity.setDesc("Beschreibung scopingEntity");
		participantRole.setScopingEntity(scopingEntity);

		// INFO: Choice PlayingEntity OR PlayingDevice
		// participantRole.setEntityChoice(playingEntity);
		participantRole.setEntityChoice(playingDevice);

		participant2.getParticipantRoles().add(participantRole);

		// ReferenceRange
		ReferenceRange referenceRange = new ReferenceRange();
		referenceRange.setTypeCode("REFV");

		ObservationRange observationRange = new ObservationRange();
		observationRange.setClassCode("OBS");
		observationRange.setMoodCode("EVN.CRT");
		observationRange.setCode(code1);
		observationRange.setText("ObservationText");
		observationRange.setValue("ObservationRange-Value");
		observationRange.setInterpretationCode(code1);
		referenceRange.getObservationRanges().add(observationRange);

		// Precondition
		Precondition precondition = new Precondition();
		precondition.setTypeCode("PRCN");

		Criterion criterion = new Criterion();
		criterion.setClassCode("OBS");
		criterion.setMoodCode("EVN.CRT");
		criterion.setCode(code1);
		criterion.setText("Criterion-Text");
		criterion.setValue("Criterion-Value");
		precondition.getCriterions().add(criterion);

		// reference
		Reference reference = new Reference();
		reference.setTypeCode(XActRelationshipExternalReference.ELNK);
		reference.setSeperatableInd(true);

		// INFO: Choice ExternalAct OR ExternalObservation OR ExternalProcedure
		// OR ExternalDocument
		// ExternalAct
		ExternalAct externalAct = new ExternalAct();
		externalAct.setClassCode("ACT");
		externalAct.setMoodCode("EVN");
		externalAct.getIds().add(id);
		externalAct.setCode(code1);
		externalAct.setText("ExternalAct Text");
		// reference.setExternalActChoice(externalAct);

		// ExternalObservation
		ExternalObservation externalObservation = new ExternalObservation();
		externalObservation.setClassCode("OBS");
		externalObservation.setMoodCode("EVN");
		externalObservation.getIds().add(id);
		externalObservation.setCode(code1);
		externalObservation.setText("ExternalObservation Text");
		// reference.setExternalActChoice(externalObservation);

		// ExternalProcedure
		ExternalProcedure externalProcedure = new ExternalProcedure();
		externalProcedure.setClassCode("PROC");
		externalProcedure.setMoodCode("EVN");
		externalProcedure.getIds().add(id);
		externalProcedure.setCode(code1);
		externalProcedure.setText("ExternalProcedure Text");
		// reference.setExternalActChoice(externalProcedure);

		// ExternalDocument
		ExternalDocument externalDocument = new ExternalDocument();
		externalDocument.setClassCode("DOC");
		externalDocument.setMoodCode("EVN");
		externalDocument.getIds().add(id);
		externalDocument.setCode(code1);
		externalDocument.setText("ExternalDocument Text");
		externalDocument.setSetID(id);
		externalDocument.setVersionNumber(versionNumber);
		reference.setExternalActChoice(externalDocument);

		// LabeledDrug
		LabeledDrug labeledDrug = new LabeledDrug();
		labeledDrug.setClassCode("MMAT");
		labeledDrug.setDeterminerCode(EntityDeterminerDetermined.KIND);
		labeledDrug.setCode(code1);
		labeledDrug.setName("Drug-Name");

		// Material
		Material material = new Material();
		material.setClassCode("MMAT");
		material.setDeterminerCode(EntityDeterminerDetermined.KIND);
		material.setCode(code1);
		material.setName("Material");
		material.setLotNumberText("LOT-Num");

		// ManufacturedProduct
		ManufacturedProduct manufacturedProduct = new ManufacturedProduct();
		manufacturedProduct.setClassCode(RoleClassManufacturedProduct.MANU);
		manufacturedProduct.getIds().add(id);
		manufacturedProduct.setManufacturerOrganization(organization);
		// INFO Choice LabeledDrug OR Material
		// labeledDrug
		manufacturedProduct.setDrugOrOtherMaterialChoice(labeledDrug);
		// material
		// manufacturedProduct.setDrugOrOtherMaterialChoice(material);

		// Product
		Product product = new Product();
		product.setTypeCode("PRD");
		product.setManufacturedProduct(manufacturedProduct);

		/*
		 * CDA Document
		 */
		doc.setClassCode(ActClinicalDocument.DOCCLIN);
		doc.setMoodCode(XDocumentActMood.EVN);
		doc.setId(new ID("c266", "2.16.840.1.113883.19.4"));
		doc.setCode(new Code("11488-4", "2.16.840.1.113883.6.1", "LOINC", "Consultation note"));
		doc.setTitle("Good Health Clinic Consultation Note");
		doc.setEffectiveTime(new EffectiveTime("201312161830"));
		doc.setConfidentialityCode(new ConfidentialityCode("N", "2.16.840.1.113883.5.25"));
		doc.setLanguageCode(new LanguageCode("de-DE"));
		doc.setSetID(new ID("BB35", "2.16.840.1.113883.19.7"));
		doc.setVersionNumber(new VersionNumber("1"));
		doc.setCopyTime(new CopyTime("201316121830"));

		/*
		 * CDA Header
		 */

		// Authenticator
		Authenticator authenticator = new Authenticator();
		authenticator.setTime("201312171830");
		authenticator.setSignatureCode(new Code("S"));
		authenticator.setAssignedEntity(assignedEntity);
		doc.getAuthenticators().add(authenticator);

		// legalAuthenticator
		LegalAuthenticator legalAuthenticator = new LegalAuthenticator();
		legalAuthenticator.setTime("201316121830");
		legalAuthenticator.setSignatureCode(new Code("S"));
		legalAuthenticator.setAssignedEntity(assignedEntity);
		doc.setLegalAuthenticator(legalAuthenticator);

		// informationRecipient
		InformationRecipient informationRecipient = new InformationRecipient();
		informationRecipient.setTypeCode(XInformationRecipient.PRCP);
		informationRecipient.setIntendedRecipient(intendedRecipient);
		doc.getInformationRecipients().add(informationRecipient);

		// Author
		doc.getAuthors().add(author);

		// Custodian
		Custodian custodian = new Custodian();
		custodian.setTypeCode("CST");
		custodian.setAssignedCustodian(assignedCustodian);
		doc.setCustodian(custodian);

		// DataEnterer
		DataEnterer dataEnterer = new DataEnterer();
		dataEnterer.setContextControlCode("OP");
		dataEnterer.setTime("20140107153000");
		dataEnterer.setAssignedEntity(assignedEntity);
		doc.setDataEnterer(dataEnterer);

		// recordTarget
		RecordTarget recordTarget = new RecordTarget();
		recordTarget.setTypeCode("RCT");
		recordTarget.setContextControlCode("OP");
		PatientRole patientRole = new PatientRole();
		patientRole.setClassCode("PAT");
		patientRole.getIds().add(id);
		patientRole.getAddrs().add(address);
		patientRole.getTelecoms().add(telecom);
		patientRole.setPatient(patient);

		recordTarget.getPatientRoles().add(patientRole);
		doc.getRecordTarget().add(recordTarget);

		// informant
		Informant informant = new Informant();
		informant.setTypeCode(ParticipationInformationGenerator.INF);

		// INFO: Choice AssignedEntity OR RelatedEntity
		// informant.setInformantChoice(assignedEntity);
		informant.setInformantChoice(relatedEntity);
		doc.getInformants().add(informant);

		// participant
		Participant participant = new Participant();
		participant.setTypeCode("PRF");
		participant.setFunctionCode(code1);
		participant.setContextControlCode(code1);
//		participant.setTime("20140107153000");
		
//		participant.setTime(time);
		participant.getTime().setHigh("99");
		participant.getTime().setLow("11");
		participant.setAssociatedEntity(associatedEntity);

		doc.getParticipants().add(participant);

		/*
		 * CDA BODY
		 */

		// RelatedDocument
		RelatedDocument relatedDocument = new RelatedDocument();
		relatedDocument.setTypeCode(XActRelationshipDocument.APND);

		ParentDocument parentDocument = new ParentDocument();
		parentDocument.setClassCode(ActClinicalDocument.DOCCLIN);
		parentDocument.getIds().add(id);
		parentDocument.setCode(code1);
		parentDocument.setText("Test Text");
		parentDocument.setSetId(id);
		parentDocument.setVersionNumber(versionNumber);
		relatedDocument.setParentDocument(parentDocument);
		doc.getRelatedDocuments().add(relatedDocument);

		// DocumentationOf
		DocumentationOf documentationOf = new DocumentationOf();
		documentationOf.setTypeCode("DOC");

		ServiceEvent serviceEvent = new ServiceEvent();
		serviceEvent.setClassCode("PCPR");
		serviceEvent.getIds().add(id);
		serviceEvent.setCode(code1);
		serviceEvent.setEffectiveTime(new EffectiveTime("20141301"));

		Performer performer = new Performer();
		performer.setTypeCode(XServiceEventPerformer.PPRF);
		performer.setFunctionCode(code1);
		performer.setTime("201413011349");
		performer.setAssignedEntity(assignedEntity);

		serviceEvent.getPerformers().add(performer);
		documentationOf.getServiceEvents().add(serviceEvent);
		doc.getDocumentationOf().add(documentationOf);

		// InFulFillmentOf
		InFulfillmentOf inFulfillmentOf = new InFulfillmentOf();
		inFulfillmentOf.setTypeCode(ActRelationshipFulfills.FLFS);

		Order order = new Order();
		order.setMoodCode("RQO");
		order.getIds().add(id);
		order.setCode(code1);
		order.setPriorityCode(code1);
		inFulfillmentOf.getOrders().add(order);
		doc.getInFulfillmentOf().add(inFulfillmentOf);

		// Authorization
		Authorization authorization = new Authorization();
		authorization.setTypeCode("AUTH");

		Consent consent = new Consent();
		consent.setClassCode("CONS");
		consent.setMoodCode("EVN");
		consent.getIds().add(id);
		consent.setCode(code1);
		consent.setStatusCode(StatusCode.ACTIVE);
		authorization.getConsents().add(consent);
		doc.getAuthorizations().add(authorization);

		// ComponentOf
		ComponentOf componentOf = new ComponentOf();
		componentOf.setTypeCode(ActRelationshipHasComponent.COMP);

		EncompassingEncounter encompassingEncounter = new EncompassingEncounter();
		encompassingEncounter.setClassCode("ENC");
		encompassingEncounter.setMoodCode("EVN");
		encompassingEncounter.getIds().add(id);
		encompassingEncounter.setCode(code1);
		encompassingEncounter.setEffectiveTime(new EffectiveTime("201401131400"));
		encompassingEncounter.setDischargeDispositionCode(code1);

		ResponsibleParty responsibleParty = new ResponsibleParty();
		responsibleParty.setTypeCode("RESP");
		responsibleParty.setAssignedEntity(assignedEntity);
		encompassingEncounter.setResponsibleParty(responsibleParty);

		EncounterParticipant encounterParticipant = new EncounterParticipant();
		encounterParticipant.setTypeCode(XEncounterParticipant.ADM);
		encounterParticipant.setTime("201413011401");
		encounterParticipant.setAssignedEntity(assignedEntity);
		encompassingEncounter.getEncounterParticipants().add(encounterParticipant);

		Location location = new Location();
		location.setTypeCode(ParticipationTargetLocation.LOC);

		HealthCareFacility healthCareFacility = new HealthCareFacility();
		healthCareFacility.setClassCode(RoleClassServiceDeliveryLocation.SDLOC);
		healthCareFacility.getIds().add(id);
		healthCareFacility.setCode(code1);
		healthCareFacility.setServiceProviderOrganization(organization);

		Place facilityLocation = new Place();
		facilityLocation.setClassCode(EntityClassPlace.PLC);
		facilityLocation.setDeterminerCode("INSTANCE");
		facilityLocation.setName("Platz");
		facilityLocation.setAddress(address);
		healthCareFacility.setLocation(facilityLocation);

		location.setHealthCareFacility(healthCareFacility);

		encompassingEncounter.setLocation(location);
		componentOf.setEncompassingEncounter(encompassingEncounter);
		doc.setComponentOf(componentOf);

		// Component
		Component2 component2 = new Component2();
		component2.setTypeCode(ActRelationshipHasComponent.COMP);

		// body
		// INFO: Choice NonXMLBody OR StructuredBody
		// NonXMLBody
		// NonXMLBody nonXMLBody = new NonXMLBody();
		// nonXMLBody.setClassCode("DOCBODY");
		// nonXMLBody.setMoodCode("EVN");
		// nonXMLBody.setText("Test Text");
		// nonXMLBody.setConfidentialityCode(code);
		// nonXMLBody.setLanguageCode(new LanguageCode("de-DE"));
		// component2.setBodyChoice(nonXMLBody);

		// StructuredBody
		StructuredBody structuredBody = new StructuredBody();
		structuredBody.setClassCode("DOCBODY");
		structuredBody.setMoodCode("EVN");
		structuredBody.setConfidentialityCode(code1);
		structuredBody.setLanguageCode(new LanguageCode("de-DE"));

		/*
		 * ClinicalStatements
		 */

		// Observation
		Component3 observationComponent = new Component3();
		observationComponent.setTypeCode(ActRelationshipHasComponent.COMP);
		observationComponent.setContextConductionInd(true);

		Section observationSection = new Section();
		observationSection.setClassCode("DOCSECT");
		observationSection.setMoodCode("EVN");
		observationSection.setId(id);
		observationSection.setText("Observation");
		observationSection.setConfidentialityCode(code1);
		observationSection.setLanguageCode(new LanguageCode("de-DE"));
		observationSection.getAuthors().add(author);
		observationSection.getInformants().add(informant);
		observationSection.setSubject(subject);

		// Component5 observationComponent5 = new Component5();
		// observationComponent5.setTypeCode(ActRelationshipHasComponent.COMP);
		// observationComponent5.setContextConductionInd(true);
		// observationSection.getComponents5().add(observationComponent5);

		Entry observationEntry = new Entry();
		observationEntry.setTypeCode(XActRelationshipEntry.COMP);
		observationEntry.setContextConductionInd(true);

		Observation observation = new Observation();
		observation.setClassCode("OBS");
		observation.setMoodCode(XActMoodDocumentObservation.EVN);
		observation.getIds().add(id);
		observation.setCode(code1);
		observation.setNegationInd(true);
		observation.setText("Observation");
		observation.setStatusCode(StatusCode.ACTIVE);
		observation.setEffectiveTime(new EffectiveTime("201414010000"));
		observation.setPriorityCode(code1);
		observation.setRepeatNumber(versionNumber);
		observation.setLanguageCode(new LanguageCode("de-DE"));
		observation.setValue("ObservationValue");
		observation.getInterpretationCodes().add(code1);
		observation.getMethodCodes().add(code1);
		observation.getTargetSiteCodes().add(code1);
		observation.getAuthors().add(author);
		observation.getInformants().add(informant);
		observation.setSubject(subject);
		observation.getPerformers2().add(performer2);
		observation.getSpecimens().add(specimen);
		observation.getParticipants2().add(participant2);
		observation.getReferenceRanges().add(referenceRange);
		observation.getPreconditions().add(precondition);
		observation.getReferences().add(reference);

		observationEntry.setClinicalStatement(observation);
		observationSection.getEntries().add(observationEntry);
		observationComponent.setSection(observationSection);
		structuredBody.getComponent3().add(observationComponent);

		// RegionOfInterest
		Component3 regionOfInterestComponent = new Component3();
		regionOfInterestComponent.setTypeCode(ActRelationshipHasComponent.COMP);
		regionOfInterestComponent.setContextConductionInd(true);

		Section regionOfInterestSection = new Section();
		regionOfInterestSection.setClassCode("DOCSECT");
		regionOfInterestSection.setMoodCode("EVN");
		regionOfInterestSection.setId(id);
		regionOfInterestSection.setText("RegionOfInterest");
		regionOfInterestSection.setConfidentialityCode(code1);
		regionOfInterestSection.setLanguageCode(new LanguageCode("de-DE"));
		regionOfInterestSection.getAuthors().add(author);
		regionOfInterestSection.getInformants().add(informant);
		regionOfInterestSection.setSubject(subject);

		Entry regionOfInterestEntry = new Entry();
		regionOfInterestEntry.setTypeCode(XActRelationshipEntry.COMP);
		regionOfInterestEntry.setContextConductionInd(true);

		RegionOfInterest regionOfInterest = new RegionOfInterest();
		regionOfInterest.setClassCode("ROIOVL");
		regionOfInterest.setMoodCode("EVN");
		regionOfInterest.getIds().add(id);
		// CODE_WO_CS
		regionOfInterest.setCode(new Code("Blub"));
		regionOfInterest.getValues().add(new BigInteger("5"));
		regionOfInterest.getAuthors().add(author);
		regionOfInterest.getInformants().add(informant);
		regionOfInterest.setSubject(subject);
		regionOfInterest.getPerformers2().add(performer2);
		regionOfInterest.getSpecimens().add(specimen);
		regionOfInterest.getParticipants2().add(participant2);
		regionOfInterest.getPreconditions().add(precondition);
		regionOfInterest.getReferences().add(reference);

		regionOfInterestEntry.setClinicalStatement(regionOfInterest);
		regionOfInterestSection.getEntries().add(regionOfInterestEntry);
		regionOfInterestComponent.setSection(regionOfInterestSection);
		structuredBody.getComponent3().add(regionOfInterestComponent);

		// ObservationMedia
		Component3 observationMediaComponent = new Component3();
		observationMediaComponent.setTypeCode(ActRelationshipHasComponent.COMP);
		observationMediaComponent.setContextConductionInd(true);

		Section observationMediaSection = new Section();
		observationMediaSection.setClassCode("DOCSECT");
		observationMediaSection.setMoodCode("EVN");
		observationMediaSection.setId(id);
		observationMediaSection.setText("ObservationMedia");
		observationMediaSection.setConfidentialityCode(code1);
		observationMediaSection.setLanguageCode(new LanguageCode("de-DE"));
		observationMediaSection.getAuthors().add(author);
		observationMediaSection.getInformants().add(informant);
		observationMediaSection.setSubject(subject);

		Entry observationMediaEntry = new Entry();
		observationMediaEntry.setTypeCode(XActRelationshipEntry.COMP);
		observationMediaEntry.setContextConductionInd(true);

		ObservationMedia observationMedia = new ObservationMedia();
		observationMedia.setClassCode("OBS");
		observationMedia.setMoodCode("EVN");
		observationMedia.getIds().add(id);
		observationMedia.setLanguageCode(new LanguageCode("de-DE"));
		observationMedia.setValue("Observation-Media");
		observationMedia.getAuthors().add(author);
		observationMedia.getInformants().add(informant);
		observationMedia.setSubject(subject);
		observationMedia.getPerformers2().add(performer2);
		observationMedia.getSpecimens().add(specimen);
		observationMedia.getParticipants2().add(participant2);
		observationMedia.getPreconditions().add(precondition);
		observationMedia.getReferences().add(reference);

		observationMediaEntry.setClinicalStatement(observationMedia);
		observationMediaSection.getEntries().add(observationMediaEntry);
		observationMediaComponent.setSection(observationMediaSection);
		structuredBody.getComponent3().add(observationMediaComponent);

		// SubstanceAdministration
		Component3 substanceAdministrationComponent = new Component3();
		substanceAdministrationComponent.setTypeCode(ActRelationshipHasComponent.COMP);
		substanceAdministrationComponent.setContextConductionInd(true);

		Section substanceAdministrationSection = new Section();
		substanceAdministrationSection.setClassCode("DOCSECT");
		substanceAdministrationSection.setMoodCode("EVN");
		substanceAdministrationSection.setId(id);
		substanceAdministrationSection.setText("SubstanceAdministration");
		substanceAdministrationSection.setConfidentialityCode(code1);
		substanceAdministrationSection.setLanguageCode(new LanguageCode("de-DE"));
		substanceAdministrationSection.getAuthors().add(author);
		substanceAdministrationSection.getInformants().add(informant);
		substanceAdministrationSection.setSubject(subject);

		Entry substanceAdministrationEntry = new Entry();
		substanceAdministrationEntry.setTypeCode(XActRelationshipEntry.COMP);
		substanceAdministrationEntry.setContextConductionInd(true);

		SubstanceAdministration substanceAdministration = new SubstanceAdministration();
		substanceAdministration.setClassCode("SBADM");
		substanceAdministration.setMoodCode(XDocumentSubstanceMood.EVN);
		substanceAdministration.getIds().add(id);
		substanceAdministration.setCode(new Code("Blub"));
		substanceAdministration.setNegationInd(true);
		substanceAdministration.setText("SubstanceAdministration-Text");
		substanceAdministration.setStatusCode(StatusCode.ACTIVE);
		substanceAdministration.getEffectiveTime().setLow("201001010101");
		substanceAdministration.getEffectiveTime().setHigh("201501010101");
		substanceAdministration.setPriorityCode(code1);
		substanceAdministration.setRepeatNumber(new BigInteger("10"));
		substanceAdministration.setRouteCode(code1);
		substanceAdministration.getApproachSiteCodes().add(code1);
		substanceAdministration.setDoseQuantity(quantity);
		substanceAdministration.setRateQuantity(quantity);

		Ratio ratio = new Ratio();
		ratio.setDenominator(quantity);
		ratio.setEnumerator(quantity);
		substanceAdministration.setMaxDoseQuantity(ratio);
		substanceAdministration.setAdministrationUnitCode(code1);
		substanceAdministration.getAuthors().add(author);
		substanceAdministration.getInformants().add(informant);
		substanceAdministration.setSubject(subject);
		substanceAdministration.getPerformers2().add(performer2);

		Consumable consumable = new Consumable();
		consumable.setTypeCode("CSM");

		consumable.setManufacturedProduct(manufacturedProduct);

		substanceAdministration.setConsumable(consumable);
		substanceAdministration.getSpecimens().add(specimen);
		substanceAdministration.getParticipants2().add(participant2);
		substanceAdministration.getPreconditions().add(precondition);
		substanceAdministration.getReferences().add(reference);

		substanceAdministrationEntry.setClinicalStatement(substanceAdministration);
		substanceAdministrationSection.getEntries().add(substanceAdministrationEntry);
		substanceAdministrationComponent.setSection(substanceAdministrationSection);
		structuredBody.getComponent3().add(substanceAdministrationComponent);

		// supply
		Component3 supplyComponent = new Component3();
		supplyComponent.setTypeCode(ActRelationshipHasComponent.COMP);
		supplyComponent.setContextConductionInd(true);

		Section supplySection = new Section();
		supplySection.setClassCode("DOCSECT");
		supplySection.setMoodCode("EVN");
		supplySection.setId(id);
		supplySection.setText("Supply");
		supplySection.setConfidentialityCode(code1);
		supplySection.setLanguageCode(new LanguageCode("de-DE"));
		supplySection.getAuthors().add(author);
		supplySection.getInformants().add(informant);
		supplySection.setSubject(subject);

		Entry supplyEntry = new Entry();
		supplyEntry.setTypeCode(XActRelationshipEntry.COMP);
		supplyEntry.setContextConductionInd(true);

		Supply supply = new Supply();
		supply.setClassCode(ActClassSupply.SPLY);
		supply.setMoodCode(XDocumentSubstanceMood.EVN);
		supply.getIds().add(id);
		supply.setCode(code1);
		supply.setText("Supply-Text");
		supply.setStatusCode(StatusCode.ACTIVE);
		supply.getEffectiveTimes().add(new EffectiveTime("201415011253"));
		supply.getPriorityCodes().add(code1);
		supply.setRepeatNumber(new BigInteger("5"));
		supply.setIndependentInd(true);
		supply.setQuantity(quantity);
		supply.setExpectedUseTime(new EffectiveTime("201415011253"));
		supply.getAuthors().add(author);
		supply.getInformants().add(informant);
		supply.setSubject(subject);
		supply.getPerformers2().add(performer2);
		supply.setProduct(product);
		supply.getSpecimens().add(specimen);
		supply.getParticipants2().add(participant2);
		supply.getPreconditions().add(precondition);
		supply.getReferences().add(reference);

		supplyEntry.setClinicalStatement(supply);
		supplySection.getEntries().add(supplyEntry);
		supplyComponent.setSection(supplySection);
		structuredBody.getComponent3().add(supplyComponent);

		// Procedure
		Component3 procedureComponent = new Component3();
		procedureComponent.setTypeCode(ActRelationshipHasComponent.COMP);
		procedureComponent.setContextConductionInd(true);

		Section procedureSection = new Section();
		procedureSection.setClassCode("DOCSECT");
		procedureSection.setMoodCode("EVN");
		procedureSection.setId(id);
		procedureSection.setText("Procedure");
		procedureSection.setConfidentialityCode(code1);
		procedureSection.setLanguageCode(new LanguageCode("de-DE"));
		procedureSection.getAuthors().add(author);
		procedureSection.getInformants().add(informant);
		procedureSection.setSubject(subject);

		Entry procedureEntry = new Entry();
		procedureEntry.setTypeCode(XActRelationshipEntry.COMP);
		procedureEntry.setContextConductionInd(true);

		Procedure procedure = new Procedure();
		procedure.setClassCode("PROC");
		procedure.setMoodCode(XDocumentProcedureMood.APT);
		procedure.getIds().add(id);
		procedure.setCode(code1);
		procedure.setNegationInd(true);
		procedure.setText("Procedure");
		procedure.setStatusCode(StatusCode.ACTIVE);
		procedure.setEffectiveTime(new EffectiveTime("201415011300"));
		procedure.setPriorityCode(code1);
		procedure.setLanguageCode(new LanguageCode("de-DE"));
		procedure.getMethodCodes().add(code1);
		procedure.getApproachSiteCodes().add(code1);
		procedure.getTargetSiteCode().add(code1);
		procedure.getAuthors().add(author);
		procedure.getInformants().add(informant);
		procedure.setSubject(subject);
		procedure.getPerformers2().add(performer2);
		procedure.getSpecimens().add(specimen);
		procedure.getParticipants2().add(participant2);
		procedure.getPreconditions().add(precondition);
		procedure.getReferences().add(reference);

		procedureEntry.setClinicalStatement(procedure);
		procedureSection.getEntries().add(procedureEntry);
		procedureComponent.setSection(procedureSection);
		structuredBody.getComponent3().add(procedureComponent);

		// Encounter
		Component3 encounterComponent = new Component3();
		encounterComponent.setTypeCode(ActRelationshipHasComponent.COMP);
		encounterComponent.setContextConductionInd(true);

		Section encounterSection = new Section();
		encounterSection.setClassCode("DOCSECT");
		encounterSection.setMoodCode("EVN");
		encounterSection.setId(id);
		encounterSection.setText("Encounter");
		encounterSection.setConfidentialityCode(code1);
		encounterSection.setLanguageCode(new LanguageCode("de-DE"));
		encounterSection.getAuthors().add(author);
		encounterSection.getInformants().add(informant);
		encounterSection.setSubject(subject);

		Entry encounterEntry = new Entry();
		encounterEntry.setTypeCode(XActRelationshipEntry.COMP);
		encounterEntry.setContextConductionInd(true);

		Encounter encounter = new Encounter();
		encounter.setClassCode("ENC");
		encounter.setMoodCode(XDocumentEncounterMood.APT);
		encounter.getIds().add(id);
		encounter.setCode(code1);
		encounter.setText("Encounter");
		encounter.setStatusCode(StatusCode.ACTIVE);
		encounter.setEffectiveTime(new EffectiveTime("201415011300"));
		encounter.setPriorityCode(code1);
		encounter.getAuthors().add(author);
		encounter.getInformants().add(informant);
		encounter.setSubject(subject);
		encounter.getPerformers2().add(performer2);
		encounter.getSpecimens().add(specimen);
		encounter.getParticipants2().add(participant2);
		encounter.getPreconditions().add(precondition);
		encounter.getReferences().add(reference);

		encounterEntry.setClinicalStatement(encounter);
		encounterSection.getEntries().add(encounterEntry);
		encounterComponent.setSection(encounterSection);
		structuredBody.getComponent3().add(encounterComponent);

		// Organizer
		Component3 organizerComponent = new Component3();
		organizerComponent.setTypeCode(ActRelationshipHasComponent.COMP);
		organizerComponent.setContextConductionInd(true);

		Section organizerSection = new Section();
		organizerSection.setClassCode("DOCSECT");
		organizerSection.setMoodCode("EVN");
		organizerSection.setId(id);
		organizerSection.setText("Organizer");
		organizerSection.setConfidentialityCode(code1);
		organizerSection.setLanguageCode(new LanguageCode("de-DE"));
		organizerSection.getAuthors().add(author);
		organizerSection.getInformants().add(informant);
		organizerSection.setSubject(subject);

		Entry organizerEntry = new Entry();
		organizerEntry.setTypeCode(XActRelationshipEntry.COMP);
		organizerEntry.setContextConductionInd(true);

		Organizer organizer = new Organizer();
		organizer.setClassCode(XActClassDocumentEntryOrganizer.BATTERY);
		organizer.setMoodCode("EVN");
		organizer.getIds().add(id);
		organizer.setCode(code1);
		organizer.setStatusCode(StatusCode.ACTIVE);
		organizer.setEffectiveTime(new EffectiveTime("201415011300"));
		organizer.getAuthors().add(author);
		organizer.getInformants().add(informant);
		organizer.setSubject(subject);
		organizer.getPerformers2().add(performer2);
		organizer.getSpecimens().add(specimen);
		organizer.getParticipants2().add(participant2);
		organizer.getPreconditions().add(precondition);
		organizer.getReferences().add(reference);

		Component4 component4 = new Component4();
		component4.setTypeCode(ActRelationshipHasComponent.COMP);
		component4.setContextConductionInd(true);
		component4.setSequenceNumber(new BigInteger("5"));
		component4.setSeperateableInd(true);
		component4.getClinicalStatements().add(encounter);

		organizer.getComponents4().add(component4);
		organizerEntry.setClinicalStatement(organizer);
		organizerSection.getEntries().add(organizerEntry);
		organizerComponent.setSection(organizerSection);
		structuredBody.getComponent3().add(organizerComponent);

		// Act
		Component3 actComponent = new Component3();
		actComponent.setTypeCode(ActRelationshipHasComponent.COMP);
		actComponent.setContextConductionInd(true);

		Section actSection = new Section();
		actSection.setClassCode("DOCSECT");
		actSection.setMoodCode("EVN");
		actSection.setId(id);
		actSection.setText("Encounter");
		actSection.setConfidentialityCode(code1);
		actSection.setLanguageCode(new LanguageCode("de-DE"));
		actSection.getAuthors().add(author);
		actSection.getInformants().add(informant);
		actSection.setSubject(subject);

		Entry actEntry = new Entry();
		actEntry.setTypeCode(XActRelationshipEntry.COMP);
		actEntry.setContextConductionInd(true);

		Act act = new Act();
		act.setClassCode(XActClassDocumentEntryAct.ACCM);
		act.setMoodCode(XDocumentActMood.APT);
		act.getIds().add(id);
		act.setCode(code1);
		act.setText("Act");
		act.setStatusCode(StatusCode.ACTIVE);
		act.setEffectiveTime(new EffectiveTime("201415011300"));
		act.setPriorityCode(code1);
		act.getAuthors().add(author);
		act.getInformants().add(informant);
		act.setSubject(subject);
		act.getPerformers2().add(performer2);
		act.getSpecimens().add(specimen);
		act.getParticipants2().add(participant2);
		act.getPreconditions().add(precondition);
		act.getReferences().add(reference);

		actEntry.setClinicalStatement(act);
		actSection.getEntries().add(actEntry);
		actComponent.setSection(actSection);
		structuredBody.getComponent3().add(actComponent);

		component2.setBodyChoice(structuredBody);
		doc.setComponent(component2);

		try {
//			service.print(doc);
			service.save(XML_PATH, doc);
//			assertTrue(service.validate(XSD_PATH, XML_PATH));
		} catch (IOException | MissingAttributeException | MissingNodeException | JAXBException e) {
			System.out.println(e.getMessage());
			fail();
			e.printStackTrace();
		}

	}
}