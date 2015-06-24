package de.fhg.isst.cda.classes;

import de.fhg.isst.cda.choices.Person;

// TODO: Auto-generated Javadoc
/**
 * The Class MaintainedEntity.
 */
public class MaintainedEntity {
	
	/** The class code. */
	private String classCode;
	
	/** The effective time. */
	private String effectiveTime;
	
	/** The maintaining person. */
	private Person maintainingPerson;
	
	/**
	 * Gets the class code.
	 * 
	 * @return the class code
	 */
	public String getClassCode() {
		return classCode;
	}
	
	/**
	 * Sets the class code.
	 * 
	 * @param classCode
	 *            the new class code
	 */
	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}
	
	/**
	 * Gets the effective time.
	 * 
	 * @return the effective time
	 */
	public String getEffectiveTime() {
		return effectiveTime;
	}
	
	/**
	 * Sets the effective time.
	 * 
	 * @param effectiveTime
	 *            the new effective time
	 */
	public void setEffectiveTime(String effectiveTime) {
		this.effectiveTime = effectiveTime;
	}
	
	/**
	 * Gets the maintaining person.
	 * 
	 * @return the maintaining person
	 */
	public Person getMaintainingPerson() {
		return maintainingPerson;
	}
	
	/**
	 * Sets the maintaining person.
	 * 
	 * @param maintainingPerson
	 *            the new maintaining person
	 */
	public void setMaintainingPerson(Person maintainingPerson) {
		this.maintainingPerson = maintainingPerson;
	}
	
	
}
