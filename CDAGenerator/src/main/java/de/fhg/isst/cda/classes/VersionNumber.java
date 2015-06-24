package de.fhg.isst.cda.classes;

// TODO: Auto-generated Javadoc
/**
 * The Class VersionNumber.
 */
public class VersionNumber   
{
    
    /** The value. */
    private String value = new String();
    
    /**
	 * Gets the value.
	 * 
	 * @return the value
	 */
    public String getValue() {
        return value;
    }

    /**
	 * Sets the value.
	 * 
	 * @param value
	 *            the new value
	 */
    public void setValue(String value) {
        this.value = value;
    }

    /**
	 * Instantiates a new version number.
	 * 
	 * @throws Exception
	 *             the exception
	 */
    public VersionNumber() throws Exception {
    }

    /**
	 * Instantiates a new version number.
	 * 
	 * @param value
	 *            the value
	 */
    public VersionNumber(String value) {
        this.setValue(value);
    }
}