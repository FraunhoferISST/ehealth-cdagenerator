package de.fhg.isst.cda.classes;

import de.fhg.isst.cda.enumerations.XInformationRecipient;

// TODO: Auto-generated Javadoc
/**
 * The Class InformationRecipient.
 */
public class InformationRecipient {
	
	/** The type code. */
	public XInformationRecipient typeCode;
	
	/** The intended recipient. */
	public IntendedRecipient intendedRecipient;

	/**
	 * Instantiates a new information recipient.
	 */
	public InformationRecipient() {
		this.typeCode = XInformationRecipient.PRCP;
	}
	
	/**
	 * Gets the type code.
	 * 
	 * @return the type code
	 */
	public XInformationRecipient getTypeCode() {
		return typeCode;
	}

	/**
	 * Sets the type code.
	 * 
	 * @param typeCode
	 *            the new type code
	 */
	public void setTypeCode(XInformationRecipient typeCode) {
		this.typeCode = typeCode;
	}
	
	/**
	 * Gets the intended recipient.
	 * 
	 * @return the intended recipient
	 */
	public IntendedRecipient getIntendedRecipient() {
		return intendedRecipient;
	}
	
	/**
	 * Sets the intended recipient.
	 * 
	 * @param intendedRecipient
	 *            the new intended recipient
	 */
	public void setIntendedRecipient(IntendedRecipient intendedRecipient) {
		this.intendedRecipient = intendedRecipient;
	}
}