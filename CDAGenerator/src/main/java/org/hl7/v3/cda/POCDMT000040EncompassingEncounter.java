
package org.hl7.v3.cda;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for POCD_MT000040.EncompassingEncounter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POCD_MT000040.EncompassingEncounter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="realmCode" type="{urn:hl7-org:v3}CS" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="typeId" type="{urn:hl7-org:v3}POCD_MT000040.InfrastructureRoot.typeId" minOccurs="0"/>
 *         &lt;element name="templateId" type="{urn:hl7-org:v3}II" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="id" type="{urn:hl7-org:v3}II" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="code" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="effectiveTime" type="{urn:hl7-org:v3}IVL_TS"/>
 *         &lt;element name="dischargeDispositionCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="responsibleParty" type="{urn:hl7-org:v3}POCD_MT000040.ResponsibleParty" minOccurs="0"/>
 *         &lt;element name="encounterParticipant" type="{urn:hl7-org:v3}POCD_MT000040.EncounterParticipant" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="location" type="{urn:hl7-org:v3}POCD_MT000040.Location" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" />
 *       &lt;attribute name="classCode" type="{urn:hl7-org:v3}ActClass" fixed="ENC" />
 *       &lt;attribute name="moodCode" type="{urn:hl7-org:v3}ActMood" fixed="EVN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POCD_MT000040.EncompassingEncounter", namespace = "urn:hl7-org:v3", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "code",
    "effectiveTime",
    "dischargeDispositionCode",
    "responsibleParty",
    "encounterParticipant",
    "location"
})
public class POCDMT000040EncompassingEncounter {

    /** The realm code. */
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected List<CS> realmCode;
    
    /** The type id. */
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected POCDMT000040InfrastructureRootTypeId typeId;
    
    /** The template id. */
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected List<II> templateId;
    
    /** The id. */
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected List<II> id;
    
    /** The code. */
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected CE code;
    
    /** The effective time. */
    @XmlElement(namespace = "urn:hl7-org:v3", required = true)
    protected IVLTS effectiveTime;
    
    /** The discharge disposition code. */
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected CE dischargeDispositionCode;
    
    /** The responsible party. */
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected POCDMT000040ResponsibleParty responsibleParty;
    
    /** The encounter participant. */
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected List<POCDMT000040EncounterParticipant> encounterParticipant;
    
    /** The location. */
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected POCDMT000040Location location;
    
    /** The null flavor. */
    @XmlAttribute(name = "nullFlavor")
    protected List<String> nullFlavor;
    
    /** The class code. */
    @XmlAttribute(name = "classCode")
    protected List<String> classCode;
    
    /** The mood code. */
    @XmlAttribute(name = "moodCode")
    protected List<String> moodCode;

    /**
	 * Gets the value of the realmCode property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the realmCode property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getRealmCode().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * 
	 * @return the realm code {@link CS }
	 */
    public List<CS> getRealmCode() {
        if (realmCode == null) {
            realmCode = new ArrayList<CS>();
        }
        return this.realmCode;
    }

    /**
	 * Gets the value of the typeId property.
	 * 
	 * @return the type id possible object is
	 *         {@link POCDMT000040InfrastructureRootTypeId }
	 */
    public POCDMT000040InfrastructureRootTypeId getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040InfrastructureRootTypeId }
     *     
     */
    public void setTypeId(POCDMT000040InfrastructureRootTypeId value) {
        this.typeId = value;
    }

    /**
	 * Gets the value of the templateId property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the templateId property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getTemplateId().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * 
	 * @return the template id {@link II }
	 */
    public List<II> getTemplateId() {
        if (templateId == null) {
            templateId = new ArrayList<II>();
        }
        return this.templateId;
    }

    /**
	 * Gets the value of the id property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the id property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getId().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * 
	 * @return the id {@link II }
	 */
    public List<II> getId() {
        if (id == null) {
            id = new ArrayList<II>();
        }
        return this.id;
    }

    /**
	 * Gets the value of the code property.
	 * 
	 * @return the code possible object is {@link CE }
	 */
    public CE getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setCode(CE value) {
        this.code = value;
    }

    /**
	 * Gets the value of the effectiveTime property.
	 * 
	 * @return the effective time possible object is {@link IVLTS }
	 */
    public IVLTS getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * Sets the value of the effectiveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLTS }
     *     
     */
    public void setEffectiveTime(IVLTS value) {
        this.effectiveTime = value;
    }

    /**
	 * Gets the value of the dischargeDispositionCode property.
	 * 
	 * @return the discharge disposition code possible object is {@link CE }
	 */
    public CE getDischargeDispositionCode() {
        return dischargeDispositionCode;
    }

    /**
     * Sets the value of the dischargeDispositionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setDischargeDispositionCode(CE value) {
        this.dischargeDispositionCode = value;
    }

    /**
	 * Gets the value of the responsibleParty property.
	 * 
	 * @return the responsible party possible object is
	 *         {@link POCDMT000040ResponsibleParty }
	 */
    public POCDMT000040ResponsibleParty getResponsibleParty() {
        return responsibleParty;
    }

    /**
     * Sets the value of the responsibleParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040ResponsibleParty }
     *     
     */
    public void setResponsibleParty(POCDMT000040ResponsibleParty value) {
        this.responsibleParty = value;
    }

    /**
	 * Gets the value of the encounterParticipant property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the encounterParticipant property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getEncounterParticipant().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * 
	 * @return the encounter participant
	 *         {@link POCDMT000040EncounterParticipant }
	 */
    public List<POCDMT000040EncounterParticipant> getEncounterParticipant() {
        if (encounterParticipant == null) {
            encounterParticipant = new ArrayList<POCDMT000040EncounterParticipant>();
        }
        return this.encounterParticipant;
    }

    /**
	 * Gets the value of the location property.
	 * 
	 * @return the location possible object is {@link POCDMT000040Location }
	 */
    public POCDMT000040Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040Location }
     *     
     */
    public void setLocation(POCDMT000040Location value) {
        this.location = value;
    }

    /**
	 * Gets the value of the nullFlavor property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the nullFlavor property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getNullFlavor().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * 
	 * @return the null flavor {@link String }
	 */
    public List<String> getNullFlavor() {
        if (nullFlavor == null) {
            nullFlavor = new ArrayList<String>();
        }
        return this.nullFlavor;
    }

    /**
	 * Gets the value of the classCode property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the classCode property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getClassCode().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * 
	 * @return the class code {@link String }
	 */
    public List<String> getClassCode() {
        if (classCode == null) {
            classCode = new ArrayList<String>();
        }
        return this.classCode;
    }

    /**
	 * Gets the value of the moodCode property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the moodCode property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getMoodCode().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * 
	 * @return the mood code {@link String }
	 */
    public List<String> getMoodCode() {
        if (moodCode == null) {
            moodCode = new ArrayList<String>();
        }
        return this.moodCode;
    }

}
