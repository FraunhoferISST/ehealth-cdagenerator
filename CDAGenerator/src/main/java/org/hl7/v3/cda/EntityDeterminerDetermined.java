
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for EntityDeterminerDetermined.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityDeterminerDetermined">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="KIND"/>
 *     &lt;enumeration value="QUANTIFIED_KIND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntityDeterminerDetermined", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum EntityDeterminerDetermined {

    /** The kind. */
    KIND,
    
    /** The quantified kind. */
    QUANTIFIED_KIND;

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
	 * @return the entity determiner determined
	 */
    public static EntityDeterminerDetermined fromValue(String v) {
        return valueOf(v);
    }

}
