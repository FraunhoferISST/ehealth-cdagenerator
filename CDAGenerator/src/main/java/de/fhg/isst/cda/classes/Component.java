//

package de.fhg.isst.cda.classes;

import de.fhg.isst.cda.classes.Code;
import de.fhg.isst.cda.classes.NullFlavor;
import de.fhg.isst.cda.classes.Section;
import de.fhg.isst.cda.classes.TemplateID;
import de.fhg.isst.cda.classes.TypeID;

// TODO: Auto-generated Javadoc
/**
 * The Class Component.
 */
public class Component   
{
    
    /** The realm code. */
    private Code realmCode;
    
    /** The type id. */
    private TypeID typeID;
    
    /** The template id. */
    private TemplateID templateID;
    
    /** The null flavor. */
    private NullFlavor nullFlavor;
    
    /** The type code. */
    private Code typeCode;
    
    /** The context conduction ind. */
    private String contextConductionInd;
    
    /** The section. */
    private Section section;
        
	/**
	 * Instantiates a new component.
	 */
	public Component() {
		super();
	}
	
	/**
	 * Instantiates a new component.
	 * 
	 * @param realmCode
	 *            the realm code
	 * @param typeID
	 *            the type id
	 * @param templateID
	 *            the template id
	 * @param nullFlavor
	 *            the null flavor
	 * @param typeCode
	 *            the type code
	 * @param contextConductionInd
	 *            the context conduction ind
	 * @param section
	 *            the section
	 */
	public Component(Code realmCode, TypeID typeID, TemplateID templateID,
			NullFlavor nullFlavor, Code typeCode, String contextConductionInd,
			Section section) {
		super();
		this.realmCode = realmCode;
		this.typeID = typeID;
		this.templateID = templateID;
		this.nullFlavor = nullFlavor;
		this.typeCode = typeCode;
		this.contextConductionInd = contextConductionInd;
		this.section = section;
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
	 * Gets the null flavor.
	 * 
	 * @return the null flavor
	 */
	public NullFlavor getNullFlavor() {
		return nullFlavor;
	}
	
	/**
	 * Sets the null flavor.
	 * 
	 * @param nullFlavor
	 *            the new null flavor
	 */
	public void setNullFlavor(NullFlavor nullFlavor) {
		this.nullFlavor = nullFlavor;
	}
	
	/**
	 * Gets the type code.
	 * 
	 * @return the type code
	 */
	public Code getTypeCode() {
		return typeCode;
	}
	
	/**
	 * Sets the type code.
	 * 
	 * @param typeCode
	 *            the new type code
	 */
	public void setTypeCode(Code typeCode) {
		this.typeCode = typeCode;
	}
	
	/**
	 * Gets the context conduction ind.
	 * 
	 * @return the context conduction ind
	 */
	public String getContextConductionInd() {
		return contextConductionInd;
	}
	
	/**
	 * Sets the context conduction ind.
	 * 
	 * @param contextConductionInd
	 *            the new context conduction ind
	 */
	public void setContextConductionInd(String contextConductionInd) {
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