package de.fhg.isst.cda.classes;

import java.util.ArrayList;

import de.fhg.isst.cda.enumerations.XDocumentSubject;

// TODO: Auto-generated Javadoc
/**
 * The Class RelatedSubject.
 */
public class RelatedSubject   
{
	
	/** The class code. */
	private XDocumentSubject classCode;
	
	/** The Code. */
	private Code Code;
	
	/** The addrs. */
	private ArrayList<Address> addrs;
	
	/** The telecoms. */
	private ArrayList<Telecom> telecoms;
	
	/** The subject person. */
	private SubjectPerson subjectPerson;
	
	/**
	 * Instantiates a new related subject.
	 */
	public RelatedSubject() {
		this.classCode = XDocumentSubject.PRS;
	}
	
	/**
	 * Gets the class code.
	 * 
	 * @return the class code
	 */
	public XDocumentSubject getClassCode() {
		return classCode;
	}
	
	/**
	 * Sets the class code.
	 * 
	 * @param classCode
	 *            the new class code
	 */
	public void setClassCode(XDocumentSubject classCode) {
		this.classCode = classCode;
	}
	
	/**
	 * Gets the code.
	 * 
	 * @return the code
	 */
	public Code getCode() {
		return Code;
	}
	
	/**
	 * Sets the code.
	 * 
	 * @param code
	 *            the new code
	 */
	public void setCode(Code code) {
		Code = code;
	}
	
	/**
	 * Gets the addrs.
	 * 
	 * @return the addrs
	 */
	public ArrayList<Address> getAddrs() {
		if(this.addrs == null) {
			this.addrs = new ArrayList<Address>();
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
	 * Gets the subject person.
	 * 
	 * @return the subject person
	 */
	public SubjectPerson getSubjectPerson() {
		return subjectPerson;
	}
	
	/**
	 * Sets the subject person.
	 * 
	 * @param subject
	 *            the new subject person
	 */
	public void setSubjectPerson(SubjectPerson subject) {
		this.subjectPerson = subject;
	}
}