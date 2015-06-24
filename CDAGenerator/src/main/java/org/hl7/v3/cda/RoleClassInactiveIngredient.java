
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for RoleClassInactiveIngredient.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleClassInactiveIngredient">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="IACT"/>
 *     &lt;enumeration value="COLR"/>
 *     &lt;enumeration value="FLVR"/>
 *     &lt;enumeration value="PRSV"/>
 *     &lt;enumeration value="STBL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoleClassInactiveIngredient", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum RoleClassInactiveIngredient {

    /** The iact. */
    IACT,
    
    /** The colr. */
    COLR,
    
    /** The flvr. */
    FLVR,
    
    /** The prsv. */
    PRSV,
    
    /** The stbl. */
    STBL;

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
	 * @return the role class inactive ingredient
	 */
    public static RoleClassInactiveIngredient fromValue(String v) {
        return valueOf(v);
    }

}
