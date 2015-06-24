package de.fhg.isst.cda.choices.body;

import java.util.ArrayList;

import de.fhg.isst.cda.classes.Code;
import de.fhg.isst.cda.classes.Component3;
import de.fhg.isst.cda.classes.LanguageCode;

// TODO: Auto-generated Javadoc
/**
 * The Class StructuredBody.
 */
public class StructuredBody implements BodyChoice
{
	
	/** The class code. */
	private String classCode;
	
	/** The mood code. */
	private String moodCode;
	
	/** The confidentiality code. */
	private Code confidentialityCode;
	
	/** The language code. */
	private LanguageCode languageCode;
	
	/** The component3. */
	private ArrayList<Component3> component3;
	
	/**
	 * Instantiates a new structured body.
	 */
	public StructuredBody() {
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
	
	/**
	 * Gets the component3.
	 * 
	 * @return the component3
	 */
	public ArrayList<Component3> getComponent3() {
		if(this.component3 == null) {
			this.component3 = new ArrayList<Component3>();
		}
		return component3;
	}
	
	/**
	 * Sets the component3.
	 * 
	 * @param component3
	 *            the new component3
	 */
	public void setComponent3(ArrayList<Component3> component3) {
		this.component3 = component3;
	}
}