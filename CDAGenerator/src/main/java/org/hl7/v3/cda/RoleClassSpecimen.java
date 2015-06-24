
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for RoleClassSpecimen.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleClassSpecimen">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="SPEC"/>
 *     &lt;enumeration value="ALQT"/>
 *     &lt;enumeration value="ISLT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoleClassSpecimen", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum RoleClassSpecimen {

    /** The spec. */
    SPEC,
    
    /** The alqt. */
    ALQT,
    
    /** The islt. */
    ISLT;

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
	 * @return the role class specimen
	 */
    public static RoleClassSpecimen fromValue(String v) {
        return valueOf(v);
    }

}
