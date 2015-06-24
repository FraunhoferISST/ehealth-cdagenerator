package de.fhg.isst.cda;

import java.util.ArrayList;

import de.fhg.isst.cda.classes.Authenticator;
import de.fhg.isst.cda.classes.Author;
import de.fhg.isst.cda.classes.Authorization;
import de.fhg.isst.cda.classes.Code;
import de.fhg.isst.cda.classes.Component2;
import de.fhg.isst.cda.classes.ComponentOf;
import de.fhg.isst.cda.classes.ConfidentialityCode;
import de.fhg.isst.cda.classes.CopyTime;
import de.fhg.isst.cda.classes.Custodian;
import de.fhg.isst.cda.classes.DataEnterer;
import de.fhg.isst.cda.classes.DocumentationOf;
import de.fhg.isst.cda.classes.EffectiveTime;
import de.fhg.isst.cda.classes.ID;
import de.fhg.isst.cda.classes.InFulfillmentOf;
import de.fhg.isst.cda.classes.Informant;
import de.fhg.isst.cda.classes.InformationRecipient;
import de.fhg.isst.cda.classes.LanguageCode;
import de.fhg.isst.cda.classes.LegalAuthenticator;
import de.fhg.isst.cda.classes.Participant;
import de.fhg.isst.cda.classes.ProviderOrganization;
import de.fhg.isst.cda.classes.RecordTarget;
import de.fhg.isst.cda.classes.RelatedDocument;
import de.fhg.isst.cda.classes.VersionNumber;
import de.fhg.isst.cda.enumerations.ActClinicalDocument;
import de.fhg.isst.cda.enumerations.XDocumentActMood;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class CDADocument.
 */
public class CDADocument {
        /** The realm code. */
        private List<Code> realmCode;

	/** The type id. */
	private ID typeID;

	/** The template id. */
	private List<ID> templateID;

	/** The id. */
	private ID id;

	/** The code. */
	private Code code;

	/** The title. */
	private String title;

	/** The effective time. */
	private EffectiveTime effectiveTime;

	/** The confidentiality code. */
	private ConfidentialityCode confidentialityCode;

	/** The language code. */
	private LanguageCode languageCode;

	/** The set id. */
	private ID setID;

	/** The version number. */
	private VersionNumber versionNumber;

	/** The copy time. */
	private CopyTime copyTime;

	/** The record target. */
	private ArrayList<RecordTarget> recordTarget;

	/** The provider organization. */
	private ProviderOrganization providerOrganization;

	/** The author. */
	private ArrayList<Author> author;

	/** The custodian. */
	private Custodian custodian;

	/** The legal authenticator. */
	private LegalAuthenticator legalAuthenticator;

	/** The related documents. */
	private ArrayList<RelatedDocument> relatedDocuments;

	/** The component of. */
	private ComponentOf componentOf;

	/** The component. */
	private Component2 component;

	/** The data enterer. */
	private DataEnterer dataEnterer;

	/** The class code. */
	private ActClinicalDocument classCode;

	/** The mood code. */
	private XDocumentActMood moodCode;

	/** The informants. */
	private ArrayList<Informant> informants;

	/** The information recipients. */
	private ArrayList<InformationRecipient> informationRecipients;

	/** The authenticators. */
	private ArrayList<Authenticator> authenticators;

	/** The participants. */
	private ArrayList<Participant> participants;

	/** The in fulfillment of. */
	private ArrayList<InFulfillmentOf> inFulfillmentOf;

	/** The documentation of. */
	private ArrayList<DocumentationOf> documentationOf;

	/** The authorizations. */
	private ArrayList<Authorization> authorizations;

	/**
	 * Inits the vars.
	 */
	private void initVars() {
		this.recordTarget = new ArrayList<RecordTarget>();
		this.author = new ArrayList<Author>();
		this.relatedDocuments = new ArrayList<RelatedDocument>();
		this.informationRecipients = new ArrayList<InformationRecipient>();
		this.authenticators = new ArrayList<Authenticator>();
		this.participants = new ArrayList<Participant>();
		this.inFulfillmentOf = new ArrayList<InFulfillmentOf>();
		this.documentationOf = new ArrayList<DocumentationOf>();
		this.authenticators = new ArrayList<Authenticator>();
	}

