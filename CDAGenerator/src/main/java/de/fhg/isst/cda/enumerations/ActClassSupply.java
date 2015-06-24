package de.fhg.isst.cda.enumerations;

// TODO: Auto-generated Javadoc
/**
 * The Enum ActClassSupply.
 */
public enum ActClassSupply {

    /** The sply. */
    SPLY,
    
    /** The diet. */
    DIET;

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
	 * @return the act class supply
	 */
    public static ActClassSupply fromValue(String v) {
        return valueOf(v);
    }

}