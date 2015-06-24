
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for RoleClassManufacturedProduct.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleClassManufacturedProduct">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="MANU"/>
 *     &lt;enumeration value="THER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoleClassManufacturedProduct", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum RoleClassManufacturedProduct {

    /** The manu. */
    MANU,
    
    /** The ther. */
    THER;

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
	 * @return the role class manufactured product
	 */
    public static RoleClassManufacturedProduct fromValue(String v) {
        return valueOf(v);
    }

}
