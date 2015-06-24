package de.fhg.isst.cda.enumerations;

// TODO: Auto-generated Javadoc
/**
 * The Enum ParticipationTargetSubject.
 */
public enum ParticipationTargetSubject {

    /** The sbj. */
    SBJ,
    
    /** The spc. */
    SPC;

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
	 * @return the participation target subject
	 */
    public static ParticipationTargetSubject fromValue(String v) {
        return valueOf(v);
    }

}
