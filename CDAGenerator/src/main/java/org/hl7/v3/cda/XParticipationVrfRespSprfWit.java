
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for x_ParticipationVrfRespSprfWit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ParticipationVrfRespSprfWit">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="VRF"/>
 *     &lt;enumeration value="RESP"/>
 *     &lt;enumeration value="SPRF"/>
 *     &lt;enumeration value="WIT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_ParticipationVrfRespSprfWit", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum XParticipationVrfRespSprfWit {

    /** The vrf. */
    VRF,
    
    /** The resp. */
    RESP,
    
    /** The sprf. */
    SPRF,
    
    /** The wit. */
    WIT;

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
	 * @return the x participation vrf resp sprf wit
	 */
    public static XParticipationVrfRespSprfWit fromValue(String v) {
        return valueOf(v);
    }

}
