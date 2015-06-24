package de.fhg.isst.cda.enumerations;

// TODO: Auto-generated Javadoc
/**
 * The Enum WorkPlaceAddressUse.
 */
public enum TelecomUse {
    
    WORKPLACE(0, "WP"),
    
    WORKPLACE_DIRECT(1, "DIR"),
    
    HOME(2, "H"),

    HOME_PRIMARY(3, "HP"),
    
    HOME_VACATION(4, "HV"),
    
    BAD(5, "BAD"),
    
    TEMP(6, "TMP"),
    
    ANSWERING_SERVICE(7, "AS"),

    EMERGENCY(8, "EC"),
    
    MOBILE(9, "MC"),
    
    PAGER(7, "PG");
    
    /** The value. */
    private final int value;
    
    /** The description. */
    private final String description;
    
    /**
	 * Instantiates a new work place address use.
	 * 
	 * @param value
	 *            the value
	 * @param description
	 *            the description
	 */
    private TelecomUse(final int value, final String description) {
    	this.value = value;
    	this.description = description;
    }

	/**
	 * Gets the value.
	 * 
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * Gets the description.
	 * 
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
}
