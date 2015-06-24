package de.fhg.isst.cda.classes;

// TODO: Auto-generated Javadoc
/**
 * The Enum RoleClassServiceDeliveryLocation.
 */
public enum RoleClassServiceDeliveryLocation {
    
    /** The sdloc. */
    SDLOC,
    
    /** The dsdloc. */
    DSDLOC,
    
    /** The isdloc. */
    ISDLOC;

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
	 * @return the role class service delivery location
	 */
    public static RoleClassServiceDeliveryLocation fromValue(String v) {
        return valueOf(v);
    }

}