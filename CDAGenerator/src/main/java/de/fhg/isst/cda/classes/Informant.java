package de.fhg.isst.cda.classes;

import de.fhg.isst.cda.choices.informant.InformantChoice;
import de.fhg.isst.cda.enumerations.ContextControlPropagating;
import de.fhg.isst.cda.enumerations.ParticipationInformationGenerator;

// TODO: Auto-generated Javadoc
/**
 * The Class Informant.
 */
public class Informant   
{
    
    /** The realm code. */
    private Code realmCode;
    
    /** The type id. */
    private TypeID typeID;
    
    /** The template id. */
    private TemplateID templateID;
    
    /** The informant choice. */
    private InformantChoice informantChoice;
    
    /** The null flavor. */
    private String nullFlavor;
    
    /** The type code. */
    private ParticipationInformationGenerator typeCode;
    
    /** The context control code. */
    private ContextControlPropagating contextControlCode;
    
    /** The item. */
    private Object item;
    
    /**
	 * Instantiates a new informant.
	 */
    public Informant() {
    	this.typeCode = ParticipationInformationGenerator.INF;
    	this.contextControlCode = ContextControlPropagating.OP;
    }
	
	/**
	 * Gets the realm code.
	 * 
	 * @return the realm code
	 */
	public Code getRealmCode() {
		return realmCode;
	}
	
	/**
	 * Sets the realm code.
	 * 
	 * @param realmCode
	 *            the new realm code
	 */
	public void setRealmCode(Code realmCode) {
		this.realmCode = realmCode;
	}
	
	/**
	 * Gets the type id.
	 * 
	 * @return the type id
	 */
	public TypeID getTypeID() {
		return typeID;
	}
	
	/**
	 * Sets the type id.
	 * 
	 * @param typeID
	 *            the new type id
	 */
	public void setTypeID(TypeID typeID) {
		this.typeID = typeID;
	}
	
	/**
	 * Gets the template id.
	 * 
	 * @return the template id
	 */
	public TemplateID getTemplateID() {
		return templateID;
	}
	
	/**
	 * Sets the template id.
	 * 
	 * @param templateID
	 *            the new template id
	 */
	public void setTemplateID(TemplateID templateID) {
		this.templateID = templateID;
	}
	
	/**
	 * Gets the informant choice.
	 * 
	 * @return the informant choice
	 */
	public InformantChoice getInformantChoice() {
		return informantChoice;
	}
	
	/**
	 * Sets the informant choice.
	 * 
	 * @param informantChoice
	 *            the new informant choice
	 */
	public void setInformantChoice(InformantChoice informantChoice) {
		this.informantChoice = informantChoice;
	}
	
	/**
	 * Gets the null flavor.
	 * 
	 * @return the null flavor
	 */
	public String getNullFlavor() {
		return nullFlavor;
	}
	
	/**
	 * Sets the null flavor.
	 * 
	 * @param nullFlavor
	 *            the new null flavor
	 */
	public void setNullFlavor(String nullFlavor) {
		this.nullFlavor = nullFlavor;
	}
	
	/**
	 * Gets the type code.
	 * 
	 * @return the type code
	 */
	public ParticipationInformationGenerator getTypeCode() {
		return typeCode;
	}
	
	/**
	 * Sets the type code.
	 * 
	 * @param typeCode
	 *            the new type code
	 */
	public void setTypeCode(ParticipationInformationGenerator typeCode) {
		this.typeCode = typeCode;
	}
	
	/**
	 * Gets the context control code.
	 * 
	 * @return the context control code
	 */
	public ContextControlPropagating getContextControlCode() {
		return contextControlCode;
	}
	
	/**
	 * Sets the context control code.
	 * 
	 * @param contextControlCode
	 *            the new context control code
	 */
	public void setContextControlCode(ContextControlPropagating contextControlCode) {
		this.contextControlCode = contextControlCode;
	}
	
	/**
	 * Gets the item.
	 * 
	 * @return the item
	 */
	public Object getItem() {
		return item;
	}
	
	/**
	 * Sets the item.
	 * 
	 * @param item
	 *            the new item
	 */
	public void setItem(Object item) {
		this.item = item;
	}
}