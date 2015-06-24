
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for ParticipationTargetSubject.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipationTargetSubject">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="SBJ"/>
 *     &lt;enumeration value="SPC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParticipationTargetSubject", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum ParticipationTargetSubject {

    /** The sbj. */
    SBJ,
    
    /** The spc. */
    SPC;

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
	 * @return the participation target subject
	 */
    public static ParticipationTargetSubject fromValue(String v) {
        return valueOf(v);
    }

}
