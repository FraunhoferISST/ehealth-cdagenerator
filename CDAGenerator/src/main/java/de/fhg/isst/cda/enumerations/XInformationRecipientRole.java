package de.fhg.isst.cda.enumerations;

// TODO: Auto-generated Javadoc
/**
 * The Enum XInformationRecipientRole.
 */
public enum XInformationRecipientRole {

    /** The assigned. */
    ASSIGNED,
    
    /** The hlthchrt. */
    HLTHCHRT;

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
	 * @return the x information recipient role
	 */
    public static XInformationRecipientRole fromValue(String v) {
        return valueOf(v);
    }

}