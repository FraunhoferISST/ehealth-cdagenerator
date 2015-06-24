package de.fhg.isst.cda.choices;

import de.fhg.isst.cda.choices.author.AuthorChoice;
import de.fhg.isst.cda.choices.guardian.GuardianChoice;

// TODO: Auto-generated Javadoc
/**
 * The Class Person.
 */
public class Person implements AuthorChoice, GuardianChoice {
	
	/** The class code. */
	private String classCode;
	
	/** The determiner code. */
	private String determinerCode;
	
	/** The given name. */
	private String givenName;
    
    /** The family name. */
    private String familyName;
    
    /** The prefix. */
    private String prefix;
    
    /** The suffix. */
    private String suffix;
    
    /**
	 * Instantiates a new person.
	 */
    public Person() {
    	this.classCode = "PSN";
    	this.determinerCode = "INSTANCE";
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
	 * Gets the determiner code.
	 * 
	 * @return the determiner code
	 */
	public String getDeterminerCode() {
		return determinerCode;
	}
	
	/**
	 * Sets the determiner code.
	 * 
	 * @param determinerCode
	 *            the new determiner code
	 */
	public void setDeterminerCode(String determinerCode) {
		this.determinerCode = determinerCode;
	}
	
	/**
	 * Gets the given name.
	 * 
	 * @return the given name
	 */
	public String getGivenName() {
		return givenName;
	}
	
	/**
	 * Sets the given name.
	 * 
	 * @param givenName
	 *            the new given name
	 */
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	
	/**
	 * Gets the family name.
	 * 
	 * @return the family name
	 */
	public String getFamilyName() {
		return familyName;
	}
	
	/**
	 * Sets the family name.
	 * 
	 * @param familyName
	 *            the new family name
	 */
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	
	/**
	 * Gets the suffix.
	 * 
	 * @return the suffix
	 */
	public String getSuffix() {
		return suffix;
	}
	
	/**
	 * Sets the suffix.
	 * 
	 * @param suffix
	 *            the new suffix
	 */
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
        
        
}