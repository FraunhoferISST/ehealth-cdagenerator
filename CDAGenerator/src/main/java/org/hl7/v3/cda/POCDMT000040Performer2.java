
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
 * <p>Java class for POCD_MT000040.Performer2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POCD_MT000040.Performer2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="realmCode" type="{urn:hl7-org:v3}CS" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="typeId" type="{urn:hl7-org:v3}POCD_MT000040.InfrastructureRoot.typeId" minOccurs="0"/>
 *         &lt;element name="templateId" type="{urn:hl7-org:v3}II" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="time" type="{urn:hl7-org:v3}IVL_TS" minOccurs="0"/>
 *         &lt;element name="modeCode" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="assignedEntity" type="{urn:hl7-org:v3}POCD_MT000040.AssignedEntity"/>
 *       &lt;/sequence>
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" />
 *       &lt;attribute name="typeCode" type="{urn:hl7-org:v3}ParticipationPhysicalPerformer" fixed="PRF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POCD_MT000040.Performer2", namespace = "urn:hl7-org:v3", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "time",
    "modeCode",
    "assignedEntity"
})
public class POCDMT000040Performer2 {

    /** The realm code. */
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected List<CS> realmCode;
    
    /** The type id. */
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected POCDMT000040InfrastructureRootTypeId typeId;
    
    /** The template id. */
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected List<II> templateId;
    
    /** The time. */
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected IVLTS time;
    
    /** The mode code. */
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected CE modeCode;
    
    /** The assigned entity. */
    @XmlElement(namespace = "urn:hl7-org:v3", required = true)
    protected POCDMT000040AssignedEntity assignedEntity;
    
    /** The null flavor. */
    @XmlAttribute(name = "nullFlavor")
    protected List<String> nullFlavor;
    
    /** The type code. */
    @XmlAttribute(name = "typeCode")
    protected ParticipationPhysicalPerformer typeCode;

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
	 * Gets the value of the time property.
	 * 
	 * @return the time possible object is {@link IVLTS }
	 */
    public IVLTS getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link IVLTS }
     *     
     */
    public void setTime(IVLTS value) {
        this.time = value;
    }

    /**
	 * Gets the value of the modeCode property.
	 * 
	 * @return the mode code possible object is {@link CE }
	 */
    public CE getModeCode() {
        return modeCode;
    }

    /**
     * Sets the value of the modeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CE }
     *     
     */
    public void setModeCode(CE value) {
        this.modeCode = value;
    }

    /**
	 * Gets the value of the assignedEntity property.
	 * 
	 * @return the assigned entity possible object is
	 *         {@link POCDMT000040AssignedEntity }
	 */
    public POCDMT000040AssignedEntity getAssignedEntity() {
        return assignedEntity;
    }

    /**
     * Sets the value of the assignedEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link POCDMT000040AssignedEntity }
     *     
     */
    public void setAssignedEntity(POCDMT000040AssignedEntity value) {
        this.assignedEntity = value;
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
	 *         {@link ParticipationPhysicalPerformer }
	 */
    public ParticipationPhysicalPerformer getTypeCode() {
        if (typeCode == null) {
            return ParticipationPhysicalPerformer.PRF;
        } else {
            return typeCode;
        }
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipationPhysicalPerformer }
     *     
     */
    public void setTypeCode(ParticipationPhysicalPerformer value) {
        this.typeCode = value;
    }

}
