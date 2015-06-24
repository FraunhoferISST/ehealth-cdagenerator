
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for x_RoleClassCoverage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="x_RoleClassCoverage">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="COVPTY"/>
 *     &lt;enumeration value="POLHOLD"/>
 *     &lt;enumeration value="SPNSR"/>
 *     &lt;enumeration value="UNDWRT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_RoleClassCoverage", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum XRoleClassCoverage {

    /** The covpty. */
    COVPTY,
    
    /** The polhold. */
    POLHOLD,
    
    /** The spnsr. */
    SPNSR,
    
    /** The undwrt. */
    UNDWRT;

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
	 * @return the x role class coverage
	 */
    public static XRoleClassCoverage fromValue(String v) {
        return valueOf(v);
    }

}
