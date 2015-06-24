package de.fhg.isst.cda.classes;


// TODO: Auto-generated Javadoc
/**
 * The Class LanguageCode.
 */
public class LanguageCode  extends Code 
{
    
    /** The code. */
    private String code;
    
    /**
    * {@inheritDoc}
    */
    public String getCode() {
        return code;
    }

    /**
    * {@inheritDoc}
    */
    public void setCode(String value) {
        code = value;
    }

    /** The code system. */
    private String codeSystem;
    
    /**
    * {@inheritDoc}
    */
    public String getCodeSystem() {
        return codeSystem;
    }

    /**
    * {@inheritDoc}
    */
    public void setCodeSystem(String value) {
        codeSystem = value;
    }

    /** The code system name. */
    private String codeSystemName;
    
    /**
    * {@inheritDoc}
    */
    public String getCodeSystemName() {
        return codeSystemName;
    }

    /**
    * {@inheritDoc}
    */
    public void setCodeSystemName(String value) {
        codeSystemName = value;
    }

    /** The code system version. */
    private String codeSystemVersion;
    
    /**
    * {@inheritDoc}
    */
    public String getCodeSystemVersion() {
        return codeSystemVersion;
    }

    /**
    * {@inheritDoc}
    */
    public void setCodeSystemVersion(String value) {
        codeSystemVersion = value;
    }

    /** The display name. */
    private String displayName;
    
    /**
    * {@inheritDoc}
    */
    public String getDisplayName() {
        return displayName;
    }

    /**
    * {@inheritDoc}
    */
    public void setDisplayName(String value) {
        displayName = value;
    }

    /**
	 * Instantiates a new language code.
	 * 
	 * @throws Exception
	 *             the exception
	 */
    public LanguageCode() throws Exception {
    }

    /**
	 * Instantiates a new language code.
	 * 
	 * @param code
	 *            the code
	 */
    public LanguageCode(String code){
        this.setCode(code);
    }

    /**
	 * Instantiates a new language code.
	 * 
	 * @param code
	 *            the code
	 * @param codeSystem
	 *            the code system
	 * @param codeSystemName
	 *            the code system name
	 * @param DisplayName
	 *            the display name
	 * @throws Exception
	 *             the exception
	 */
    public LanguageCode(String code, String codeSystem, String codeSystemName, String DisplayName) throws Exception {
        this.setCode(code);
        this.setCodeSystem(codeSystem);
        this.setCodeSystemName(codeSystemName);
        this.setDisplayName(DisplayName);
    }

}


