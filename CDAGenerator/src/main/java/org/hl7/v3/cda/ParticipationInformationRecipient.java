
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for ParticipationInformationRecipient.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipationInformationRecipient">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="IRCP"/>
 *     &lt;enumeration value="NOT"/>
 *     &lt;enumeration value="PRCP"/>
 *     &lt;enumeration value="REFB"/>
 *     &lt;enumeration value="REFT"/>
 *     &lt;enumeration value="TRC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParticipationInformationRecipient", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum ParticipationInformationRecipient {

    /** The ircp. */
    IRCP,
    
    /** The not. */
    NOT,
    
    /** The prcp. */
    PRCP,
    
    /** The refb. */
    REFB,
    
    /** The reft. */
    REFT,
    
    /** The trc. */
    TRC;

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
	 * @return the participation information recipient
	 */
    public static ParticipationInformationRecipient fromValue(String v) {
        return valueOf(v);
    }

}
