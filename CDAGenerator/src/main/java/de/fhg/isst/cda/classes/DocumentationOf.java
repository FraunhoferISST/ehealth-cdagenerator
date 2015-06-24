package de.fhg.isst.cda.classes;

import java.util.ArrayList;


// TODO: Auto-generated Javadoc
/**
 * The Class DocumentationOf.
 */
public class DocumentationOf {
	
	/** The type code. */
	private String typeCode;
	
	/** The service events. */
	private ArrayList<ServiceEvent> serviceEvents;
	
	/**
	 * Instantiates a new documentation of.
	 */
	public DocumentationOf() {
		this.typeCode = "DOC";
	}

	/**
	 * Gets the type code.
	 * 
	 * @return the type code
	 */
	public String getTypeCode() {
		return typeCode;
	}

	/**
	 * Sets the type code.
	 * 
	 * @param typeCode
	 *            the new type code
	 */
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	/**
	 * Gets the service events.
	 * 
	 * @return the service events
	 */
	public ArrayList<ServiceEvent> getServiceEvents() {
		if(this.serviceEvents == null) {
			this.serviceEvents = new ArrayList<ServiceEvent>();
		}
		return serviceEvents;
	}

	/**
	 * Sets the service events.
	 * 
	 * @param serviceEvents
	 *            the new service events
	 */
	public void setServiceEvents(ArrayList<ServiceEvent> serviceEvents) {
		this.serviceEvents = serviceEvents;
	}

}