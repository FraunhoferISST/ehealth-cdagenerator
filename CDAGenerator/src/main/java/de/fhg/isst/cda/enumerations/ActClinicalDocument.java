package de.fhg.isst.cda.enumerations;

// TODO: Auto-generated Javadoc
/**
 * The Enum ActClinicalDocument.
 */
public enum ActClinicalDocument {

    /** The docclin. */
    DOCCLIN,
    
    /** The cdalvlone. */
    CDALVLONE;

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
	 * @return the act clinical document
	 */
    public static ActClinicalDocument fromValue(String v) {
        return valueOf(v);
    }

}
