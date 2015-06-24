
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for CalendarCycleOneLetter.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CalendarCycleOneLetter">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="H"/>
 *     &lt;enumeration value="J"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="W"/>
 *     &lt;enumeration value="Y"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CalendarCycleOneLetter", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum CalendarCycleOneLetter {

    /** The d. */
    D,
    
    /** The h. */
    H,
    
    /** The j. */
    J,
    
    /** The m. */
    M,
    
    /** The n. */
    N,
    
    /** The s. */
    S,
    
    /** The w. */
    W,
    
    /** The y. */
    Y;

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
	 * @return the calendar cycle one letter
	 */
    public static CalendarCycleOneLetter fromValue(String v) {
        return valueOf(v);
    }

}
