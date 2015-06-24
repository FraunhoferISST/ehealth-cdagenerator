
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for ActMoodPredicate.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActMoodPredicate">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="EVN.CRT"/>
 *     &lt;enumeration value="GOL"/>
 *     &lt;enumeration value="OPT"/>
 *     &lt;enumeration value="PERM"/>
 *     &lt;enumeration value="PERMRQ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActMoodPredicate", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum ActMoodPredicate {

    /** The evn crt. */
    @XmlEnumValue("EVN.CRT")
    EVN_CRT("EVN.CRT"),
    
    /** The gol. */
    GOL("GOL"),
    
    /** The opt. */
    OPT("OPT"),
    
    /** The perm. */
    PERM("PERM"),
    
    /** The permrq. */
    PERMRQ("PERMRQ");
    
    /** The value. */
    private final String value;

    /**
	 * Instantiates a new act mood predicate.
	 * 
	 * @param v
	 *            the v
	 */
    ActMoodPredicate(String v) {
        value = v;
    }

    /**
	 * Value.
	 * 
	 * @return the string
	 */
    public String value() {
        return value;
    }

    /**
	 * From value.
	 * 
	 * @param v
	 *            the v
	 * @return the act mood predicate
	 */
    public static ActMoodPredicate fromValue(String v) {
        for (ActMoodPredicate c: ActMoodPredicate.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
