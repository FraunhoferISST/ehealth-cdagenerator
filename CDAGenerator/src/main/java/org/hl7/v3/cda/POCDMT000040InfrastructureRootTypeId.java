
package org.hl7.v3.cda;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


// TODO: Auto-generated Javadoc
/**
 * <p>Java class for POCD_MT000040.InfrastructureRoot.typeId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POCD_MT000040.InfrastructureRoot.typeId">
 *   &lt;complexContent>
 *     &lt;restriction base="{urn:hl7-org:v3}II">
 *       &lt;attribute name="root" use="required" type="{urn:hl7-org:v3}uid" fixed="2.16.840.1.113883.1.3" />
 *       &lt;attribute name="extension" use="required" type="{urn:hl7-org:v3}st" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POCD_MT000040.InfrastructureRoot.typeId", namespace = "urn:hl7-org:v3")
public class POCDMT000040InfrastructureRootTypeId
    extends II
{
	
	/**
	 * Instantiates a new pOCDM t000040 infrastructure root type id.
	 */
	public POCDMT000040InfrastructureRootTypeId() {}
	
	/**
	 * Instantiates a new pOCDM t000040 infrastructure root type id.
	 * 
	 * @param root
	 *            the root
	 * @param extension
	 *            the extension
	 */
	public POCDMT000040InfrastructureRootTypeId(String root, String extension) {
		super(root, extension);
	}

}
