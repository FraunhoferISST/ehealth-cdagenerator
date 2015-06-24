
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for x_ActMoodDocumentObservation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ActMoodDocumentObservation">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="INT"/>
 *     &lt;enumeration value="DEF"/>
 *     &lt;enumeration value="EVN"/>
 *     &lt;enumeration value="GOL"/>
 *     &lt;enumeration value="PRMS"/>
 *     &lt;enumeration value="PRP"/>
 *     &lt;enumeration value="RQO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_ActMoodDocumentObservation", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum XActMoodDocumentObservation {

    /** The int. */
    INT,
    
    /** The def. */
    DEF,
    
    /** The evn. */
    EVN,
    
    /** The gol. */
    GOL,
    
    /** The prms. */
    PRMS,
    
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
	 * @return the x act mood document observation
	 */
    public static XActMoodDocumentObservation fromValue(String v) {
        return valueOf(v);
    }

}
