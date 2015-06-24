package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for EntityClassPlace.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityClassPlace">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="PLC"/>
 *     &lt;enumeration value="CITY"/>
 *     &lt;enumeration value="COUNTRY"/>
 *     &lt;enumeration value="COUNTY"/>
 *     &lt;enumeration value="PROVINCE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntityClassPlace", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum EntityClassPlace {

    /** The plc. */
    PLC,
    
    /** The city. */
    CITY,
    
    /** The country. */
    COUNTRY,
    
    /** The county. */
    COUNTY,
    
    /** The province. */
    PROVINCE;

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
	 * @return the entity class place
	 */
    public static EntityClassPlace fromValue(String v) {
        return valueOf(v);
    }

}
