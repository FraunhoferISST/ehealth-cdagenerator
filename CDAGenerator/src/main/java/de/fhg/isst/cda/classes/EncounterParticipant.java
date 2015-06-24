package de.fhg.isst.cda.classes;

import de.fhg.isst.cda.choices.informant.AssignedEntity;
import de.fhg.isst.cda.enumerations.XEncounterParticipant;


// TODO: Auto-generated Javadoc
/**
 * The Class EncounterParticipant.
 */
public class EncounterParticipant   
{
	
	/** The type code. */
	private XEncounterParticipant typeCode;
	
	/** The time. */
	private String time;
	
	/** The assigned entity. */
	private AssignedEntity assignedEntity;
	
	/**
	 * Instantiates a new encounter participant.
	 */
	public EncounterParticipant() {
		this.typeCode = XEncounterParticipant.REF;
	}
	
	/**
	 * Gets the type code.
	 * 
	 * @return the type code
	 */
	public XEncounterParticipant getTypeCode() {
		return typeCode;
	}
	
	/**
	 * Sets the type code.
	 * 
	 * @param typeCode
	 *            the new type code
	 */
	public void setTypeCode(XEncounterParticipant typeCode) {
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