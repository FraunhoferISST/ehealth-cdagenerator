package de.fhg.isst.cda.classes;

import java.util.ArrayList;

import de.fhg.isst.cda.choices.Person;
import de.fhg.isst.cda.choices.guardian.Organization;

// TODO: Auto-generated Javadoc
/**
 * The Class Entity.
 */
public class Entity {
	
	/** The class code. */
	private String classCode;
	
	/** The determiner code. */
	private String determinerCode;
	
	/** The ids. */
	private ArrayList<ID> ids;
	
	/** The code. */
	private Code code;
	
	/** The addresses. */
	private ArrayList<Address> addresses;
	
	/** The telecoms. */
	private ArrayList<Telecom> telecoms;
	
	/** The assigned person. */
	private Person assignedPerson;
	
	/** The represented organization. */
	private Organization representedOrganization;
	
	/** The desc. */
	private String desc;

	/**
	 * Instantiates a new entity.
	 */
	public Entity() {
		this.classCode = "ENT";
		this.determinerCode = "INSTANCE";
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
	 * @param determinerCode
	 *            the new determiner code
	 */
	public void setDeterminerCode(String determinerCode) {
		this.determinerCode = determinerCode;
	}

	/**
	 * Gets the ids.
	 * 
	 * @return the ids
	 */
	public ArrayList<ID> getIds() {
		if (this.ids == null) {
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
		if (this.addresses == null) {
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
		if (this.telecoms == null) {
			this.telecoms = new ArrayList<>();
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
	 * Gets the assigned person.
	 * 
	 * @return the assigned person
	 */
	public Person getAssignedPerson() {
		return assignedPerson;
	}

	/**
	 * Sets the assigned person.
	 * 
	 * @param assignedPerson
	 *            the new assigned person
	 */
	public void setAssignedPerson(Person assignedPerson) {
		this.assignedPerson = assignedPerson;
	}

	/**
	 * Gets the represented organization.
	 * 
	 * @return the represented organization
	 */
	public Organization getRepresentedOrganization() {
		return representedOrganization;
	}

	/**
	 * Sets the represented organization.
	 * 
	 * @param representedOrganization
	 *            the new represented organization
	 */
	public void setRepresentedOrganization(Organization representedOrganization) {
		this.representedOrganization = representedOrganization;
	}

	/**
	 * Gets the desc.
	 * 
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * Sets the desc.
	 * 
	 * @param desc
	 *            the new desc
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
}