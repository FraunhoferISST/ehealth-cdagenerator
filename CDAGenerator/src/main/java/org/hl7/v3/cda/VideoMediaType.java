
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for VideoMediaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoMediaType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="video/mpeg"/>
 *     &lt;enumeration value="video/x-avi"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoMediaType", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum VideoMediaType {

    /** The video mpeg. */
    @XmlEnumValue("video/mpeg")
    VIDEO_MPEG("video/mpeg"),
    
    /** The video x avi. */
    @XmlEnumValue("video/x-avi")
    VIDEO_X_AVI("video/x-avi");
    
    /** The value. */
    private final String value;

    /**
	 * Instantiates a new video media type.
	 * 
	 * @param v
	 *            the v
	 */
    VideoMediaType(String v) {
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
	 * @return the video media type
	 */
    public static VideoMediaType fromValue(String v) {
        for (VideoMediaType c: VideoMediaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
