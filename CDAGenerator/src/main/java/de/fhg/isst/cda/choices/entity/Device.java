package de.fhg.isst.cda.choices.entity;

import de.fhg.isst.cda.classes.Code;
import de.fhg.isst.cda.enumerations.EntityClassDevice;

// TODO: Auto-generated Javadoc
/**
 * The Class Device.
 */
public class Device implements EntityChoice{
	
	/** The class code. */
	private EntityClassDevice classCode;
	
	/** The determiner code. */
	private String determinerCode;
	
	/** The code. */
	private Code code;
	
	/** The manufacturer model name. */
	private Code manufacturerModelName;
	
	/** The software name. */
	private Code softwareName;
	
	/**
	 * Instantiates a new device.
	 */
	public Device() {
		this.classCode = EntityClassDevice.DEV;
		this.determinerCode = "INSTANCE";
	}
	
	/**
	 * Gets the class code.
	 * 
	 * @return the class code
	 */
	public EntityClassDevice getClassCode() {
		return classCode;
	}
	
	/**
	 * Sets the class code.
	 * 
	 * @param classCode
	 *            the new class code
	 */
	public void setClassCode(EntityClassDevice classCode) {
		this.classCode = classCode;
	}
	
	/**
	 * Gets the determiner code.
	 * 
	 * @return the determiner code
	 */
	public String getDeterminerCode() {
		return determinerCode;
	}
	
	/**
	 * Sets the determiner code.
	 * 
	 * @param string
	 *            the new determiner code
	 */
	public void setDeterminerCode(String string) {
		this.determinerCode = string;
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
	 * Gets the manufacturer model name.
	 * 
	 * @return the manufacturer model name
	 */
	public Code getManufacturerModelName() {
		return manufacturerModelName;
	}
	
	/**
	 * Sets the manufacturer model name.
	 * 
	 * @param manufacturerModelName
	 *            the new manufacturer model name
	 */
	public void setManufacturerModelName(Code manufacturerModelName) {
		this.manufacturerModelName = manufacturerModelName;
	}
	
	/**
	 * Gets the software name.
	 * 
	 * @return the software name
	 */
	public Code getSoftwareName() {
		return softwareName;
	}
	
	/**
	 * Sets the software name.
	 * 
	 * @param softwareName
	 *            the new software name
	 */
	public void setSoftwareName(Code softwareName) {
		this.softwareName = softwareName;
	}
}