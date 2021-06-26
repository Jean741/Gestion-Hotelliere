package tn.enis.gestionhotelliere.entites;

public class Client {

	private String email;
	private String nom;
	private String prenom;
	private String motPasse;



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getMotPasse() {
		return motPasse;
	}

	public void setMotPasse(String motPasse) {
		this.motPasse = motPasse;
	}

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(String email, String nom, String prenom, String motPasse) {
		super();
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
		this.motPasse = motPasse;
	}

}
