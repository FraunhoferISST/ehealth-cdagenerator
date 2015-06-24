package de.fhg.isst.cda.classes;


// TODO: Auto-generated Javadoc
/**
 * The Class ID.
 */
public class ID   
{
    
    /** The root. */
    private String root;
    
    /** The extensions. */
    private String extensions;
    
    /** The null flavour. */
    private String nullFlavour;

    /**
	 * Instantiates a new id.
	 */
    public ID() {
    	
    }
    
    /**
	 * Instantiates a new id.
	 * 
	 * @param root
	 *            the root
	 * @param extensions
	 *            the extensions
	 */
    public ID(String root, String extensions) {
    	this.root = root;
    	this.extensions = extensions;
    }
   	
	   /**
		 * Gets the root.
		 * 
		 * @return the root
		 */
	   public String getRoot() {
		return root;
	}
	
	/**
	 * Sets the root.
	 * 
	 * @param root
	 *            the new root
	 */
	public void setRoot(String root) {
		this.root = root;
	}
	
	/**
	 * Gets the extensions.
	 * 
	 * @return the extensions
	 */
	public String getExtensions() {
		return extensions;
	}
	
	/**
	 * Sets the extensions.
	 * 
	 * @param extensions
	 *            the new extensions
	 */
	public void setExtensions(String extensions) {
		this.extensions = extensions;
	}
	
	/**
	 * Gets the null flavour.
	 * 
	 * @return the null flavour
	 */
	public String getNullFlavour() {
		return nullFlavour;
	}
	
	/**
	 * Sets the null flavour.
	 * 
	 * @param nullFlavour
	 *            the new null flavour
	 */
	public void setNullFlavour(String nullFlavour) {
		this.nullFlavour = nullFlavour;
	}
}