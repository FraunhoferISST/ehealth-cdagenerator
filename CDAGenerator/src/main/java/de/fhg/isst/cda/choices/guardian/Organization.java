package de.fhg.isst.cda.choices.guardian;

import java.util.ArrayList;

import de.fhg.isst.cda.choices.clinicalstatements.OrganizationPartOf;
import de.fhg.isst.cda.classes.Address;
import de.fhg.isst.cda.classes.Code;
import de.fhg.isst.cda.classes.ID;
import de.fhg.isst.cda.classes.Telecom;
import de.fhg.isst.cda.classes.TemplateID;
import de.fhg.isst.cda.classes.TypeID;

// TODO: Auto-generated Javadoc
/**
 * The Class Organization.
 */
public class Organization implements GuardianChoice
{
    
    /** The realm code. */
    private Code realmCode;
    
    /** The status code. */
    private Code statusCode;
    
    /** The type id. */
    private TypeID typeID;
    
    /** The template id. */
    private TemplateID templateID;
    
    /** The ids. */
    private ArrayList<ID> ids;
    
    /** The name. */
    private String name;
    
    /** The telecoms. */
    private ArrayList<Telecom> telecoms;
    
    /** The addrs. */
    private ArrayList<Address> addrs;
    
    /** The standard industry class code. */
    private Code standardIndustryClassCode;
    
    /** The organization part of. */
    private OrganizationPartOf organizationPartOf;
    
    /** The null flavor. */
    private String nullFlavor;
    
    /** The class code. */
    private String classCode;
    
    /** The determiner code. */
    private String determinerCode;
    
    /**
	 * Instantiates a new organization.
	 */
    public Organization() {
    	this.classCode = "ORG";
    	this.determinerCode = "INSTANCE";
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
	 * Gets the status code.
	 * 
	 * @return the status code
	 */
	public Code getStatusCode() {
		return statusCode;
	}
	
	/**
	 * Sets the status code.
	 * 
	 * @param statusCode
	 *            the new status code
	 */
	public void setStatusCode(Code statusCode) {
		this.statusCode = statusCode;
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
		return ids;
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
	 * Gets the name.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name.
	 * 
	 * @param name
	 *            the new name
	 */
	public void setName(String name) {
		this.name = name;
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
	 * Gets the addrs.
	 * 
	 * @return the addrs
	 */
	public ArrayList<Address> getAddrs() {
		if(this.addrs == null) {
			this.addrs = new ArrayList<Address>();
		}
		return addrs;
	}
	
	/**
	 * Sets the addrs.
	 * 
	 * @param addrs
	 *            the new addrs
	 */
	public void setAddrs(ArrayList<Address> addrs) {
		this.addrs = addrs;
	}
	
	/**
	 * Gets the standard industry class code.
	 * 
	 * @return the standard industry class code
	 */
	public Code getStandardIndustryClassCode() {
		return standardIndustryClassCode;
	}
	
	/**
	 * Sets the standard industry class code.
	 * 
	 * @param standardIndustryClassCode
	 *            the new standard industry class code
	 */
	public void setStandardIndustryClassCode(Code standardIndustryClassCode) {
		this.standardIndustryClassCode = standardIndustryClassCode;
	}
	
	/**
	 * Gets the organization part of.
	 * 
	 * @return the organization part of
	 */
	public OrganizationPartOf getOrganizationPartOf() {
		return organizationPartOf;
	}
	
	/**
	 * Sets the organization part of.
	 * 
	 * @param organizationPartOf
	 *            the new organization part of
	 */
	public void setOrganizationPartOf(OrganizationPartOf organizationPartOf) {
		this.organizationPartOf = organizationPartOf;
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
	 * Gets the determiner code.
	 * 
	 * @return the determiner code
	 */
	public String getDeterminerCode() {
		return determinerCode;
	}
	
	/**
	 * Sets the determiner code.
	 * 
	 * @param determinerCode
	 *            the new determiner code
	 */
	public void setDeterminerCode(String determinerCode) {
		this.determinerCode = determinerCode;
	}
    
    
}