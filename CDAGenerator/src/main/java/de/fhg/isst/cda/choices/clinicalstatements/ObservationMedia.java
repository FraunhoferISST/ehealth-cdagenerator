package de.fhg.isst.cda.choices.clinicalstatements;

import java.util.ArrayList;

import de.fhg.isst.cda.classes.ClinicalStatement;
import de.fhg.isst.cda.classes.ID;
import de.fhg.isst.cda.classes.LanguageCode;

// TODO: Auto-generated Javadoc
/**
 * The Class ObservationMedia.
 */
public class ObservationMedia extends ClinicalStatement {
	
	/** The class code. */
	private String classCode;
	
	/** The mood code. */
	private String moodCode;
	
	/** The ids. */
	private ArrayList<ID> ids;
	
	/** The language code. */
	private LanguageCode languageCode;
	
	/** The value. */
	private String value;

	/**
	 * Instantiates a new observation media.
	 */
	public ObservationMedia() {
		this.classCode = "OBS";
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
}