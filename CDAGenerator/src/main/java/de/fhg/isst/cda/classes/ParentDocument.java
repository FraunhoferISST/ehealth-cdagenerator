package de.fhg.isst.cda.classes;

import java.math.BigInteger;
import java.util.ArrayList;

import de.fhg.isst.cda.enumerations.ActClinicalDocument;

// TODO: Auto-generated Javadoc
/**
 * The Class ParentDocument.
 */
public class ParentDocument   
{
	
	/** The class code. */
	private ActClinicalDocument classCode;
	
	/** The mood code. */
	private String moodCode;
	
	/** The ids. */
	private ArrayList<ID> ids;
	
	/** The code. */
	private Code code;
	
	/** The text. */
	private String text;
	
	/** The set id. */
	private ID setId;
	
	/** The version number. */
	private BigInteger versionNumber;
	
	/**
	 * Instantiates a new parent document.
	 */
	public ParentDocument() {
		this.classCode = ActClinicalDocument.DOCCLIN;
		this.moodCode = "EVN";
	}
	
	/**
	 * Gets the class code.
	 * 
	 * @return the class code
	 */
	public ActClinicalDocument getClassCode() {
		return classCode;
	}
	
	/**
	 * Sets the class code.
	 * 
	 * @param classCode
	 *            the new class code
	 */
	public void setClassCode(ActClinicalDocument classCode) {
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
	 * Gets the sets the id.
	 * 
	 * @return the sets the id
	 */
	public ID getSetId() {
		return setId;
	}
	
	/**
	 * Sets the sets the id.
	 * 
	 * @param setId
	 *            the new sets the id
	 */
	public void setSetId(ID setId) {
		this.setId = setId;
	}
	
	/**
	 * Gets the version number.
	 * 
	 * @return the version number
	 */
	public BigInteger getVersionNumber() {
		return versionNumber;
	}
	
	/**
	 * Sets the version number.
	 * 
	 * @param versionNumber
	 *            the new version number
	 */
	public void setVersionNumber(BigInteger versionNumber) {
		this.versionNumber = versionNumber;
	}
}