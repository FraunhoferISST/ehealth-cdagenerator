
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for TimingEvent.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TimingEvent">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="AC"/>
 *     &lt;enumeration value="ACD"/>
 *     &lt;enumeration value="ACM"/>
 *     &lt;enumeration value="ACV"/>
 *     &lt;enumeration value="HS"/>
 *     &lt;enumeration value="IC"/>
 *     &lt;enumeration value="ICD"/>
 *     &lt;enumeration value="ICM"/>
 *     &lt;enumeration value="ICV"/>
 *     &lt;enumeration value="PC"/>
 *     &lt;enumeration value="PCD"/>
 *     &lt;enumeration value="PCM"/>
 *     &lt;enumeration value="PCV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TimingEvent", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum TimingEvent {

    /** The ac. */
    AC,
    
    /** The acd. */
    ACD,
    
    /** The acm. */
    ACM,
    
    /** The acv. */
    ACV,
    
    /** The hs. */
    HS,
    
    /** The ic. */
    IC,
    
    /** The icd. */
    ICD,
    
    /** The icm. */
    ICM,
    
    /** The icv. */
    ICV,
    
    /** The pc. */
    PC,
    
    /** The pcd. */
    PCD,
    
    /** The pcm. */
    PCM,
    
    /** The pcv. */
    PCV;

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
	 * @return the timing event
	 */
    public static TimingEvent fromValue(String v) {
        return valueOf(v);
    }

}
