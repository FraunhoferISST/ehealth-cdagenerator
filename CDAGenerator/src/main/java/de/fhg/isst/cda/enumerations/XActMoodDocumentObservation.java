package de.fhg.isst.cda.enumerations;

// TODO: Auto-generated Javadoc
/**
 * The Enum XActMoodDocumentObservation.
 */
public enum XActMoodDocumentObservation {

	/** The int. */
	INT, /** The def. */
 DEF, /** The evn. */
 EVN, /** The gol. */
 GOL, /** The prms. */
 PRMS, /** The prp. */
 PRP, /** The rqo. */
 RQO;

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
	 * @return the x act mood document observation
	 */
	public static XActMoodDocumentObservation fromValue(String v) {
		return valueOf(v);
	}

}
