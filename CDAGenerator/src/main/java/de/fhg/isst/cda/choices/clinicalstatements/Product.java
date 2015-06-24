package de.fhg.isst.cda.choices.clinicalstatements;


// TODO: Auto-generated Javadoc
/**
 * The Class Product.
 */
public class Product   
{
	
	/** The type code. */
	private String typeCode;
	
	/** The manufactured product. */
	private ManufacturedProduct manufacturedProduct;
	
	/**
	 * Instantiates a new product.
	 */
	public Product() {
		this.typeCode = "PRD";
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