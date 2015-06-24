package de.fhg.isst.cda.classes;


// TODO: Auto-generated Javadoc
/**
 * The Enum XActRelationshipEntry.
 */
public enum XActRelationshipEntry {

    /** The comp. */
    COMP,
    
    /** The driv. */
    DRIV;

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
	 * @return the x act relationship entry
	 */
    public static XActRelationshipEntry fromValue(String v) {
        return valueOf(v);
    }

}
