package de.fhg.isst.cda.choices.drugorothermaterial;

import de.fhg.isst.cda.classes.Code;
import de.fhg.isst.cda.enumerations.EntityDeterminerDetermined;

// TODO: Auto-generated Javadoc
/**
 * The Class LabeledDrug.
 */
public class LabeledDrug implements DrugOrOtherMaterialChoice
{
	
	/** The class code. */
	private String classCode;
	
	/** The determiner code. */
	private EntityDeterminerDetermined determinerCode;
	
	/** The code. */
	private Code code;
	
	/** The name. */
	private String name;
	
	/**
	 * Instantiates a new labeled drug.
	 */
	public LabeledDrug() {
		this.classCode = "MMAT";
		this.determinerCode = EntityDeterminerDetermined.KIND;
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
	 * Gets the determiner code.
	 * 
	 * @return the determiner code
	 */
	public EntityDeterminerDetermined getDeterminerCode() {
		return determinerCode;
	}
	
	/**
	 * Sets the determiner code.
	 * 
	 * @param determinerCode
	 *            the new determiner code
	 */
	public void setDeterminerCode(EntityDeterminerDetermined determinerCode) {
		this.determinerCode = determinerCode;
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
	 * Gets the name.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name.
	 * 
	 * @param name
	 *            the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
