package de.fhg.isst.cda.classes;

import java.util.ArrayList;

import de.fhg.isst.cda.choices.Person;
import de.fhg.isst.cda.choices.guardian.Organization;
import de.fhg.isst.cda.enumerations.XInformationRecipientRole;

// TODO: Auto-generated Javadoc
/**
 * The Class IntendedRecipient.
 */
public class IntendedRecipient {
	
	/**
	 * Instantiates a new intended recipient.
	 */
	public IntendedRecipient() {
		this.classCode = XInformationRecipientRole.ASSIGNED;
	}
	/** The class code. */
	private XInformationRecipientRole classCode;
	
	/** The ids. */
	private ArrayList<ID> ids;
	
	/** The addresses. */
	private ArrayList<Address> addresses;
	
	/** The telecoms. */
	private ArrayList<Telecom> telecoms;
	
	/** The information recipient. */
	private Person informationRecipient;
	
	/** The received organization. */
	private Organization receivedOrganization;
	
	/**
	 * Gets the class code.
	 * 
	 * @return the class code
	 */
	public XInformationRecipientRole getClassCode() {
		return classCode;
	}
	
	/**
	 * Sets the class code.
	 * 
	 * @param classCode
	 *            the new class code
	 */
	public void setClassCode(XInformationRecipientRole classCode) {
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
	 * Gets the addresses.
	 * 
	 * @return the addresses
	 */
	public ArrayList<Address> getAddresses() {
		if(this.addresses == null) {
			this.addresses = new  ArrayList<Address>();
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
	 * Gets the information recipient.
	 * 
	 * @return the information recipient
	 */
	public Person getInformationRecipient() {
		return informationRecipient;
	}
	
	/**
	 * Sets the information recipient.
	 * 
	 * @param informationRecipient
	 *            the new information recipient
	 */
	public void setInformationRecipient(Person informationRecipient) {
		this.informationRecipient = informationRecipient;
	}
	
	/**
	 * Gets the received organization.
	 * 
	 * @return the received organization
	 */
	public Organization getReceivedOrganization() {
		return receivedOrganization;
	}
	
	/**
	 * Sets the received organization.
	 * 
	 * @param receivedOrganization
	 *            the new received organization
	 */
	public void setReceivedOrganization(Organization receivedOrganization) {
		this.receivedOrganization = receivedOrganization;
	}
}