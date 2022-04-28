package com.fantasy.backend.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="leagues")
public class League {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 
	 @NotNull
	 @Size(min=1,max=255,message="League name cannot be blank!")
	 private String league_name;

	 @Min(value=0, message="must be 2 or greater ")  
	 private int maxteams;
	 
	 @Min(value=1, message="must be 1 or greater ")  
	 private int typeofscoring;
	 
	 @Min(value=0, message="must be 0 or greater ")  
	 private int passingTDpts;
	 
	 @Min(value=1, message="must be 0 or greater ")  
	 private int interceptpts;
	 
	 @Min(value=0, message="must be 0 or greater ")  
	 private int passingydspts;
	 
	 @Min(value=1, message="must be 0 or greater ")  
	 private int rushingtdspts;
	 
	 @Min(value=0, message="must be 0 or greater ")  
	 private int rushingydspts;
	 
	 @Min(value=1, message="must be 0 or greater ")  
	 private int receptionspts;
	 
	 @Min(value=0, message="must be 0 or greater ")  
	 private int receivingtdspts;
	 
	 @Min(value=1, message="must be 0 or greater ")  
	 private int receivingydspts;
	 
	 @Min(value=0, message="must be 0 or greater ")  
	 private int returntdpts;
	 
	 @Min(value=1, message="must be 0 or greater ")  
	 private int twoptconvptss;

	 @Min(value=0, message="must be 0 or greater ")  
	 private int fumbleslostptspts;
	 
	 @Min(value=1, message="must be 0 or greater ")  
	 private int fieldgoals019pts;
	 
	 @Min(value=1, message="must be 0 or greater ")  
	 private int fieldgoals2029pts;
	 
	 @Min(value=1, message="must be 0 or greater ")  
	 private int fieldgoals3039pts;
	 
	 @Min(value=1, message="must be 0 or greater ")  
	 private int fieldgoals4049pts;
	 
	 @Min(value=1, message="must be 0 or greater ")  
	 private int fieldgoals50pluspts;
	 
	 @Min(value=1, message="must be 0 or greater ")  
	 private int pointsallowed0pts;
	 
	 @Min(value=1, message="must be 0 or greater ")  
	 private int pointsallowed16pts;
	 
	 @Min(value=1, message="must be 0 or greater ")  
	 private int pointsallowed713pts;
	
	 @Min(value=1, message="must be 0 or greater ")  
	 private int pointsallowed1420pts;
	 
	 @Min(value=1, message="must be 0 or greater ")  
	 private int pointsallowed2127pts;
	 
	 @Min(value=1, message="must be 0 or greater ")  
	 private int pointsallowed2834pts;

	 @Min(value=1, message="must be 0 or greater ")  
	 private int pointsallowed35pluspts;
	 
	 @Min(value=1, message="must be 0 or greater ")  
	 private int sackpts;
	 
	 @Min(value=1, message="must be 0 or greater ")  
	 private int definterceptpts;
	 
	 @Min(value=1, message="must be 0 or greater ")  
	 private int fumblerecovpts;
	 
	 @Min(value=1, message="must be 0 or greater ")  
	 private int deftouchdownpts;
	
	 @Min(value=1, message="must be 0 or greater ")  
	 private int safetyptss;
	 
	 @Min(value=1, message="must be 0 or greater ")  
	 private int blockkickpts;
	 
	 @Min(value=1, message="must be 0 or greater ")  
	 private int specteamtdspts;

	 @Min(value=1, message="must be 0 or greater ")  
	 private int extrapointretpts;
	 
	 @ManyToMany(fetch= FetchType.LAZY)
	 @JoinTable(
	    	name="user_league",
	    	joinColumns = @JoinColumn(name = "league_id"),
	    	inverseJoinColumns = @JoinColumn(name="user_id")
	    )
	    private List<User> users;


	 public League() {
		 
	 }


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getLeague_name() {
		return league_name;
	}


	public void setLeague_name(String league_name) {
		this.league_name = league_name;
	}


	public int getMaxteams() {
		return maxteams;
	}


	public void setMaxteams(int maxteams) {
		this.maxteams = maxteams;
	}


	public int getTypeofscoring() {
		return typeofscoring;
	}


	public void setTypeofscoring(int typeofscoring) {
		this.typeofscoring = typeofscoring;
	}


	public int getPassingTDpts() {
		return passingTDpts;
	}


	public void setPassingTDpts(int passingTDpts) {
		this.passingTDpts = passingTDpts;
	}


	public int getInterceptpts() {
		return interceptpts;
	}


	public void setInterceptpts(int interceptpts) {
		this.interceptpts = interceptpts;
	}


	public int getPassingydspts() {
		return passingydspts;
	}


	public void setPassingydspts(int passingydspts) {
		this.passingydspts = passingydspts;
	}


	public int getRushingtdspts() {
		return rushingtdspts;
	}


	public void setRushingtdspts(int rushingtdspts) {
		this.rushingtdspts = rushingtdspts;
	}


	public int getRushingydspts() {
		return rushingydspts;
	}


	public void setRushingydspts(int rushingydspts) {
		this.rushingydspts = rushingydspts;
	}


	public int getReceptionspts() {
		return receptionspts;
	}


	public void setReceptionspts(int receptionspts) {
		this.receptionspts = receptionspts;
	}


