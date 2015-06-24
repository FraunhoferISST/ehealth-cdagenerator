package de.fhg.isst.cda.classes;

import java.util.ArrayList;

import de.fhg.isst.cda.choices.entity.PlayingEntity;
import de.fhg.isst.cda.enumerations.RoleClassSpecimen;

// TODO: Auto-generated Javadoc
/**
 * The Class SpecimenRole.
 */
public class SpecimenRole   
{
	
	/** The class code. */
	private RoleClassSpecimen classCode;
	
	/** The ids. */
	private ArrayList<ID> ids;
	
	/** The specimen playing entity. */
	private PlayingEntity specimenPlayingEntity;
	
	/**
	 * Instantiates a new specimen role.
	 */
	public SpecimenRole() {
		this.classCode = RoleClassSpecimen.SPEC;
	}
	
	/**
	 * Gets the class code.
	 * 
	 * @return the class code
	 */
	public RoleClassSpecimen getClassCode() {
		return classCode;
	}
	
	/**
	 * Sets the class code.
	 * 
	 * @param classCode
	 *            the new class code
	 */
	public void setClassCode(RoleClassSpecimen classCode) {
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
	 * Gets the specimen playing entity.
	 * 
	 * @return the specimen playing entity
	 */
	public PlayingEntity getSpecimenPlayingEntity() {
		return specimenPlayingEntity;
	}
	
	/**
	 * Sets the specimen playing entity.
	 * 
	 * @param specimenPlayingEntity
	 *            the new specimen playing entity
	 */
	public void setSpecimenPlayingEntity(PlayingEntity specimenPlayingEntity) {
		this.specimenPlayingEntity = specimenPlayingEntity;
	}
	
	
}