package de.fhg.isst.cda.classes;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class EncompassingEncounter.
 */
public class EncompassingEncounter   
{
	
	/** The class code. */
	private String classCode;
	
	/** The mood code. */
	private String moodCode;
	
	/** The ids. */
	private ArrayList<ID> ids;
	
	/** The code. */
	private Code code;
	
	/** The effective time. */
	private EffectiveTime effectiveTime;
	
	/** The discharge disposition code. */
	private Code dischargeDispositionCode;
	
	/** The responsible party. */
	private ResponsibleParty responsibleParty;
	
	/** The encounter participants. */
	private ArrayList<EncounterParticipant> encounterParticipants;
	
	/** The location. */
	private Location location;

	/**
	 * Instantiates a new encompassing encounter.
	 */
	public EncompassingEncounter() {
		this.classCode = "ENC";
		this.moodCode = "EVN";
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
	 * Gets the mood code.
	 * 
	 * @return the mood code
	 */
	public String getMoodCode() {
		return moodCode;
	}
	
	/**
	 * Sets the mood code.
	 * 
	 * @param moodCode
	 *            the new mood code
	 */
	public void setMoodCode(String moodCode) {
		this.moodCode = moodCode;
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
	public EffectiveTime getEffectiveTime() {
		return effectiveTime;
	}
	
	/**
	 * Sets the effective time.
	 * 
	 * @param effectiveTime
	 *            the new effective time
	 */
	public void setEffectiveTime(EffectiveTime effectiveTime) {
		this.effectiveTime = effectiveTime;
	}
	
	/**
	 * Gets the discharge disposition code.
	 * 
	 * @return the discharge disposition code
	 */
	public Code getDischargeDispositionCode() {
		return dischargeDispositionCode;
	}
	
	/**
	 * Sets the discharge disposition code.
	 * 
	 * @param dischargeDispositionCode
	 *            the new discharge disposition code
	 */
	public void setDischargeDispositionCode(Code dischargeDispositionCode) {
		this.dischargeDispositionCode = dischargeDispositionCode;
	}
	
	/**
	 * Gets the responsible party.
	 * 
	 * @return the responsible party
	 */
	public ResponsibleParty getResponsibleParty() {
		return responsibleParty;
	}
	
	/**
	 * Sets the responsible party.
	 * 
	 * @param responsibleParty
	 *            the new responsible party
	 */
	public void setResponsibleParty(ResponsibleParty responsibleParty) {
		this.responsibleParty = responsibleParty;
	}
	
	/**
	 * Gets the encounter participants.
	 * 
	 * @return the encounter participants
	 */
	public ArrayList<EncounterParticipant> getEncounterParticipants() {
		if(this.encounterParticipants == null) {
			this.encounterParticipants = new ArrayList<EncounterParticipant>();
		}
		return encounterParticipants;
	}
	
	/**
	 * Sets the encounter participants.
	 * 
	 * @param encounterParticipants
	 *            the new encounter participants
	 */
	public void setEncounterParticipants(ArrayList<EncounterParticipant> encounterParticipants) {
		this.encounterParticipants = encounterParticipants;
	}
	
	/**
	 * Gets the location.
	 * 
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}
	
	/**
	 * Sets the location.
	 * 
	 * @param location
	 *            the new location
	 */
	public void setLocation(Location location) {
		this.location = location;
	}

	
}