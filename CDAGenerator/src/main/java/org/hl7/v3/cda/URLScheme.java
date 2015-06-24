
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for URLScheme.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="URLScheme">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="fax"/>
 *     &lt;enumeration value="file"/>
 *     &lt;enumeration value="ftp"/>
 *     &lt;enumeration value="http"/>
 *     &lt;enumeration value="mailto"/>
 *     &lt;enumeration value="mllp"/>
 *     &lt;enumeration value="modem"/>
 *     &lt;enumeration value="nfs"/>
 *     &lt;enumeration value="tel"/>
 *     &lt;enumeration value="telnet"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "URLScheme", namespace = "urn:hl7-org:v3")
@XmlEnum
public enum URLScheme {

    /** The fax. */
    @XmlEnumValue("fax")
    FAX("fax"),
    
    /** The file. */
    @XmlEnumValue("file")
    FILE("file"),
    
    /** The ftp. */
    @XmlEnumValue("ftp")
    FTP("ftp"),
    
    /** The http. */
    @XmlEnumValue("http")
    HTTP("http"),
    
    /** The mailto. */
    @XmlEnumValue("mailto")
    MAILTO("mailto"),
    
    /** The mllp. */
    @XmlEnumValue("mllp")
    MLLP("mllp"),
    
    /** The modem. */
    @XmlEnumValue("modem")
    MODEM("modem"),
    
    /** The nfs. */
    @XmlEnumValue("nfs")
    NFS("nfs"),
    
    /** The tel. */
    @XmlEnumValue("tel")
    TEL("tel"),
    
    /** The telnet. */
    @XmlEnumValue("telnet")
    TELNET("telnet");
    
    /** The value. */
    private final String value;

    /**
	 * Instantiates a new uRL scheme.
	 * 
	 * @param v
	 *            the v
	 */
    URLScheme(String v) {
        value = v;
    }

    /**
	 * Value.
	 * 
	 * @return the string
	 */
    public String value() {
        return value;
    }

    /**
	 * From value.
	 * 
	 * @param v
	 *            the v
	 * @return the uRL scheme
	 */
    public static URLScheme fromValue(String v) {
        for (URLScheme c: URLScheme.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
