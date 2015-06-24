
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for IntegrityCheckAlgorithm.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IntegrityCheckAlgorithm">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="SHA-1"/>
 *     &lt;enumeration value="SHA-256"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntegrityCheckAlgorithm", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum IntegrityCheckAlgorithm {

    /** The SH a_1. */
    @XmlEnumValue("SHA-1")
    SHA_1("SHA-1"),
    
    /** The SH a_256. */
    @XmlEnumValue("SHA-256")
    SHA_256("SHA-256");
    
    /** The value. */
    private final String value;

    /**
	 * Instantiates a new integrity check algorithm.
	 * 
	 * @param v
	 *            the v
	 */
    IntegrityCheckAlgorithm(String v) {
        value = v;
    }

    /**
	 * Value.
	 * 
	 * @return the string
	 */
    public String value() {
        return value;
    }

    /**
	 * From value.
	 * 
	 * @param v
	 *            the v
	 * @return the integrity check algorithm
	 */
    public static IntegrityCheckAlgorithm fromValue(String v) {
        for (IntegrityCheckAlgorithm c: IntegrityCheckAlgorithm.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
