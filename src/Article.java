package src;

public class Article {
	private  int id_commande;
	private int id_article;
	private int quantite;
	
	public Article(int id_commande, int id_article, int quantite) {
		this.id_article = id_article;
		this.id_commande = id_commande;
		this.quantite = quantite;
	}
	
	public Article() {
		
	}
	
	public int getIdCommande() {
		return this.id_commande ;
	}
	public int getIdArticle() {
		return this.id_article;
	}

	public int getQuantite() {
		return this.quantite ;
	}
	
	public void setIdCommande(int id_commande) {
		this.id_commande = id_commande;
	}
	
	public void setIdArticle(int id_article) {
		this.id_article = id_article ;
	}
	
	public void setQuantite(int quantite) {
		this.quantite = quantite ;
	}
}
