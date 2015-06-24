
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for x_RoleClassPayeePolicyRelationship.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="x_RoleClassPayeePolicyRelationship">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="COVPTY"/>
 *     &lt;enumeration value="GUAR"/>
 *     &lt;enumeration value="POLHOLD"/>
 *     &lt;enumeration value="PROV"/>
 *     &lt;enumeration value="PRS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_RoleClassPayeePolicyRelationship", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum XRoleClassPayeePolicyRelationship {

    /** The covpty. */
    COVPTY,
    
    /** The guar. */
    GUAR,
    
    /** The polhold. */
    POLHOLD,
    
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
	 * @return the x role class payee policy relationship
	 */
    public static XRoleClassPayeePolicyRelationship fromValue(String v) {
        return valueOf(v);
    }

}
