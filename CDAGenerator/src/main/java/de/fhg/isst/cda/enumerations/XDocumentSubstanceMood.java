package de.fhg.isst.cda.enumerations;

// TODO: Auto-generated Javadoc
/**
 * The Enum XDocumentSubstanceMood.
 */
public enum XDocumentSubstanceMood {

    /** The int. */
    INT,
    
    /** The evn. */
    EVN,
    
    /** The prms. */
    PRMS,
    
    /** The prp. */
    PRP,
    
    /** The rqo. */
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
	 * @return the x document substance mood
	 */
    public static XDocumentSubstanceMood fromValue(String v) {
        return valueOf(v);
    }
}