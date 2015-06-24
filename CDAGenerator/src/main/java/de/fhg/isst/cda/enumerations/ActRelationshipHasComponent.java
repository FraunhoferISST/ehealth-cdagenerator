package de.fhg.isst.cda.enumerations;

// TODO: Auto-generated Javadoc
/**
 * The Enum ActRelationshipHasComponent.
 */
public enum ActRelationshipHasComponent {

    /** The comp. */
    COMP,
    
    /** The arr. */
    ARR,
    
    /** The ctrlv. */
    CTRLV,
    
    /** The dep. */
    DEP;
    
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
	 * @return the act relationship has component
	 */
    public static ActRelationshipHasComponent fromValue(String v) {
        return valueOf(v);
    }
}