package de.fhg.isst.cda.classes;

import java.util.ArrayList;

import de.fhg.isst.cda.choices.entity.EntityChoice;

// TODO: Auto-generated Javadoc
/**
 * The Class ParticipantRole.
 */
public class ParticipantRole   
{
	
	/** The class code. */
	private String classCode;
	
	/** The ids. */
	private ArrayList<ID> ids;
	
	/** The code. */
	private Code code;
	
	/** The addrs. */
	private ArrayList<Address> addrs;
	
	/** The telecoms. */
	private ArrayList<Telecom> telecoms;
	
	/** The entity choice. */
	private EntityChoice entityChoice;
	
	/** The scoping entity. */
	private Entity scopingEntity;
	
	/**
	 * Instantiates a new participant role.
	 */
	public ParticipantRole() {
		this.classCode = "ROL";
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
	 * Gets the entity choice.
	 * 
	 * @return the entity choice
	 */
	public EntityChoice getEntityChoice() {
		return entityChoice;
	}
	
	/**
	 * Sets the entity choice.
	 * 
	 * @param entityChoice
	 *            the new entity choice
	 */
	public void setEntityChoice(EntityChoice entityChoice) {
		this.entityChoice = entityChoice;
	}
	
	/**
	 * Gets the scoping entity.
	 * 
	 * @return the scoping entity
	 */
	public Entity getScopingEntity() {
		return scopingEntity;
	}
	
	/**
	 * Sets the scoping entity.
	 * 
	 * @param scopingEntity
	 *            the new scoping entity
	 */
	public void setScopingEntity(Entity scopingEntity) {
		this.scopingEntity = scopingEntity;
	}

}