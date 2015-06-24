
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for ActRelationshipReason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActRelationshipReason">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="RSON"/>
 *     &lt;enumeration value="MITGT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActRelationshipReason", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum ActRelationshipReason {

    /** The rson. */
    RSON,
    
    /** The mitgt. */
    MITGT;

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
	 * @return the act relationship reason
	 */
    public static ActRelationshipReason fromValue(String v) {
        return valueOf(v);
    }

}
