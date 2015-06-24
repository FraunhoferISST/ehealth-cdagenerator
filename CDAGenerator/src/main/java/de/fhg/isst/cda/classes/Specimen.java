package de.fhg.isst.cda.classes;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class Specimen.
 */
public class Specimen   
{
	
	/** The type code. */
	private String typeCode;
	
	/** The specimen roles. */
	private ArrayList<SpecimenRole> specimenRoles;
	
	/**
	 * Instantiates a new specimen.
	 */
	public Specimen() {
		this.typeCode = "SPC";
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
	 * Gets the specimen roles.
	 * 
	 * @return the specimen roles
	 */
	public ArrayList<SpecimenRole> getSpecimenRoles() {
		if(this.specimenRoles == null) {
			this.specimenRoles = new ArrayList<SpecimenRole>();
		}
		return specimenRoles;
	}
	
	/**
	 * Sets the specimen roles.
	 * 
	 * @param specimenRoles
	 *            the new specimen roles
	 */
	public void setSpecimenRoles(ArrayList<SpecimenRole> specimenRoles) {
		this.specimenRoles = specimenRoles;
	}
	
}