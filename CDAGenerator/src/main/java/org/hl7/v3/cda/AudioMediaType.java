
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for AudioMediaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AudioMediaType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="audio/basic"/>
 *     &lt;enumeration value="audio/k32adpcm"/>
 *     &lt;enumeration value="audio/mpeg"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AudioMediaType", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum AudioMediaType {

    /** The audio basic. */
    @XmlEnumValue("audio/basic")
    AUDIO_BASIC("audio/basic"),
    
    /** The AUDI o_ k_32_ adpcm. */
    @XmlEnumValue("audio/k32adpcm")
    AUDIO_K_32_ADPCM("audio/k32adpcm"),
    
    /** The audio mpeg. */
    @XmlEnumValue("audio/mpeg")
    AUDIO_MPEG("audio/mpeg");
    
    /** The value. */
    private final String value;

    /**
	 * Instantiates a new audio media type.
	 * 
	 * @param v
	 *            the v
	 */
    AudioMediaType(String v) {
        value = v;
    }

    /**
	 * Value.
	 * 
	 * @return the string
	 */
    public String value() {
        return value;
    }

    /**
	 * From value.
	 * 
	 * @param v
	 *            the v
	 * @return the audio media type
	 */
    public static AudioMediaType fromValue(String v) {
        for (AudioMediaType c: AudioMediaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
