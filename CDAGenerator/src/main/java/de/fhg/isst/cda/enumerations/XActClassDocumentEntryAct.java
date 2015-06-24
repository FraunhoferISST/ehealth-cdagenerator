package de.fhg.isst.cda.enumerations;

// TODO: Auto-generated Javadoc
/**
 * The Enum XActClassDocumentEntryAct.
 */
public enum XActClassDocumentEntryAct {

	/** The act. */
	ACT, /** The accm. */
 ACCM, /** The cons. */
 CONS, /** The cttevent. */
 CTTEVENT, /** The inc. */
 INC, /** The infrm. */
 INFRM, /** The pcpr. */
 PCPR, /** The reg. */
 REG, /** The spctrt. */
 SPCTRT;

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
	 * @return the x act class document entry act
	 */
	public static XActClassDocumentEntryAct fromValue(String v) {
		return valueOf(v);
	}

}
