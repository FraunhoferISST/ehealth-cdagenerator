package de.fhg.isst.cda.enumerations;

// TODO: Auto-generated Javadoc
/**
 * The Enum XActClassDocumentEntryOrganizer.
 */
public enum XActClassDocumentEntryOrganizer {

	/** The battery. */
	BATTERY, /** The cluster. */
 CLUSTER;

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
	 * @return the x act class document entry organizer
	 */
	public static XActClassDocumentEntryOrganizer fromValue(String v) {
		return valueOf(v);
	}

}
