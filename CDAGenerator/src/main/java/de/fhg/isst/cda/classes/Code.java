package de.fhg.isst.cda.classes;

import de.fhg.isst.cda.classes.Any;
import de.fhg.isst.cda.classes.Cr;
import de.fhg.isst.cda.classes.ICode;

// TODO: Auto-generated Javadoc
/**
 * The Class Code.
 */
public class Code extends Any implements ICode {

	/** The qualifier. */
	private Cr qualifier;

	/** The original text. */
	private String originalText;

	/** The code. */
	private String code;

	/** The code system. */
	private String codeSystem;

	/** The code system name. */
	private String codeSystemName;

	/** The code system version. */
	private String codeSystemVersion;

	/** The display name. */
	private String displayName;

	/**
	 * Instantiates a new code.
	 */
	public Code() {
		super();
	}

	/**
	 * Instantiates a new code.
	 * 
	 * @param code
	 *            the code
	 */
	public Code(String code) {
		this.code = code;
	}

	/**
	 * Instantiates a new code.
	 * 
	 * @param code
	 *            the code
	 * @param codeSystem
	 *            the code system
	 */
	public Code(String code, String codeSystem) {
		this.code = code;
		this.codeSystem = codeSystem;
	}

	/**
	 * Instantiates a new code.
	 * 
	 * @param code
	 *            the code
	 * @param codeSystem
	 *            the code system
	 * @param codeSystemName
	 *            the code system name
	 */
	public Code(String code, String codeSystem, String codeSystemName) {
		this.code = code;
		this.codeSystem = codeSystem;
		this.codeSystemName = codeSystemName;
	}

	/**
	 * Instantiates a new code.
	 * 
	 * @param code
	 *            the code
	 * @param codeSystem
	 *            the code system
	 * @param codeSystemName
	 *            the code system name
	 * @param codeSystemVersion
	 *            the code system version
	 */
	public Code(String code, String codeSystem, String codeSystemName, String codeSystemVersion) {
		this.code = code;
		this.codeSystem = codeSystem;
		this.codeSystemName = codeSystemName;
		this.codeSystemVersion = codeSystemVersion;
	}

	public Code(String code, String codeSystem, String codeSystemName, String codeSystemVersion, String displayName) {
		this.code = code;
		this.codeSystem = codeSystem;
		this.codeSystemName = codeSystemName;
		this.codeSystemVersion = codeSystemVersion;
		this.displayName = displayName;
	}

	/**
	 * Instantiates a new code.
	 * 
	 * @param qualifier
	 *            the qualifier
	 * @param originalText
	 *            the original text
	 * @param code
	 *            the code
	 * @param codeSystem
	 *            the code system
	 * @param codeSystemName
	 *            the code system name
	 * @param codeSystemVersion
	 *            the code system version
	 * @param displayName
	 *            the display name
	 */
	public Code(Cr qualifier, String originalText, String code, String codeSystem, String codeSystemName, String codeSystemVersion, String displayName) {
		super();
		this.qualifier = qualifier;
		this.originalText = originalText;
		this.code = code;
		this.codeSystem = codeSystem;
		this.codeSystemName = codeSystemName;
		this.codeSystemVersion = codeSystemVersion;
		this.displayName = displayName;
	}

	/**
	 * {@inheritDoc}
	 */
	public Cr getQualifier() {
		return qualifier;
	}

	/**
	 * {@inheritDoc}
	 */
	public void setQualifier(Cr qualifier) {
		this.qualifier = qualifier;
	}

	/**
	 * {@inheritDoc}
	 */
	public String getOriginalText() {
		return originalText;
	}

	/**
	 * {@inheritDoc}
	 */
	public void setOriginalText(String originalText) {
		this.originalText = originalText;
	}

	/**
	 * {@inheritDoc}
	 */
	public String getCode() {
		return code;
	}

	/**
	 * {@inheritDoc}
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * {@inheritDoc}
	 */
	public String getCodeSystem() {
		return codeSystem;
	}

	/**
	 * {@inheritDoc}
	 */
	public void setCodeSystem(String codeSystem) {
		this.codeSystem = codeSystem;
	}

	/**
	 * {@inheritDoc}
	 */
	public String getCodeSystemName() {
		return codeSystemName;
	}

	/**
	 * {@inheritDoc}
	 */
	public void setCodeSystemName(String codeSystemName) {
		this.codeSystemName = codeSystemName;
	}

	/**
	 * {@inheritDoc}
	 */
	public String getCodeSystemVersion() {
		return codeSystemVersion;
	}

	/**
	 * {@inheritDoc}
	 */
	public void setCodeSystemVersion(String codeSystemVersion) {
		this.codeSystemVersion = codeSystemVersion;
	}

	/**
	 * {@inheritDoc}
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * {@inheritDoc}
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (!(o instanceof Code))
			return false;
		Code c = (Code) o;
		return (code.equals(c.getCode()) && codeSystem.equals(c.getCodeSystem()));
	}
}
