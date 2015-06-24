package de.fhg.isst.cda.classes;

import java.util.ArrayList;

import de.fhg.isst.cda.choices.clinicalstatements.Act;
import de.fhg.isst.cda.choices.clinicalstatements.Encounter;
import de.fhg.isst.cda.choices.clinicalstatements.Observation;
import de.fhg.isst.cda.choices.clinicalstatements.ObservationMedia;
import de.fhg.isst.cda.choices.clinicalstatements.Organizer;
import de.fhg.isst.cda.choices.clinicalstatements.Precondition;
import de.fhg.isst.cda.choices.clinicalstatements.Procedure;
import de.fhg.isst.cda.choices.clinicalstatements.Reference;
import de.fhg.isst.cda.choices.clinicalstatements.RegionOfInterest;
import de.fhg.isst.cda.choices.clinicalstatements.SubstanceAdministration;
import de.fhg.isst.cda.choices.clinicalstatements.Supply;

// TODO: Auto-generated Javadoc
/**
 * The Class ClinicalStatement.
 */
public class ClinicalStatement {
	
	/** The subject. */
	private Subject subject;
	
	/** The authors. */
	private ArrayList<Author> authors;
	
	/** The informants. */
	private ArrayList<Informant> informants;
	
	/** The specimens. */
	private ArrayList<Specimen> specimens;
	
	/** The performers2. */
	private ArrayList<Performer2> performers2;
	
	/** The participants2. */
	private ArrayList<Participant2> participants2;
	
	/** The entry relationships. */
	private ArrayList<EntryRelationship> entryRelationships;
	
	/** The references. */
	private ArrayList<Reference> references;
	
	/** The preconditions. */
	private ArrayList<Precondition> preconditions;
	
	/** The act. */
	private Act act;
	
	/** The encounter. */
	private Encounter encounter;
	
	/** The Observation. */
	private Observation Observation;
	
	/** The observation media. */
	private ObservationMedia observationMedia;
	
	/** The organizer. */
	private Organizer organizer;
	
	/** The procedure. */
	private Procedure procedure;
	
	/** The region of interest. */
	private RegionOfInterest regionOfInterest;
	
	/** The substance administration. */
	private SubstanceAdministration substanceAdministration;
	
	/** The supply. */
	private Supply supply;
	
