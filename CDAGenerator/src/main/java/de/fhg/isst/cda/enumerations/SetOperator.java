package de.fhg.isst.cda.enumerations;

// TODO: Auto-generated Javadoc
/**
 * The Enum SetOperator.
 */
public enum SetOperator {

	/** The a. */
	A, /** The e. */
 E, /** The h. */
 H, /** The i. */
 I, /** The p. */
 P;

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
	 * @return the sets the operator
	 */
	public static SetOperator fromValue(String v) {
		return valueOf(v);
	}

}