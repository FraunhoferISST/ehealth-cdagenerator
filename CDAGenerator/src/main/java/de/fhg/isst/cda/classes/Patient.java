package de.fhg.isst.cda.classes;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class Patient.
 */
public class Patient {

    /**
     * The class code.
     */
    private String classCode;

    /**
     * The determiner code.
     */
    private String determinerCode;

    /**
     * The id.
     */
    private ID id;

    /**
     * The given name.
     */
    private String givenName;

    /**
     * The family name.
     */
    private String familyName;

    /**
     * The prefix
     */
    private String prefix;

    /**
     * The suffix.
     */
    private String suffix;

    /**
     * The administrative gender code.
     */
    private Code administrativeGenderCode;
//    private AdministrativeGenderCode administrativeGenderCode;

    /**
     * The birth time.
     */
    private String birthTime;

    /**
     * The marital status code.
     */
    private Code maritalStatusCode;

    /**
     * The religious affiliation code.
     */
    private Code religiousAffiliationCode;

    /**
     * The race code.
     */
    private Code raceCode;

    /**
     * The ethnic group code.
     */
    private Code ethnicGroupCode;

    /**
     * The guardians.
     */
    private ArrayList<Guardian> guardians;

    /**
     * The birth place.
     */
    private Place birthPlace;

    /**
     * The language communications.
     */
    private ArrayList<LanguageCommunication> languageCommunications;

    /**
     * Instantiates a new patient.
     */
    public Patient() {
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
     * @param classCode the new class code
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
     * @param determinerCode the new determiner code
     */
    public void setDeterminerCode(String determinerCode) {
        this.determinerCode = determinerCode;
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
     * @param id the new id
     */
    public void setId(ID id) {
        this.id = id;
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
     * @param givenName the new given name
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
     * @param familyName the new family name
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
     * @param suffix the new suffix
     */
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    /**
     * Gets the administrative gender code.
     *
     * @return the administrative gender code
     */
    public Code getAdministrativeGenderCode() {
        return administrativeGenderCode;
    }
//	public AdministrativeGenderCode getAdministrativeGenderCode() {
//		return administrativeGenderCode;
//	}

    /**
     * Sets the administrative gender code.
     *
     * @param administrativeGenderCode the new administrative gender code
     */
    public void setAdministrativeGenderCode(Code administrativeGenderCode) {
        this.administrativeGenderCode = administrativeGenderCode;
    }
//	public void setAdministrativeGenderCode(AdministrativeGenderCode administrativeGenderCode) {
//		this.administrativeGenderCode = administrativeGenderCode;
//	}

    /**
     * Gets the birth time.
     *
     * @return the birth time
     */
    public String getBirthTime() {
        return birthTime;
    }

    /**
     * Sets the birth time.
     *
     * @param birthTime the new birth time
     */
    public void setBirthTime(String birthTime) {
        this.birthTime = birthTime;
    }

    /**
     * Gets the marital status code.
     *
     * @return the marital status code
     */
    public Code getMaritalStatusCode() {
        return maritalStatusCode;
    }

    /**
     * Sets the marital status code.
     *
     * @param code the new marital status code
     */
    public void setMaritalStatusCode(Code code) {
        this.maritalStatusCode = code;
    }

    /**
     * Gets the religious affiliation code.
     *
     * @return the religious affiliation code
     */
    public Code getReligiousAffiliationCode() {
        return religiousAffiliationCode;
    }

    /**
     * Sets the religious affiliation code.
     *
     * @param religiousAffiliationCode the new religious affiliation code
     */
    public void setReligiousAffiliationCode(Code religiousAffiliationCode) {
        this.religiousAffiliationCode = religiousAffiliationCode;
    }

    /**
     * Gets the race code.
     *
     * @return the race code
     */
    public Code getRaceCode() {
        return raceCode;
    }

    /**
     * Sets the race code.
     *
     * @param raceCode the new race code
     */
    public void setRaceCode(Code raceCode) {
        this.raceCode = raceCode;
    }

    /**
     * Gets the ethnic group code.
     *
     * @return the ethnic group code
     */
    public Code getEthnicGroupCode() {
        return ethnicGroupCode;
    }

    /**
     * Sets the ethnic group code.
     *
     * @param ethnicGroupCode the new ethnic group code
     */
    public void setEthnicGroupCode(Code ethnicGroupCode) {
        this.ethnicGroupCode = ethnicGroupCode;
    }

    /**
     * Gets the guardians.
     *
     * @return the guardians
     */
    public ArrayList<Guardian> getGuardians() {
        if (this.guardians == null) {
            this.guardians = new ArrayList<Guardian>();
        }
        return guardians;
    }

    /**
     * Sets the guardians.
     *
     * @param guardians the new guardians
     */
    public void setGuardians(ArrayList<Guardian> guardians) {
        this.guardians = guardians;
    }

    /**
     * Gets the birth place.
     *
     * @return the birth place
     */
    public Place getBirthPlace() {
        return birthPlace;
    }

    /**
     * Sets the birth place.
     *
     * @param birthPlace the new birth place
     */
    public void setBirthPlace(Place birthPlace) {
        this.birthPlace = birthPlace;
    }

    /**
     * Gets the language communications.
     *
     * @return the language communications
     */
    public ArrayList<LanguageCommunication> getLanguageCommunications() {
        if (this.languageCommunications == null) {
            this.languageCommunications = new ArrayList<LanguageCommunication>();
        }
        return languageCommunications;
    }

    /**
     * Sets the language communications.
     *
     * @param languageCommunications the new language communications
     */
    public void setLanguageCommunications(ArrayList<LanguageCommunication> languageCommunications) {
        this.languageCommunications = languageCommunications;
    }

    /**
     * Gets the prefix
     *
     * @return
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Sets the prefix
     *
     * @param prefix
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

}
