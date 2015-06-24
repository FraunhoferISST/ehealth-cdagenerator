package de.fhg.isst.cda.choices.clinicalstatements;

import java.math.BigInteger;
import java.util.ArrayList;

import de.fhg.isst.cda.classes.ClinicalStatement;
import de.fhg.isst.cda.enumerations.ActRelationshipHasComponent;

// TODO: Auto-generated Javadoc
/**
 * The Class Component4.
 */
public class Component4 {
	
	/** The type code. */
	private ActRelationshipHasComponent typeCode;
	
	/** The context conduction ind. */
	private boolean contextConductionInd;
	
	/** The sequence number. */
	private BigInteger sequenceNumber;
	
	/** The seperateable ind. */
	private boolean seperateableInd;
	
	/** The clinical statements. */
	private ArrayList<ClinicalStatement> clinicalStatements;

	/**
	 * Instantiates a new component4.
	 */
	public Component4() {
		this.typeCode = ActRelationshipHasComponent.COMP;
		this.contextConductionInd = true;
	}

	/**
	 * Gets the type code.
	 * 
	 * @return the type code
	 */
	public ActRelationshipHasComponent getTypeCode() {
		return typeCode;
	}

	/**
	 * Sets the type code.
	 * 
	 * @param typeCode
	 *            the new type code
	 */
	public void setTypeCode(ActRelationshipHasComponent typeCode) {
		this.typeCode = typeCode;
	}

	/**
	 * Checks if is context conduction ind.
	 * 
	 * @return true, if is context conduction ind
	 */
	public boolean isContextConductionInd() {
		return contextConductionInd;
	}

	/**
	 * Sets the context conduction ind.
	 * 
	 * @param contextConductionInd
	 *            the new context conduction ind
	 */
	public void setContextConductionInd(boolean contextConductionInd) {
		this.contextConductionInd = contextConductionInd;
	}

	/**
	 * Gets the sequence number.
	 * 
	 * @return the sequence number
	 */
	public BigInteger getSequenceNumber() {
		return sequenceNumber;
	}

	/**
	 * Sets the sequence number.
	 * 
	 * @param sequenceNumber
	 *            the new sequence number
	 */
	public void setSequenceNumber(BigInteger sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	/**
	 * Checks if is seperateable ind.
	 * 
	 * @return true, if is seperateable ind
	 */
	public boolean isSeperateableInd() {
		return seperateableInd;
	}

	/**
	 * Sets the seperateable ind.
	 * 
	 * @param seperateableInd
	 *            the new seperateable ind
	 */
	public void setSeperateableInd(boolean seperateableInd) {
		this.seperateableInd = seperateableInd;
	}

	/**
	 * Gets the clinical statements.
	 * 
	 * @return the clinical statements
	 */
	public ArrayList<ClinicalStatement> getClinicalStatements() {
		if(this.clinicalStatements == null) {
			this.clinicalStatements = new ArrayList<ClinicalStatement>();
		}
		return clinicalStatements;
	}

	/**
	 * Sets the clinical statements.
	 * 
	 * @param clinicalStatements
	 *            the new clinical statements
	 */
	public void setClinicalStatements(ArrayList<ClinicalStatement> clinicalStatements) {
		this.clinicalStatements = clinicalStatements;
	}

	
}