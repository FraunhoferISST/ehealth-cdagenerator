package de.fhg.isst.cda.classes;

import javax.xml.bind.JAXBElement;

// TODO: Auto-generated Javadoc
/**
 * The Class Participant.
 */
public class Participant {

    /** The type code. */
    private String typeCode;

    /** The function code. */
    private Code functionCode;

    /** The context control code. */
    private Code contextControlCode;

    /** The time. */
    // private String time;
    private IVLTS time;

    /** The associated entity. */
    private AssociatedEntity associatedEntity;

    /**
     * Instantiates a new participant.
     */
    public Participant() {
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
     * Gets the function code.
     * 
     * @return the function code
     */
    public Code getFunctionCode() {
	return functionCode;
    }

    /**
     * Sets the function code.
     * 
     * @param functionCode
     *            the new function code
     */
    public void setFunctionCode(Code functionCode) {
	this.functionCode = functionCode;
    }

    /**
     * Gets the context control code.
     * 
     * @return the context control code
     */
    public Code getContextControlCode() {
	return contextControlCode;
    }

    /**
     * Sets the context control code.
     * 
     * @param contextControlCode
     *            the new context control code
     */
    public void setContextControlCode(Code contextControlCode) {
	this.contextControlCode = contextControlCode;
    }

    /**
     * Gets the time.
     * 
     * @return the time
     */
    public IVLTS getTime() {
        if (time==null){
            time = new IVLTS();
        }
	return time;
    }

    /**
     * Sets the time.
     * 
     * @param time
     *            the new time
     */
    public void setTime(IVLTS time) {
	this.time = time;
    }


    /**
     * Gets the associated entity.
     * 
     * @return the associated entity
     */
    public AssociatedEntity getAssociatedEntity() {
	return associatedEntity;
    }

    /**
     * Sets the associated entity.
     * 
     * @param associatedEntity
     *            the new associated entity
     */
    public void setAssociatedEntity(AssociatedEntity associatedEntity) {
	this.associatedEntity = associatedEntity;
    }
}
