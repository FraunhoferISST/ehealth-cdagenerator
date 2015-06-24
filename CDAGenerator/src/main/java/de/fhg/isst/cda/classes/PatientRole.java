package de.fhg.isst.cda.classes;

import java.util.ArrayList;

import de.fhg.isst.cda.choices.guardian.Organization;

// TODO: Auto-generated Javadoc
/**
 * The Class PatientRole.
 */
public class PatientRole {

	/** The class code. */
	private String classCode;

	/** The ids. */
	private ArrayList<ID> ids;

	/** The addrs. */
	private ArrayList<Address> addrs;

	/** The telecoms. */
	private ArrayList<Telecom> telecoms;

	/** The organization. */
	private Organization organization;

	/** The patient. */
	private Patient patient;

	/** The language communications. */
	private ArrayList<LanguageCommunication> languageCommunications;

	/**
	 * Instantiates a new patient role.
	 */
	public PatientRole() {
		this.classCode = "PAT";
	}

	/**
	 * Gets the ids.
	 * 
	 * @return the ids
	 */
	public ArrayList<ID> getIds() {
		if (this.ids == null) {
			this.ids = new ArrayList<>();
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
	 * Gets the addrs.
	 * 
	 * @return the addrs
	 */
	public ArrayList<Address> getAddrs() {
		if (this.addrs == null) {
			this.addrs = new ArrayList<>();
		}
		return addrs;
	}

	/**
	 * Sets the addrs.
	 * 
	 * @param addrs
	 *            the new addrs
	 */
	public void setAddrs(ArrayList<Address> addrs) {
		this.addrs = addrs;
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
	 * Gets the organization.
	 * 
	 * @return the organization
	 */
	public Organization getOrganization() {
		return organization;
	}

	/**
	 * Sets the organization.
	 * 
	 * @param organization
	 *            the new organization
	 */
	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	/**
	 * Gets the language communications.
	 * 
	 * @return the language communications
	 */
	public ArrayList<LanguageCommunication> getLanguageCommunications() {
		if (this.languageCommunications == null) {
			this.languageCommunications = new ArrayList<LanguageCommunication>();
		}
		return languageCommunications;
	}

	/**
	 * Sets the language communications.
	 * 
	 * @param languageCommunications
	 *            the new language communications
	 */
	public void setLanguageCommunications(ArrayList<LanguageCommunication> languageCommunications) {
		this.languageCommunications = languageCommunications;
	}

	/**
	 * Gets the patient.
	 * 
	 * @return the patient
	 */
	public Patient getPatient() {
		return patient;
	}

	/**
	 * Sets the patient.
	 * 
	 * @param patient
	 *            the new patient
	 */
	public void setPatient(Patient patient) {
		this.patient = patient;
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

}