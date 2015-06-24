
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for x_ActClassDocumentEntryAct.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="x_ActClassDocumentEntryAct">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ACT"/>
 *     &lt;enumeration value="ACCM"/>
 *     &lt;enumeration value="CONS"/>
 *     &lt;enumeration value="CTTEVENT"/>
 *     &lt;enumeration value="INC"/>
 *     &lt;enumeration value="INFRM"/>
 *     &lt;enumeration value="PCPR"/>
 *     &lt;enumeration value="REG"/>
 *     &lt;enumeration value="SPCTRT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "x_ActClassDocumentEntryAct", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum XActClassDocumentEntryAct {

    /** The act. */
    ACT,
    
    /** The accm. */
    ACCM,
    
    /** The cons. */
    CONS,
    
    /** The cttevent. */
    CTTEVENT,
    
    /** The inc. */
    INC,
    
    /** The infrm. */
    INFRM,
    
    /** The pcpr. */
    PCPR,
    
    /** The reg. */
    REG,
    
    /** The spctrt. */
    SPCTRT;

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
	 * @return the x act class document entry act
	 */
    public static XActClassDocumentEntryAct fromValue(String v) {
        return valueOf(v);
    }

}
