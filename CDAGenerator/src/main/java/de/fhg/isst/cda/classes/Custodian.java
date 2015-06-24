package de.fhg.isst.cda.classes;

import de.fhg.isst.cda.classes.AssignedCustodian;

// TODO: Auto-generated Javadoc
/**
 * The Class Custodian.
 */
public class Custodian   
{
	
	/** The type code. */
	private String typeCode;
	
	/** The assigned custodian. */
	private AssignedCustodian assignedCustodian;
	
	/**
	 * Instantiates a new custodian.
	 */
	public Custodian() {
		this.typeCode = "CST";
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
	 * Gets the assigned custodian.
	 * 
	 * @return the assigned custodian
	 */
	public AssignedCustodian getAssignedCustodian() {
		return assignedCustodian;
	}
	
	/**
	 * Sets the assigned custodian.
	 * 
	 * @param assignedCustodian
	 *            the new assigned custodian
	 */
	public void setAssignedCustodian(AssignedCustodian assignedCustodian) {
		this.assignedCustodian = assignedCustodian;
	}
}