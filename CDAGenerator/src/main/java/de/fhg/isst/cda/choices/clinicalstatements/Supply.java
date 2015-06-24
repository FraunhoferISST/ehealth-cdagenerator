package de.fhg.isst.cda.choices.clinicalstatements;

import java.math.BigInteger;
import java.util.ArrayList;

import de.fhg.isst.cda.classes.ClinicalStatement;
import de.fhg.isst.cda.classes.Code;
import de.fhg.isst.cda.classes.EffectiveTime;
import de.fhg.isst.cda.classes.ID;
import de.fhg.isst.cda.classes.Quantity;
import de.fhg.isst.cda.enumerations.ActClassSupply;
import de.fhg.isst.cda.enumerations.StatusCode;
import de.fhg.isst.cda.enumerations.XDocumentSubstanceMood;

// TODO: Auto-generated Javadoc
/**
 * The Class Supply.
 */
public class Supply extends ClinicalStatement {
	
	/** The class code. */
	private ActClassSupply classCode;
	
	/** The mood code. */
	private XDocumentSubstanceMood moodCode;
	
	/** The ids. */
	private ArrayList<ID> ids;
	
	/** The code. */
	private Code code;
	
	/** The text. */
	private String text;
	
	/** The status code. */
	private StatusCode statusCode;
	
	/** The effective times. */
	private ArrayList<EffectiveTime> effectiveTimes;
	
	/** The priority codes. */
	private ArrayList<Code> priorityCodes;
	
	/** The repeat number. */
	private BigInteger repeatNumber;
	
	/** The independent ind. */
	private boolean independentInd;
	
	/** The quantity. */
	private Quantity quantity;
	
	/** The expected use time. */
	private EffectiveTime expectedUseTime;
	
	/** The product. */
	private Product product;

	
	/**
	 * Instantiates a new supply.
	 */
	public Supply() {
		this.classCode = ActClassSupply.SPLY;
	}
	
	/**
	 * Gets the class code.
	 * 
	 * @return the class code
	 */
	public ActClassSupply getClassCode() {
		return classCode;
	}

	/**
	 * Sets the class code.
	 * 
	 * @param classCode
	 *            the new class code
	 */
	public void setClassCode(ActClassSupply classCode) {
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
		if (this.ids == null) {
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
	 * Gets the effective times.
	 * 
	 * @return the effective times
	 */
	public ArrayList<EffectiveTime> getEffectiveTimes() {
		if(this.effectiveTimes == null) {
			this.effectiveTimes = new ArrayList<EffectiveTime>();
		}
		return this.effectiveTimes;
	}

	/**
	 * Sets the effective time.
	 * 
	 * @param effectiveTimes
	 *            the new effective time
	 */
	public void setEffectiveTime(ArrayList<EffectiveTime> effectiveTimes) {
		this.effectiveTimes = effectiveTimes;
	}

	/**
	 * Gets the priority codes.
	 * 
	 * @return the priority codes
	 */
	public ArrayList<Code> getPriorityCodes() {
		if (this.priorityCodes == null) {
			this.priorityCodes = new ArrayList<Code>();
		}
		return priorityCodes;
	}

	/**
	 * Sets the priority codes.
	 * 
	 * @param priorityCodes
	 *            the new priority codes
	 */
	public void setPriorityCodes(ArrayList<Code> priorityCodes) {
		this.priorityCodes = priorityCodes;
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
	 * Checks if is independent ind.
	 * 
	 * @return true, if is independent ind
	 */
	public boolean isIndependentInd() {
		return independentInd;
	}

	/**
	 * Sets the independent ind.
	 * 
	 * @param independentInd
	 *            the new independent ind
	 */
	public void setIndependentInd(boolean independentInd) {
		this.independentInd = independentInd;
	}

	/**
	 * Gets the quantity.
	 * 
	 * @return the quantity
	 */
	public Quantity getQuantity() {
		return quantity;
	}

	/**
	 * Sets the quantity.
	 * 
	 * @param quantity
	 *            the new quantity
	 */
	public void setQuantity(Quantity quantity) {
		this.quantity = quantity;
	}

	/**
	 * Gets the expected use time.
	 * 
	 * @return the expected use time
	 */
	public EffectiveTime getExpectedUseTime() {
		return expectedUseTime;
	}

	/**
	 * Sets the expected use time.
	 * 
	 * @param expectedUseTime
	 *            the new expected use time
	 */
	public void setExpectedUseTime(EffectiveTime expectedUseTime) {
		this.expectedUseTime = expectedUseTime;
	}

	/**
	 * Gets the product.
	 * 
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * Sets the product.
	 * 
	 * @param product
	 *            the new product
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

}