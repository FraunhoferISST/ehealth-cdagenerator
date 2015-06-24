package de.fhg.isst.cda.classes;

import de.fhg.isst.cda.choices.informant.AssignedEntity;

// TODO: Auto-generated Javadoc
/**
 * The Class ResponsibleParty.
 */
public class ResponsibleParty {
	
	/** The type code. */
	private String typeCode;
	
	/** The assigned entity. */
	private AssignedEntity assignedEntity;
	
	/**
	 * Instantiates a new responsible party.
	 */
	public ResponsibleParty() {
		this.typeCode = "RESP";
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