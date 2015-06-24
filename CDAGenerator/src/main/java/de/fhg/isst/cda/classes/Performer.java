package de.fhg.isst.cda.classes;

import de.fhg.isst.cda.choices.informant.AssignedEntity;

// TODO: Auto-generated Javadoc
/**
 * The Class Performer.
 */
public class Performer {
	
	/** The type code. */
	private XServiceEventPerformer typeCode;
	
	/** The function code. */
	private Code functionCode;
	
	/** The time. */
	private String time;
	
	/** The assigned entity. */
	private AssignedEntity assignedEntity;
	
	/**
	 * Instantiates a new performer.
	 */
	public Performer() {
	}
	
	/**
	 * Gets the type code.
	 * 
	 * @return the type code
	 */
	public XServiceEventPerformer getTypeCode() {
		return typeCode;
	}
	
	/**
	 * Sets the type code.
	 * 
	 * @param typeCode
	 *            the new type code
	 */
	public void setTypeCode(XServiceEventPerformer typeCode) {
		this.typeCode = typeCode;
	}
	
	/**
	 * Gets the function code.
	 * 
	 * @return the function code
	 */
	public Code getFunctionCode() {
		return functionCode;
	}
	
	/**
	 * Sets the function code.
	 * 
	 * @param functionCode
	 *            the new function code
	 */
	public void setFunctionCode(Code functionCode) {
		this.functionCode = functionCode;
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
