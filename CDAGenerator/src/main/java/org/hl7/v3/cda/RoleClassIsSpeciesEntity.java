
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for RoleClassIsSpeciesEntity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleClassIsSpeciesEntity">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="GEN"/>
 *     &lt;enumeration value="GRIC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoleClassIsSpeciesEntity", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum RoleClassIsSpeciesEntity {

    /** The gen. */
    GEN,
    
    /** The gric. */
    GRIC;

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
	 * @return the role class is species entity
	 */
    public static RoleClassIsSpeciesEntity fromValue(String v) {
        return valueOf(v);
    }

}
