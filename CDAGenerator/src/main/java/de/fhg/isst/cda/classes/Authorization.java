package de.fhg.isst.cda.classes;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class Authorization.
 */
public class Authorization {
	
	/** The type code. */
	private String typeCode;
	
	/** The consents. */
	private ArrayList<Consent> consents;
	
	/**
	 * Instantiates a new authorization.
	 */
	public Authorization() {
		this.typeCode = "AUTH";
	}

	/**
	 * Gets the type code.
	 * 
	 * @return the type code
	 */
	public String getTypeCode() {
		return typeCode;
	}

	/**
	 * Sets the type code.
	 * 
	 * @param typeCode
	 *            the new type code
	 */
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	/**
	 * Gets the consents.
	 * 
	 * @return the consents
	 */
	public ArrayList<Consent> getConsents() {
		if(this.consents == null) {
			this.consents = new ArrayList<Consent>();
		}
		return consents;
	}

	/**
	 * Sets the consents.
	 * 
	 * @param consents
	 *            the new consents
	 */
	public void setConsents(ArrayList<Consent> consents) {
		this.consents = consents;
	}

	
}