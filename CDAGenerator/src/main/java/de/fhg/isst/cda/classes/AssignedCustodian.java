package de.fhg.isst.cda.classes;

import de.fhg.isst.cda.classes.RepresentedCustodianOrganization;

// TODO: Auto-generated Javadoc
/**
 * The Class AssignedCustodian.
 */
public class AssignedCustodian   
{
    
    /** The represented custodian organization. */
    private RepresentedCustodianOrganization representedCustodianOrganization;
    
    /** The class code. */
    private String classCode;
	
	/** The null flavor. */
	private NullFlavor nullFlavor;
	
	/**
	 * Instantiates a new assigned custodian.
	 */
	public AssignedCustodian() {
		this.classCode = "ASSIGNED";
	}
	
	/**
	 * Gets the represented custodian organization.
	 * 
	 * @return the represented custodian organization
	 */
	public RepresentedCustodianOrganization getRepresentedCustodianOrganization() {
		return representedCustodianOrganization;
	}
	
	/**
	 * Sets the represented custodian organization.
	 * 
	 * @param representedCustodianOrganization
	 *            the new represented custodian organization
	 */
	public void setRepresentedCustodianOrganization(RepresentedCustodianOrganization representedCustodianOrganization) {
		this.representedCustodianOrganization = representedCustodianOrganization;
	}
	
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
	 * Gets the null flavor.
	 * 
	 * @return the null flavor
	 */
	public NullFlavor getNullFlavor() {
		return nullFlavor;
	}
	
	/**
	 * Sets the null flavor.
	 * 
	 * @param nullFlavor
	 *            the new null flavor
	 */
	public void setNullFlavor(NullFlavor nullFlavor) {
		this.nullFlavor = nullFlavor;
	}

}