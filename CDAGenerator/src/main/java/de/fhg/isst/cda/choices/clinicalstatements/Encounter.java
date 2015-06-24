package de.fhg.isst.cda.choices.clinicalstatements;

import java.util.ArrayList;

import de.fhg.isst.cda.classes.ClinicalStatement;
import de.fhg.isst.cda.classes.Code;
import de.fhg.isst.cda.classes.EffectiveTime;
import de.fhg.isst.cda.classes.ID;
import de.fhg.isst.cda.enumerations.StatusCode;
import de.fhg.isst.cda.enumerations.XDocumentEncounterMood;

// TODO: Auto-generated Javadoc
/**
 * The Class Encounter.
 */
public class Encounter extends ClinicalStatement{
	
	/** The class code. */
	private String classCode;
	
	/** The mood code. */
	private XDocumentEncounterMood moodCode;
	
	/** The ids. */
	private ArrayList<ID> ids;
	
	/** The code. */
	private Code code;
	
	/** The text. */
	private String text;
	
	/** The status code. */
	private StatusCode statusCode;
	
	/** The effective time. */
	private EffectiveTime effectiveTime;
	
	/** The priority code. */
	private Code priorityCode;

	/**
	 * Instantiates a new encounter.
	 */
	public Encounter() {
		this.classCode = "ENC";
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
	 * Gets the mood code.
	 * 
	 * @return the mood code
	 */
	public XDocumentEncounterMood getMoodCode() {
		return moodCode;
	}

	/**
	 * Sets the mood code.
	 * 
	 * @param moodCode
	 *            the new mood code
	 */
	public void setMoodCode(XDocumentEncounterMood moodCode) {
		this.moodCode = moodCode;
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
	 * Gets the text.
	 * 
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * Sets the text.
	 * 
	 * @param text
	 *            the new text
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * Gets the status code.
	 * 
	 * @return the status code
	 */
	public StatusCode getStatusCode() {
		return statusCode;
	}

	/**
	 * Sets the status code.
	 * 
	 * @param active
	 *            the new status code
	 */
	public void setStatusCode(StatusCode active) {
		this.statusCode = active;
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
	 * Gets the priority code.
	 * 
	 * @return the priority code
	 */
	public Code getPriorityCode() {
		return priorityCode;
	}

	/**
	 * Sets the priority code.
	 * 
	 * @param priorityCode
	 *            the new priority code
	 */
	public void setPriorityCode(Code priorityCode) {
		this.priorityCode = priorityCode;
	}
}