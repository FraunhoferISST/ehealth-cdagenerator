package de.fhg.isst.cda.enumerations;

// TODO: Auto-generated Javadoc
/**
 * The Enum XDocumentSubject.
 */
public enum XDocumentSubject {
    
    /** The pat. */
    PAT,
    
    /** The prs. */
    PRS;

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
	 * @return the x document subject
	 */
    public static XDocumentSubject fromValue(String v) {
        return valueOf(v);
    }

}
