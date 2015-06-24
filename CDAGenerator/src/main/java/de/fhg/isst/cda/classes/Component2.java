package de.fhg.isst.cda.classes;

import de.fhg.isst.cda.choices.body.BodyChoice;
import de.fhg.isst.cda.enumerations.ActRelationshipHasComponent;

// TODO: Auto-generated Javadoc
/**
 * The Class Component2.
 */
public class Component2 {
	
	/** The type code. */
	private ActRelationshipHasComponent typeCode;
	
	/** The context conduction ind. */
	private boolean contextConductionInd;
	
	/** The body choice. */
	private BodyChoice bodyChoice;
	
	/**
	 * Instantiates a new component2.
	 */
	public Component2() {
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
	 * Gets the body choice.
	 * 
	 * @return the body choice
	 */
	public BodyChoice getBodyChoice() {
		return bodyChoice;
	}

	/**
	 * Sets the body choice.
	 * 
	 * @param bodyChoice
	 *            the new body choice
	 */
	public void setBodyChoice(BodyChoice bodyChoice) {
		this.bodyChoice = bodyChoice;
	}
}