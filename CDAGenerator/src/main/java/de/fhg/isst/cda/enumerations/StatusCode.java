package de.fhg.isst.cda.enumerations;

public enum StatusCode {

    NORMAL,
    ABORTED,
    ACTIVE,
    CANCELLED,
    COMPLETED,
    HELD,
    NEW,
    SUSPENDED,
    NULLIFIED,
    OBSOLETE;
    

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
    public static StatusCode fromValue(String v) {
        return valueOf(v);
    }

}
