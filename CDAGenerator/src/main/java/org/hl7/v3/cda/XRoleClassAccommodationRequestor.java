
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for x_RoleClassAccommodationRequestor.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="x_RoleClassAccommodationRequestor">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="AGNT"/>
 *     &lt;enumeration value="PAT"/>
 *     &lt;enumeration value="PROV"/>
 *     &lt;enumeration value="PRS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_RoleClassAccommodationRequestor", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum XRoleClassAccommodationRequestor {

    /** The agnt. */
    AGNT,
    
    /** The pat. */
    PAT,
    
    /** The prov. */
    PROV,
    
    /** The prs. */
    PRS;

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
	 * @return the x role class accommodation requestor
	 */
    public static XRoleClassAccommodationRequestor fromValue(String v) {
        return valueOf(v);
    }

}
