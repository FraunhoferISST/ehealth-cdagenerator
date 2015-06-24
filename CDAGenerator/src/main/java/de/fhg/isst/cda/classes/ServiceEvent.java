package de.fhg.isst.cda.classes;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class ServiceEvent.
 */
public class ServiceEvent {
	
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
	
	/** The performers. */
	private ArrayList<Performer> performers;
	
	/**
	 * Instantiates a new service event.
	 */
	public ServiceEvent() {
		this.classCode = "ACT";
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
	 * @param active
	 *            the new mood code
	 */
	public void setMoodCode(String code) {
		this.moodCode = code;
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
	 * Gets the performers.
	 * 
	 * @return the performers
	 */
	public ArrayList<Performer> getPerformers() {
		if(this.performers == null) {
			this.performers = new ArrayList<Performer>();
		}
		return performers;
	}
	
	/**
	 * Sets the performers.
	 * 
	 * @param performers
	 *            the new performers
	 */
	public void setPerformers(ArrayList<Performer> performers) {
		this.performers = performers;
	}
}
