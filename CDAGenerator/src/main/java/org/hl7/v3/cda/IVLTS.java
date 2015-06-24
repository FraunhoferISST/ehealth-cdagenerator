
package org.hl7.v3.cda;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for IVL_TS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="IVL_TS">
 *   <complexContent>
 *     <extension base="{urn:hl7-org:v3}SXCM_TS">
 *       <choice minOccurs="0">
 *         <sequence>
 *           <element name="low" type="{urn:hl7-org:v3}IVXB_TS"/>
 *           <choice minOccurs="0">
 *             <element name="width" type="{urn:hl7-org:v3}PQ" minOccurs="0"/>
 *             <element name="high" type="{urn:hl7-org:v3}IVXB_TS" minOccurs="0"/>
 *           </choice>
 *         </sequence>
 *         <element name="high" type="{urn:hl7-org:v3}IVXB_TS"/>
 *         <sequence>
 *           <element name="width" type="{urn:hl7-org:v3}PQ"/>
 *           <element name="high" type="{urn:hl7-org:v3}IVXB_TS" minOccurs="0"/>
 *         </sequence>
 *         <sequence>
 *           <element name="center" type="{urn:hl7-org:v3}TS"/>
 *           <element name="width" type="{urn:hl7-org:v3}PQ" minOccurs="0"/>
 *         </sequence>
 *       </choice>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IVL_TS", namespace = "urn:hl7-org:v3", propOrder = {
    "rest"
})
public class IVLTS
    extends SXCMTS
{

    /** The rest. */
    @XmlElementRefs({
        @XmlElementRef(name = "low", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "width", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "center", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "high", namespace = "urn:hl7-org:v3", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends QTY>> rest;

    /**
	 * Gets the rest of the content model.
	 * 
	 * <p>
	 * You are getting this "catch-all" property because of the following
	 * reason: The field name "High" is used by two different parts of a schema.
	 * See: line 1758 of
	 * file:/C:/Users/HKadi/Desktop/Projekte/CDA/HL7V3/coreschemas
	 * /datatypes-base.xsd line 1749 of
	 * file:/C:/Users/HKadi/Desktop/Projekte/CDA
	 * /HL7V3/coreschemas/datatypes-base.xsd
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
	 * @return the rest {@link JAXBElement }{@code <}{@link IVXBTS }{@code >}
	 *         {@link JAXBElement }{@code <}{@link TS }{@code >}
	 *         {@link JAXBElement }{@code <}{@link PQ }{@code >}
	 *         {@link JAXBElement }{@code <}{@link IVXBTS }{@code >}
	 */
    public List<JAXBElement<? extends QTY>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<? extends QTY>>();
        }
        return this.rest;
    }

}
