package de.fhg.isst.cda.choices.entity;

import java.util.ArrayList;

import de.fhg.isst.cda.classes.Code;
import de.fhg.isst.cda.classes.Quantity;

// TODO: Auto-generated Javadoc
/**
 * The Class PlayingEntity.
 */
public class PlayingEntity implements EntityChoice {

    /**
     * The class code.
     */
    private String classCode;

    /**
     * The determiner code.
     */
    private String determinerCode;

    /**
     * The code.
     */
    private Code code;

    /**
     * The quantities.
     */
    private ArrayList<Quantity> quantities;

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
     * The desc.
     */
    private String desc;

    /**
     * Instantiates a new playing entity.
     */
    public PlayingEntity() {
        this.classCode = "ROL";
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
     * @param code the new code
     */
    public void setCode(Code code) {
        this.code = code;
    }

    /**
     * Gets the quantities.
     *
     * @return the quantities
     */
    public ArrayList<Quantity> getQuantities() {
        if (this.quantities == null) {
            this.quantities = new ArrayList<Quantity>();
        }
        return quantities;
    }

    /**
     * Sets the quantities.
     *
     * @param quantities the new quantities
     */
    public void setQuantities(ArrayList<Quantity> quantities) {
        this.quantities = quantities;
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
     * Gets the desc.
     *
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the desc.
     *
     * @param desc the new desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}
