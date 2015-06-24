
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
 * <p>Java class for POCD_MT000040.Component4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POCD_MT000040.Component4">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="realmCode" type="{urn:hl7-org:v3}CS" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="typeId" type="{urn:hl7-org:v3}POCD_MT000040.InfrastructureRoot.typeId" minOccurs="0"/>
 *         &lt;element name="templateId" type="{urn:hl7-org:v3}II" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sequenceNumber" type="{urn:hl7-org:v3}INT" minOccurs="0"/>
 *         &lt;element name="seperatableInd" type="{urn:hl7-org:v3}BL" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="act" type="{urn:hl7-org:v3}POCD_MT000040.Act"/>
 *           &lt;element name="encounter" type="{urn:hl7-org:v3}POCD_MT000040.Encounter"/>
 *           &lt;element name="observation" type="{urn:hl7-org:v3}POCD_MT000040.Observation"/>
 *           &lt;element name="observationMedia" type="{urn:hl7-org:v3}POCD_MT000040.ObservationMedia"/>
 *           &lt;element name="organizer" type="{urn:hl7-org:v3}POCD_MT000040.Organizer"/>
 *           &lt;element name="procedure" type="{urn:hl7-org:v3}POCD_MT000040.Procedure"/>
 *           &lt;element name="regionOfInterest" type="{urn:hl7-org:v3}POCD_MT000040.RegionOfInterest"/>
 *           &lt;element name="substanceAdministration" type="{urn:hl7-org:v3}POCD_MT000040.SubstanceAdministration"/>
 *           &lt;element name="supply" type="{urn:hl7-org:v3}POCD_MT000040.Supply"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" />
 *       &lt;attribute name="typeCode" type="{urn:hl7-org:v3}ActRelationshipHasComponent" fixed="COMP" />
 *       &lt;attribute name="contextConductionInd" type="{urn:hl7-org:v3}bl" fixed="true" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POCD_MT000040.Component4", namespace = "urn:hl7-org:v3", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "sequenceNumber",
    "seperatableInd",
    "act",
    "encounter",
    "observation",
    "observationMedia",
    "organizer",
    "procedure",
    "regionOfInterest",
    "substanceAdministration",
    "supply"
})
public class POCDMT000040Component4 {

    /** The realm code. */
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected List<CS> realmCode;
    
    /** The type id. */
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected POCDMT000040InfrastructureRootTypeId typeId;
    
    /** The template id. */
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected List<II> templateId;
    
    /** The sequence number. */
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected INT sequenceNumber;
    
    /** The seperatable ind. */
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected BL seperatableInd;
    
    /** The act. */
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected POCDMT000040Act act;
    
    /** The encounter. */
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected POCDMT000040Encounter encounter;
    
    /** The observation. */
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected POCDMT000040Observation observation;
    
    /** The observation media. */
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected POCDMT000040ObservationMedia observationMedia;
    
    /** The organizer. */
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected POCDMT000040Organizer organizer;
    
    /** The procedure. */
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected POCDMT000040Procedure procedure;
    
    /** The region of interest. */
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected POCDMT000040RegionOfInterest regionOfInterest;
    
    /** The substance administration. */
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected POCDMT000040SubstanceAdministration substanceAdministration;
    
    /** The supply. */
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected POCDMT000040Supply supply;
    
    /** The null flavor. */
    @XmlAttribute(name = "nullFlavor")
    protected List<String> nullFlavor;
    
    /** The type code. */
    @XmlAttribute(name = "typeCode")
    protected ActRelationshipHasComponent typeCode;
    
