package de.fhg.isst.cda.exceptions;

// TODO: Auto-generated Javadoc
/**
 * The Class MissingNodeException.
 */
public class MissingNodeException extends Exception{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -6185646561455016661L;

	/**
	 * Instantiates a new missing node exception.
	 * 
	 * @param message
	 *            the message
	 */
	public MissingNodeException(String message) {
		super(message);
	}
	
	/**
	* {@inheritDoc}
	*/
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Node "+super.getMessage()+" is mandatory";
	}
}
