package com.fantasy.backend.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="athletes")
public class Athlete {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotEmpty(message = "Need athlete name")
	@Size(min=3, message = "Name must be greater than 3 characters")
	private String athletename;
	
	@NotEmpty(message = "Need position")
	@Size(min=1, message = "Postion must not be empty")
	private String position;

	@NotEmpty(message = "Need status")
	@Size(min=1, message = "Athlete must have a status")
	private String status;

	@NotEmpty(message = "Field blank")
	@Size(min=1, message = "This field must not be empty")
	private String gamesstarted;


	@NotEmpty(message = "Field blank")
	@Size(min=3, message = "This field must not be empty")
	private String passcmp;

	@NotEmpty(message = "field blank")
	@Size(min=3, message = "This field must not be empty")
	private String passatt;

	@NotEmpty(message = "field blank")
	@Size(min=3, message = "This field must not be empty")
	private String passcmppct;

	@NotEmpty(message = "Field blank")
	@Size(min=3, message = "This field must not be empty")
	private String passyds;

	@NotEmpty(message = "field blank")
	@Size(min=3, message = "This field must not be empty")
	private String passtds;

	@NotEmpty(message = "field blank")
	@Size(min=3, message = "This field must not be empty")
	private String passint;

	@NotEmpty(message = "Field blank")
	@Size(min=3, message = "This field must not be empty")
	private String passrating;

	@NotEmpty(message = "field blank")
	@Size(min=3, message = "This field must not be empty")
	private String passsacked;

	@NotEmpty(message = "field blank")
	@Size(min=3, message = "This field must not be empty")
	private String passsackedyds;
	
	@NotEmpty(message = "Field blank")
	@Size(min=3, message = "This field must not be empty")
	private String rushatt;

	@NotEmpty(message = "field blank")
	@Size(min=3, message = "This field must not be empty")
	private String rushyds;

	@NotEmpty(message = "field blank")
	@Size(min=3, message = "This field must not be empty")
	private String rushydsperatt;
	
	@NotEmpty(message = "Field blank")
	@Size(min=3, message = "This field must not be empty")
	private String rushtd;

	@NotEmpty(message = "field blank")
	@Size(min=3, message = "This field must not be empty")
	private String rectargeted;

	@NotEmpty(message = "field blank")
	@Size(min=3, message = "This field must not be empty")
	private String receptions;
	
	@NotEmpty(message = "Field blank")
	@Size(min=3, message = "This field must not be empty")
	private String recyds;

	@NotEmpty(message = "field blank")
	@Size(min=3, message = "This field must not be empty")
	private String recydsperatt;

	@NotEmpty(message = "field blank")
	@Size(min=3, message = "This field must not be empty")
	private String rectds;
	
	@NotEmpty(message = "Field blank")
	@Size(min=3, message = "This field must not be empty")
	private String kickfieldgoalsatt;

	@NotEmpty(message = "field blank")
	@Size(min=3, message = "This field must not be empty")
	private String kickfieldgoalsmade;

	@NotEmpty(message = "field blank")
	@Size(min=3, message = "This field must not be empty")
	private String kickxpatt;
	
	@NotEmpty(message = "Field blank")
	@Size(min=3, message = "This field must not be empty")
	private String kickxptmade;

	@NotEmpty(message = "field blank")
	@Size(min=3, message = "This field must not be empty")
	private String defint;

	@NotEmpty(message = "field blank")
	@Size(min=3, message = "This field must not be empty")
	private String deffumrec;
	
	@NotEmpty(message = "Field blank")
	@Size(min=3, message = "This field must not be empty")
	private String defsacks;

	@NotEmpty(message = "field blank")
	@Size(min=3, message = "This field must not be empty")
	private String deftds;

	@NotEmpty(message = "field blank")
	@Size(min=3, message = "This field must not be empty")
	private String safeties;
	
