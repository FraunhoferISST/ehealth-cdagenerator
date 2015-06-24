package de.fhg.isst.cda.choices.clinicalstatements;


// TODO: Auto-generated Javadoc
/**
 * The Class Consumable.
 */
public class Consumable   
{
	
	/** The type code. */
	private String typeCode;
	
	/** The manufactured product. */
	private ManufacturedProduct manufacturedProduct;
	
	/**
	 * Instantiates a new consumable.
	 */
	public Consumable() {
		this.typeCode = "CSM";
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
	 * Gets the manufactured product.
	 * 
	 * @return the manufactured product
	 */
	public ManufacturedProduct getManufacturedProduct() {
		return manufacturedProduct;
	}
	
	/**
	 * Sets the manufactured product.
	 * 
	 * @param manufacturedProduct
	 *            the new manufactured product
	 */
	public void setManufacturedProduct(ManufacturedProduct manufacturedProduct) {
		this.manufacturedProduct = manufacturedProduct;
	}
}