//

package de.fhg.isst.cda.classes;

import de.fhg.isst.cda.choices.Person;


// TODO: Auto-generated Javadoc
/**
 * The Class Author.
 */
public class Author   
{
    
    /** The realm code. */
    private Code realmCode;
    
    /** The type id. */
    private TypeID typeID;
    
    /** The template id. */
    private TemplateID templateID;
    
    /** The function code. */
    private Code functionCode;
    
    /** The time. */
    private String time;
    
    /** The assigned author. */
    private AssignedAuthor assignedAuthor;
    
    /** The assigned person. */
    private Person assignedPerson;
    
    /** The null flavor. */
    private String nullFlavor;
    
    /** The type code. */
    private String typeCode;
    
    /** The context control code. */
    private String contextControlCode;
    
    /** The represented organization. */
    private RepresentedOrganization representedOrganization;
    
	/**
	 * Instantiates a new author.
	 */
	public Author() {
		this.typeCode = "AUT";
		this.contextControlCode = "OP";
	}
	
	/**
	 * Instantiates a new author.
	 * 
	 * @param time
	 *            the time
	 * @param assignedAuthor
	 *            the assigned author
	 * @param assignedPerson
	 *            the assigned person
	 * @param representedOrganization
	 *            the represented organization
	 */
	public Author(String time, AssignedAuthor assignedAuthor, Person assignedPerson, RepresentedOrganization representedOrganization) {
		this.time = time;
		this.assignedAuthor = assignedAuthor;
		this.assignedPerson = assignedPerson;
		this.representedOrganization = representedOrganization;
	}

	/**
	 * Instantiates a new author.
	 * 
	 * @param realmCode
	 *            the realm code
	 * @param typeID
	 *            the type id
	 * @param templateID
	 *            the template id
	 * @param functionCode
	 *            the function code
	 * @param time
	 *            the time
	 * @param assignedAuthor
	 *            the assigned author
	 * @param assignedPerson
	 *            the assigned person
	 * @param nullFlavor
	 *            the null flavor
	 * @param typeCode
	 *            the type code
	 * @param contextControlCode
	 *            the context control code
	 * @param representedOrganization
	 *            the represented organization
	 */
	public Author(Code realmCode, TypeID typeID, TemplateID templateID,
			Code functionCode, String time, AssignedAuthor assignedAuthor,
			Person assignedPerson, String nullFlavor, String typeCode,
			String contextControlCode,
			RepresentedOrganization representedOrganization) {
		super();
		this.realmCode = realmCode;
		this.typeID = typeID;
		this.templateID = templateID;
		this.functionCode = functionCode;
		this.time = time;
		this.assignedAuthor = assignedAuthor;
		this.assignedPerson = assignedPerson;
		this.nullFlavor = nullFlavor;
		this.typeCode = typeCode;
		this.contextControlCode = contextControlCode;
		this.representedOrganization = representedOrganization;
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
	 * Gets the function code.
	 * 
	 * @return the function code
	 */
	public Code getFunctionCode() {
		return functionCode;
	}

	/**
	 * Sets the function code.
	 * 
	 * @param functionCode
	 *            the new function code
	 */
	public void setFunctionCode(Code functionCode) {
		this.functionCode = functionCode;
	}

	/**
	 * Gets the time.
	 * 
	 * @return the time
	 */
	public String getTime() {
		return time;
	}

	/**
	 * Sets the time.
	 * 
	 * @param time
	 *            the new time
	 */
	public void setTime(String time) {
		this.time = time;
	}

	/**
	 * Gets the assigned author.
	 * 
	 * @return the assigned author
	 */
	public AssignedAuthor getAssignedAuthor() {
		return assignedAuthor;
	}

	/**
	 * Sets the assigned author.
	 * 
	 * @param assignedAuthor
	 *            the new assigned author
	 */
	public void setAssignedAuthor(AssignedAuthor assignedAuthor) {
		this.assignedAuthor = assignedAuthor;
	}

	/**
	 * Gets the assigned person.
	 * 
	 * @return the assigned person
	 */
	public Person getAssignedPerson() {
		return assignedPerson;
	}

	/**
	 * Sets the assigned person.
	 * 
	 * @param assignedPerson
	 *            the new assigned person
	 */
	public void setAssignedPerson(Person assignedPerson) {
		this.assignedPerson = assignedPerson;
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
	 * Gets the context control code.
	 * 
	 * @return the context control code
	 */
	public String getContextControlCode() {
		return contextControlCode;
	}

	/**
	 * Sets the context control code.
	 * 
	 * @param contextControlCode
	 *            the new context control code
	 */
	public void setContextControlCode(String contextControlCode) {
		this.contextControlCode = contextControlCode;
	}

	/**
	 * Gets the represented organization.
	 * 
	 * @return the represented organization
	 */
	public RepresentedOrganization getRepresentedOrganization() {
		return representedOrganization;
	}

	/**
	 * Sets the represented organization.
	 * 
	 * @param representedOrganization
	 *            the new represented organization
	 */
	public void setRepresentedOrganization(
			RepresentedOrganization representedOrganization) {
		this.representedOrganization = representedOrganization;
	}
}