	/**
	 * Gets the type id.
	 * 
	 * @return the type id
	 */
	public ID getTypeID() {
		return typeID;
	}

	/**
	 * Sets the type id.
	 * 
	 * @param typeID
	 *            the new type id
	 */
	public void setTypeID(ID typeID) {
		this.typeID = typeID;
	}

	/**
	 * Gets the template id.
	 * 
	 * @return the template id
	 */
	public List<ID> getTemplateID() {
            if (templateID==null){
                templateID=new ArrayList<>();
            }
            return templateID;
	}

	/**
	 * Sets the template id.
	 * 
	 * @param templateID
	 *            the new template id
	 */
	public void setTemplateID(List<ID> templateID) {
		this.templateID = templateID;
	}

	/**
	 * Gets the id.
	 * 
	 * @return the id
	 */
	public ID getId() {
		return id;
	}

	/**
	 * Sets the id.
	 * 
	 * @param id
	 *            the new id
	 */
	public void setId(ID id) {
		this.id = id;
	}

	/**
	 * Gets the code.
	 * 
	 * @return the code
	 */
	public Code getCode() {
		return code;
	}

	/**
	 * Sets the code.
	 * 
	 * @param code
	 *            the new code
	 */
	public void setCode(Code code) {
		this.code = code;
	}

	/**
	 * Gets the title.
	 * 
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the title.
	 * 
	 * @param title
	 *            the new title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Gets the effective time.
	 * 
	 * @return the effective time
	 */
	public EffectiveTime getEffectiveTime() {
		return effectiveTime;
	}

	/**
	 * Sets the effective time.
	 * 
	 * @param effectiveTime
	 *            the new effective time
	 */
	public void setEffectiveTime(EffectiveTime effectiveTime) {
		this.effectiveTime = effectiveTime;
	}

	/**
	 * Gets the confidentiality code.
	 * 
	 * @return the confidentiality code
	 */
	public ConfidentialityCode getConfidentialityCode() {
		return confidentialityCode;
	}

	/**
	 * Sets the confidentiality code.
	 * 
	 * @param confidentialityCode
	 *            the new confidentiality code
	 */
	public void setConfidentialityCode(ConfidentialityCode confidentialityCode) {
		this.confidentialityCode = confidentialityCode;
	}

	/**
	 * Gets the language code.
	 * 
	 * @return the language code
	 */
	public LanguageCode getLanguageCode() {
		return languageCode;
	}

	/**
	 * Sets the language code.
	 * 
	 * @param languageCode
	 *            the new language code
	 */
	public void setLanguageCode(LanguageCode languageCode) {
		this.languageCode = languageCode;
	}

	/**
	 * Gets the sets the id.
	 * 
	 * @return the sets the id
	 */
	public ID getSetID() {
		return setID;
	}

	/**
	 * Sets the sets the id.
	 * 
	 * @param setID
	 *            the new sets the id
	 */
	public void setSetID(ID setID) {
		this.setID = setID;
	}

	/**
	 * Gets the version number.
	 * 
	 * @return the version number
	 */
	public VersionNumber getVersionNumber() {
		return versionNumber;
	}

	/**
	 * Sets the version number.
	 * 
	 * @param versionNumber
	 *            the new version number
	 */
	public void setVersionNumber(VersionNumber versionNumber) {
		this.versionNumber = versionNumber;
	}

	/**
	 * Gets the copy time.
	 * 
	 * @return the copy time
	 */
	public CopyTime getCopyTime() {
		return copyTime;
	}

	/**
	 * Sets the copy time.
	 * 
	 * @param copyTime
	 *            the new copy time
	 */
	public void setCopyTime(CopyTime copyTime) {
		this.copyTime = copyTime;
	}

	/**
	 * Gets the record target.
	 * 
	 * @return the record target
	 */
	public ArrayList<RecordTarget> getRecordTarget() {
		if (this.recordTarget == null) {
			this.recordTarget = new ArrayList<RecordTarget>();
		}
		return recordTarget;
	}

	/**
	 * Sets the record target.
	 * 
	 * @param recordTarget
	 *            the new record target
	 */
	public void setRecordTarget(ArrayList<RecordTarget> recordTarget) {
		this.recordTarget = recordTarget;
	}