	@ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name="user_id")
	 private User user;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAthletename() {
		return athletename;
	}
	public void setAthletename(String athletename) {
		this.athletename = athletename;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getGamesstarted() {
		return gamesstarted;
	}
	public void setGamesstarted(String gamesstarted) {
		this.gamesstarted = gamesstarted;
	}
	public String getPasscmp() {
		return passcmp;
	}
	public void setPasscmp(String passcmp) {
		this.passcmp = passcmp;
	}
	public String getPassatt() {
		return passatt;
	}
	public void setPassatt(String passatt) {
		this.passatt = passatt;
	}
	public String getPasscmppct() {
		return passcmppct;
	}
	public void setPasscmppct(String passcmppct) {
		this.passcmppct = passcmppct;
	}
	public String getPassyds() {
		return passyds;
	}
	public void setPassyds(String passyds) {
		this.passyds = passyds;
	}
	public String getPasstds() {
		return passtds;
	}
	public void setPasstds(String passtds) {
		this.passtds = passtds;
	}
	public String getPassint() {
		return passint;
	}
	public void setPassint(String passint) {
		this.passint = passint;
	}
	public String getPassrating() {
		return passrating;
	}
	public void setPassrating(String passrating) {
		this.passrating = passrating;
	}
	public String getPasssacked() {
		return passsacked;
	}
	public void setPasssacked(String passsacked) {
		this.passsacked = passsacked;
	}
	public String getPasssackedyds() {
		return passsackedyds;
	}
	public void setPasssackedyds(String passsackedyds) {
		this.passsackedyds = passsackedyds;
	}
	public String getRushatt() {
		return rushatt;
	}
	public void setRushatt(String rushatt) {
		this.rushatt = rushatt;
	}
	public String getRushyds() {
		return rushyds;
	}
	public void setRushyds(String rushyds) {
		this.rushyds = rushyds;
	}
	public String getRushydsperatt() {
		return rushydsperatt;
	}
	public void setRushydsperatt(String rushydsperatt) {
		this.rushydsperatt = rushydsperatt;
	}
	public String getRushtd() {
		return rushtd;
	}
	public void setRushtd(String rushtd) {
		this.rushtd = rushtd;
	}
	public String getRectargeted() {
		return rectargeted;
	}
	public void setRectargeted(String rectargeted) {
		this.rectargeted = rectargeted;
	}
	public String getReceptions() {
		return receptions;
	}
	public void setReceptions(String receptions) {
		this.receptions = receptions;
	}
	public String getRecyds() {
		return recyds;
	}
	public void setRecyds(String recyds) {
		this.recyds = recyds;
	}
	public String getRecydsperatt() {
		return recydsperatt;
	}
	public void setRecydsperatt(String recydsperatt) {
		this.recydsperatt = recydsperatt;
	}
	public String getRectds() {
		return rectds;
	}
	public void setRectds(String rectds) {
		this.rectds = rectds;
	}
	public String getKickfieldgoalsatt() {
		return kickfieldgoalsatt;
	}
	public void setKickfieldgoalsatt(String kickfieldgoalsatt) {
		this.kickfieldgoalsatt = kickfieldgoalsatt;
	}
	public String getKickfieldgoalsmade() {
		return kickfieldgoalsmade;
	}
	public void setKickfieldgoalsmade(String kickfieldgoalsmade) {
		this.kickfieldgoalsmade = kickfieldgoalsmade;
	}
	public String getKickxpatt() {
		return kickxpatt;
	}
	public void setKickxpatt(String kickxpatt) {
		this.kickxpatt = kickxpatt;
	}
	public String getKickxptmade() {
		return kickxptmade;
	}
	public void setKickxptmade(String kickxptmade) {
		this.kickxptmade = kickxptmade;
	}
	public String getDefint() {
		return defint;
	}
	public void setDefint(String defint) {
		this.defint = defint;
	}
	public String getDeffumrec() {
		return deffumrec;
	}
	public void setDeffumrec(String deffumrec) {
		this.deffumrec = deffumrec;
	}
	public String getDefsacks() {
		return defsacks;
	}
	public void setDefsacks(String defsacks) {
		this.defsacks = defsacks;
	}
	public String getDeftds() {
		return deftds;
	}
	public void setDeftds(String deftds) {
		this.deftds = deftds;
	}
	public String getSafeties() {
		return safeties;
	}
	public void setSafeties(String safeties) {
		this.safeties = safeties;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
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
	
	@Column(updatable=false)
	 private Date createdAt;
	 private Date updatedAt;
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

