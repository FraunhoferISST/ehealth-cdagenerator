
package org.hl7.v3.cda;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


// TODO: Auto-generated Javadoc
/**
 * 
 *             A concept descriptor represents any kind of concept usually
 *             by giving a code defined in a code system.  A concept
 *             descriptor can contain the original text or phrase that
 *             served as the basis of the coding and one or more
 *             translations into different coding systems. A concept
 *             descriptor can also contain qualifiers to describe, e.g.,
 *             the concept of a "left foot" as a postcoordinated term built
 *             from the primary code "FOOT" and the qualifier "LEFT".
 *             In exceptional cases, the concept descriptor need not
 *             contain a code but only the original text describing
 *             that concept.
 *          
 * 
 * <p>Java class for CD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CD">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}ANY">
 *       &lt;sequence>
 *         &lt;element name="originalText" type="{urn:hl7-org:v3}ED" minOccurs="0"/>
 *         &lt;element name="qualifier" type="{urn:hl7-org:v3}CR" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="translation" type="{urn:hl7-org:v3}CD" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="code" type="{urn:hl7-org:v3}cs" />
 *       &lt;attribute name="codeSystem" type="{urn:hl7-org:v3}uid" />
 *       &lt;attribute name="codeSystemName" type="{urn:hl7-org:v3}st" />
 *       &lt;attribute name="codeSystemVersion" type="{urn:hl7-org:v3}st" />
 *       &lt;attribute name="displayName" type="{urn:hl7-org:v3}st" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CD", namespace = "urn:hl7-org:v3", propOrder = {
    "originalText",
    "qualifier",
    "translation"
})
@XmlSeeAlso({
    BXITCD.class,
    SXCMCD.class,
    CE.class
})
public class CD
    extends ANY
{

    /** The original text. */
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected ED originalText;
    
    /** The qualifier. */
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected List<CR> qualifier;
    
    /** The translation. */
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected List<CD> translation;
    
    /** The code. */
    @XmlAttribute(name = "code")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String code;
    
    /** The code system. */
    @XmlAttribute(name = "codeSystem")
    protected String codeSystem;
    
    /** The code system name. */
    @XmlAttribute(name = "codeSystemName")
    protected String codeSystemName;
    
    /** The code system version. */
    @XmlAttribute(name = "codeSystemVersion")
    protected String codeSystemVersion;
    
    /** The display name. */
    @XmlAttribute(name = "displayName")
    protected String displayName;

    /**
	 * Gets the value of the originalText property.
	 * 
	 * @return the original text possible object is {@link ED }
	 */
    public ED getOriginalText() {
        return originalText;
    }

    /**
     * Sets the value of the originalText property.
     * 
     * @param value
     *     allowed object is
     *     {@link ED }
     *     
     */
    public void setOriginalText(ED value) {
        this.originalText = value;
    }

    /**
	 * Gets the value of the qualifier property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the qualifier property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getQualifier().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * 
	 * @return the qualifier {@link CR }
	 */
    public List<CR> getQualifier() {
        if (qualifier == null) {
            qualifier = new ArrayList<CR>();
        }
        return this.qualifier;
    }

    /**
	 * Gets the value of the translation property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the translation property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getTranslation().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * 
	 * @return the translation {@link CD }
	 */
    public List<CD> getTranslation() {
        if (translation == null) {
            translation = new ArrayList<CD>();
        }
        return this.translation;
    }

    /**
	 * Gets the value of the code property.
	 * 
	 * @return the code possible object is {@link String }
	 */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
	 * Gets the value of the codeSystem property.
	 * 
	 * @return the code system possible object is {@link String }
	 */
    public String getCodeSystem() {
        return codeSystem;
    }

    /**
     * Sets the value of the codeSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeSystem(String value) {
        this.codeSystem = value;
    }

    /**
	 * Gets the value of the codeSystemName property.
	 * 
	 * @return the code system name possible object is {@link String }
	 */
    public String getCodeSystemName() {
        return codeSystemName;
    }

    /**
     * Sets the value of the codeSystemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeSystemName(String value) {
        this.codeSystemName = value;
    }

    /**
	 * Gets the value of the codeSystemVersion property.
	 * 
	 * @return the code system version possible object is {@link String }
	 */
    public String getCodeSystemVersion() {
        return codeSystemVersion;
    }

    /**
     * Sets the value of the codeSystemVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeSystemVersion(String value) {
        this.codeSystemVersion = value;
    }

    /**
	 * Gets the value of the displayName property.
	 * 
	 * @return the display name possible object is {@link String }
	 */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

}