	/**
	 * Gets the provider organization.
	 * 
	 * @return the provider organization
	 */
	public ProviderOrganization getProviderOrganization() {
		return providerOrganization;
	}

	/**
	 * Sets the provider organization.
	 * 
	 * @param providerOrganization
	 *            the new provider organization
	 */
	public void setProviderOrganization(ProviderOrganization providerOrganization) {
		this.providerOrganization = providerOrganization;
	}

	/**
	 * Gets the authors.
	 * 
	 * @return the authors
	 */
	public ArrayList<Author> getAuthors() {
		return author;
	}

	/**
	 * Sets the authors.
	 * 
	 * @param author
	 *            the new authors
	 */
	public void setAuthors(ArrayList<Author> author) {
		this.author = author;
	}

	/**
	 * Gets the custodian.
	 * 
	 * @return the custodian
	 */
	public Custodian getCustodian() {
		return custodian;
	}

	/**
	 * Sets the custodian.
	 * 
	 * @param custodian
	 *            the new custodian
	 */
	public void setCustodian(Custodian custodian) {
		this.custodian = custodian;
	}

	/**
	 * Gets the legal authenticator.
	 * 
	 * @return the legal authenticator
	 */
	public LegalAuthenticator getLegalAuthenticator() {
		return legalAuthenticator;
	}

	/**
	 * Sets the legal authenticator.
	 * 
	 * @param legalAuthenticator
	 *            the new legal authenticator
	 */
	public void setLegalAuthenticator(LegalAuthenticator legalAuthenticator) {
		this.legalAuthenticator = legalAuthenticator;
	}

	/**
	 * Gets the related documents.
	 * 
	 * @return the related documents
	 */
	public ArrayList<RelatedDocument> getRelatedDocuments() {
		if (this.relatedDocuments == null) {
			this.relatedDocuments = new ArrayList<RelatedDocument>();
		}
		return relatedDocuments;
	}

	/**
	 * Sets the related documents.
	 * 
	 * @param relatedDocuments
	 *            the new related documents
	 */
	public void setRelatedDocuments(ArrayList<RelatedDocument> relatedDocuments) {
		this.relatedDocuments = relatedDocuments;
	}

	/**
	 * Gets the component of.
	 * 
	 * @return the component of
	 */
	public ComponentOf getComponentOf() {
		return componentOf;
	}

	/**
	 * Sets the component of.
	 * 
	 * @param componentOf
	 *            the new component of
	 */
	public void setComponentOf(ComponentOf componentOf) {
		this.componentOf = componentOf;
	}

	/**
	 * Gets the component.
	 * 
	 * @return the component
	 */
	public Component2 getComponent() {
		return component;
	}

	/**
	 * Sets the component.
	 * 
	 * @param component
	 *            the new component
	 */
	public void setComponent(Component2 component) {
		this.component = component;
	}

	/**
	 * Gets the data enterer.
	 * 
	 * @return the data enterer
	 */
	public DataEnterer getDataEnterer() {
		return dataEnterer;
	}

	/**
	 * Sets the data enterer.
	 * 
	 * @param dataEnterer
	 *            the new data enterer
	 */
	public void setDataEnterer(DataEnterer dataEnterer) {
		this.dataEnterer = dataEnterer;
	}

	/**
	 * Gets the class code.
	 * 
	 * @return the class code
	 */
	public ActClinicalDocument getClassCode() {
		return classCode;
	}

	/**
	 * Sets the class code.
	 * 
	 * @param classCode
	 *            the new class code
	 */
	public void setClassCode(ActClinicalDocument classCode) {
		this.classCode = classCode;
	}

	/**
	 * Gets the mood code.
	 * 
	 * @return the mood code
	 */
	public XDocumentActMood getMoodCode() {
		return moodCode;
	}

	/**
	 * Sets the mood code.
	 * 
	 * @param moodCode
	 *            the new mood code
	 */
	public void setMoodCode(XDocumentActMood moodCode) {
		this.moodCode = moodCode;
	}

	/**
	 * Gets the informants.
	 * 
	 * @return the informants
	 */
	public ArrayList<Informant> getInformants() {
		if (this.informants == null) {
			this.informants = new ArrayList<Informant>();
		}
		return this.informants;
	}

