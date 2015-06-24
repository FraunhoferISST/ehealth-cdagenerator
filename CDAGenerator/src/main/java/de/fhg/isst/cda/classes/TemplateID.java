//

package de.fhg.isst.cda.classes;


// TODO: Auto-generated Javadoc
/**
 * The Class TemplateID.
 */
public class TemplateID   
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

    /** The __ extension. */
    private String __Extension = new String();
    
    /**
	 * Gets the extension.
	 * 
	 * @return the extension
	 */
    public String getExtension() {
        return __Extension;
    }

    /**
	 * Sets the extension.
	 * 
	 * @param value
	 *            the new extension
	 */
    public void setExtension(String value) {
        __Extension = value;
    }

    /**
	 * Instantiates a new template id.
	 * 
	 * @throws Exception
	 *             the exception
	 */
    public TemplateID() throws Exception {
    }

    /**
	 * Instantiates a new template id.
	 * 
	 * @param root
	 *            the root
	 * @param extension
	 *            the extension
	 */
    public TemplateID(String root, String extension) {
        this.setRoot(root);
        this.setExtension(extension);
    }

}


