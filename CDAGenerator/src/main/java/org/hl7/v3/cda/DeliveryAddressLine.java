
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for DeliveryAddressLine.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryAddressLine">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="DAL"/>
 *     &lt;enumeration value="DINST"/>
 *     &lt;enumeration value="DINSTA"/>
 *     &lt;enumeration value="DINSTQ"/>
 *     &lt;enumeration value="DMOD"/>
 *     &lt;enumeration value="DMODID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeliveryAddressLine", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum DeliveryAddressLine {

    /** The dal. */
    DAL,
    
    /** The dinst. */
    DINST,
    
    /** The dinsta. */
    DINSTA,
    
    /** The dinstq. */
    DINSTQ,
    
    /** The dmod. */
    DMOD,
    
    /** The dmodid. */
    DMODID;

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
	 * @return the delivery address line
	 */
    public static DeliveryAddressLine fromValue(String v) {
        return valueOf(v);
    }

}
