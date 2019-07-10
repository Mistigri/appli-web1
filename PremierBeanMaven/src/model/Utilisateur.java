package model;

public class Utilisateur {
	private String nom="", prenom="", login="", mdp="";

	public Utilisateur(Utilisateur user) {
		this.nom = user.nom;
		this.prenom = user.prenom;
		this.login = user.login;
		this.mdp = user.mdp;
	}
	
	

	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	@Override
	public String toString() {
		return "Utilisateur [nom=" + nom + ", prenom=" + prenom + ", login="
				+ login + "]";
	}
	

}
