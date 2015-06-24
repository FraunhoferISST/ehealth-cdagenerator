package de.fhg.isst.cda.classes;

import de.fhg.isst.cda.choices.informant.AssignedEntity;


// TODO: Auto-generated Javadoc
/**
 * The Class DataEnterer.
 */
public class DataEnterer {
	
	/** The type code. */
	private String typeCode;
	
	/** The context control code. */
	private String contextControlCode;
	
	/** The time. */
	private String time;
	
	/** The assigned entity. */
	private AssignedEntity assignedEntity;
	
	/**
	 * Instantiates a new data enterer.
	 */
	public DataEnterer() {
		this.typeCode = "ENT";
		this.contextControlCode = "OP";
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
	 * Gets the context control code.
	 * 
	 * @return the context control code
	 */
	public String getContextControlCode() {
		return contextControlCode;
	}
	
	/**
	 * Sets the context control code.
	 * 
	 * @param contextControlCode
	 *            the new context control code
	 */
	public void setContextControlCode(String contextControlCode) {
		this.contextControlCode = contextControlCode;
	}
	
	/**
	 * Gets the time.
	 * 
	 * @return the time
	 */
	public String getTime() {
		return time;
	}
	
	/**
	 * Sets the time.
	 * 
	 * @param time
	 *            the new time
	 */
	public void setTime(String time) {
		this.time = time;
	}
	
	/**
	 * Gets the assigned entity.
	 * 
	 * @return the assigned entity
	 */
	public AssignedEntity getAssignedEntity() {
		return assignedEntity;
	}
	
	/**
	 * Sets the assigned entity.
	 * 
	 * @param assignedEntity
	 *            the new assigned entity
	 */
	public void setAssignedEntity(AssignedEntity assignedEntity) {
		this.assignedEntity = assignedEntity;
	}
	
	
}
