package de.fhg.isst.cda.classes;

import java.util.ArrayList;

import de.fhg.isst.cda.choices.author.AuthorChoice;

// TODO: Auto-generated Javadoc
/**
 * The Class AssignedAuthor.
 */
public class AssignedAuthor   
{
    
    /** The realm code. */
    private Code realmCode;
    
    /** The type id. */
    private TypeID typeID;
    
    /** The template id. */
    private TemplateID templateID;
    
    /** The ids. */
    private ArrayList<ID> ids;
    
    /** The code. */
    private Code code;
    
    /** The addresses. */
    private ArrayList<Address> addresses;
    
    /** The telecoms. */
    private ArrayList<Telecom> telecoms;
    
    /** The item. */
    private Object item;
    
    /** The represented organization. */
    private RepresentedOrganization representedOrganization;
    
    /** The null flavor. */
    private String nullFlavor;
    
    /** The class code. */
    private String classCode;
    
    /** The author choice. */
    private AuthorChoice authorChoice;
	

    /**
	 * Instantiates a new assigned author.
	 */
    public AssignedAuthor() {
    	this.classCode = "ASSIGNED";
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
	 * Gets the ids.
	 * 
	 * @return the ids
	 */
	public ArrayList<ID> getIds() {
		if(this.ids == null) {
			this.ids = new ArrayList<ID>();
		}
		return this.ids;
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
	 * Gets the code.
	 * 
	 * @return the code
	 */
	public Code getCode() {
		return code;
	}
	
	/**
	 * Sets the code.
	 * 
	 * @param code
	 *            the new code
	 */
	public void setCode(Code code) {
		this.code = code;
	}
	
	/**
	 * Gets the addresses.
	 * 
	 * @return the addresses
	 */
	public ArrayList<Address> getAddresses() {
		if(this.addresses == null) {
			this.addresses = new ArrayList<Address>();
		}
		return addresses;
	}
	
	/**
	 * Sets the addresses.
	 * 
	 * @param addresses
	 *            the new addresses
	 */
	public void setAddresses(ArrayList<Address> addresses) {
		this.addresses = addresses;
	}
	
	/**
	 * Gets the telecoms.
	 * 
	 * @return the telecoms
	 */
	public ArrayList<Telecom> getTelecoms() {
		if(this.telecoms == null) {
			this.telecoms = new ArrayList<Telecom>();
		}
		return telecoms;
	}
	
	/**
	 * Sets the telecoms.
	 * 
	 * @param telecoms
	 *            the new telecoms
	 */
	public void setTelecoms(ArrayList<Telecom> telecoms) {
		this.telecoms = telecoms;
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
	public void setRepresentedOrganization(RepresentedOrganization representedOrganization) {
		this.representedOrganization = representedOrganization;
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
	 * Gets the class code.
	 * 
	 * @return the class code
	 */
	public String getClassCode() {
		return classCode;
	}
	
	/**
	 * Sets the class code.
	 * 
	 * @param classCode
	 *            the new class code
	 */
	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	/**
	 * Gets the author choice.
	 * 
	 * @return the author choice
	 */
	public AuthorChoice getAuthorChoice() {
		return authorChoice;
	}

	/**
	 * Sets the author choice.
	 * 
	 * @param authorChoice
	 *            the new author choice
	 */
	public void setAuthorChoice(AuthorChoice authorChoice) {
		this.authorChoice = authorChoice;
	}
	
}