	/**
	 * Sets the informant.
	 * 
	 * @param informants
	 *            the new informant
	 */
	public void setInformant(ArrayList<Informant> informants) {
		this.informants = informants;
	}

	/**
	 * Gets the information recipients.
	 * 
	 * @return the information recipients
	 */
	public ArrayList<InformationRecipient> getInformationRecipients() {
		if (this.informationRecipients == null) {
			this.informationRecipients = new ArrayList<InformationRecipient>();
		}
		return informationRecipients;
	}

	/**
	 * Sets the information recipients.
	 * 
	 * @param informationRecipients
	 *            the new information recipients
	 */
	public void setInformationRecipients(ArrayList<InformationRecipient> informationRecipients) {
		this.informationRecipients = informationRecipients;
	}

	/**
	 * Gets the authenticators.
	 * 
	 * @return the authenticators
	 */
	public ArrayList<Authenticator> getAuthenticators() {
		if (this.authenticators == null) {
			this.authenticators = new ArrayList<Authenticator>();
		}
		return authenticators;
	}

	/**
	 * Sets the authenticators.
	 * 
	 * @param authenticators
	 *            the new authenticators
	 */
	public void setAuthenticators(ArrayList<Authenticator> authenticators) {
		this.authenticators = authenticators;
	}

	/**
	 * Gets the participants.
	 * 
	 * @return the participants
	 */
	public ArrayList<Participant> getParticipants() {
		if (this.participants == null) {
			this.participants = new ArrayList<Participant>();
		}
		return participants;
	}

	/**
	 * Sets the participants.
	 * 
	 * @param participants
	 *            the new participants
	 */
	public void setParticipants(ArrayList<Participant> participants) {
		this.participants = participants;
	}

	/**
	 * Gets the in fulfillment of.
	 * 
	 * @return the in fulfillment of
	 */
	public ArrayList<InFulfillmentOf> getInFulfillmentOf() {
		if (this.inFulfillmentOf == null) {
			this.inFulfillmentOf = new ArrayList<InFulfillmentOf>();
		}
		return inFulfillmentOf;
	}

	/**
	 * Sets the in fulfillment of.
	 * 
	 * @param inFulfillmentOf
	 *            the new in fulfillment of
	 */
	public void setInFulfillmentOf(ArrayList<InFulfillmentOf> inFulfillmentOf) {
		this.inFulfillmentOf = inFulfillmentOf;
	}

	/**
	 * Sets the informants.
	 * 
	 * @param informants
	 *            the new informants
	 */
	public void setInformants(ArrayList<Informant> informants) {
		this.informants = informants;
	}

	/**
	 * Gets the documentation of.
	 * 
	 * @return the documentation of
	 */
	public ArrayList<DocumentationOf> getDocumentationOf() {
		if (this.documentationOf == null) {
			this.documentationOf = new ArrayList<DocumentationOf>();
		}
		return documentationOf;
	}

	/**
	 * Sets the documentation of.
	 * 
	 * @param documentationOf
	 *            the new documentation of
	 */
	public void setDocumentationOf(ArrayList<DocumentationOf> documentationOf) {
		this.documentationOf = documentationOf;
	}

	/**
	 * Gets the authorizations.
	 * 
	 * @return the authorizations
	 */
	public ArrayList<Authorization> getAuthorizations() {
		if (this.authorizations == null) {
			this.authorizations = new ArrayList<Authorization>();
		}
		return authorizations;
	}

	/**
	 * Sets the authorizations.
	 * 
	 * @param authorizations
	 *            the new authorizations
	 */
	public void setAuthorizations(ArrayList<Authorization> authorizations) {
		this.authorizations = authorizations;
	}

	/**
	 * Instantiates a new cDA document.
	 */
	public CDADocument() {
		this.initVars();
		this.typeID = new ID("2.16.840.1.113883.1.3", "POCD_HD000040");
		this.classCode = ActClinicalDocument.DOCCLIN;
		this.moodCode = XDocumentActMood.EVN;
	}

    public List<Code> getRealmCode() {
        if (realmCode==null){
            realmCode=new ArrayList<Code>();
        }
        return realmCode;
    }

    public void setRealmCode(List<Code> realmCode) {
        this.realmCode = realmCode;
    }
        
        

}