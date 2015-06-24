package de.fhg.isst.cda.classes;

import de.fhg.isst.cda.enumerations.EntityClassPlace;


// TODO: Auto-generated Javadoc
/**
 * The Class Place.
 */
public class Place {
	
	/** The class code. */
	private EntityClassPlace classCode;
	
	/** The determiner code. */
	private String determinerCode;
	
	/** The name. */
	private String name;
	
	/** The address. */
	private Address address;
	
	/**
	 * Instantiates a new place.
	 */
	public Place() {
		this.classCode = EntityClassPlace.PLC;
		this.determinerCode = "INSTANCE";
	}	
	
	/**
	 * Gets the class code.
	 * 
	 * @return the class code
	 */
	public EntityClassPlace getClassCode() {
		return classCode;
	}
	
	/**
	 * Sets the class code.
	 * 
	 * @param classCode
	 *            the new class code
	 */
	public void setClassCode(EntityClassPlace classCode) {
		this.classCode = classCode;
	}
	
	/**
	 * Gets the determiner code.
	 * 
	 * @return the determiner code
	 */
	public String getDeterminerCode() {
		return determinerCode;
	}
	
	/**
	 * Sets the determiner code.
	 * 
	 * @param string
	 *            the new determiner code
	 */
	public void setDeterminerCode(String string) {
		this.determinerCode = string;
	}
	
	/**
	 * Gets the name.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name.
	 * 
	 * @param name
	 *            the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the address.
	 * 
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	
	/**
	 * Sets the address.
	 * 
	 * @param address
	 *            the new address
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	
}