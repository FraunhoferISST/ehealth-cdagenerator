//

package de.fhg.isst.cda.classes;


// TODO: Auto-generated Javadoc
/**
 * The Class TypeID.
 */
public class TypeID   
{
    
    /** The __ root. */
    private String __Root = new String();
    
    /**
	 * Gets the root.
	 * 
	 * @return the root
	 */
    public String getRoot() {
        return __Root;
    }

    /**
	 * Sets the root.
	 * 
	 * @param value
	 *            the new root
	 */
    public void setRoot(String value) {
        __Root = value;
    }

    /** The __ extensions. */
    private String __Extensions = new String();
    
    /**
	 * Gets the extensions.
	 * 
	 * @return the extensions
	 */
    public String getExtensions() {
        return __Extensions;
    }

    /**
	 * Sets the extensions.
	 * 
	 * @param value
	 *            the new extensions
	 */
    public void setExtensions(String value) {
        __Extensions = value;
    }

    /**
	 * Instantiates a new type id.
	 * 
	 * @throws Exception
	 *             the exception
	 */
    public TypeID() throws Exception {
    }

    /**
	 * Instantiates a new type id.
	 * 
	 * @param root
	 *            the root
	 * @param extensions
	 *            the extensions
	 */
    public TypeID(String root, String extensions) {
        this.setRoot(root);
        this.setExtensions(extensions);
    }

}


