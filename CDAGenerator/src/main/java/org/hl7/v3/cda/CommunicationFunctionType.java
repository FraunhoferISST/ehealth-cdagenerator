
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for CommunicationFunctionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommunicationFunctionType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="RCV"/>
 *     &lt;enumeration value="RSP"/>
 *     &lt;enumeration value="SND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommunicationFunctionType", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum CommunicationFunctionType {

    /** The rcv. */
    RCV,
    
    /** The rsp. */
    RSP,
    
    /** The snd. */
    SND;

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
	 * @return the communication function type
	 */
    public static CommunicationFunctionType fromValue(String v) {
        return valueOf(v);
    }

}
