
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
 * <p>Java class for POCD_MT000040.Material complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POCD_MT000040.Material">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="realmCode" type="{urn:hl7-org:v3}CS" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="typeId" type="{urn:hl7-org:v3}POCD_MT000040.InfrastructureRoot.typeId" minOccurs="0"/>
 *         &lt;element name="templateId" type="{urn:hl7-org:v3}II" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="code" type="{urn:hl7-org:v3}CE" minOccurs="0"/>
 *         &lt;element name="name" type="{urn:hl7-org:v3}EN" minOccurs="0"/>
 *         &lt;element name="lotNumberText" type="{urn:hl7-org:v3}ST" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" />
 *       &lt;attribute name="classCode" type="{urn:hl7-org:v3}EntityClassManufacturedMaterial" fixed="MMAT" />
 *       &lt;attribute name="determinerCode" type="{urn:hl7-org:v3}EntityDeterminerDetermined" fixed="KIND" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POCD_MT000040.Material", namespace = "urn:hl7-org:v3", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "code",
    "name",
    "lotNumberText"
})
public class POCDMT000040Material {

    /** The realm code. */
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected List<CS> realmCode;
    
    /** The type id. */
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected POCDMT000040InfrastructureRootTypeId typeId;
    
    /** The template id. */
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected List<II> templateId;
    
    /** The code. */
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected CE code;
    
    /** The name. */
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected EN name;
    
    /** The lot number text. */
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected ST lotNumberText;
    
    /** The null flavor. */
    @XmlAttribute(name = "nullFlavor")
    protected List<String> nullFlavor;
    
    /** The class code. */
    @XmlAttribute(name = "classCode")
    protected String classCode;
    
    /** The determiner code. */
    @XmlAttribute(name = "determinerCode")
    protected EntityDeterminerDetermined determinerCode;

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
	 * Gets the value of the name property.
	 * 
	 * @return the name possible object is {@link EN }
	 */
    public EN getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link EN }
     *     
     */
    public void setName(EN value) {
        this.name = value;
    }

    /**
	 * Gets the value of the lotNumberText property.
	 * 
	 * @return the lot number text possible object is {@link ST }
	 */
    public ST getLotNumberText() {
        return lotNumberText;
    }

    /**
     * Sets the value of the lotNumberText property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setLotNumberText(ST value) {
        this.lotNumberText = value;
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
	 * @return the class code possible object is {@link String }
	 */
    public String getClassCode() {
        if (classCode == null) {
            return "MMAT";
        } else {
            return classCode;
        }
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassCode(String value) {
        this.classCode = value;
    }

    /**
	 * Gets the value of the determinerCode property.
	 * 
	 * @return the determiner code possible object is
	 *         {@link EntityDeterminerDetermined }
	 */
    public EntityDeterminerDetermined getDeterminerCode() {
        if (determinerCode == null) {
            return EntityDeterminerDetermined.KIND;
        } else {
            return determinerCode;
        }
    }

    /**
     * Sets the value of the determinerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityDeterminerDetermined }
     *     
     */
    public void setDeterminerCode(EntityDeterminerDetermined value) {
        this.determinerCode = value;
    }

}
