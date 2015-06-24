package de.fhg.isst.cda.choices.clinicalstatements;

import java.math.BigInteger;
import java.util.ArrayList;

import de.fhg.isst.cda.classes.ClinicalStatement;
import de.fhg.isst.cda.classes.Code;
import de.fhg.isst.cda.classes.EffectiveTime;
import de.fhg.isst.cda.classes.ID;
import de.fhg.isst.cda.classes.Quantity;
import de.fhg.isst.cda.classes.Ratio;
import de.fhg.isst.cda.enumerations.StatusCode;
import de.fhg.isst.cda.enumerations.XDocumentSubstanceMood;

// TODO: Auto-generated Javadoc
/**
 * The Class SubstanceAdministration.
 */
public class SubstanceAdministration extends ClinicalStatement
{
	
	/** The class code. */
	private String classCode;
	
	/** The mood code. */
	private XDocumentSubstanceMood moodCode;
	
	/** The ids. */
	private ArrayList<ID> ids;
	
	/** The code. */
	private Code code;
	
	/** The negation ind. */
	private boolean negationInd;
	
	/** The text. */
	private String text;
	
	/** The status code. */
	private StatusCode statusCode;
	
	/** TODO: Literalerklärung, siehe Spezifikation. */
//	private ArrayList<EffectiveTime> effectiveTimes;
	private EffectiveTime effectiveTime;
	
	/** The priority code. */
	private Code priorityCode;
	
	/** The repeat number. */
	private BigInteger repeatNumber;
	
	/** The route code. */
	private Code routeCode;
	
	/** The approach site codes. */
	private ArrayList<Code> approachSiteCodes;
	
	/** The dose quantity. */
	private Quantity doseQuantity;
	
	/** The rate quantity. */
	private Quantity rateQuantity;
	
	/** The max dose quantity. */
	private Ratio maxDoseQuantity;
	
	/** The administration unit code. */
	private Code administrationUnitCode;
	
	/** The consumable. */
	private Consumable consumable;
	
