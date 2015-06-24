
package org.hl7.v3.cda;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for StrucDoc.Table complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StrucDoc.Table">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caption" type="{urn:hl7-org:v3}StrucDoc.Caption" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="col" type="{urn:hl7-org:v3}StrucDoc.Col" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="colgroup" type="{urn:hl7-org:v3}StrucDoc.Colgroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="thead" type="{urn:hl7-org:v3}StrucDoc.Thead" minOccurs="0"/>
 *         &lt;element name="tfoot" type="{urn:hl7-org:v3}StrucDoc.Tfoot" minOccurs="0"/>
 *         &lt;element name="tbody" type="{urn:hl7-org:v3}StrucDoc.Tbody" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="styleCode" type="{http://www.w3.org/2001/XMLSchema}NMTOKENS" />
 *       &lt;attribute name="summary" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="border" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="frame">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="void"/>
 *             &lt;enumeration value="above"/>
 *             &lt;enumeration value="below"/>
 *             &lt;enumeration value="hsides"/>
 *             &lt;enumeration value="lhs"/>
 *             &lt;enumeration value="rhs"/>
 *             &lt;enumeration value="vsides"/>
 *             &lt;enumeration value="box"/>
 *             &lt;enumeration value="border"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="rules">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="none"/>
 *             &lt;enumeration value="groups"/>
 *             &lt;enumeration value="rows"/>
 *             &lt;enumeration value="cols"/>
 *             &lt;enumeration value="all"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="cellspacing" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cellpadding" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrucDoc.Table", namespace = "urn:hl7-org:v3", propOrder = {
    "caption",
    "col",
    "colgroup",
    "thead",
    "tfoot",
    "tbody"
})
public class StrucDocTable {

    /** The caption. */
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected StrucDocCaption caption;
    
    /** The col. */
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected List<StrucDocCol> col;
    
    /** The colgroup. */
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected List<StrucDocColgroup> colgroup;
    
    /** The thead. */
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected StrucDocThead thead;
    
    /** The tfoot. */
    @XmlElement(namespace = "urn:hl7-org:v3")
    protected StrucDocTfoot tfoot;
    
    /** The tbody. */
    @XmlElement(namespace = "urn:hl7-org:v3", required = true)
    protected List<StrucDocTbody> tbody;
    
    /** The id. */
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    
    /** The language. */
    @XmlAttribute(name = "language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String language;
    
    /** The style code. */
    @XmlAttribute(name = "styleCode")
    @XmlSchemaType(name = "NMTOKENS")
    protected List<String> styleCode;
    
    /** The summary. */
    @XmlAttribute(name = "summary")
    protected String summary;
    
    /** The width. */
    @XmlAttribute(name = "width")
    protected String width;
    
    /** The border. */
    @XmlAttribute(name = "border")
    protected String border;
    
    /** The frame. */
    @XmlAttribute(name = "frame")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String frame;
    
    /** The rules. */
    @XmlAttribute(name = "rules")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rules;
    
    /** The cellspacing. */
    @XmlAttribute(name = "cellspacing")
    protected String cellspacing;
    
    /** The cellpadding. */
    @XmlAttribute(name = "cellpadding")
    protected String cellpadding;

    /**
	 * Gets the value of the caption property.
	 * 
	 * @return the caption possible object is {@link StrucDocCaption }
	 */
    public StrucDocCaption getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrucDocCaption }
     *     
     */
    public void setCaption(StrucDocCaption value) {
        this.caption = value;
    }

    /**
	 * Gets the value of the col property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the col property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getCol().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * 
	 * @return the col {@link StrucDocCol }
	 */
    public List<StrucDocCol> getCol() {
        if (col == null) {
            col = new ArrayList<StrucDocCol>();
        }
        return this.col;
    }

    /**
	 * Gets the value of the colgroup property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the colgroup property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getColgroup().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * 
	 * @return the colgroup {@link StrucDocColgroup }
	 */
    public List<StrucDocColgroup> getColgroup() {
        if (colgroup == null) {
            colgroup = new ArrayList<StrucDocColgroup>();
        }
        return this.colgroup;
    }

    /**
	 * Gets the value of the thead property.
	 * 
	 * @return the thead possible object is {@link StrucDocThead }
	 */
    public StrucDocThead getThead() {
        return thead;
    }

    /**
     * Sets the value of the thead property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrucDocThead }
     *     
     */
    public void setThead(StrucDocThead value) {
        this.thead = value;
    }

    /**
	 * Gets the value of the tfoot property.
	 * 
	 * @return the tfoot possible object is {@link StrucDocTfoot }
	 */
    public StrucDocTfoot getTfoot() {
        return tfoot;
    }

    /**
     * Sets the value of the tfoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrucDocTfoot }
     *     
     */
    public void setTfoot(StrucDocTfoot value) {
        this.tfoot = value;
    }

    /**
	 * Gets the value of the tbody property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the tbody property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getTbody().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * 
	 * @return the tbody {@link StrucDocTbody }
	 */
    public List<StrucDocTbody> getTbody() {
        if (tbody == null) {
            tbody = new ArrayList<StrucDocTbody>();
        }
        return this.tbody;
    }

    /**
	 * Gets the value of the id property.
	 * 
	 * @return the id possible object is {@link String }
	 */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
	 * Gets the value of the language property.
	 * 
	 * @return the language possible object is {@link String }
	 */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
	 * Gets the value of the styleCode property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the styleCode property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getStyleCode().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * 
	 * @return the style code {@link String }
	 */
    public List<String> getStyleCode() {
        if (styleCode == null) {
            styleCode = new ArrayList<String>();
        }
        return this.styleCode;
    }

    /**
	 * Gets the value of the summary property.
	 * 
	 * @return the summary possible object is {@link String }
	 */
    public String getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummary(String value) {
        this.summary = value;
    }

    /**
	 * Gets the value of the width property.
	 * 
	 * @return the width possible object is {@link String }
	 */
    public String getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidth(String value) {
        this.width = value;
    }

    /**
	 * Gets the value of the border property.
	 * 
	 * @return the border possible object is {@link String }
	 */
    public String getBorder() {
        return border;
    }

    /**
     * Sets the value of the border property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorder(String value) {
        this.border = value;
    }

    /**
	 * Gets the value of the frame property.
	 * 
	 * @return the frame possible object is {@link String }
	 */
    public String getFrame() {
        return frame;
    }

    /**
     * Sets the value of the frame property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrame(String value) {
        this.frame = value;
    }

    /**
	 * Gets the value of the rules property.
	 * 
	 * @return the rules possible object is {@link String }
	 */
    public String getRules() {
        return rules;
    }

    /**
     * Sets the value of the rules property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRules(String value) {
        this.rules = value;
    }

    /**
	 * Gets the value of the cellspacing property.
	 * 
	 * @return the cellspacing possible object is {@link String }
	 */
    public String getCellspacing() {
        return cellspacing;
    }

    /**
     * Sets the value of the cellspacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellspacing(String value) {
        this.cellspacing = value;
    }

    /**
	 * Gets the value of the cellpadding property.
	 * 
	 * @return the cellpadding possible object is {@link String }
	 */
    public String getCellpadding() {
        return cellpadding;
    }

    /**
     * Sets the value of the cellpadding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellpadding(String value) {
        this.cellpadding = value;
    }

}
