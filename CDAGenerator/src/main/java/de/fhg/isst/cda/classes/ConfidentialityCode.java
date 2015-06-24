package de.fhg.isst.cda.classes;

public class ConfidentialityCode {
	private String code;
	private String codeSystem;
	private String codeSystemName;
	private String codeSystemVersion;
	private String displayName;
	private String originalText;

	public ConfidentialityCode(String code, String codeSystem) {
		this.code = code;
		this.codeSystem = codeSystem;
	}

	public ConfidentialityCode(String code, String codeSystem, String codeSystemName, String codeSystemVersion, String displayName, String originalText) {
		this.code = code;
		this.codeSystem = codeSystem;
		this.codeSystemName = codeSystemName;
		this.codeSystemVersion = codeSystemVersion;
		this.displayName = displayName;
		this.originalText = originalText;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCodeSystem() {
		return codeSystem;
	}

	public void setCodeSystem(String codeSystem) {
		this.codeSystem = codeSystem;
	}

	public String getCodeSystemName() {
		return codeSystemName;
	}

	public void setCodeSystemName(String codeSystemName) {
		this.codeSystemName = codeSystemName;
	}

	public String getCodeSystemVersion() {
		return codeSystemVersion;
	}

	public void setCodeSystemVersion(String codeSystemVersion) {
		this.codeSystemVersion = codeSystemVersion;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getOriginalText() {
		return originalText;
	}

	public void setOriginalText(String originalText) {
		this.originalText = originalText;
	}

}