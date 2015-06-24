package de.fhg.isst.cda.enumerations;

// TODO: Auto-generated Javadoc
/**
 * The Enum ContextControlPropagating.
 */
public enum ContextControlPropagating {

    /** The ap. */
    AP,
    
    /** The op. */
    OP;

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
	 * @return the context control propagating
	 */
    public static ContextControlPropagating fromValue(String v) {
        return valueOf(v);
    }

}
