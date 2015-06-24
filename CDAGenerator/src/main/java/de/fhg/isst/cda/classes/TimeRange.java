package de.fhg.isst.cda.classes;

import java.util.ArrayList;

import de.fhg.isst.cda.enumerations.ItemsChoiceType2;

// TODO: Auto-generated Javadoc
/**
 * The Class TimeRange.
 */
public class TimeRange   
{
    
    /** The __ value. */
    private ArrayList<String> __Value = new ArrayList<String>();
    
    /**
	 * Gets the value.
	 * 
	 * @return the value
	 */
    public ArrayList<String> getValue() {
        return __Value;
    }

    /**
	 * Sets the value.
	 * 
	 * @param value
	 *            the new value
	 */
    public void setValue(ArrayList<String> value) {
        __Value = value;
    }

    /** The __ items choice type2. */
    private ArrayList<ItemsChoiceType2> __ItemsChoiceType2 = new ArrayList<ItemsChoiceType2>();
    
    /**
	 * Gets the items choice type2.
	 * 
	 * @return the items choice type2
	 */
    public ArrayList<ItemsChoiceType2> getItemsChoiceType2() {
        return __ItemsChoiceType2;
    }

    /**
	 * Sets the items choice type2.
	 * 
	 * @param value
	 *            the new items choice type2
	 */
    public void setItemsChoiceType2(ArrayList<ItemsChoiceType2> value) {
        __ItemsChoiceType2 = value;
    }

    /**
	 * Instantiates a new time range.
	 * 
	 * @throws Exception
	 *             the exception
	 */
    public TimeRange() throws Exception {
        this.setValue(new ArrayList<String>());
        this.setItemsChoiceType2(new ArrayList<ItemsChoiceType2>());
    }

}