    /** The context conduction ind. */
    @XmlAttribute(name = "contextConductionInd")
    protected Boolean contextConductionInd;

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
	 * Gets the value of the sequenceNumber property.
	 * 
	 * @return the sequence number possible object is {@link INT }
	 */
    public INT getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link INT }
     *     
     */
    public void setSequenceNumber(INT value) {
        this.sequenceNumber = value;
    }

    /**
	 * Gets the value of the seperatableInd property.
	 * 
	 * @return the seperatable ind possible object is {@link BL }
	 */
    public BL getSeperatableInd() {
        return seperatableInd;
    }

    /**
     * Sets the value of the seperatableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BL }
     *     
     */
    public void setSeperatableInd(BL value) {
        this.seperatableInd = value;
    }

    /**
	 * Gets the value of the act property.
	 * 
	 * @return the act possible object is {@link POCDMT000040Act }
	 */
    public POCDMT000040Act getAct() {
        return act;
    }

    /**
     * Sets the value of the act property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040Act }
     *     
     */
    public void setAct(POCDMT000040Act value) {
        this.act = value;
    }

    /**
	 * Gets the value of the encounter property.
	 * 
	 * @return the encounter possible object is {@link POCDMT000040Encounter }
	 */
    public POCDMT000040Encounter getEncounter() {
        return encounter;
    }

    /**
     * Sets the value of the encounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040Encounter }
     *     
     */
    public void setEncounter(POCDMT000040Encounter value) {
        this.encounter = value;
    }

    /**
	 * Gets the value of the observation property.
	 * 
	 * @return the observation possible object is
	 *         {@link POCDMT000040Observation }
	 */
    public POCDMT000040Observation getObservation() {
        return observation;
    }

    /**
     * Sets the value of the observation property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040Observation }
     *     
     */
    public void setObservation(POCDMT000040Observation value) {
        this.observation = value;
    }

    /**
	 * Gets the value of the observationMedia property.
	 * 
	 * @return the observation media possible object is
	 *         {@link POCDMT000040ObservationMedia }
	 */
    public POCDMT000040ObservationMedia getObservationMedia() {
        return observationMedia;
    }

    /**
     * Sets the value of the observationMedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040ObservationMedia }
     *     
     */
    public void setObservationMedia(POCDMT000040ObservationMedia value) {
        this.observationMedia = value;
    }

    /**
	 * Gets the value of the organizer property.
	 * 
	 * @return the organizer possible object is {@link POCDMT000040Organizer }
	 */
    public POCDMT000040Organizer getOrganizer() {
        return organizer;
    }

    /**
     * Sets the value of the organizer property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040Organizer }
     *     
     */
    public void setOrganizer(POCDMT000040Organizer value) {
        this.organizer = value;
    }

    /**
	 * Gets the value of the procedure property.
	 * 
	 * @return the procedure possible object is {@link POCDMT000040Procedure }
	 */
    public POCDMT000040Procedure getProcedure() {
        return procedure;
    }

    /**
     * Sets the value of the procedure property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040Procedure }
     *     
     */
    public void setProcedure(POCDMT000040Procedure value) {
        this.procedure = value;
    }

    /**
	 * Gets the value of the regionOfInterest property.
	 * 
	 * @return the region of interest possible object is
	 *         {@link POCDMT000040RegionOfInterest }
	 */
    public POCDMT000040RegionOfInterest getRegionOfInterest() {
        return regionOfInterest;
    }

    /**
     * Sets the value of the regionOfInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040RegionOfInterest }
     *     
     */
    public void setRegionOfInterest(POCDMT000040RegionOfInterest value) {
        this.regionOfInterest = value;
    }

    /**
	 * Gets the value of the substanceAdministration property.
	 * 
	 * @return the substance administration possible object is
	 *         {@link POCDMT000040SubstanceAdministration }
	 */
    public POCDMT000040SubstanceAdministration getSubstanceAdministration() {
        return substanceAdministration;
    }

    /**
     * Sets the value of the substanceAdministration property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040SubstanceAdministration }
     *     
     */
    public void setSubstanceAdministration(POCDMT000040SubstanceAdministration value) {
        this.substanceAdministration = value;
    }

    /**
	 * Gets the value of the supply property.
	 * 
	 * @return the supply possible object is {@link POCDMT000040Supply }
	 */
    public POCDMT000040Supply getSupply() {
        return supply;
    }

    /**
     * Sets the value of the supply property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040Supply }
     *     
     */
    public void setSupply(POCDMT000040Supply value) {
        this.supply = value;
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
	 * Gets the value of the typeCode property.
	 * 
	 * @return the type code possible object is
	 *         {@link ActRelationshipHasComponent }
	 */
    public ActRelationshipHasComponent getTypeCode() {
        if (typeCode == null) {
            return ActRelationshipHasComponent.COMP;
        } else {
            return typeCode;
        }
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActRelationshipHasComponent }
     *     
     */
    public void setTypeCode(ActRelationshipHasComponent value) {
        this.typeCode = value;
    }

    /**
	 * Gets the value of the contextConductionInd property.
	 * 
	 * @return true, if is context conduction ind possible object is
	 *         {@link Boolean }
	 */
    public boolean isContextConductionInd() {
        if (contextConductionInd == null) {
            return true;
        } else {
            return contextConductionInd;
        }
    }

    /**
     * Sets the value of the contextConductionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContextConductionInd(Boolean value) {
        this.contextConductionInd = value;
    }

}
