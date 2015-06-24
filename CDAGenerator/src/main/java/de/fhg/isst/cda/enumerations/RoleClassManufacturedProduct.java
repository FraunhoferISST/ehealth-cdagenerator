package de.fhg.isst.cda.enumerations;

// TODO: Auto-generated Javadoc
/**
 * The Enum RoleClassManufacturedProduct.
 */
public enum RoleClassManufacturedProduct {

    /** The manu. */
    MANU,
    
    /** The ther. */
    THER;

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
	 * @return the role class manufactured product
	 */
    public static RoleClassManufacturedProduct fromValue(String v) {
        return valueOf(v);
    }

}
