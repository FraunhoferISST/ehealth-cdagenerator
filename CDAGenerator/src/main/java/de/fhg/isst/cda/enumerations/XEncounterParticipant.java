package de.fhg.isst.cda.enumerations;

// TODO: Auto-generated Javadoc
/**
 * The Enum XEncounterParticipant.
 */
public enum XEncounterParticipant {

    /** The adm. */
    ADM,
    
    /** The atnd. */
    ATND,
    
    /** The con. */
    CON,
    
    /** The dis. */
    DIS,
    
    /** The ref. */
    REF;

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
	 * @return the x encounter participant
	 */
    public static XEncounterParticipant fromValue(String v) {
        return valueOf(v);
    }

}
