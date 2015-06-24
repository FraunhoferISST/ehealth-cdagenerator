package de.fhg.isst.cda.enumerations;

// TODO: Auto-generated Javadoc
/**
 * The Enum EntityDeterminerDetermined.
 */
public enum EntityDeterminerDetermined {

    /** The kind. */
    KIND,
    
    /** The quantified kind. */
    QUANTIFIED_KIND;

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
	 * @return the entity determiner determined
	 */
    public static EntityDeterminerDetermined fromValue(String v) {
        return valueOf(v);
    }

}
