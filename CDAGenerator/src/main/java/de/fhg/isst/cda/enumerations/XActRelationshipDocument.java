package de.fhg.isst.cda.enumerations;

// TODO: Auto-generated Javadoc
/**
 * The Enum XActRelationshipDocument.
 */
public enum XActRelationshipDocument {

    /** The rplc. */
    RPLC,
    
    /** The apnd. */
    APND,
    
    /** The xfrm. */
    XFRM;

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
	 * @return the x act relationship document
	 */
    public static XActRelationshipDocument fromValue(String v) {
        return valueOf(v);
    }
}