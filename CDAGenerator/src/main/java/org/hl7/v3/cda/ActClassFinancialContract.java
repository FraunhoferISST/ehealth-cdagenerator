
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for ActClassFinancialContract.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActClassFinancialContract">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="FCNTRCT"/>
 *     &lt;enumeration value="COV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActClassFinancialContract", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum ActClassFinancialContract {

    /** The fcntrct. */
    FCNTRCT,
    
    /** The cov. */
    COV;

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
	 * @return the act class financial contract
	 */
    public static ActClassFinancialContract fromValue(String v) {
        return valueOf(v);
    }

}
