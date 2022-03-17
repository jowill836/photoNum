package src;

public class Client {
	int id_client;
	String adresseMail="";
	String nom="";
	String prenom="";
	String motDePasse="";
	String alerte="";
	String adresseLivraison="";
	Boolean aUnCodePromo =false;
	
	public Client(int id_client,String adrMail, String nom, String prenom, String motDePasse, String alerte, String adrLivraison, Boolean aUnCode) {
		this.id_client = id_client;
		this.adresseMail = adrMail;
		this.nom = nom;
		this.prenom = prenom;
		this.motDePasse = motDePasse;
		this.alerte = alerte;
		this.adresseLivraison = adrLivraison;
		this.aUnCodePromo = aUnCode;
	}
	
	public Client() {
		
	}
    // getters
	public int getIdClient() {
		return this.id_client;
	}
	public String getAdresseMail() {
		return this.adresseMail ;
	}
	public String getNom() {
		return this.nom ;
	}
	public String getPrenom() {
		return this.prenom ;
	}
	public String getMotDePasse() {
		return this.motDePasse ;
	}
	public String getAlerte() {
		return this.alerte ;
	}
	public String getAdresseLivraison() {
		return this.adresseLivraison ;
	}
	public Boolean getAUnCodePromo() {
		return this.aUnCodePromo;
	}
	
	// setters
	public void setIdClient(int id_client) {
		this.id_client = id_client;
	}
	public void setAdresseMAil(String adrMail) {
		this.adresseMail = adrMail;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse =  motDePasse;
	}
	public void setAlerte(String alerte) {
		this.alerte = alerte;
	}
	public void setAdresseLivraison( String adresseLivraison) {
		this.adresseLivraison = adresseLivraison;
	}
	public void setAUnCodePromo(Boolean aUnCodePromo) {
		this.aUnCodePromo = aUnCodePromo;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
