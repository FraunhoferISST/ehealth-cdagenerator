
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for ActClassOrganizer.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActClassOrganizer">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ORGANIZER"/>
 *     &lt;enumeration value="CATEGORY"/>
 *     &lt;enumeration value="DOCBODY"/>
 *     &lt;enumeration value="DOCSECT"/>
 *     &lt;enumeration value="TOPIC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActClassOrganizer", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum ActClassOrganizer {

    /** The organizer. */
    ORGANIZER,
    
    /** The category. */
    CATEGORY,
    
    /** The docbody. */
    DOCBODY,
    
    /** The docsect. */
    DOCSECT,
    
    /** The topic. */
    TOPIC;

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
	 * @return the act class organizer
	 */
    public static ActClassOrganizer fromValue(String v) {
        return valueOf(v);
    }

}
