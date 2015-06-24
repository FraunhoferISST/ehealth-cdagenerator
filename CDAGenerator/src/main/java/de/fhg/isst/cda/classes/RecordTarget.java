package de.fhg.isst.cda.classes;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class RecordTarget.
 */
public class RecordTarget   
{
	
	/** The type code. */
	private String typeCode;
	
	/** The context control code. */
	private String contextControlCode;
	
	/** The patient roles. */
	private ArrayList<PatientRole> patientRoles;
	
	/**
	 * Instantiates a new record target.
	 */
	public RecordTarget() {
		this.typeCode = "RCT";
		this.contextControlCode = "OP";
	}
	
	/**
	 * Gets the patient roles.
	 * 
	 * @return the patient roles
	 */
	public ArrayList<PatientRole> getPatientRoles() {
		if(patientRoles == null) {
			this.patientRoles = new ArrayList<>();
		}
		return patientRoles;
	}
	
	/**
	 * Sets the patient roles.
	 * 
	 * @param patientRoles
	 *            the new patient roles
	 */
	public void setPatientRoles(ArrayList<PatientRole> patientRoles) {
		this.patientRoles = patientRoles;
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
	 * Gets the context control code.
	 * 
	 * @return the context control code
	 */
	public String getContextControlCode() {
		return contextControlCode;
	}
	
	/**
	 * Sets the context control code.
	 * 
	 * @param contextControlCode
	 *            the new context control code
	 */
	public void setContextControlCode(String contextControlCode) {
		this.contextControlCode = contextControlCode;
	}
}