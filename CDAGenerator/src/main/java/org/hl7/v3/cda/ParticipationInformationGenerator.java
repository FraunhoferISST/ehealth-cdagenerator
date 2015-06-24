
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for ParticipationInformationGenerator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipationInformationGenerator">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="AUT"/>
 *     &lt;enumeration value="ENT"/>
 *     &lt;enumeration value="INF"/>
 *     &lt;enumeration value="WIT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParticipationInformationGenerator", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum ParticipationInformationGenerator {

    /** The aut. */
    AUT,
    
    /** The ent. */
    ENT,
    
    /** The inf. */
    INF,
    
    /** The wit. */
    WIT;

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
	 * @return the participation information generator
	 */
    public static ParticipationInformationGenerator fromValue(String v) {
        return valueOf(v);
    }

}
