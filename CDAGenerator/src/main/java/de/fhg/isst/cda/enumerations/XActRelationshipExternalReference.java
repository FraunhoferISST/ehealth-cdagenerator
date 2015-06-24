//

package de.fhg.isst.cda.enumerations;


// TODO: Auto-generated Javadoc
/**
 * The Enum XActRelationshipExternalReference.
 */
public enum XActRelationshipExternalReference {

    /** The xcrpt. */
    XCRPT,
    
    /** The rplc. */
    RPLC,
    
    /** The sprt. */
    SPRT,
    
    /** The elnk. */
    ELNK,
    
    /** The refr. */
    REFR,
    
    /** The subj. */
    SUBJ;

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
	 * @return the x act relationship external reference
	 */
    public static XActRelationshipExternalReference fromValue(String v) {
        return valueOf(v);
    }

}