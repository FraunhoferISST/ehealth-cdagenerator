
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for x_ParticipationPrfEntVrf.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ParticipationPrfEntVrf">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="PRF"/>
 *     &lt;enumeration value="VRF"/>
 *     &lt;enumeration value="ENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_ParticipationPrfEntVrf", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum XParticipationPrfEntVrf {

    /** The prf. */
    PRF,
    
    /** The vrf. */
    VRF,
    
    /** The ent. */
    ENT;

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
	 * @return the x participation prf ent vrf
	 */
    public static XParticipationPrfEntVrf fromValue(String v) {
        return valueOf(v);
    }

}
