package de.fhg.isst.cda.choices.clinicalstatements;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class ReferenceRange.
 */
public class ReferenceRange   
{
	
	/** The type code. */
	private String typeCode;
	
	/** The observation ranges. */
	private ArrayList<ObservationRange> observationRanges;
	
	/**
	 * Instantiates a new reference range.
	 */
	public ReferenceRange() {
		this.typeCode = "REFV";
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
	 * Gets the observation ranges.
	 * 
	 * @return the observation ranges
	 */
	public ArrayList<ObservationRange> getObservationRanges() {
		if(this.observationRanges == null) {
			this.observationRanges = new ArrayList<ObservationRange>();
		}
		return observationRanges;
	}

	/**
	 * Sets the observation ranges.
	 * 
	 * @param observationRanges
	 *            the new observation ranges
	 */
	public void setObservationRanges(ArrayList<ObservationRange> observationRanges) {
		this.observationRanges = observationRanges;
	}

	
}