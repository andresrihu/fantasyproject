package com.fantasy.backend.models;

import java.util.Date;
import java.util.Locale.Category;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
	@Table(name="league_team")
	public class League_Team {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 
	 @NotNull
	 @Size(min=1,max=255,message="team name cannot be blank!")
	 private String team_name;

	 @ManyToMany(fetch = FetchType.LAZY)
	    @JoinTable(
	        name = "rosters", 
	        joinColumns = @JoinColumn(name = "league_team_id"), 
	        inverseJoinColumns = @JoinColumn(name = "athletes_id")
	        )
	    
	    @Column(updatable=false)
	    private Date createdAt;
	    private Date updatedAt;
	    
	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name="league_id")
	    private League league;
	    
	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name="user_id")
	    private User user;
	    
	    public League_Team() {
	        
	    }

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

		public League getLeague() {
			return league;
		}

		public void setLeague(League league) {
			this.league = league;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}
	    
	    
}
