package de.fhg.isst.cda.choices.clinicalstatements;

import org.hl7.v3.cda.XActRelationshipExternalReference;

import de.fhg.isst.cda.choices.externalactchoice.ExternalActChoice;

// TODO: Auto-generated Javadoc
/**
 * The Class Reference.
 */
public class Reference   
{
	
	/** The type code. */
	private XActRelationshipExternalReference typeCode;
	
	/** The seperatable ind. */
	private boolean seperatableInd;
	
	/** The external act choice. */
	private ExternalActChoice externalActChoice;
	
	/**
	 * Instantiates a new reference.
	 */
	public Reference() {
	}

	/**
	 * Gets the type code.
	 * 
	 * @return the type code
	 */
	public XActRelationshipExternalReference getTypeCode() {
		return typeCode;
	}

	/**
	 * Sets the type code.
	 * 
	 * @param typeCode
	 *            the new type code
	 */
	public void setTypeCode(XActRelationshipExternalReference typeCode) {
		this.typeCode = typeCode;
	}

	/**
	 * Checks if is seperatable ind.
	 * 
	 * @return true, if is seperatable ind
	 */
	public boolean isSeperatableInd() {
		return seperatableInd;
	}

	/**
	 * Sets the seperatable ind.
	 * 
	 * @param seperatableInd
	 *            the new seperatable ind
	 */
	public void setSeperatableInd(boolean seperatableInd) {
		this.seperatableInd = seperatableInd;
	}

	/**
	 * Gets the external act choice.
	 * 
	 * @return the external act choice
	 */
	public ExternalActChoice getExternalActChoice() {
		return externalActChoice;
	}

	/**
	 * Sets the external act choice.
	 * 
	 * @param externalActChoice
	 *            the new external act choice
	 */
	public void setExternalActChoice(ExternalActChoice externalActChoice) {
		this.externalActChoice = externalActChoice;
	}
}