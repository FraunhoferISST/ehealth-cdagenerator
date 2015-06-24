package de.fhg.isst.cda.choices.externalactchoice;

import java.math.BigInteger;

import de.fhg.isst.cda.choices.clinicalstatements.ExternalReference;
import de.fhg.isst.cda.classes.ID;

// TODO: Auto-generated Javadoc
/**
 * The Class ExternalDocument.
 */
public class ExternalDocument extends ExternalReference implements ExternalActChoice{
	
	/** The set id. */
	private ID setID;
	
	/** The version number. */
	private BigInteger versionNumber;
	

	/**
	 * Instantiates a new external document.
	 */
	public ExternalDocument() {
		super.setClassCode("DOC");
	}
	
	/**
	 * Gets the sets the id.
	 * 
	 * @return the sets the id
	 */
	public ID getSetID() {
		return setID;
	}
	
	/**
	 * Sets the sets the id.
	 * 
	 * @param setID
	 *            the new sets the id
	 */
	public void setSetID(ID setID) {
		this.setID = setID;
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
