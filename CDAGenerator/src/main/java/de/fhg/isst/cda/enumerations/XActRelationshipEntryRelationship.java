package de.fhg.isst.cda.enumerations;


// TODO: Auto-generated Javadoc
/**
 * The Enum XActRelationshipEntryRelationship.
 */
public enum XActRelationshipEntryRelationship {

    /** The xcrpt. */
    XCRPT,
    
    /** The comp. */
    COMP,
    
    /** The rson. */
    RSON,
    
    /** The sprt. */
    SPRT,
    
    /** The caus. */
    CAUS,
    
    /** The gevl. */
    GEVL,
    
    /** The mfst. */
    MFST,
    
    /** The refr. */
    REFR,
    
    /** The sas. */
    SAS,
    
    /** The subj. */
    SUBJ;

    /**
	 * Value.
	 * 
	 * @return the string
	 */
    public String getValue() {
        return name();
    }

    /**
	 * From value.
	 * 
	 * @param v
	 *            the v
	 * @return the x act relationship entry relationship
	 */
    public static XActRelationshipEntryRelationship fromValue(String v) {
        return valueOf(v);
    }

}
