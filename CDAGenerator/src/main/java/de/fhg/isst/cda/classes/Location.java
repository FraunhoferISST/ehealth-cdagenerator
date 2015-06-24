package de.fhg.isst.cda.classes;

import de.fhg.isst.cda.classes.HealthCareFacility;

// TODO: Auto-generated Javadoc
/**
 * The Class Location.
 */
public class Location   
{
	
	/** The type code. */
	private ParticipationTargetLocation typeCode;
	
	/** The health care facility. */
	private HealthCareFacility healthCareFacility;
	
	/**
	 * Instantiates a new location.
	 */
	public Location() {
		this.typeCode = ParticipationTargetLocation.LOC;
	}
	
	/**
	 * Gets the type code.
	 * 
	 * @return the type code
	 */
	public ParticipationTargetLocation getTypeCode() {
		return typeCode;
	}
	
	/**
	 * Sets the type code.
	 * 
	 * @param typeCode
	 *            the new type code
	 */
	public void setTypeCode(ParticipationTargetLocation typeCode) {
		this.typeCode = typeCode;
	}
	
	/**
	 * Gets the health care facility.
	 * 
	 * @return the health care facility
	 */
	public HealthCareFacility getHealthCareFacility() {
		return healthCareFacility;
	}
	
	/**
	 * Sets the health care facility.
	 * 
	 * @param healthCareFacility
	 *            the new health care facility
	 */
	public void setHealthCareFacility(HealthCareFacility healthCareFacility) {
		this.healthCareFacility = healthCareFacility;
	}
}