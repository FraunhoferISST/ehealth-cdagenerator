
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for RelatedLinkType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RelatedLinkType">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="REL"/>
 *     &lt;enumeration value="BACKUP"/>
 *     &lt;enumeration value="DIRAUTH"/>
 *     &lt;enumeration value="INDAUTH"/>
 *     &lt;enumeration value="PART"/>
 *     &lt;enumeration value="REPL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RelatedLinkType", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum RelatedLinkType {

    /** The rel. */
    REL,
    
    /** The backup. */
    BACKUP,
    
    /** The dirauth. */
    DIRAUTH,
    
    /** The indauth. */
    INDAUTH,
    
    /** The part. */
    PART,
    
    /** The repl. */
    REPL;

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
	 * @return the related link type
	 */
    public static RelatedLinkType fromValue(String v) {
        return valueOf(v);
    }

}
