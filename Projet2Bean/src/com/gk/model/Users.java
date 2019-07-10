package com.gk.model;

public class Users {
	private String nom = "";
	private String prenom ="";
	private String pseudo="";
	private String password ="";
	private String adresse ="";
	private int telephone ;
	
	public Users() {
		super();
	}
	
	public Users(String nom, String prenom, String pseudo, String password,
			String adresse, int telephone) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.pseudo = pseudo;
		this.password = password;
		this.adresse = adresse;
		this.telephone = telephone;
	}

	public Users(Users user) {
		this.nom = user.nom;
		this.prenom = user.prenom;
		this.pseudo = user.pseudo;
		this.password = user.password;
		this.adresse = user.adresse;
		this.telephone = user.telephone;
	}
		
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	
	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "Users [nom=" + nom + ", prenom=" + prenom + ", pseudo="
				+ pseudo + ", password=" + password + ", adresse=" + adresse
				+ ", telephone=" + telephone + "]";
	}

}
