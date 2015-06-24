
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for AskedButUnknown.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AskedButUnknown">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ASKU"/>
 *     &lt;enumeration value="NAV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AskedButUnknown", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum AskedButUnknown {

    /** The asku. */
    ASKU,
    
    /** The nav. */
    NAV;

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
	 * @return the asked but unknown
	 */
    public static AskedButUnknown fromValue(String v) {
        return valueOf(v);
    }

}
