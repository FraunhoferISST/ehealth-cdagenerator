package de.fhg.isst.cda.enumerations;

// TODO: Auto-generated Javadoc
/**
 * The Enum ParticipationPhysicalPerformer.
 */
public enum ParticipationPhysicalPerformer {

    /** The prf. */
    PRF,
    
    /** The dist. */
    DIST,
    
    /** The pprf. */
    PPRF,
    
    /** The sprf. */
    SPRF;

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
	 * @return the participation physical performer
	 */
    public static ParticipationPhysicalPerformer fromValue(String v) {
        return valueOf(v);
    }

}
