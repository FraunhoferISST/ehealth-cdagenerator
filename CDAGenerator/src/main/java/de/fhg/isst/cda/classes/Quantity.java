package de.fhg.isst.cda.classes;

import java.util.ArrayList;

import de.fhg.isst.cda.enumerations.SetOperator;

// TODO: Auto-generated Javadoc
/**
 * The Class Quantity.
 */
public class Quantity {
	
	/** The translations. */
	private ArrayList<String> translations;
	
	/** The value. */
	private String value;
	
	/** The unit. */
	private String unit;
	
	/** The set operator. */
	private SetOperator setOperator;
	
	/**
	 * Instantiates a new quantity.
	 */
	public Quantity() {
		this.setOperator = SetOperator.I;
	}
	
	/**
	 * Gets the translations.
	 * 
	 * @return the translations
	 */
	public ArrayList<String> getTranslations() {
		if(this.translations == null) {
			this.translations = new ArrayList<String>();
		}
		return translations;
	}
	
	/**
	 * Sets the translations.
	 * 
	 * @param translations
	 *            the new translations
	 */
	public void setTranslations(ArrayList<String> translations) {
		this.translations = translations;
	}
	
	/**
	 * Gets the value.
	 * 
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	
	/**
	 * Sets the value.
	 * 
	 * @param value
	 *            the new value
	 */
	public void setValue(String value) {
		this.value = value;
	}
	
	/**
	 * Gets the unit.
	 * 
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}
	
	/**
	 * Sets the unit.
	 * 
	 * @param unit
	 *            the new unit
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}

	/**
	 * Gets the sets the operator.
	 * 
	 * @return the sets the operator
	 */
	public SetOperator getSetOperator() {
		return setOperator;
	}

	/**
	 * Sets the sets the operator.
	 * 
	 * @param setOperator
	 *            the new sets the operator
	 */
	public void setSetOperator(SetOperator setOperator) {
		this.setOperator = setOperator;
	}
}
