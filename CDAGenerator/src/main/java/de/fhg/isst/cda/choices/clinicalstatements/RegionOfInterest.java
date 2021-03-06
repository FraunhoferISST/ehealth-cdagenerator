package de.fhg.isst.cda.choices.clinicalstatements;

import java.math.BigInteger;
import java.util.ArrayList;

import de.fhg.isst.cda.classes.ClinicalStatement;
import de.fhg.isst.cda.classes.Code;
import de.fhg.isst.cda.classes.ID;

// TODO: Auto-generated Javadoc
/**
 * The Class RegionOfInterest.
 */
public class RegionOfInterest extends ClinicalStatement {
	
	/** The class code. */
	private String classCode;
	
	/** The mood code. */
	private String moodCode;
	
	/** The ids. */
	private ArrayList<ID> ids;
	
	/** The code. */
	private Code code;
	
	/** The values. */
	private ArrayList<BigInteger> values;

	/**
	 * Instantiates a new region of interest.
	 */
	public RegionOfInterest() {
		this.classCode = "ROIOVL";
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
	 * Gets the values.
	 * 
	 * @return the values
	 */
	public ArrayList<BigInteger> getValues() {
		if (this.values == null) {
			this.values = new ArrayList<BigInteger>();
		}
		return values;
	}

	/**
	 * Sets the values.
	 * 
	 * @param values
	 *            the new values
	 */
	public void setValues(ArrayList<BigInteger> values) {
		this.values = values;
	}

}