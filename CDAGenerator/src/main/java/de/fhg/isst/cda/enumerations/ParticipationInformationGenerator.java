package de.fhg.isst.cda.enumerations;

// TODO: Auto-generated Javadoc
/**
 * The Enum ParticipationInformationGenerator.
 */
public enum ParticipationInformationGenerator {

    /** The aut. */
    AUT,
    
    /** The ent. */
    ENT,
    
    /** The inf. */
    INF,
    
    /** The wit. */
    WIT;

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
	 * @return the participation information generator
	 */
    public static ParticipationInformationGenerator fromValue(String v) {
        return valueOf(v);
    }
}