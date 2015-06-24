
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for RoleClassServiceDeliveryLocation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleClassServiceDeliveryLocation">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="SDLOC"/>
 *     &lt;enumeration value="DSDLOC"/>
 *     &lt;enumeration value="ISDLOC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoleClassServiceDeliveryLocation", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum RoleClassServiceDeliveryLocation {

    /** The sdloc. */
    SDLOC,
    
    /** The dsdloc. */
    DSDLOC,
    
    /** The isdloc. */
    ISDLOC;

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
	 * @return the role class service delivery location
	 */
    public static RoleClassServiceDeliveryLocation fromValue(String v) {
        return valueOf(v);
    }

}
