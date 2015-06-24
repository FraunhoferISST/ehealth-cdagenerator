package de.fhg.isst.cda.choices.body;

import de.fhg.isst.cda.classes.Code;
import de.fhg.isst.cda.classes.LanguageCode;

// TODO: Auto-generated Javadoc
/**
 * The Class NonXMLBody.
 */
public class NonXMLBody implements BodyChoice   
{
	
	/** The class code. */
	private String classCode;
	
	/** The mood code. */
	private String moodCode;
	
	/** The text. */
	private String text;
	
	/** The confidentiality code. */
	private Code confidentialityCode;
	
	/** The language code. */
	private LanguageCode languageCode;
	
	/**
	 * Instantiates a new non xml body.
	 */
	public NonXMLBody() {
		this.classCode = "DOCBODY";
		this.moodCode = "EVN";
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
	 * Gets the confidentiality code.
	 * 
	 * @return the confidentiality code
	 */
	public Code getConfidentialityCode() {
		return confidentialityCode;
	}
	
	/**
	 * Sets the confidentiality code.
	 * 
	 * @param confidentialityCode
	 *            the new confidentiality code
	 */
	public void setConfidentialityCode(Code confidentialityCode) {
		this.confidentialityCode = confidentialityCode;
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
}