	public int getReceivingtdspts() {
		return receivingtdspts;
	}


	public void setReceivingtdspts(int receivingtdspts) {
		this.receivingtdspts = receivingtdspts;
	}


	public int getReceivingydspts() {
		return receivingydspts;
	}


	public void setReceivingydspts(int receivingydspts) {
		this.receivingydspts = receivingydspts;
	}


	public int getReturntdpts() {
		return returntdpts;
	}


	public void setReturntdpts(int returntdpts) {
		this.returntdpts = returntdpts;
	}


	public int getTwoptconvptss() {
		return twoptconvptss;
	}


	public void setTwoptconvptss(int twoptconvptss) {
		this.twoptconvptss = twoptconvptss;
	}


	public int getFumbleslostptspts() {
		return fumbleslostptspts;
	}


	public void setFumbleslostptspts(int fumbleslostptspts) {
		this.fumbleslostptspts = fumbleslostptspts;
	}


	public int getFieldgoals019pts() {
		return fieldgoals019pts;
	}


	public void setFieldgoals019pts(int fieldgoals019pts) {
		this.fieldgoals019pts = fieldgoals019pts;
	}


	public int getFieldgoals2029pts() {
		return fieldgoals2029pts;
	}


	public void setFieldgoals2029pts(int fieldgoals2029pts) {
		this.fieldgoals2029pts = fieldgoals2029pts;
	}


	public int getFieldgoals3039pts() {
		return fieldgoals3039pts;
	}


	public void setFieldgoals3039pts(int fieldgoals3039pts) {
		this.fieldgoals3039pts = fieldgoals3039pts;
	}


	public int getFieldgoals4049pts() {
		return fieldgoals4049pts;
	}


	public void setFieldgoals4049pts(int fieldgoals4049pts) {
		this.fieldgoals4049pts = fieldgoals4049pts;
	}


	public int getFieldgoals50pluspts() {
		return fieldgoals50pluspts;
	}


	public void setFieldgoals50pluspts(int fieldgoals50pluspts) {
		this.fieldgoals50pluspts = fieldgoals50pluspts;
	}


	public int getPointsallowed0pts() {
		return pointsallowed0pts;
	}


	public void setPointsallowed0pts(int pointsallowed0pts) {
		this.pointsallowed0pts = pointsallowed0pts;
	}


	public int getPointsallowed16pts() {
		return pointsallowed16pts;
	}


	public void setPointsallowed16pts(int pointsallowed16pts) {
		this.pointsallowed16pts = pointsallowed16pts;
	}


	public int getPointsallowed713pts() {
		return pointsallowed713pts;
	}


	public void setPointsallowed713pts(int pointsallowed713pts) {
		this.pointsallowed713pts = pointsallowed713pts;
	}


	public int getPointsallowed1420pts() {
		return pointsallowed1420pts;
	}


	public void setPointsallowed1420pts(int pointsallowed1420pts) {
		this.pointsallowed1420pts = pointsallowed1420pts;
	}


	public int getPointsallowed2127pts() {
		return pointsallowed2127pts;
	}


	public void setPointsallowed2127pts(int pointsallowed2127pts) {
		this.pointsallowed2127pts = pointsallowed2127pts;
	}


	public int getPointsallowed2834pts() {
		return pointsallowed2834pts;
	}


	public void setPointsallowed2834pts(int pointsallowed2834pts) {
		this.pointsallowed2834pts = pointsallowed2834pts;
	}


	public int getPointsallowed35pluspts() {
		return pointsallowed35pluspts;
	}


	public void setPointsallowed35pluspts(int pointsallowed35pluspts) {
		this.pointsallowed35pluspts = pointsallowed35pluspts;
	}


	public int getSackpts() {
		return sackpts;
	}


	public void setSackpts(int sackpts) {
		this.sackpts = sackpts;
	}


	public int getDefinterceptpts() {
		return definterceptpts;
	}


	public void setDefinterceptpts(int definterceptpts) {
		this.definterceptpts = definterceptpts;
	}


	public int getFumblerecovpts() {
		return fumblerecovpts;
	}


	public void setFumblerecovpts(int fumblerecovpts) {
		this.fumblerecovpts = fumblerecovpts;
	}


	public int getDeftouchdownpts() {
		return deftouchdownpts;
	}


	public void setDeftouchdownpts(int deftouchdownpts) {
		this.deftouchdownpts = deftouchdownpts;
	}


	public int getSafetyptss() {
		return safetyptss;
	}


	public void setSafetyptss(int safetyptss) {
		this.safetyptss = safetyptss;
	}


	public int getBlockkickpts() {
		return blockkickpts;
	}


	public void setBlockkickpts(int blockkickpts) {
		this.blockkickpts = blockkickpts;
	}


	public int getSpecteamtdspts() {
		return specteamtdspts;
	}


	public void setSpecteamtdspts(int specteamtdspts) {
		this.specteamtdspts = specteamtdspts;
	}


	public int getExtrapointretpts() {
		return extrapointretpts;
	}


	public void setExtrapointretpts(int extrapointretpts) {
		this.extrapointretpts = extrapointretpts;
	}


	public List<User> getUsers() {
		return users;
	}


	public void setUsers(List<User> users) {
		this.users = users;
	}
	 
}
