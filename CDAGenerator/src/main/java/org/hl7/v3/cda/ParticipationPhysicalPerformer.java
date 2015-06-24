
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for ParticipationPhysicalPerformer.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipationPhysicalPerformer">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="PRF"/>
 *     &lt;enumeration value="DIST"/>
 *     &lt;enumeration value="PPRF"/>
 *     &lt;enumeration value="SPRF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParticipationPhysicalPerformer", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum ParticipationPhysicalPerformer {

    /** The prf. */
    PRF,
    
    /** The dist. */
    DIST,
    
    /** The pprf. */
    PPRF,
    
    /** The sprf. */
    SPRF;

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
	 * @return the participation physical performer
	 */
    public static ParticipationPhysicalPerformer fromValue(String v) {
        return valueOf(v);
    }

}
