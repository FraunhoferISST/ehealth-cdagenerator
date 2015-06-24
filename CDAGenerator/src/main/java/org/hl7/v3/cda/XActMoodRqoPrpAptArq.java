
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for x_ActMoodRqoPrpAptArq.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ActMoodRqoPrpAptArq">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="APT"/>
 *     &lt;enumeration value="ARQ"/>
 *     &lt;enumeration value="PRP"/>
 *     &lt;enumeration value="RQO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_ActMoodRqoPrpAptArq", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum XActMoodRqoPrpAptArq {

    /** The apt. */
    APT,
    
    /** The arq. */
    ARQ,
    
    /** The prp. */
    PRP,
    
    /** The rqo. */
    RQO;

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
	 * @return the x act mood rqo prp apt arq
	 */
    public static XActMoodRqoPrpAptArq fromValue(String v) {
        return valueOf(v);
    }

}
