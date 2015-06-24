package de.fhg.isst.cda.classes;

import java.util.ArrayList;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class Section.
 */
public class Section   
{
	
	/** The class code. */
	private String classCode;
	
	/** The mood code. */
	private String moodCode;
        
        /** The templateId */
        private List<ID> templateId;
	
	/** The id. */
	private ID id;
	
	/** The code. */
	private Code code;
	
	/** The title. */
	private String title;
	
	/** The text. */
	private String text;
	
	/** The confidentiality code. */
	private Code confidentialityCode;
	
	/** The language code. */
	private LanguageCode languageCode;
	
	/** The subject. */
	private Subject subject;
	
	/** The authors. */
	private ArrayList<Author> authors;
	
	/** The informants. */
	private ArrayList<Informant> informants;
	
	/** The entries. */
	private ArrayList<Entry> entries;
	
	/** The components5. */
	private ArrayList<Component5> components5;
	
	/**
	 * Instantiates a new section.
	 */
	public Section() {
		this.classCode = "DOCSECT";
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
	 * Gets the id.
	 * 
	 * @return the id
	 */
	public ID getId() {
		return id;
	}
	
	/**
	 * Sets the id.
	 * 
	 * @param id
	 *            the new id
	 */
	public void setId(ID id) {
		this.id = id;
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
	 * Gets the title.
	 * 
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * Sets the title.
	 * 
	 * @param title
	 *            the new title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * Gets the text.
	 * 
	 * @return the text
	 */
	public String getText() {
		return text;
	}
	
	/**
	 * Sets the text.
	 * 
	 * @param text
	 *            the new text
	 */
	public void setText(String text) {
		this.text = text;
	}
	
	/**
	 * Gets the confidentiality code.
	 * 
	 * @return the confidentiality code
	 */
	public Code getConfidentialityCode() {
		return confidentialityCode;
	}
	
	/**
	 * Sets the confidentiality code.
	 * 
	 * @param confidentialityCode
	 *            the new confidentiality code
	 */
	public void setConfidentialityCode(Code confidentialityCode) {
		this.confidentialityCode = confidentialityCode;
	}
	
	/**
	 * Gets the language code.
	 * 
	 * @return the language code
	 */
	public LanguageCode getLanguageCode() {
		return languageCode;
	}
	
	/**
	 * Sets the language code.
	 * 
	 * @param languageCode
	 *            the new language code
	 */
	public void setLanguageCode(LanguageCode languageCode) {
		this.languageCode = languageCode;
	}
	
	/**
	 * Gets the subject.
	 * 
	 * @return the subject
	 */
	public Subject getSubject() {
		return subject;
	}
	
	/**
	 * Sets the subject.
	 * 
	 * @param subject
	 *            the new subject
	 */
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	/**
	 * Gets the authors.
	 * 
	 * @return the authors
	 */
	public ArrayList<Author> getAuthors() {
		if(this.authors == null) {
			this.authors = new ArrayList<Author>();
		}
		return authors;
	}
	
	/**
	 * Sets the authors.
	 * 
	 * @param authors
	 *            the new authors
	 */
	public void setAuthors(ArrayList<Author> authors) {
		if(this.authors == null) {
			this.authors = new ArrayList<Author>();
		}
		this.authors = authors;
	}
	
	/**
	 * Gets the informants.
	 * 
	 * @return the informants
	 */
	public ArrayList<Informant> getInformants() {
		if(this.informants == null) {
			this.informants = new ArrayList<Informant>();
		}
		return informants;
	}
	
	/**
	 * Sets the informants.
	 * 
	 * @param informants
	 *            the new informants
	 */
	public void setInformants(ArrayList<Informant> informants) {
		if(this.informants == null) {
			this.informants = new ArrayList<Informant>();
		}
		this.informants = informants;
	}
	
	/**
	 * Gets the entries.
	 * 
	 * @return the entries
	 */
	public ArrayList<Entry> getEntries() {
		if(this.entries == null) {
			this.entries = new ArrayList<Entry>();
		}
		return entries;
	}
	
	/**
	 * Sets the entries.
	 * 
	 * @param entries
	 *            the new entries
	 */
	public void setEntries(ArrayList<Entry> entries) {
		this.entries = entries;
	}
	
	/**
	 * Gets the components5.
	 * 
	 * @return the components5
	 */
	public ArrayList<Component5> getComponents5() {
		if(this.components5 == null) {
			this.components5 = new ArrayList<Component5>();
		}
		return components5;
	}
	
	/**
	 * Sets the components5.
	 * 
	 * @param components5
	 *            the new components5
	 */
	public void setComponents5(ArrayList<Component5> components5) {
		this.components5 = components5;
	}

    public List<ID> getTemplateId() {
        if (templateId==null){
            this.templateId= new ArrayList<>();
        }
        return templateId;
    }

    public void setTemplateId(List<ID> templateId) {
        this.templateId = templateId;
    }
}