package de.fhg.isst.cda.choices.clinicalstatements;

import java.util.ArrayList;

import de.fhg.isst.cda.choices.guardian.Organization;
import de.fhg.isst.cda.classes.Code;
import de.fhg.isst.cda.classes.ID;
import de.fhg.isst.cda.classes.NullFlavor;
import de.fhg.isst.cda.classes.TemplateID;
import de.fhg.isst.cda.classes.TypeID;
import de.fhg.isst.cda.enumerations.StatusCode;

// TODO: Auto-generated Javadoc
/**
 * The Class OrganizationPartOf.
 */
public class OrganizationPartOf   
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
    
    /** The effective time. */
    private String effectiveTime;
    
    /** The whole organization. */
    private Organization wholeOrganization;
    
    /** The null flavor. */
    private NullFlavor nullFlavor;
    
    /** The class code. */
    private String classCode;
    
    /** The status code. */
    private StatusCode statusCode;
	
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
	 * Gets the effective time.
	 * 
	 * @return the effective time
	 */
	public String getEffectiveTime() {
		return effectiveTime;
	}
	
	/**
	 * Sets the effective time.
	 * 
	 * @param effectiveTime
	 *            the new effective time
	 */
	public void setEffectiveTime(String effectiveTime) {
		this.effectiveTime = effectiveTime;
	}
	
	/**
	 * Gets the whole organization.
	 * 
	 * @return the whole organization
	 */
	public Organization getWholeOrganization() {
		return wholeOrganization;
	}
	
	/**
	 * Sets the whole organization.
	 * 
	 * @param wholeOrganization
	 *            the new whole organization
	 */
	public void setWholeOrganization(Organization wholeOrganization) {
		this.wholeOrganization = wholeOrganization;
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
	 * Gets the status code.
	 * 
	 * @return the status code
	 */
	public StatusCode getStatusCode() {
		return statusCode;
	}
	
	/**
	 * Sets the status code.
	 * 
	 * @param statusCode
	 *            the new status code
	 */
	public void setStatusCode(StatusCode statusCode) {
		this.statusCode = statusCode;
	}
}