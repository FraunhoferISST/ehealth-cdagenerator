package de.fhg.isst.cda.classes;

import de.fhg.isst.cda.enumerations.ActRelationshipHasComponent;

// TODO: Auto-generated Javadoc
/**
 * The Class ComponentOf.
 */
public class ComponentOf   
{
	
	/** The type code. */
	private ActRelationshipHasComponent typeCode;
	
	/** The encompassing encounter. */
	private EncompassingEncounter encompassingEncounter;
	
	/**
	 * Instantiates a new component of.
	 */
	public ComponentOf() {
		this.typeCode = ActRelationshipHasComponent.COMP;
	}
	
	/**
	 * Gets the type code.
	 * 
	 * @return the type code
	 */
	public ActRelationshipHasComponent getTypeCode() {
		return typeCode;
	}
	
	/**
	 * Sets the type code.
	 * 
	 * @param typeCode
	 *            the new type code
	 */
	public void setTypeCode(ActRelationshipHasComponent typeCode) {
		this.typeCode = typeCode;
	}
	
	/**
	 * Gets the encompassing encounter.
	 * 
	 * @return the encompassing encounter
	 */
	public EncompassingEncounter getEncompassingEncounter() {
		return encompassingEncounter;
	}
	
	/**
	 * Sets the encompassing encounter.
	 * 
	 * @param encompassingEncounter
	 *            the new encompassing encounter
	 */
	public void setEncompassingEncounter(EncompassingEncounter encompassingEncounter) {
		this.encompassingEncounter = encompassingEncounter;
	}
}