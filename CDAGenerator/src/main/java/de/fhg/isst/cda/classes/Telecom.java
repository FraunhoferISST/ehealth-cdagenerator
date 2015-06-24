package de.fhg.isst.cda.classes;

import de.fhg.isst.cda.enumerations.TelecomUse;

// TODO: Auto-generated Javadoc
/**
 * The Class Telecom.
 */
public class Telecom   
{
	
	/** The value. */
	private String value;
	
	/** The use. */
	private TelecomUse use;
	
	/**
	 * Instantiates a new telecom.
	 */
	public  Telecom() {
		
	}

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
	 * Gets the use.
	 * 
	 * @return the use
	 */
	public TelecomUse getUse() {
		if(use == null) {
			this.use = TelecomUse.WORKPLACE;
		}
		return use;
	}

	/**
	 * Sets the use.
	 * 
	 * @param use
	 *            the new use
	 */
	public void setUse(TelecomUse use) {
		this.use = use;
	}
	
}