package de.fhg.isst.cda.classes;

import de.fhg.isst.cda.choices.informant.AssignedEntity;
import de.fhg.isst.cda.enumerations.ParticipationPhysicalPerformer;


// TODO: Auto-generated Javadoc
/**
 * The Class Performer2.
 */
public class Performer2   
{
	
	/** The type code. */
	private ParticipationPhysicalPerformer typeCode;
	
	/** The time. */
	private String time;
	
	/** The mode code. */
	private Code modeCode;
	
	/** The assigned entity. */
	private AssignedEntity assignedEntity;
	
	/**
	 * Instantiates a new performer2.
	 */
	public Performer2() {
		this.typeCode = ParticipationPhysicalPerformer.PRF;
	}

	/**
	 * Gets the type code.
	 * 
	 * @return the type code
	 */
	public ParticipationPhysicalPerformer getTypeCode() {
		return typeCode;
	}

	/**
	 * Sets the type code.
	 * 
	 * @param typeCode
	 *            the new type code
	 */
	public void setTypeCode(ParticipationPhysicalPerformer typeCode) {
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
	 * Gets the mode code.
	 * 
	 * @return the mode code
	 */
	public Code getModeCode() {
		return modeCode;
	}

	/**
	 * Sets the mode code.
	 * 
	 * @param modeCode
	 *            the new mode code
	 */
	public void setModeCode(Code modeCode) {
		this.modeCode = modeCode;
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