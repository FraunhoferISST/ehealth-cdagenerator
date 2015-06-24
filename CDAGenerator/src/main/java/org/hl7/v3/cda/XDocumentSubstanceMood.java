
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for x_DocumentSubstanceMood.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="x_DocumentSubstanceMood">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="INT"/>
 *     &lt;enumeration value="EVN"/>
 *     &lt;enumeration value="PRMS"/>
 *     &lt;enumeration value="PRP"/>
 *     &lt;enumeration value="RQO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_DocumentSubstanceMood", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum XDocumentSubstanceMood {

    /** The int. */
    INT,
    
    /** The evn. */
    EVN,
    
    /** The prms. */
    PRMS,
    
    /** The prp. */
    PRP,
    
    /** The rqo. */
    RQO;

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
	 * @return the x document substance mood
	 */
    public static XDocumentSubstanceMood fromValue(String v) {
        return valueOf(v);
    }

}
