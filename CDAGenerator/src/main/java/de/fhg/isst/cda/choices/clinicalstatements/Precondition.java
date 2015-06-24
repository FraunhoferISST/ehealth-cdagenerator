package de.fhg.isst.cda.choices.clinicalstatements;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class Precondition.
 */
public class Precondition   
{
	
	/** The type code. */
	private String typeCode;
	
	/** The criterions. */
	private ArrayList<Criterion> criterions;
	
	/**
	 * Instantiates a new precondition.
	 */
	public Precondition() {
		this.typeCode = "PRCN";
	}
	
	/**
	 * Gets the type code.
	 * 
	 * @return the type code
	 */
	public String getTypeCode() {
		return typeCode;
	}
	
	/**
	 * Sets the type code.
	 * 
	 * @param typeCode
	 *            the new type code
	 */
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
	
	/**
	 * Gets the criterions.
	 * 
	 * @return the criterions
	 */
	public ArrayList<Criterion> getCriterions() {
		if(this.criterions == null) {
			this.criterions = new ArrayList<Criterion>();
		}
		return criterions;
	}
	
	/**
	 * Sets the criterions.
	 * 
	 * @param criterions
	 *            the new criterions
	 */
	public void setCriterions(ArrayList<Criterion> criterions) {
		this.criterions = criterions;
	}
	
}