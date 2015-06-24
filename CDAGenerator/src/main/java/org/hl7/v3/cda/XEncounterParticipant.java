
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for x_EncounterParticipant.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="x_EncounterParticipant">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ADM"/>
 *     &lt;enumeration value="ATND"/>
 *     &lt;enumeration value="CON"/>
 *     &lt;enumeration value="DIS"/>
 *     &lt;enumeration value="REF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_EncounterParticipant", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum XEncounterParticipant {

    /** The adm. */
    ADM,
    
    /** The atnd. */
    ATND,
    
    /** The con. */
    CON,
    
    /** The dis. */
    DIS,
    
    /** The ref. */
    REF;

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
	 * @return the x encounter participant
	 */
    public static XEncounterParticipant fromValue(String v) {
        return valueOf(v);
    }

}
