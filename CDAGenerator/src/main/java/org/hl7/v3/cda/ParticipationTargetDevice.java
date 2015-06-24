
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for ParticipationTargetDevice.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipationTargetDevice">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="DEV"/>
 *     &lt;enumeration value="NRD"/>
 *     &lt;enumeration value="RDV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParticipationTargetDevice", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum ParticipationTargetDevice {

    /** The dev. */
    DEV,
    
    /** The nrd. */
    NRD,
    
    /** The rdv. */
    RDV;

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
	 * @return the participation target device
	 */
    public static ParticipationTargetDevice fromValue(String v) {
        return valueOf(v);
    }

}
