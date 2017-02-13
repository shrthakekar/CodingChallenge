package com.clinicalTrial.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table( name = "clinical_trial", schema="test")
public class ClinicalTrialBean implements Serializable{
	
	private static final long serialVersionUID = 1L; 
	private Long id;
	private String nctId;
	private String officialTitle;
	private String phase;
	private Date primaryCompletionDate;
	
	//Added an extra field as a primary key in the table. 
	@Id	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	
	@Column(name="nct_id")
	public String getNctId() {
		return nctId;
	}
	
		
	public void setNctId(String nctId) {
		this.nctId = nctId;
	}
	
	@Column(name="official_title")
	public String getOfficialTitle() {
		return officialTitle;
	}
	
	public void setOfficialTitle(String officialTitle) {
		this.officialTitle = officialTitle;
	}
	
	@Column(name="phase")
	public String getPhase() {
		return phase;
	}
	
	public void setPhase(String phase) {
		this.phase = phase;
	}
	
	@Column(name="primary_completion_date")
	public Date getPrimaryCompletionDate() {
		
		return primaryCompletionDate;
	}
	
	public void setPrimaryCompletionDate(Date primaryCompletionDate) {
		this.primaryCompletionDate = primaryCompletionDate;
	}
	
}
