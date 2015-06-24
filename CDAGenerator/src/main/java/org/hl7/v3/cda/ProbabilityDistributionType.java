
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for ProbabilityDistributionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProbabilityDistributionType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="G"/>
 *     &lt;enumeration value="LN"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="T"/>
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="X2"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProbabilityDistributionType", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum ProbabilityDistributionType {

    /** The b. */
    B("B"),
    
    /** The e. */
    E("E"),
    
    /** The f. */
    F("F"),
    
    /** The g. */
    G("G"),
    
    /** The ln. */
    LN("LN"),
    
    /** The n. */
    N("N"),
    
    /** The t. */
    T("T"),
    
    /** The u. */
    U("U"),
    
    /** The X_2. */
    @XmlEnumValue("X2")
    X_2("X2");
    
    /** The value. */
    private final String value;

    /**
	 * Instantiates a new probability distribution type.
	 * 
	 * @param v
	 *            the v
	 */
    ProbabilityDistributionType(String v) {
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
	 * @return the probability distribution type
	 */
    public static ProbabilityDistributionType fromValue(String v) {
        for (ProbabilityDistributionType c: ProbabilityDistributionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
