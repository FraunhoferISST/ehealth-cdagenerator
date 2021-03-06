package de.fhg.isst.cda.classes;

import java.util.ArrayList;

import de.fhg.isst.cda.choices.Person;
import de.fhg.isst.cda.choices.guardian.Organization;
// TODO: Auto-generated Javadoc

/**
 * The Class AssociatedEntity.
 */
public class AssociatedEntity {

	/** The class code. */
	private String classCode;
	
	/** The ids. */
	private ArrayList<ID> ids;
	
	/** The code. */
	private Code code;
	
	/** The addresses. */
	private ArrayList<Address> addresses;
	
	/** The telecoms. */
	private ArrayList<Telecom> telecoms;
	
	/** The associated person. */
	private Person associatedPerson;
	
	/** The scoping organization. */
	private Organization scopingOrganization;
	
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
	 * Gets the addresses.
	 * 
	 * @return the addresses
	 */
	public ArrayList<Address> getAddresses() {
		if(this.addresses == null) {
			this.addresses = new ArrayList<Address>();
		}
		return addresses;
	}
	
	/**
	 * Sets the addresses.
	 * 
	 * @param addresses
	 *            the new addresses
	 */
	public void setAddresses(ArrayList<Address> addresses) {
		this.addresses = addresses;
	}
	
	/**
	 * Gets the telecoms.
	 * 
	 * @return the telecoms
	 */
	public ArrayList<Telecom> getTelecoms() {
		if(this.telecoms == null) {
			this.telecoms = new ArrayList<Telecom>();
		}
		return telecoms;
	}
	
	/**
	 * Sets the telecoms.
	 * 
	 * @param telecoms
	 *            the new telecoms
	 */
	public void setTelecoms(ArrayList<Telecom> telecoms) {
		this.telecoms = telecoms;
	}
	
	/**
	 * Gets the associated person.
	 * 
	 * @return the associated person
	 */
	public Person getAssociatedPerson() {
		return associatedPerson;
	}
	
	/**
	 * Sets the associated person.
	 * 
	 * @param associatedPerson
	 *            the new associated person
	 */
	public void setAssociatedPerson(Person associatedPerson) {
		this.associatedPerson = associatedPerson;
	}
	
	/**
	 * Gets the scoping organization.
	 * 
	 * @return the scoping organization
	 */
	public Organization getScopingOrganization() {
		return scopingOrganization;
	}
	
	/**
	 * Sets the scoping organization.
	 * 
	 * @param scopingOrganization
	 *            the new scoping organization
	 */
	public void setScopingOrganization(Organization scopingOrganization) {
		this.scopingOrganization = scopingOrganization;
	}
}