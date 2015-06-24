package de.fhg.isst.cda.classes;

// TODO: Auto-generated Javadoc

import java.util.ArrayList;
import java.util.List;

/**
 * The Class Entry.
 */
public class Entry   
{
        /** The templateId */
        private List<ID> templateId;
    
	/** The type code. */
	private XActRelationshipEntry typeCode;
	
	/** The context conduction ind. */
	private boolean contextConductionInd;
	
	/** The clinical statement. */
	private ClinicalStatement clinicalStatement;
	
	/**
	 * Instantiates a new entry.
	 */
	public Entry() {
		this.typeCode = XActRelationshipEntry.COMP;
		this.contextConductionInd = true;
	}
	
	/**
	 * Gets the type code.
	 * 
	 * @return the type code
	 */
	public XActRelationshipEntry getTypeCode() {
		return typeCode;
	}
	
	/**
	 * Sets the type code.
	 * 
	 * @param typeCode
	 *            the new type code
	 */
	public void setTypeCode(XActRelationshipEntry typeCode) {
		this.typeCode = typeCode;
	}
	
	/**
	 * Checks if is context conduction ind.
	 * 
	 * @return true, if is context conduction ind
	 */
	public boolean isContextConductionInd() {
		return contextConductionInd;
	}
	
	/**
	 * Sets the context conduction ind.
	 * 
	 * @param contextConductionInd
	 *            the new context conduction ind
	 */
	public void setContextConductionInd(boolean contextConductionInd) {
		this.contextConductionInd = contextConductionInd;
	}
	
	/**
	 * Gets the clinical statement.
	 * 
	 * @return the clinical statement
	 */
	public ClinicalStatement getClinicalStatement() {
		return clinicalStatement;
	}
	
	/**
	 * Sets the clinical statement.
	 * 
	 * @param clinicalStatement
	 *            the new clinical statement
	 */
	public void setClinicalStatement(ClinicalStatement clinicalStatement) {
		this.clinicalStatement = clinicalStatement;
	}

    public List<ID> getTemplateId() {
        if (templateId==null){
            templateId = new ArrayList<>();
        }
        return templateId;
    }

    public void setTemplateId(List<ID> templateId) {
        this.templateId = templateId;
    }
        
        
}