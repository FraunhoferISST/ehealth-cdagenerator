
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for RTO_MO_PQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RTO_MO_PQ">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}QTY">
 *       &lt;sequence>
 *         &lt;element name="numerator" type="{urn:hl7-org:v3}MO"/>
 *         &lt;element name="denominator" type="{urn:hl7-org:v3}PQ"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RTO_MO_PQ", namespace = "urn:hl7-org:v3", propOrder = {
    "numerator",
    "denominator"
})
public class RTOMOPQ
    extends QTY
{

    /** The numerator. */
    @XmlElement(namespace = "urn:hl7-org:v3", required = true)
    protected MO numerator;
    
    /** The denominator. */
    @XmlElement(namespace = "urn:hl7-org:v3", required = true)
    protected PQ denominator;

    /**
	 * Gets the value of the numerator property.
	 * 
	 * @return the numerator possible object is {@link MO }
	 */
    public MO getNumerator() {
        return numerator;
    }

    /**
     * Sets the value of the numerator property.
     * 
     * @param value
     *     allowed object is
     *     {@link MO }
     *     
     */
    public void setNumerator(MO value) {
        this.numerator = value;
    }

    /**
	 * Gets the value of the denominator property.
	 * 
	 * @return the denominator possible object is {@link PQ }
	 */
    public PQ getDenominator() {
        return denominator;
    }

    /**
     * Sets the value of the denominator property.
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setDenominator(PQ value) {
        this.denominator = value;
    }

}
