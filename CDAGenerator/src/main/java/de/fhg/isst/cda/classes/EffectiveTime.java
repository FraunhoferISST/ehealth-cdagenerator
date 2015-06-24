package de.fhg.isst.cda.classes;

import de.fhg.isst.cda.classes.Period;
import de.fhg.isst.cda.classes.TimeRange;

// TODO: Auto-generated Javadoc
/**
 * The Class EffectiveTime.
 */
public class EffectiveTime   
{
    
    /** The value. */
    private String value;
    
    /** The period. */
    private Period period;
    
    /** The time range. */
    private TimeRange timeRange;

    private String high;
    private String low;

    /**
	 * Instantiates a new effective time.
	 */
    public EffectiveTime(){
    }

    /**
	 * Instantiates a new effective time.
	 * 
	 * @param value
	 *            the value
	 */
    public EffectiveTime(String value){
        this.setValue(value);
    }
    
    /**
	 * Gets the value.
	 * 
	 * @return the value
	 */
    public String getValue() {
        return value;
    }

    /**
	 * Sets the value.
	 * 
	 * @param value
	 *            the new value
	 */
    public void setValue(String value) {
        this.value = value;
    }

    /**
	 * Gets the period.
	 * 
	 * @return the period
	 */
    public Period getPeriod() {
        return period;
    }

    /**
	 * Sets the period.
	 * 
	 * @param value
	 *            the new period
	 */
    public void setPeriod(Period value) {
        period = value;
    }

    /**
	 * Gets the time range.
	 * 
	 * @return the time range
	 */
    public TimeRange getTimeRange() {
        return timeRange;
    }

    /**
	 * Sets the time range.
	 * 
	 * @param value
	 *            the new time range
	 */
    public void setTimeRange(TimeRange value) {
        timeRange = value;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }
    
    
}