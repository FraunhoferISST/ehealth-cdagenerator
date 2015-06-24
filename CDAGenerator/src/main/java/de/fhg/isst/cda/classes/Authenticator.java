package de.fhg.isst.cda.classes;

import de.fhg.isst.cda.choices.informant.AssignedEntity;

// TODO: Auto-generated Javadoc
/**
 * The Class Authenticator.
 */
public class Authenticator {
	
	/** The type code. */
	private Code typeCode;
	
	/** The time. */
	private String time;
	
	/** The signature code. */
	private Code signatureCode;
	
	/** The assigned entity. */
	private AssignedEntity assignedEntity;
	
	/**
	 * Gets the type code.
	 * 
	 * @return the type code
	 */
	public Code getTypeCode() {
		return typeCode;
	}
	
	/**
	 * Sets the type code.
	 * 
	 * @param typeCode
	 *            the new type code
	 */
	public void setTypeCode(Code typeCode) {
		this.typeCode = typeCode;
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
	 * Gets the signature code.
	 * 
	 * @return the signature code
	 */
	public Code getSignatureCode() {
		return signatureCode;
	}
	
	/**
	 * Sets the signature code.
	 * 
	 * @param signatureCode
	 *            the new signature code
	 */
	public void setSignatureCode(Code signatureCode) {
		this.signatureCode = signatureCode;
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