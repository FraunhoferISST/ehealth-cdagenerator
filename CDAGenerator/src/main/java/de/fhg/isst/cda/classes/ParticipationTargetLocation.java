package de.fhg.isst.cda.classes;

// TODO: Auto-generated Javadoc
/**
 * The Enum ParticipationTargetLocation.
 */
public enum ParticipationTargetLocation {

    /** The loc. */
    LOC,
    
    /** The dst. */
    DST,
    
    /** The eloc. */
    ELOC,
    
    /** The org. */
    ORG,
    
    /** The rml. */
    RML,
    
    /** The via. */
    VIA;

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
	 * @return the participation target location
	 */
    public static ParticipationTargetLocation fromValue(String v) {
        return valueOf(v);
    }

}
