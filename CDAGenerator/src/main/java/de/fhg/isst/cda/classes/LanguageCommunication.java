package de.fhg.isst.cda.classes;

import de.fhg.isst.cda.choices.clinicalstatements.BL;

// TODO: Auto-generated Javadoc
/**
 * The Class LanguageCommunication.
 */
public class LanguageCommunication{
	
	/** The language code. */
	private LanguageCode languageCode;
	
	/** The mode code. */
	private Code modeCode;
	
	/** The proficiency level code. */
	private Code proficiencyLevelCode;
	
	/** The preference ind. */
	private BL preferenceInd;
	
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
	 * Gets the mode code.
	 * 
	 * @return the mode code
	 */
	public Code getModeCode() {
		return modeCode;
	}
	
	/**
	 * Sets the mode code.
	 * 
	 * @param modeCode
	 *            the new mode code
	 */
	public void setModeCode(Code modeCode) {
		this.modeCode = modeCode;
	}
	
	/**
	 * Gets the proficiency level code.
	 * 
	 * @return the proficiency level code
	 */
	public Code getProficiencyLevelCode() {
		return proficiencyLevelCode;
	}
	
	/**
	 * Sets the proficiency level code.
	 * 
	 * @param proficiencyLevelCode
	 *            the new proficiency level code
	 */
	public void setProficiencyLevelCode(Code proficiencyLevelCode) {
		this.proficiencyLevelCode = proficiencyLevelCode;
	}
	
	/**
	 * Gets the preference ind.
	 * 
	 * @return the preference ind
	 */
	public BL getPreferenceInd() {
		return preferenceInd;
	}
	
	/**
	 * Sets the preference ind.
	 * 
	 * @param preferenceInd
	 *            the new preference ind
	 */
	public void setPreferenceInd(BL preferenceInd) {
		this.preferenceInd = preferenceInd;
	}
	
	
}