	/** The components5. */
	private ArrayList<Component5> components5;
	
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
		this.informants = informants;
	}
	
	/**
	 * Gets the specimens.
	 * 
	 * @return the specimens
	 */
	public ArrayList<Specimen> getSpecimens() {
		if(this.specimens == null) {
			this.specimens = new ArrayList<Specimen>();
		}
		return specimens;
	}
	
	/**
	 * Sets the specimens.
	 * 
	 * @param specimens
	 *            the new specimens
	 */
	public void setSpecimens(ArrayList<Specimen> specimens) {
		this.specimens = specimens;
	}
	
	/**
	 * Gets the performers2.
	 * 
	 * @return the performers2
	 */
	public ArrayList<Performer2> getPerformers2() {
		if(this.performers2 == null) {
			this.performers2 = new ArrayList<Performer2>();
		}
		return performers2;
	}
	
	/**
	 * Sets the performers2.
	 * 
	 * @param performers2
	 *            the new performers2
	 */
	public void setPerformers2(ArrayList<Performer2> performers2) {
		this.performers2 = performers2;
	}
	
	/**
	 * Gets the participants2.
	 * 
	 * @return the participants2
	 */
	public ArrayList<Participant2> getParticipants2() {
		if(this.participants2 == null) {
			this.participants2 = new ArrayList<Participant2>();
		}
		return participants2;
	}
	
	/**
	 * Sets the participants2.
	 * 
	 * @param participants2
	 *            the new participants2
	 */
	public void setParticipants2(ArrayList<Participant2> participants2) {
		this.participants2 = participants2;
	}
	
	/**
	 * Gets the entry relationships.
	 * 
	 * @return the entry relationships
	 */
	public ArrayList<EntryRelationship> getEntryRelationships() {
		if(this.entryRelationships == null) {
			this.entryRelationships = new ArrayList<EntryRelationship>();
		}
		return entryRelationships;
	}
	
	/**
	 * Sets the entry relationships.
	 * 
	 * @param entryRelationships
	 *            the new entry relationships
	 */
	public void setEntryRelationships(ArrayList<EntryRelationship> entryRelationships) {
		this.entryRelationships = entryRelationships;
	}
	
	/**
	 * Gets the references.
	 * 
	 * @return the references
	 */
	public ArrayList<Reference> getReferences() {
		if(this.references == null) {
			this.references = new ArrayList<Reference>();
		}
		return references;
	}
	
	/**
	 * Sets the references.
	 * 
	 * @param references
	 *            the new references
	 */
	public void setReferences(ArrayList<Reference> references) {
		this.references = references;
	}
	
	/**
	 * Gets the preconditions.
	 * 
	 * @return the preconditions
	 */
	public ArrayList<Precondition> getPreconditions() {
		if(this.preconditions == null) {
			this.preconditions = new ArrayList<Precondition>();
		}
		return preconditions;
	}
	
	/**
	 * Sets the preconditions.
	 * 
	 * @param preconditions
	 *            the new preconditions
	 */
	public void setPreconditions(ArrayList<Precondition> preconditions) {
		this.preconditions = preconditions;
	}
	
	/**
	 * Gets the act.
	 * 
	 * @return the act
	 */
	public Act getAct() {
		return act;
	}
	
	/**
	 * Sets the act.
	 * 
	 * @param act
	 *            the new act
	 */
	public void setAct(Act act) {
		this.act = act;
	}
	
	/**
	 * Gets the encounter.
	 * 
	 * @return the encounter
	 */
	public Encounter getEncounter() {
		return encounter;
	}
	
	/**
	 * Sets the encounter.
	 * 
	 * @param encounter
	 *            the new encounter
	 */
	public void setEncounter(Encounter encounter) {
		this.encounter = encounter;
	}
	
	/**
	 * Gets the observation.
	 * 
	 * @return the observation
	 */
	public Observation getObservation() {
		return Observation;
	}
	
	/**
	 * Sets the observation.
	 * 
	 * @param observation
	 *            the new observation
	 */
	public void setObservation(Observation observation) {
		Observation = observation;
	}
	
	/**
	 * Gets the observation media.
	 * 
	 * @return the observation media
	 */
	public ObservationMedia getObservationMedia() {
		return observationMedia;
	}
	
	/**
	 * Sets the observation media.
	 * 
	 * @param observationMedia
	 *            the new observation media
	 */
	public void setObservationMedia(ObservationMedia observationMedia) {
		this.observationMedia = observationMedia;
	}
	
	/**
	 * Gets the organizer.
	 * 
	 * @return the organizer
	 */
	public Organizer getOrganizer() {
		return organizer;
	}
	
	/**
	 * Sets the organizer.
	 * 
	 * @param organizer
	 *            the new organizer
	 */
	public void setOrganizer(Organizer organizer) {
		this.organizer = organizer;
	}
	
	/**
	 * Gets the procedure.
	 * 
	 * @return the procedure
	 */
	public Procedure getProcedure() {
		return procedure;
	}
	
	/**
	 * Sets the procedure.
	 * 
	 * @param procedure
	 *            the new procedure
	 */
	public void setProcedure(Procedure procedure) {
		this.procedure = procedure;
	}
	
	/**
	 * Gets the region of interest.
	 * 
	 * @return the region of interest
	 */
	public RegionOfInterest getRegionOfInterest() {
		return regionOfInterest;
	}
	
	/**
	 * Sets the region of interest.
	 * 
	 * @param regionOfInterest
	 *            the new region of interest
	 */
	public void setRegionOfInterest(RegionOfInterest regionOfInterest) {
		this.regionOfInterest = regionOfInterest;
	}
	
	/**
	 * Gets the substance administration.
	 * 
	 * @return the substance administration
	 */
	public SubstanceAdministration getSubstanceAdministration() {
		return substanceAdministration;
	}
	
	/**
	 * Sets the substance administration.
	 * 
	 * @param substanceAdministration
	 *            the new substance administration
	 */
	public void setSubstanceAdministration(SubstanceAdministration substanceAdministration) {
		this.substanceAdministration = substanceAdministration;
	}
	
	/**
	 * Gets the supply.
	 * 
	 * @return the supply
	 */
	public Supply getSupply() {
		return supply;
	}
	
	/**
	 * Sets the supply.
	 * 
	 * @param supply
	 *            the new supply
	 */
	public void setSupply(Supply supply) {
		this.supply = supply;
	}
	
	/**
	 * Gets the components.
	 * 
	 * @return the components
	 */
	public ArrayList<Component5> getComponents() {
		if(this.components5 == null) {
			this.components5 = new ArrayList<Component5>();
		}
		return components5;
	}
	
	/**
	 * Sets the components.
	 * 
	 * @param components5
	 *            the new components
	 */
	public void setComponents(ArrayList<Component5> components5) {
		this.components5 = components5;
	}
}