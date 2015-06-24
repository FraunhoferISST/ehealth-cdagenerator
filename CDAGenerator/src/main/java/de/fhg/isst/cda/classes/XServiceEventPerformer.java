package de.fhg.isst.cda.classes;


// TODO: Auto-generated Javadoc
/**
 * The Enum XServiceEventPerformer.
 */
public enum XServiceEventPerformer {

    /** The prf. */
    PRF,
    
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
	 * @return the x service event performer
	 */
    public static XServiceEventPerformer fromValue(String v) {
        return valueOf(v);
    }

}
