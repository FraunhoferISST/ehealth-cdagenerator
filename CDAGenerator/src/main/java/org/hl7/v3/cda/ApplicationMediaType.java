
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for ApplicationMediaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ApplicationMediaType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="application/dicom"/>
 *     &lt;enumeration value="application/msword"/>
 *     &lt;enumeration value="application/pdf"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ApplicationMediaType", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum ApplicationMediaType {

    /** The application dicom. */
    @XmlEnumValue("application/dicom")
    APPLICATION_DICOM("application/dicom"),
    
    /** The application msword. */
    @XmlEnumValue("application/msword")
    APPLICATION_MSWORD("application/msword"),
    
    /** The application pdf. */
    @XmlEnumValue("application/pdf")
    APPLICATION_PDF("application/pdf");
    
    /** The value. */
    private final String value;

    /**
	 * Instantiates a new application media type.
	 * 
	 * @param v
	 *            the v
	 */
    ApplicationMediaType(String v) {
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
	 * @return the application media type
	 */
    public static ApplicationMediaType fromValue(String v) {
        for (ApplicationMediaType c: ApplicationMediaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
