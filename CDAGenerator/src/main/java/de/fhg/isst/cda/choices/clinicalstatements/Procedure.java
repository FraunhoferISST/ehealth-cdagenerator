package de.fhg.isst.cda.choices.clinicalstatements;

import java.util.ArrayList;

import de.fhg.isst.cda.classes.ClinicalStatement;
import de.fhg.isst.cda.classes.Code;
import de.fhg.isst.cda.classes.EffectiveTime;
import de.fhg.isst.cda.classes.ID;
import de.fhg.isst.cda.classes.LanguageCode;
import de.fhg.isst.cda.enumerations.StatusCode;
import de.fhg.isst.cda.enumerations.XDocumentProcedureMood;

// TODO: Auto-generated Javadoc
/**
 * The Class Procedure.
 */
public class Procedure extends ClinicalStatement {
	
	/** The class code. */
	private String classCode;
	
	/** The mood code. */
	private XDocumentProcedureMood moodCode;
	
	/** The ids. */
	private ArrayList<ID> ids;
	
	/** The code. */
	private Code code;
	
	/** The negation ind. */
	private boolean negationInd;
	
	/** The text. */
	private String text;
	
	/** The status code. */
	private StatusCode statusCode;
	
	/** The effective time. */
	private EffectiveTime effectiveTime;
	
	/** The priority code. */
	private Code priorityCode;
	
	/** The language code. */
	private LanguageCode languageCode;
	
	/** The method codes. */
	private ArrayList<Code> methodCodes;
	
	/** The approach site codes. */
	private ArrayList<Code> approachSiteCodes;
	
	/** The target site code. */
	private ArrayList<Code> targetSiteCode;

	
	/**
	 * Instantiates a new procedure.
	 */
	public Procedure() {
		this.classCode = "PROC";
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
	public XDocumentProcedureMood getMoodCode() {
		return moodCode;
	}

	/**
	 * Sets the mood code.
	 * 
	 * @param moodCode
	 *            the new mood code
	 */
	public void setMoodCode(XDocumentProcedureMood moodCode) {
		this.moodCode = moodCode;
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
	 * Checks if is negation ind.
	 * 
	 * @return true, if is negation ind
	 */
	public boolean isNegationInd() {
		return negationInd;
	}

	/**
	 * Sets the negation ind.
	 * 
	 * @param negationInd
	 *            the new negation ind
	 */
	public void setNegationInd(boolean negationInd) {
		this.negationInd = negationInd;
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

	/**
	 * Gets the language code.
	 * 
	 * @return the language code
	 */
	public LanguageCode getLanguageCode() {
		return languageCode;
	}

	/**
	 * Sets the language code.
	 * 
	 * @param languageCode
	 *            the new language code
	 */
	public void setLanguageCode(LanguageCode languageCode) {
		this.languageCode = languageCode;
	}

	/**
	 * Gets the method codes.
	 * 
	 * @return the method codes
	 */
	public ArrayList<Code> getMethodCodes() {
		if(this.methodCodes == null) {
			this.methodCodes = new ArrayList<Code>();
		}
		return methodCodes;
	}

	/**
	 * Sets the method codes.
	 * 
	 * @param methodCodes
	 *            the new method codes
	 */
	public void setMethodCodes(ArrayList<Code> methodCodes) {
		this.methodCodes = methodCodes;
	}

	/**
	 * Gets the approach site codes.
	 * 
	 * @return the approach site codes
	 */
	public ArrayList<Code> getApproachSiteCodes() {
		if(this.approachSiteCodes == null) {
			this.approachSiteCodes = new ArrayList<Code>();
		}
		return approachSiteCodes;
	}

	/**
	 * Sets the approach site codes.
	 * 
	 * @param approachSiteCodes
	 *            the new approach site codes
	 */
	public void setApproachSiteCodes(ArrayList<Code> approachSiteCodes) {
		this.approachSiteCodes = approachSiteCodes;
	}

	/**
	 * Gets the target site code.
	 * 
	 * @return the target site code
	 */
	public ArrayList<Code> getTargetSiteCode() {
		if(this.targetSiteCode == null) {
			this.targetSiteCode = new ArrayList<Code>();
		}
		return targetSiteCode;
	}

	/**
	 * Sets the target site code.
	 * 
	 * @param targetSiteCode
	 *            the new target site code
	 */
	public void setTargetSiteCode(ArrayList<Code> targetSiteCode) {
		this.targetSiteCode = targetSiteCode;
	}
}