package de.fhg.isst.cda.enumerations;


// TODO: Auto-generated Javadoc
/**
 * The Enum EntityClassDevice.
 */
public enum EntityClassDevice {

    /** The dev. */
    DEV,
    
    /** The cer. */
    CER,
    
    /** The moddv. */
    MODDV;

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
	 * @return the entity class device
	 */
    public static EntityClassDevice fromValue(String v) {
        return valueOf(v);
    }

}
