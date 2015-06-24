
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for ActClassSupply.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActClassSupply">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="SPLY"/>
 *     &lt;enumeration value="DIET"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActClassSupply", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum ActClassSupply {

    /** The sply. */
    SPLY,
    
    /** The diet. */
    DIET;

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
	 * @return the act class supply
	 */
    public static ActClassSupply fromValue(String v) {
        return valueOf(v);
    }

}
