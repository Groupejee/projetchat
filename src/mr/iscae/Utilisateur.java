package mr.iscae;

public class Utilisateur {
	private String nom;
	private String prenom;
	private String login;
	private String motDePasse;
	
	

	public Utilisateur(String nom, String prenom, String login, String motDePasse) {
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.motDePasse = motDePasse;	
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

	public String getMotdepasse() {
		return motDePasse;
	}

	public void setMotdepasse(String motdepasse) {
		this.motDePasse = motdepasse;
	}

}
	

	


