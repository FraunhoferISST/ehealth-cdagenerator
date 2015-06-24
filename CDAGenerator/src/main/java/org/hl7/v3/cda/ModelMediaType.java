
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for ModelMediaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ModelMediaType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="model/vrml"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ModelMediaType", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum ModelMediaType {

    /** The model vrml. */
    @XmlEnumValue("model/vrml")
    MODEL_VRML("model/vrml");
    
    /** The value. */
    private final String value;

    /**
	 * Instantiates a new model media type.
	 * 
	 * @param v
	 *            the v
	 */
    ModelMediaType(String v) {
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
	 * @return the model media type
	 */
    public static ModelMediaType fromValue(String v) {
        for (ModelMediaType c: ModelMediaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
