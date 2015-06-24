package de.fhg.isst.cda.enumerations;

// TODO: Auto-generated Javadoc
/**
 * The Enum XDocumentProcedureMood.
 */
public enum XDocumentProcedureMood {

    /** The int. */
    INT,
    
    /** The apt. */
    APT,
    
    /** The arq. */
    ARQ,
    
    /** The def. */
    DEF,
    
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
	 * @return the x document procedure mood
	 */
    public static XDocumentProcedureMood fromValue(String v) {
        return valueOf(v);
    }
}
