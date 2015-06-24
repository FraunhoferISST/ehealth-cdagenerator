package de.fhg.isst.cda.choices.clinicalstatements;

import java.util.ArrayList;

import de.fhg.isst.cda.choices.drugorothermaterial.DrugOrOtherMaterialChoice;
import de.fhg.isst.cda.choices.guardian.Organization;
import de.fhg.isst.cda.classes.ID;
import de.fhg.isst.cda.enumerations.RoleClassManufacturedProduct;

// TODO: Auto-generated Javadoc
/**
 * The Class ManufacturedProduct.
 */
public class ManufacturedProduct   
{
	
	/** The class code. */
	private RoleClassManufacturedProduct classCode;
	
	/** The ids. */
	private ArrayList<ID> ids;
	
	/** The drug or other material choice. */
	private DrugOrOtherMaterialChoice drugOrOtherMaterialChoice;
	
	/** The manufacturer organization. */
	private Organization manufacturerOrganization;
	
	/**
	 * Instantiates a new manufactured product.
	 */
	public ManufacturedProduct() {
		this.classCode = RoleClassManufacturedProduct.MANU;
	}
	
	/**
	 * Gets the class code.
	 * 
	 * @return the class code
	 */
	public RoleClassManufacturedProduct getClassCode() {
		return classCode;
	}
	
	/**
	 * Sets the class code.
	 * 
	 * @param classCode
	 *            the new class code
	 */
	public void setClassCode(RoleClassManufacturedProduct classCode) {
		this.classCode = classCode;
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
	 * Gets the drug or other material choice.
	 * 
	 * @return the drug or other material choice
	 */
	public DrugOrOtherMaterialChoice getDrugOrOtherMaterialChoice() {
		return drugOrOtherMaterialChoice;
	}
	
	/**
	 * Sets the drug or other material choice.
	 * 
	 * @param drugOrOtherMaterialChoice
	 *            the new drug or other material choice
	 */
	public void setDrugOrOtherMaterialChoice(DrugOrOtherMaterialChoice drugOrOtherMaterialChoice) {
		this.drugOrOtherMaterialChoice = drugOrOtherMaterialChoice;
	}
	
	/**
	 * Gets the manufacturer organization.
	 * 
	 * @return the manufacturer organization
	 */
	public Organization getManufacturerOrganization() {
		return manufacturerOrganization;
	}
	
	/**
	 * Sets the manufacturer organization.
	 * 
	 * @param manufacturerOrganization
	 *            the new manufacturer organization
	 */
	public void setManufacturerOrganization(Organization manufacturerOrganization) {
		this.manufacturerOrganization = manufacturerOrganization;
	}
}