	/**
	 * Instantiates a new substance administration.
	 */
	public SubstanceAdministration() {
		this.classCode = "SBADM";
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
	 * Gets the mood code.
	 * 
	 * @return the mood code
	 */
	public XDocumentSubstanceMood getMoodCode() {
		return moodCode;
	}
	
	/**
	 * Sets the mood code.
	 * 
	 * @param moodCode
	 *            the new mood code
	 */
	public void setMoodCode(XDocumentSubstanceMood moodCode) {
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
	 * Gets the status code.
	 * 
	 * @return the status code
	 */
	public StatusCode getStatusCode() {
		return statusCode;
	}
	
	/**
	 * Sets the status code.
	 * 
	 * @param active
	 *            the new status code
	 */
	public void setStatusCode(StatusCode active) {
		this.statusCode = active;
	}
	
	/**
	 * Gets the tODO: Literalerklärung, siehe Spezifikation.
	 * 
	 * @return the tODO: Literalerklärung, siehe Spezifikation
	 */
	/*public ArrayList<EffectiveTime> getEffectiveTimes() {
		if(this.effectiveTimes == null) {
			this.effectiveTimes = new ArrayList<EffectiveTime>();
		}
		return this.effectiveTimes;
	}*/
	
	/**
	 * Sets the tODO: Literalerklärung, siehe Spezifikation.
	 * 
	 * @param effectiveTimes
	 *            the new tODO: Literalerklärung, siehe Spezifikation
	 */
	/*public void setEffectiveTimes(ArrayList<EffectiveTime> effectiveTimes) {
		this.effectiveTimes = effectiveTimes;
	}*/
	
	public EffectiveTime getEffectiveTime() {
	    if(effectiveTime == null) effectiveTime = new EffectiveTime();
	    return effectiveTime;
	}
	
	public void setEffectiveTime(EffectiveTime effectiveTime) {
	    this.effectiveTime = effectiveTime;
	}
	
	/**
	 * Gets the priority code.
	 * 
	 * @return the priority code
	 */
	public Code getPriorityCode() {
		return priorityCode;
	}
	
	/**
	 * Sets the priority code.
	 * 
	 * @param priorityCode
	 *            the new priority code
	 */
	public void setPriorityCode(Code priorityCode) {
		this.priorityCode = priorityCode;
	}
	
	/**
	 * Gets the repeat number.
	 * 
	 * @return the repeat number
	 */
	public BigInteger getRepeatNumber() {
		return repeatNumber;
	}
	
	/**
	 * Sets the repeat number.
	 * 
	 * @param repeatNumber
	 *            the new repeat number
	 */
	public void setRepeatNumber(BigInteger repeatNumber) {
		this.repeatNumber = repeatNumber;
	}
	
	/**
	 * Gets the route code.
	 * 
	 * @return the route code
	 */
	public Code getRouteCode() {
		return routeCode;
	}
	
	/**
	 * Sets the route code.
	 * 
	 * @param routeCode
	 *            the new route code
	 */
	public void setRouteCode(Code routeCode) {
		this.routeCode = routeCode;
	}
	
	/**
	 * Gets the approach site codes.
	 * 
	 * @return the approach site codes
	 */
	public ArrayList<Code> getApproachSiteCodes() {
		if(this.approachSiteCodes == null) {
			this.approachSiteCodes = new ArrayList<Code>();
		}
		return approachSiteCodes;
	}
	
	/**
	 * Sets the approach site codes.
	 * 
	 * @param approachSiteCodes
	 *            the new approach site codes
	 */
	public void setApproachSiteCodes(ArrayList<Code> approachSiteCodes) {
		this.approachSiteCodes = approachSiteCodes;
	}
	
	/**
	 * Gets the dose quantity.
	 * 
	 * @return the dose quantity
	 */
	public Quantity getDoseQuantity() {
		return doseQuantity;
	}
	
	/**
	 * Sets the dose quantity.
	 * 
	 * @param doseQuantity
	 *            the new dose quantity
	 */
	public void setDoseQuantity(Quantity doseQuantity) {
		this.doseQuantity = doseQuantity;
	}
	
	/**
	 * Gets the rate quantity.
	 * 
	 * @return the rate quantity
	 */
	public Quantity getRateQuantity() {
		return rateQuantity;
	}
	
	/**
	 * Sets the rate quantity.
	 * 
	 * @param rateQuantity
	 *            the new rate quantity
	 */
	public void setRateQuantity(Quantity rateQuantity) {
		this.rateQuantity = rateQuantity;
	}
	
	/**
	 * Gets the max dose quantity.
	 * 
	 * @return the max dose quantity
	 */
	public Ratio getMaxDoseQuantity() {
		return maxDoseQuantity;
	}
	
	/**
	 * Sets the max dose quantity.
	 * 
	 * @param maxDoseQuantity
	 *            the new max dose quantity
	 */
	public void setMaxDoseQuantity(Ratio maxDoseQuantity) {
		this.maxDoseQuantity = maxDoseQuantity;
	}
	
	/**
	 * Gets the administration unit code.
	 * 
	 * @return the administration unit code
	 */
	public Code getAdministrationUnitCode() {
		return administrationUnitCode;
	}
	
	/**
	 * Sets the administration unit code.
	 * 
	 * @param administrationUnitCode
	 *            the new administration unit code
	 */
	public void setAdministrationUnitCode(Code administrationUnitCode) {
		this.administrationUnitCode = administrationUnitCode;
	}
	
	/**
	 * Gets the consumable.
	 * 
	 * @return the consumable
	 */
	public Consumable getConsumable() {
		return consumable;
	}
	
	/**
	 * Sets the consumable.
	 * 
	 * @param consumable
	 *            the new consumable
	 */
	public void setConsumable(Consumable consumable) {
		this.consumable = consumable;
	}
}