//

package de.fhg.isst.cda.classes;


import de.fhg.isst.cda.classes.ParentDocument;
import de.fhg.isst.cda.enumerations.XActRelationshipDocument;

// TODO: Auto-generated Javadoc
/**
 * The Class RelatedDocument.
 */
public class RelatedDocument   
{
	
	/** The type code. */
	private XActRelationshipDocument typeCode;
	
	/** The parent document. */
	private ParentDocument parentDocument;
	
	/**
	 * Gets the type code.
	 * 
	 * @return the type code
	 */
	public XActRelationshipDocument getTypeCode() {
		return typeCode;
	}
	
	/**
	 * Sets the type code.
	 * 
	 * @param typeCode
	 *            the new type code
	 */
	public void setTypeCode(XActRelationshipDocument typeCode) {
		this.typeCode = typeCode;
	}
	
	/**
	 * Gets the parent document.
	 * 
	 * @return the parent document
	 */
	public ParentDocument getParentDocument() {
		return parentDocument;
	}
	
	/**
	 * Sets the parent document.
	 * 
	 * @param parentDocument
	 *            the new parent document
	 */
	public void setParentDocument(ParentDocument parentDocument) {
		this.parentDocument = parentDocument;
	}
}


