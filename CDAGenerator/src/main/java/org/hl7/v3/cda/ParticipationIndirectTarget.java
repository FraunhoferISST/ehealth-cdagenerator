
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for ParticipationIndirectTarget.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipationIndirectTarget">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="IND"/>
 *     &lt;enumeration value="BEN"/>
 *     &lt;enumeration value="COV"/>
 *     &lt;enumeration value="HLD"/>
 *     &lt;enumeration value="RCT"/>
 *     &lt;enumeration value="RCV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParticipationIndirectTarget", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum ParticipationIndirectTarget {

    /** The ind. */
    IND,
    
    /** The ben. */
    BEN,
    
    /** The cov. */
    COV,
    
    /** The hld. */
    HLD,
    
    /** The rct. */
    RCT,
    
    /** The rcv. */
    RCV;

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
	 * @return the participation indirect target
	 */
    public static ParticipationIndirectTarget fromValue(String v) {
        return valueOf(v);
    }

}
