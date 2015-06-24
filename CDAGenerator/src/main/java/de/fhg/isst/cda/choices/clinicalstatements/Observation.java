package de.fhg.isst.cda.choices.clinicalstatements;

import java.math.BigInteger;
import java.util.ArrayList;

import de.fhg.isst.cda.classes.ClinicalStatement;
import de.fhg.isst.cda.classes.Code;
import de.fhg.isst.cda.classes.EffectiveTime;
import de.fhg.isst.cda.classes.ID;
import de.fhg.isst.cda.classes.LanguageCode;
import de.fhg.isst.cda.enumerations.StatusCode;
import de.fhg.isst.cda.enumerations.XActMoodDocumentObservation;

// TODO: Auto-generated Javadoc
/**
 * The Class Observation.
 */
public class Observation extends ClinicalStatement {
	
	/** The class code. */
	private String classCode;
	
	/** The mood code. */
	private XActMoodDocumentObservation moodCode;
	
	/** The ids. */
	private ArrayList<ID> ids;
	
	/** The code. */
	private Code code;
	
	/** The negation ind. */
	private boolean negationInd;
	
	/** The derivation expr. */
	private String derivationExpr;
	
	/** The text. */
	private String text;
	
	/** The status code. */
	private StatusCode statusCode;
	
	/** The effective time. */
	private EffectiveTime effectiveTime;
	
	/** The priority code. */
	private Code priorityCode;
	
	/** The repeat number. */
	private BigInteger repeatNumber;
	
	/** The language code. */
	private LanguageCode languageCode;
	
	/** The values. */
	private Object value;

	/** The interpretation codes. */
	private ArrayList<Code> interpretationCodes;
	
	/** The method codes. */
	private ArrayList<Code> methodCodes;
	
	/** The target site codes. */
	private ArrayList<Code> targetSiteCodes;
	
	/** The reference ranges. */
	private ArrayList<ReferenceRange> referenceRanges;

	/**
	 * Instantiates a new observation.
	 */
	public Observation() {
		this.classCode = "OBS";
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
	public XActMoodDocumentObservation getMoodCode() {
		return moodCode;
	}
	
	/**
	 * Sets the mood code.
	 * 
	 * @param moodCode
	 *            the new mood code
	 */
	public void setMoodCode(XActMoodDocumentObservation moodCode) {
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
	 * Gets the derivation expr.
	 * 
	 * @return the derivation expr
	 */
	public String getDerivationExpr() {
		return derivationExpr;
	}
	
	/**
	 * Sets the derivation expr.
	 * 
	 * @param derivationExpr
	 *            the new derivation expr
	 */
	public void setDerivationExpr(String derivationExpr) {
		this.derivationExpr = derivationExpr;
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
	 * Gets the repeat number.
	 * 
	 * @return the repeat number
	 */
	public BigInteger getRepeatNumber() {
		return repeatNumber;
	}
	
	/**
	 * Sets the repeat number.
	 * 
	 * @param repeatNumber
	 *            the new repeat number
	 */
	public void setRepeatNumber(BigInteger repeatNumber) {
		this.repeatNumber = repeatNumber;
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
	 * Gets the interpretation codes.
	 * 
	 * @return the interpretation codes
	 */
	public ArrayList<Code> getInterpretationCodes() {
		if(this.interpretationCodes == null) {
			this.interpretationCodes = new ArrayList<Code>();
		}
		return interpretationCodes;
	}
	
	/**
	 * Sets the interpretation codes.
	 * 
	 * @param interpretationCodes
	 *            the new interpretation codes
	 */
	public void setInterpretationCodes(ArrayList<Code> interpretationCodes) {
		this.interpretationCodes = interpretationCodes;
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
	 * Gets the target site codes.
	 * 
	 * @return the target site codes
	 */
	public ArrayList<Code> getTargetSiteCodes() {
		if(this.targetSiteCodes == null) {
			this.targetSiteCodes = new ArrayList<Code>();
		}
		return targetSiteCodes;
	}
	
	/**
	 * Sets the target site codes.
	 * 
	 * @param targetSiteCodes
	 *            the new target site codes
	 */
	public void setTargetSiteCodes(ArrayList<Code> targetSiteCodes) {
		this.targetSiteCodes = targetSiteCodes;
	}
	
	/**
	 * Gets the reference ranges.
	 * 
	 * @return the reference ranges
	 */
	public ArrayList<ReferenceRange> getReferenceRanges() {
		if(this.referenceRanges == null) {
			this.referenceRanges = new ArrayList<ReferenceRange>();
		}
		return referenceRanges;
	}
	
	/**
	 * Sets the reference ranges.
	 * 
	 * @param referenceRanges
	 *            the new reference ranges
	 */
	public void setReferenceRanges(ArrayList<ReferenceRange> referenceRanges) {
		this.referenceRanges = referenceRanges;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
}