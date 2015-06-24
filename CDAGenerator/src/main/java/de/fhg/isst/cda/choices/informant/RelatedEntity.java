package de.fhg.isst.cda.choices.informant;

import java.util.ArrayList;

import de.fhg.isst.cda.choices.Person;
import de.fhg.isst.cda.classes.Address;
import de.fhg.isst.cda.classes.Code;
import de.fhg.isst.cda.classes.EffectiveTime;
import de.fhg.isst.cda.classes.Telecom;

// TODO: Auto-generated Javadoc
/**
 * The Class RelatedEntity.
 */
public class RelatedEntity implements InformantChoice
{
    
    /** The class code. */
//    private Code classCode;
    private String classCode;
    
    /** The code. */
    private Code code;
    
    /** The addresses. */
    private ArrayList<Address> addresses;
    
    /** The telecoms. */
    private ArrayList<Telecom> telecoms;
    
    /** The effective time. */
    private EffectiveTime effectiveTime;
    
    /** The related person. */
    private Person relatedPerson;
	
	/**
	 * Gets the class code.
	 * 
	 * @return the class code
	 */
	public String getClassCode() {
		return classCode;
	}
//	public Code getClassCode() {
//		return classCode;
//	}
	
	/**
	 * Sets the class code.
	 * 
	 * @param classCode
	 *            the new class code
	 */
	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}
//	public void setClassCode(Code classCode) {
//		this.classCode = classCode;
//	}
	
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
	 * Gets the effective time.
	 * 
	 * @return the effective time
	 */
	public EffectiveTime getEffectiveTime() {
		return effectiveTime;
	}
	
	/**
	 * Sets the effective time.
	 * 
	 * @param effectiveTime
	 *            the new effective time
	 */
	public void setEffectiveTime(EffectiveTime effectiveTime) {
		this.effectiveTime = effectiveTime;
	}
	
	/**
	 * Gets the related person.
	 * 
	 * @return the related person
	 */
	public Person getRelatedPerson() {
		return relatedPerson;
	}
	
	/**
	 * Sets the related person.
	 * 
	 * @param relatedPerson
	 *            the new related person
	 */
	public void setRelatedPerson(Person relatedPerson) {
		this.relatedPerson = relatedPerson;
	}
    
    
}


