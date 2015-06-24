package de.fhg.isst.cda.classes;

import java.util.ArrayList;

import de.fhg.isst.cda.choices.guardian.Organization;

// TODO: Auto-generated Javadoc
/**
 * The Class HealthCareFacility.
 */
public class HealthCareFacility   
{
	
	/** The class code. */
	private RoleClassServiceDeliveryLocation classCode;
	
	/** The ids. */
	private ArrayList<ID> ids;
	
	/** The code. */
	private Code code;
	
	/** The location. */
	private Place location;
	
	/** The service provider organization. */
	private Organization serviceProviderOrganization;
	
	/**
	 * Instantiates a new health care facility.
	 */
	public HealthCareFacility() {
		this.classCode = RoleClassServiceDeliveryLocation.SDLOC;
	}
	
	/**
	 * Gets the class code.
	 * 
	 * @return the class code
	 */
	public RoleClassServiceDeliveryLocation getClassCode() {
		return classCode;
	}
	
	/**
	 * Sets the class code.
	 * 
	 * @param classCode
	 *            the new class code
	 */
	public void setClassCode(RoleClassServiceDeliveryLocation classCode) {
		this.classCode = classCode;
	}
	
	/**
	 * Gets the ids.
	 * 
	 * @return the ids
	 */
	public ArrayList<ID> getIds() {
		if(this.ids == null) {
			this.ids = new ArrayList<ID>();
		}
		return ids;
	}
	
	/**
	 * Sets the ids.
	 * 
	 * @param ids
	 *            the new ids
	 */
	public void setIds(ArrayList<ID> ids) {
		this.ids = ids;
	}
	
	/**
	 * Gets the code.
	 * 
	 * @return the code
	 */
	public Code getCode() {
		return code;
	}
	
	/**
	 * Sets the code.
	 * 
	 * @param code
	 *            the new code
	 */
	public void setCode(Code code) {
		this.code = code;
	}
	
	/**
	 * Gets the location.
	 * 
	 * @return the location
	 */
	public Place getLocation() {
		return location;
	}
	
	/**
	 * Sets the location.
	 * 
	 * @param location
	 *            the new location
	 */
	public void setLocation(Place location) {
		this.location = location;
	}
	
	/**
	 * Gets the service provider organization.
	 * 
	 * @return the service provider organization
	 */
	public Organization getServiceProviderOrganization() {
		return serviceProviderOrganization;
	}
	
	/**
	 * Sets the service provider organization.
	 * 
	 * @param serviceProviderOrganization
	 *            the new service provider organization
	 */
	public void setServiceProviderOrganization(Organization serviceProviderOrganization) {
		this.serviceProviderOrganization = serviceProviderOrganization;
	}
}