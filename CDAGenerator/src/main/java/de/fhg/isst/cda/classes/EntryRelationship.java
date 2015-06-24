package de.fhg.isst.cda.classes;

import java.math.BigInteger;

import de.fhg.isst.cda.enumerations.XActRelationshipEntryRelationship;


// TODO: Auto-generated Javadoc
/**
 * The Class EntryRelationship.
 */
public class EntryRelationship   
{
	
	/** The type code. */
	private XActRelationshipEntryRelationship typeCode;
	
	/** The inversion ind. */
	private boolean inversionInd;
	
	/** The context conduction ind. */
	private boolean contextConductionInd;
	
	/** The sequence number. */
	private BigInteger sequenceNumber;
	
	/** The negation ind. */
	private boolean negationInd;
	
	/** The seperateable ind. */
	private boolean seperateableInd;
	
	/** The clinical statement. */
	private ClinicalStatement clinicalStatement;
	
	/**
	 * Instantiates a new entry relationship.
	 */
	public EntryRelationship() {
		this.contextConductionInd = true;
	}
	/**
	 * Gets the type code.
	 * 
	 * @return the type code
	 */
	public XActRelationshipEntryRelationship getTypeCode() {
		return typeCode;
	}
	
	/**
	 * Sets the type code.
	 * 
	 * @param typeCode
	 *            the new type code
	 */
	public void setTypeCode(XActRelationshipEntryRelationship typeCode) {
		this.typeCode = typeCode;
	}
	
	/**
	 * Checks if is inversion ind.
	 * 
	 * @return true, if is inversion ind
	 */
	public boolean isInversionInd() {
		return inversionInd;
	}
	
	/**
	 * Sets the inversion ind.
	 * 
	 * @param inversionInd
	 *            the new inversion ind
	 */
	public void setInversionInd(boolean inversionInd) {
		this.inversionInd = inversionInd;
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
	 * Checks if is negation ind.
	 * 
	 * @return true, if is negation ind
	 */
	public boolean isNegationInd() {
		return negationInd;
	}
	
	/**
	 * Sets the negation ind.
	 * 
	 * @param negationInd
	 *            the new negation ind
	 */
	public void setNegationInd(boolean negationInd) {
		this.negationInd = negationInd;
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
	 * Gets the clinical statement.
	 * 
	 * @return the clinical statement
	 */
	public ClinicalStatement getClinicalStatement() {
		return clinicalStatement;
	}
	
	/**
	 * Sets the clinical statement.
	 * 
	 * @param clinicalStatement
	 *            the new clinical statement
	 */
	public void setClinicalStatement(ClinicalStatement clinicalStatement) {
		this.clinicalStatement = clinicalStatement;
	}
}