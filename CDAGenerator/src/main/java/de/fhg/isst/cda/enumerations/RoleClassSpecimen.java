package de.fhg.isst.cda.enumerations;
// TODO: Auto-generated Javadoc

/**
 * The Enum RoleClassSpecimen.
 */
public enum RoleClassSpecimen {

    /** The spec. */
    SPEC,
    
    /** The alqt. */
    ALQT,
    
    /** The islt. */
    ISLT;

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
	 * @return the role class specimen
	 */
    public static RoleClassSpecimen fromValue(String v) {
        return valueOf(v);
    }

}
