package de.fhg.isst.cda.classes;

import java.util.ArrayList;

import org.hl7.v3.cda.ActRelationshipFulfills;

// TODO: Auto-generated Javadoc
/**
 * The Class InFulfillmentOf.
 */
public class InFulfillmentOf {
	
	/** The type code. */
	private ActRelationshipFulfills typeCode;
	
	/** The orders. */
	private ArrayList<Order> orders;
	
	/**
	 * Instantiates a new in fulfillment of.
	 */
	public InFulfillmentOf() {
		this.typeCode = ActRelationshipFulfills.FLFS;
	}

	/**
	 * Gets the type code.
	 * 
	 * @return the type code
	 */
	public ActRelationshipFulfills getTypeCode() {
		return typeCode;
	}

	/**
	 * Sets the type code.
	 * 
	 * @param typeCode
	 *            the new type code
	 */
	public void setTypeCode(ActRelationshipFulfills typeCode) {
		this.typeCode = typeCode;
	}

	/**
	 * Gets the orders.
	 * 
	 * @return the orders
	 */
	public ArrayList<Order> getOrders() {
		if(this.orders == null) {
			this.orders = new ArrayList<Order>();
		}
		return orders;
	}

	/**
	 * Sets the orders.
	 * 
	 * @param orders
	 *            the new orders
	 */
	public void setOrders(ArrayList<Order> orders) {
		this.orders = orders;
	}
	
}