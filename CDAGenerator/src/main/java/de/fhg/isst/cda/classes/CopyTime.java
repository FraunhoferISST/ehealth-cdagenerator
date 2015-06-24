//

package de.fhg.isst.cda.classes;


// TODO: Auto-generated Javadoc
/**
 * The Class CopyTime.
 */
public class CopyTime   
{
    
    /** The __ value. */
    private String __Value = new String();
    
    /**
	 * Gets the value.
	 * 
	 * @return the value
	 */
    public String getValue() {
        return __Value;
    }

    /**
	 * Sets the value.
	 * 
	 * @param value
	 *            the new value
	 */
    public void setValue(String value) {
        __Value = value;
    }

    /**
	 * Instantiates a new copy time.
	 * 
	 * @throws Exception
	 *             the exception
	 */
    public CopyTime() throws Exception {
    }

    /**
	 * Instantiates a new copy time.
	 * 
	 * @param value
	 *            the value
	 */
    public CopyTime(String value) {
        this.setValue(value);
    }

}


