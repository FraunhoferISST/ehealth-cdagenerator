
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for PersonNamePartChangeQualifier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PersonNamePartChangeQualifier">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="AD"/>
 *     &lt;enumeration value="BR"/>
 *     &lt;enumeration value="SP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PersonNamePartChangeQualifier", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum PersonNamePartChangeQualifier {

    /** The ad. */
    AD,
    
    /** The br. */
    BR,
    
    /** The sp. */
    SP;

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
	 * @return the person name part change qualifier
	 */
    public static PersonNamePartChangeQualifier fromValue(String v) {
        return valueOf(v);
    }

}
