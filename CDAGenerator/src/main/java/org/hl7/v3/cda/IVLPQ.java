
package org.hl7.v3.cda;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for IVL_PQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IVL_PQ">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}SXCM_PQ">
 *       &lt;choice minOccurs="0">
 *         &lt;sequence>
 *           &lt;element name="low" type="{urn:hl7-org:v3}IVXB_PQ"/>
 *           &lt;choice minOccurs="0">
 *             &lt;element name="width" type="{urn:hl7-org:v3}PQ" minOccurs="0"/>
 *             &lt;element name="high" type="{urn:hl7-org:v3}IVXB_PQ" minOccurs="0"/>
 *           &lt;/choice>
 *         &lt;/sequence>
 *         &lt;element name="high" type="{urn:hl7-org:v3}IVXB_PQ"/>
 *         &lt;sequence>
 *           &lt;element name="width" type="{urn:hl7-org:v3}PQ"/>
 *           &lt;element name="high" type="{urn:hl7-org:v3}IVXB_PQ" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="center" type="{urn:hl7-org:v3}PQ"/>
 *           &lt;element name="width" type="{urn:hl7-org:v3}PQ" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IVL_PQ", namespace = "urn:hl7-org:v3", propOrder = {
    "rest"
})
@XmlSeeAlso({
    BXITIVLPQ.class
})
public class IVLPQ
    extends SXCMPQ
{

    /** The rest. */
    @XmlElementRefs({
        @XmlElementRef(name = "center", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "high", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "low", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "width", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends PQ>> rest;

    /**
	 * Gets the rest of the content model.
	 * 
	 * <p>
	 * You are getting this "catch-all" property because of the following
	 * reason: The field name "High" is used by two different parts of a schema.
	 * See: line 179 of
	 * file:/C:/Users/HKadi/Desktop/Projekte/CDA/HL7V3/coreschemas/datatypes.xsd
	 * line 170 of
	 * file:/C:/Users/HKadi/Desktop/Projekte/CDA/HL7V3/coreschemas/datatypes.xsd
	 * <p>
	 * To get rid of this property, apply a property customization to one of
	 * both of the following declarations to change their names: Gets the value
	 * of the rest property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the rest property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getRest().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * 
	 * @return the rest {@link JAXBElement }{@code <}{@link IVXBPQ }{@code >}
	 *         {@link JAXBElement }{@code <}{@link PQ }{@code >}
	 *         {@link JAXBElement }{@code <}{@link PQ }{@code >}
	 *         {@link JAXBElement }{@code <}{@link IVXBPQ }{@code >}
	 */
    public List<JAXBElement<? extends PQ>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<? extends PQ>>();
        }
        return this.rest;
    }

}
