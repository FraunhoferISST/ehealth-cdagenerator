
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for x_ActRelationshipPertinentInfo.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ActRelationshipPertinentInfo">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="SPRT"/>
 *     &lt;enumeration value="CAUS"/>
 *     &lt;enumeration value="MFST"/>
 *     &lt;enumeration value="REFR"/>
 *     &lt;enumeration value="SUBJ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_ActRelationshipPertinentInfo", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum XActRelationshipPertinentInfo {

    /** The sprt. */
    SPRT,
    
    /** The caus. */
    CAUS,
    
    /** The mfst. */
    MFST,
    
    /** The refr. */
    REFR,
    
    /** The subj. */
    SUBJ;

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
	 * @return the x act relationship pertinent info
	 */
    public static XActRelationshipPertinentInfo fromValue(String v) {
        return valueOf(v);
    }

}
