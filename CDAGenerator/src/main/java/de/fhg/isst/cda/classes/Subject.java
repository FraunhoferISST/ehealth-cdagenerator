package de.fhg.isst.cda.classes;

import de.fhg.isst.cda.enumerations.ParticipationTargetSubject;

// TODO: Auto-generated Javadoc
/**
 * The Class Subject.
 */
public class Subject   
{
	
	/** The type code. */
	private ParticipationTargetSubject typeCode;
	
	/** The context control code. */
	private String contextControlCode;
	
	/** The awareness code. */
	private Code awarenessCode;
	
	/** The related subject. */
	private RelatedSubject relatedSubject;
	
	/** The subject. */
	private Subject subject;
	
	
	/**
	 * Instantiates a new subject.
	 */
	public Subject() {
		this.typeCode = ParticipationTargetSubject.SBJ;
		this.contextControlCode = "OP";
	}
	
	/**
	 * Gets the type code.
	 * 
	 * @return the type code
	 */
	public ParticipationTargetSubject getTypeCode() {
		return typeCode;
	}
	
	/**
	 * Sets the type code.
	 * 
	 * @param typeCode
	 *            the new type code
	 */
	public void setTypeCode(ParticipationTargetSubject typeCode) {
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
	
	/**
	 * Gets the awareness code.
	 * 
	 * @return the awareness code
	 */
	public Code getAwarenessCode() {
		return awarenessCode;
	}
	
	/**
	 * Sets the awareness code.
	 * 
	 * @param awarenessCode
	 *            the new awareness code
	 */
	public void setAwarenessCode(Code awarenessCode) {
		this.awarenessCode = awarenessCode;
	}

	/**
	 * Gets the related subject.
	 * 
	 * @return the related subject
	 */
	public RelatedSubject getRelatedSubject() {
		return relatedSubject;
	}

	/**
	 * Sets the related subject.
	 * 
	 * @param relatedSubject
	 *            the new related subject
	 */
	public void setRelatedSubject(RelatedSubject relatedSubject) {
		this.relatedSubject = relatedSubject;
	}

	/**
	 * Gets the subject.
	 * 
	 * @return the subject
	 */
	public Subject getSubject() {
		return subject;
	}

	/**
	 * Sets the subject.
	 * 
	 * @param subject
	 *            the new subject
	 */
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
}


