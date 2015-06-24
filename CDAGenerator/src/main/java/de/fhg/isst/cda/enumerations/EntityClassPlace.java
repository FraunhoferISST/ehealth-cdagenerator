package de.fhg.isst.cda.enumerations;


// TODO: Auto-generated Javadoc
/**
 * The Enum EntityClassPlace.
 */
public enum EntityClassPlace {

    /** The plc. */
    PLC,
    
    /** The city. */
    CITY,
    
    /** The country. */
    COUNTRY,
    
    /** The county. */
    COUNTY,
    
    /** The province. */
    PROVINCE;

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
	 * @return the entity class place
	 */
    public static EntityClassPlace fromValue(String v) {
        return valueOf(v);
    }

}
