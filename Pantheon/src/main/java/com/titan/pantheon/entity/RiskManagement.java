package com.titan.pantheon.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "risk_management")
public class RiskManagement implements Serializable{
	private static final long SerialVersionUID = 1L;
	
	private Long id;
	private String createdBy;
	private String probability;
	private String impactLevel;
	private String riskDescription;
	private String actions;
	private String status;
	private String owner;
	
	@Id
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getProbability() {
		return probability;
	}
	public void setProbability(String probability) {
		this.probability = probability;
	}
	public String getImpactLevel() {
		return impactLevel;
	}
	public void setImpactLevel(String impactLevel) {
		this.impactLevel = impactLevel;
	}
	public String getRiskDescription() {
		return riskDescription;
	}
	@Column(columnDefinition = "text")
	public void setRiskDescription(String riskDescription) {
		this.riskDescription = riskDescription;
	}
	public String getActions() {
		return actions;
	}
	public void setActions(String actions) {
		this.actions = actions;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}

}
