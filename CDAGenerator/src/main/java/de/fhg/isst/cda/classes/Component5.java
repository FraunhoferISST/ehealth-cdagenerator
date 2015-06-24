package de.fhg.isst.cda.classes;

import de.fhg.isst.cda.enumerations.ActRelationshipHasComponent;

// TODO: Auto-generated Javadoc
/**
 * The Class Component5.
 */
public class Component5 {
	
	/** The type code. */
	private ActRelationshipHasComponent typeCode;
	
	/** The context conduction ind. */
	private boolean contextConductionInd;
	
	/** The section. */
	private Section section;
	
	/**
	 * Instantiates a new component5.
	 */
	public Component5() {
		this.typeCode = ActRelationshipHasComponent.COMP;
		this.contextConductionInd = true;
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
	 * Checks if is context conduction ind.
	 * 
	 * @return true, if is context conduction ind
	 */
	public boolean isContextConductionInd() {
		return contextConductionInd;
	}
	
	/**
	 * Sets the context conduction ind.
	 * 
	 * @param contextConductionInd
	 *            the new context conduction ind
	 */
	public void setContextConductionInd(boolean contextConductionInd) {
		this.contextConductionInd = contextConductionInd;
	}
	
	/**
	 * Gets the section.
	 * 
	 * @return the section
	 */
	public Section getSection() {
		return section;
	}
	
	/**
	 * Sets the section.
	 * 
	 * @param section
	 *            the new section
	 */
	public void setSection(Section section) {
		this.section = section;
	}
}
