//

package de.fhg.isst.cda.classes;

import de.fhg.isst.cda.classes.Author;
import de.fhg.isst.cda.classes.Code;
import de.fhg.isst.cda.classes.EffectiveTime;
import de.fhg.isst.cda.classes.ID;
import de.fhg.isst.cda.classes.Informant;
import de.fhg.isst.cda.classes.LanguageCode;
import de.fhg.isst.cda.classes.Participant2;
import de.fhg.isst.cda.classes.Performer2;
import de.fhg.isst.cda.classes.Specimen;
import de.fhg.isst.cda.classes.Subject;
import de.fhg.isst.cda.classes.TemplateID;
import de.fhg.isst.cda.classes.TypeID;

// TODO: Auto-generated Javadoc
/**
 * The Class EntryType.
 */
public class EntryType   
{
    
    /** The __ realm code. */
    private Code __RealmCode;
    
    /**
	 * Gets the realm code.
	 * 
	 * @return the realm code
	 */
    public Code getRealmCode() {
        return __RealmCode;
    }

    /**
	 * Sets the realm code.
	 * 
	 * @param value
	 *            the new realm code
	 */
    public void setRealmCode(Code value) {
        __RealmCode = value;
    }

    /** The __ type id. */
    private TypeID __TypeID;
    
    /**
	 * Gets the type id.
	 * 
	 * @return the type id
	 */
    public TypeID getTypeID() {
        return __TypeID;
    }

    /**
	 * Sets the type id.
	 * 
	 * @param value
	 *            the new type id
	 */
    public void setTypeID(TypeID value) {
        __TypeID = value;
    }

    /** The __ template id. */
    private TemplateID __TemplateID;
    
    /**
	 * Gets the template id.
	 * 
	 * @return the template id
	 */
    public TemplateID getTemplateID() {
        return __TemplateID;
    }

    /**
	 * Sets the template id.
	 * 
	 * @param value
	 *            the new template id
	 */
    public void setTemplateID(TemplateID value) {
        __TemplateID = value;
    }

    /** The id. */
    private ID __ID;
    
    /**
	 * Gets the id.
	 * 
	 * @return the id
	 */
    public ID getID() {
        return __ID;
    }

    /**
	 * Sets the id.
	 * 
	 * @param value
	 *            the new id
	 */
    public void setID(ID value) {
        __ID = value;
    }

    /** The __ code. */
    private Code __Code;
    
    /**
	 * Gets the code.
	 * 
	 * @return the code
	 */
    public Code getCode() {
        return __Code;
    }

    /**
	 * Sets the code.
	 * 
	 * @param value
	 *            the new code
	 */
    public void setCode(Code value) {
        __Code = value;
    }

    /** The __ text. */
    private String __Text = new String();
    
    /**
	 * Gets the text.
	 * 
	 * @return the text
	 */
    public String getText() {
        return __Text;
    }

    /**
	 * Sets the text.
	 * 
	 * @param value
	 *            the new text
	 */
    public void setText(String value) {
        __Text = value;
    }

    /** The __ status code. */
    private Code __StatusCode;
    
    /**
	 * Gets the status code.
	 * 
	 * @return the status code
	 */
    public Code getStatusCode() {
        return __StatusCode;
    }

    /**
	 * Sets the status code.
	 * 
	 * @param value
	 *            the new status code
	 */
    public void setStatusCode(Code value) {
        __StatusCode = value;
    }

    /** The __ effective time. */
    private EffectiveTime __EffectiveTime;
    
    /**
	 * Gets the effective time.
	 * 
	 * @return the effective time
	 */
    public EffectiveTime getEffectiveTime() {
        return __EffectiveTime;
    }

    /**
	 * Sets the effective time.
	 * 
	 * @param value
	 *            the new effective time
	 */
    public void setEffectiveTime(EffectiveTime value) {
        __EffectiveTime = value;
    }

    /** The __ priority code. */
    private Code __PriorityCode;
    
    /**
	 * Gets the priority code.
	 * 
	 * @return the priority code
	 */
    public Code getPriorityCode() {
        return __PriorityCode;
    }

    /**
	 * Sets the priority code.
	 * 
	 * @param value
	 *            the new priority code
	 */
    public void setPriorityCode(Code value) {
        __PriorityCode = value;
    }

    /** The __ language code. */
    private LanguageCode __LanguageCode;
    
    /**
	 * Gets the language code.
	 * 
	 * @return the language code
	 */
    public LanguageCode getLanguageCode() {
        return __LanguageCode;
    }

    /**
	 * Sets the language code.
	 * 
	 * @param value
	 *            the new language code
	 */
    public void setLanguageCode(LanguageCode value) {
        __LanguageCode = value;
    }

    /** The __ subject. */
    private Subject __Subject;
    
    /**
	 * Gets the subject.
	 * 
	 * @return the subject
	 */
    public Subject getSubject() {
        return __Subject;
    }

    /**
	 * Sets the subject.
	 * 
	 * @param value
	 *            the new subject
	 */
    public void setSubject(Subject value) {
        __Subject = value;
    }

    /** The __ specimen. */
    private Specimen __Specimen;
    
    /**
	 * Gets the specimen.
	 * 
	 * @return the specimen
	 */
    public Specimen getSpecimen() {
        return __Specimen;
    }

    /**
	 * Sets the specimen.
	 * 
	 * @param value
	 *            the new specimen
	 */
    public void setSpecimen(Specimen value) {
        __Specimen = value;
    }

    /** The __ performer. */
    private Performer2 __Performer;
    
    /**
	 * Gets the performer.
	 * 
	 * @return the performer
	 */
    public Performer2 getPerformer() {
        return __Performer;
    }

    /**
	 * Sets the performer.
	 * 
	 * @param value
	 *            the new performer
	 */
    public void setPerformer(Performer2 value) {
        __Performer = value;
    }

    /** The __ author. */
    private Author __Author;
    
    /**
	 * Gets the author.
	 * 
	 * @return the author
	 */
    public Author getAuthor() {
        return __Author;
    }

    /**
	 * Sets the author.
	 * 
	 * @param value
	 *            the new author
	 */
    public void setAuthor(Author value) {
        __Author = value;
    }

    /** The __ informant. */
    private Informant __Informant;
    
    /**
	 * Gets the informant.
	 * 
	 * @return the informant
	 */
    public Informant getInformant() {
        return __Informant;
    }

    /**
	 * Sets the informant.
	 * 
	 * @param value
	 *            the new informant
	 */
    public void setInformant(Informant value) {
        __Informant = value;
    }

    /** The __ participant. */
    private Participant2 __Participant;
    
    /**
	 * Gets the participant.
	 * 
	 * @return the participant
	 */
    public Participant2 getParticipant() {
        return __Participant;
    }

    /**
	 * Sets the participant.
	 * 
	 * @param value
	 *            the new participant
	 */
    public void setParticipant(Participant2 value) {
        __Participant = value;
    }

}


//public EntryRelationship