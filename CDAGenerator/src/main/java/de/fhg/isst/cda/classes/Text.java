package de.fhg.isst.cda.classes;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class Text.
 */
public class Text {
	
	/** The id. */
	private ID id;
	
	/** The language code. */
	private LanguageCode languageCode;
	
	/** The style code. */
	private String styleCode;
	
	/** The media type. */
	private String mediaType;
	
	/** The text element. */
	private String textElement;
	
	/** The text item. */
	private ArrayList<TextItem> textItem;
	
	/**
	 * Instantiates a new text.
	 */
	public Text() {
		
	}
	
	/**
	 * Instantiates a new text.
	 * 
	 * @param id
	 *            the id
	 */
	public Text(ID id) {
		this.id = id;
	}
	
	/**
	 * Instantiates a new text.
	 * 
	 * @param styleCode
	 *            the style code
	 */
	public Text(String styleCode) {
		this.styleCode = styleCode;
	}
	
	/**
	 * Instantiates a new text.
	 * 
	 * @param id
	 *            the id
	 * @param languageCode
	 *            the language code
	 * @param styleCode
	 *            the style code
	 * @param mediaType
	 *            the media type
	 * @param textElement
	 *            the text element
	 * @param textItem
	 *            the text item
	 */
	public Text(ID id, LanguageCode languageCode, String styleCode,
			String mediaType, String textElement, ArrayList<TextItem> textItem) {
		super();
		this.id = id;
		this.languageCode = languageCode;
		this.styleCode = styleCode;
		this.mediaType = mediaType;
		this.textElement = textElement;
		this.textItem = textItem;
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
	 * Gets the style code.
	 * 
	 * @return the style code
	 */
	public String getStyleCode() {
		return styleCode;
	}
	
	/**
	 * Sets the style code.
	 * 
	 * @param styleCode
	 *            the new style code
	 */
	public void setStyleCode(String styleCode) {
		this.styleCode = styleCode;
	}
	
	/**
	 * Gets the media type.
	 * 
	 * @return the media type
	 */
	public String getMediaType() {
		return mediaType;
	}
	
	/**
	 * Sets the media type.
	 * 
	 * @param mediaType
	 *            the new media type
	 */
	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}
	
	/**
	 * Gets the text element.
	 * 
	 * @return the text element
	 */
	public String getTextElement() {
		return textElement;
	}
	
	/**
	 * Sets the text element.
	 * 
	 * @param textElement
	 *            the new text element
	 */
	public void setTextElement(String textElement) {
		this.textElement = textElement;
	}
	
	/**
	 * Gets the text item.
	 * 
	 * @return the text item
	 */
	public ArrayList<TextItem> getTextItem() {
		return textItem;
	}
	
	/**
	 * Sets the text item.
	 * 
	 * @param textItem
	 *            the new text item
	 */
	public void setTextItem(ArrayList<TextItem> textItem) {
		this.textItem = textItem;
	}
	
	
}
