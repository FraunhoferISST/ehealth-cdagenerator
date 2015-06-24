package de.fhg.isst.cda.enumerations;

// TODO: Auto-generated Javadoc
/**
 * The Enum ActRelationshipFulfills.
 */
public enum ActRelationshipFulfills {
	
	/** The flfs. */
	FLFS, 
 /** The occr. */
 OCCR, 
 /** The oref. */
 OREF, 
 /** The sch. */
 SCH;

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
	 * @return the act relationship fulfills
	 */
	public static ActRelationshipFulfills fromValue(String v) {
		return valueOf(v);
	}

}