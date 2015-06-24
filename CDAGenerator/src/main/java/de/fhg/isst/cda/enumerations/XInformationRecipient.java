package de.fhg.isst.cda.enumerations;

// TODO: Auto-generated Javadoc
/**
 * The Enum XInformationRecipient.
 */
public enum XInformationRecipient {

	/** The prcp. */
	PRCP, /** The trc. */
 TRC;

	/**
	 * Gets the value.
	 * 
	 * @return the value
	 */
	public String getValue() {
		return name();
	}

	/**
	 * From value.
	 * 
	 * @param v
	 *            the v
	 * @return the x information recipient
	 */
	public static XInformationRecipient fromValue(String v) {
		return valueOf(v);
	}

}