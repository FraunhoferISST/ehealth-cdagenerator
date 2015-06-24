
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for TextMediaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TextMediaType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="text/html"/>
 *     &lt;enumeration value="text/plain"/>
 *     &lt;enumeration value="text/rtf"/>
 *     &lt;enumeration value="text/sgml"/>
 *     &lt;enumeration value="text/x-hl7-ft"/>
 *     &lt;enumeration value="text/xml"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TextMediaType", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum TextMediaType {

    /** The text html. */
    @XmlEnumValue("text/html")
    TEXT_HTML("text/html"),
    
    /** The text plain. */
    @XmlEnumValue("text/plain")
    TEXT_PLAIN("text/plain"),
    
    /** The text rtf. */
    @XmlEnumValue("text/rtf")
    TEXT_RTF("text/rtf"),
    
    /** The text sgml. */
    @XmlEnumValue("text/sgml")
    TEXT_SGML("text/sgml"),
    
    /** The TEX t_ x_ h l_7_ ft. */
    @XmlEnumValue("text/x-hl7-ft")
    TEXT_X_HL_7_FT("text/x-hl7-ft"),
    
    /** The text xml. */
    @XmlEnumValue("text/xml")
    TEXT_XML("text/xml");
    
    /** The value. */
    private final String value;

    /**
	 * Instantiates a new text media type.
	 * 
	 * @param v
	 *            the v
	 */
    TextMediaType(String v) {
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
	 * @return the text media type
	 */
    public static TextMediaType fromValue(String v) {
        for (TextMediaType c: TextMediaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
