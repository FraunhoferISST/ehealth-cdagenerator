
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for MultipartMediaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MultipartMediaType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="multipart/x-hl7-cda-level1"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MultipartMediaType", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum MultipartMediaType {

    /** The MULTIPAR t_ x_ h l_7_ cd a_ leve l_1. */
    @XmlEnumValue("multipart/x-hl7-cda-level1")
    MULTIPART_X_HL_7_CDA_LEVEL_1("multipart/x-hl7-cda-level1");
    
    /** The value. */
    private final String value;

    /**
	 * Instantiates a new multipart media type.
	 * 
	 * @param v
	 *            the v
	 */
    MultipartMediaType(String v) {
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
	 * @return the multipart media type
	 */
    public static MultipartMediaType fromValue(String v) {
        for (MultipartMediaType c: MultipartMediaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
