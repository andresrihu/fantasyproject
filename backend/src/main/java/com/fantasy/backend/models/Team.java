package com.fantasy.backend.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="teams")
public class Team {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 
	 @NotNull
	 @Size(min=1,max=255,message="team name cannot be blank!")
	 private String team_name;

	 @OneToMany(mappedBy="team", fetch = FetchType.LAZY)
	 private List<Athlete> athletes;
	 
	 
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTeam_name() {
		return team_name;
	}
	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}
	public List<Athlete> getAthletes() {
		return athletes;
	}
	public void setAthletes(List<Athlete> athletes) {
		this.athletes = athletes;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public Team() {
	    	
	    	
	}
	 
	 
	 @Column(updatable=false)
	 private Date createdAt;
	 private Date updatedAt;
}
