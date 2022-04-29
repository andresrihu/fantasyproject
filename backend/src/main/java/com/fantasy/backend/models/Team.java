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
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "teams")
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private String name;

	@NotNull
	private Integer founded;

	@NotNull
	private Integer wins;

	@NotNull
	private Integer losses;

	@NotNull
	private Integer championships;

	@NotNull
	private String coach;

	@JsonManagedReference
	@OneToMany(mappedBy = "teamDb", fetch = FetchType.LAZY)
	private List<Athlete> athletes;

	public List<Athlete> getAthletes() {
		return this.athletes;
	}

	public void setAthletes(List<Athlete> athletes) {
		this.athletes = athletes;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long newId) {
		this.id = newId;
	}

	public String getCoach() {
		return this.coach;
	}

	public void setCoach(String newCoach) {
		this.coach = newCoach;
	}

	public Integer getChampionships() {
		return this.championships;
	}

	public void setChampionships(Integer newChampionships) {
		this.championships = newChampionships;
	}

	public Integer getLosses() {
		return this.losses;
	}

	public void setLosses(Integer newLosses) {
		this.losses = newLosses;
	}

	public Integer getWins() {
		return this.wins;
	}

	public void setWins(Integer newWins) {
		this.wins = newWins;
	}

	public Integer getFounded() {
		return this.founded;
	}

	public void setFounded(Integer newFounded) {
		this.founded = newFounded;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String newName) {
		this.name = newName;
	}

	public Team() {

	}

	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdAt;

	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedAt;

	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}

	public Date getCreatedAt() {
		return this.createdAt;
	}

	public Date getUpdatedAt() {
		return this.updatedAt;
	}

}
