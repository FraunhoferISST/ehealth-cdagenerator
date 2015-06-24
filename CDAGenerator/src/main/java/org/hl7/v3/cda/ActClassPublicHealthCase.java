
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for ActClassPublicHealthCase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActClassPublicHealthCase">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="CASE"/>
 *     &lt;enumeration value="OUTB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActClassPublicHealthCase", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum ActClassPublicHealthCase {

    /** The case. */
    CASE,
    
    /** The outb. */
    OUTB;

    /**
	 * Value.
	 * 
	 * @return the string
	 */
    public String value() {
        return name();
    }

    /**
	 * From value.
	 * 
	 * @param v
	 *            the v
	 * @return the act class public health case
	 */
    public static ActClassPublicHealthCase fromValue(String v) {
        return valueOf(v);
    }

}
