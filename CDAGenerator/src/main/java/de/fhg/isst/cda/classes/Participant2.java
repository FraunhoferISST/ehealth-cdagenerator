package de.fhg.isst.cda.classes;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class Participant2.
 */
public class Participant2   
{
    
    /** The realm code. */
    private Code realmCode;
    
    /** The type id. */
    private TypeID typeId;
    
    /** The template id. */
    private TemplateID templateID;
    
    /** The time. */
    private String time;
    
    /** The awareness code. */
    private Code awarenessCode;
    
    /** The participant roles. */
    private ArrayList<ParticipantRole> participantRoles;
    
    /** The null flavor. */
    private String nullFlavor;
    
    /** The type code. */
    private String typeCode;
    
    /** The context control code. */
    private String contextControlCode;
    
    /**
	 * Instantiates a new participant2.
	 */
    public Participant2() {
    	this.contextControlCode = "OP";
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
	public TypeID getTypeId() {
		return typeId;
	}
	
	/**
	 * Sets the type id.
	 * 
	 * @param typeId
	 *            the new type id
	 */
	public void setTypeId(TypeID typeId) {
		this.typeId = typeId;
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
	 * Gets the awareness code.
	 * 
	 * @return the awareness code
	 */
	public Code getAwarenessCode() {
		return awarenessCode;
	}
	
	/**
	 * Sets the awareness code.
	 * 
	 * @param awarenessCode
	 *            the new awareness code
	 */
	public void setAwarenessCode(Code awarenessCode) {
		this.awarenessCode = awarenessCode;
	}

	/**
	 * Gets the participant roles.
	 * 
	 * @return the participant roles
	 */
	public ArrayList<ParticipantRole> getParticipantRoles() {
		if(this.participantRoles == null) {
			this.participantRoles = new ArrayList<ParticipantRole>();
		}
		return participantRoles;
	}

	/**
	 * Sets the participant roles.
	 * 
	 * @param participantRoles
	 *            the new participant roles
	 */
	public void setParticipantRoles(ArrayList<ParticipantRole> participantRoles) {
		this.participantRoles = participantRoles;
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
    
    
}


