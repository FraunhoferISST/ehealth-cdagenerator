package de.fhg.isst.cda.exceptions;

// TODO: Auto-generated Javadoc
/**
 * The Class MissingAttributeException.
 */
public class MissingAttributeException extends Exception{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -522957340577177200L;
	
	
	/**
	 * Instantiates a new missing attribute exception.
	 * 
	 * @param message
	 *            the message
	 */
	public MissingAttributeException(String message) {
		super(message);
	}
	
	/**
	* {@inheritDoc}
	*/
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "attribute "+super.getMessage()+" is mandatory";
	}
}
