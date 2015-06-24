
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for x_ActRelationshipExternalReference.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ActRelationshipExternalReference">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="XCRPT"/>
 *     &lt;enumeration value="RPLC"/>
 *     &lt;enumeration value="SPRT"/>
 *     &lt;enumeration value="ELNK"/>
 *     &lt;enumeration value="REFR"/>
 *     &lt;enumeration value="SUBJ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_ActRelationshipExternalReference", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum XActRelationshipExternalReference {

    /** The xcrpt. */
    XCRPT,
    
    /** The rplc. */
    RPLC,
    
    /** The sprt. */
    SPRT,
    
    /** The elnk. */
    ELNK,
    
    /** The refr. */
    REFR,
    
    /** The subj. */
    SUBJ;

    /**
	 * Gets the value.
	 * 
	 * @return the value
	 */
    public String getValue() {
        return name();
    }

    /**
	 * From value.
	 * 
	 * @param v
	 *            the v
	 * @return the x act relationship external reference
	 */
    public static XActRelationshipExternalReference fromValue(String v) {
        return valueOf(v);
    }

}
