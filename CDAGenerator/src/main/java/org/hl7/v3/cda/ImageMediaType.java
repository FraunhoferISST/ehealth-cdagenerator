
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for ImageMediaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ImageMediaType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="image/g3fax"/>
 *     &lt;enumeration value="image/gif"/>
 *     &lt;enumeration value="image/jpeg"/>
 *     &lt;enumeration value="image/png"/>
 *     &lt;enumeration value="image/tiff"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ImageMediaType", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum ImageMediaType {

    /** The IMAG e_ g_3_ fax. */
    @XmlEnumValue("image/g3fax")
    IMAGE_G_3_FAX("image/g3fax"),
    
    /** The image gif. */
    @XmlEnumValue("image/gif")
    IMAGE_GIF("image/gif"),
    
    /** The image jpeg. */
    @XmlEnumValue("image/jpeg")
    IMAGE_JPEG("image/jpeg"),
    
    /** The image png. */
    @XmlEnumValue("image/png")
    IMAGE_PNG("image/png"),
    
    /** The image tiff. */
    @XmlEnumValue("image/tiff")
    IMAGE_TIFF("image/tiff");
    
    /** The value. */
    private final String value;

    /**
	 * Instantiates a new image media type.
	 * 
	 * @param v
	 *            the v
	 */
    ImageMediaType(String v) {
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
	 * @return the image media type
	 */
    public static ImageMediaType fromValue(String v) {
        for (ImageMediaType c: ImageMediaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
