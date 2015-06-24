
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for Currency.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Currency">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="ARS"/>
 *     &lt;enumeration value="AUD"/>
 *     &lt;enumeration value="BRL"/>
 *     &lt;enumeration value="CAD"/>
 *     &lt;enumeration value="CHF"/>
 *     &lt;enumeration value="CLF"/>
 *     &lt;enumeration value="CNY"/>
 *     &lt;enumeration value="DEM"/>
 *     &lt;enumeration value="ESP"/>
 *     &lt;enumeration value="EUR"/>
 *     &lt;enumeration value="FIM"/>
 *     &lt;enumeration value="FRF"/>
 *     &lt;enumeration value="GBP"/>
 *     &lt;enumeration value="ILS"/>
 *     &lt;enumeration value="INR"/>
 *     &lt;enumeration value="JPY"/>
 *     &lt;enumeration value="KRW"/>
 *     &lt;enumeration value="MXN"/>
 *     &lt;enumeration value="NLG"/>
 *     &lt;enumeration value="NZD"/>
 *     &lt;enumeration value="PHP"/>
 *     &lt;enumeration value="RUR"/>
 *     &lt;enumeration value="THB"/>
 *     &lt;enumeration value="TRL"/>
 *     &lt;enumeration value="TWD"/>
 *     &lt;enumeration value="USD"/>
 *     &lt;enumeration value="ZAR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Currency", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum Currency {

    /** The ars. */
    ARS,
    
    /** The aud. */
    AUD,
    
    /** The brl. */
    BRL,
    
    /** The cad. */
    CAD,
    
    /** The chf. */
    CHF,
    
    /** The clf. */
    CLF,
    
    /** The cny. */
    CNY,
    
    /** The dem. */
    DEM,
    
    /** The esp. */
    ESP,
    
    /** The eur. */
    EUR,
    
    /** The fim. */
    FIM,
    
    /** The frf. */
    FRF,
    
    /** The gbp. */
    GBP,
    
    /** The ils. */
    ILS,
    
    /** The inr. */
    INR,
    
    /** The jpy. */
    JPY,
    
    /** The krw. */
    KRW,
    
    /** The mxn. */
    MXN,
    
    /** The nlg. */
    NLG,
    
    /** The nzd. */
    NZD,
    
    /** The php. */
    PHP,
    
    /** The rur. */
    RUR,
    
    /** The thb. */
    THB,
    
    /** The trl. */
    TRL,
    
    /** The twd. */
    TWD,
    
    /** The usd. */
    USD,
    
    /** The zar. */
    ZAR;

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
	 * @return the currency
	 */
    public static Currency fromValue(String v) {
        return valueOf(v);
    }

}
