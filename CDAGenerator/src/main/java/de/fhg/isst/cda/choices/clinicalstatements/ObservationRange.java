package de.fhg.isst.cda.choices.clinicalstatements;

import de.fhg.isst.cda.classes.Code;

// TODO: Auto-generated Javadoc
/**
 * The Class ObservationRange.
 */
public class ObservationRange   
{
	
	/** The class code. */
	private String classCode;
	
	/** The mood code. */
	private String moodCode;
	
	/** The code. */
	private Code code;
	
	/** The text. */
	private String text;
	
	/** The value. */
	private String value;
	
	/** The interpretation code. */
	private Code interpretationCode;
	
	/**
	 * Instantiates a new observation range.
	 */
	public ObservationRange() {
		this.classCode = "OBS";
		this.moodCode = "EVN.CRT";
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
	public String getMoodCode() {
		return moodCode;
	}
	
	/**
	 * Sets the mood code.
	 * 
	 * @param moodCode
	 *            the new mood code
	 */
	public void setMoodCode(String moodCode) {
		this.moodCode = moodCode;
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
	 * Gets the value.
	 * 
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	
	/**
	 * Sets the value.
	 * 
	 * @param value
	 *            the new value
	 */
	public void setValue(String value) {
		this.value = value;
	}
	
	/**
	 * Gets the interpretation code.
	 * 
	 * @return the interpretation code
	 */
	public Code getInterpretationCode() {
		return interpretationCode;
	}
	
	/**
	 * Sets the interpretation code.
	 * 
	 * @param interpretationCode
	 *            the new interpretation code
	 */
	public void setInterpretationCode(Code interpretationCode) {
		this.interpretationCode = interpretationCode;
	}
}