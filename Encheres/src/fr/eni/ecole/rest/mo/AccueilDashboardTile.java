package fr.eni.ecole.rest.mo;

import java.io.Serializable;
import java.util.Base64;
/**
 * Classe reprenant toutes les donnees utiles pour l'affichage des dashboard tiles
 * Sert a renvoyer un JSON
 * @author romai
 *
 */
public class AccueilDashboardTile implements Serializable {

	private static final long serialVersionUID = -8844648449092072102L;
	
	private String nomProduit;
	private String dateFinEnchere;
	private Integer montant;
	private String pseudoVendeur;
	private Integer noVendeur;
	private Integer noArticle;
	private transient Base64 photo;
	

	public Integer getNoVendeur() {
		return noVendeur;
	}




	public void setNoVendeur(Integer noVendeur) {
		this.noVendeur = noVendeur;
	}

	
	
	public  Base64  getPhoto() {
		return photo;
	}




	public Integer getNoArticle() {
		return noArticle;
	}




	public void setNoArticle(Integer noArticle) {
		this.noArticle = noArticle;
	}




	public void setPhoto(Base64 photo) {
		this.photo = photo;
	}



	public String getNomProduit() {
		return nomProduit;
	}




	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}




	public String getDateFinEnchere() {
		return dateFinEnchere;
	}




	public void setDateFinEnchere(String dateFinEnchere) {
		this.dateFinEnchere = dateFinEnchere;
	}




	public Integer getMontant() {
		return montant;
	}




	public void setMontant(Integer montant) {
		this.montant = montant;
	}




	public String getPseudoVendeur() {
		return pseudoVendeur;
	}




	public void setPseudoVendeur(String pseudoVendeur) {
		this.pseudoVendeur = pseudoVendeur;
	}




	public static long getSerialversionuid() {
		return serialVersionUID;
	}




	public AccueilDashboardTile(String nomProduit, String dateFinEnchere, Integer montant, String pseudoVendeur,
			Integer noVendeur, Integer noArticle) {
		super();
		this.nomProduit = nomProduit;
		this.dateFinEnchere = dateFinEnchere;
		this.montant = montant;
		this.pseudoVendeur = pseudoVendeur;
		this.noVendeur = noVendeur;
		this.noArticle = noArticle;
	}




	public AccueilDashboardTile(String nomProduit, String dateFinEnchere, Integer montant, String pseudoVendeur,
			Integer noVendeur, Integer noArticle, Base64 photo) {
		super();
		this.nomProduit = nomProduit;
		this.dateFinEnchere = dateFinEnchere;
		this.montant = montant;
		this.pseudoVendeur = pseudoVendeur;
		this.noVendeur = noVendeur;
		this.noArticle = noArticle;
		this.photo = photo;
	}




	public AccueilDashboardTile() {
		super();
	}
	
	
	
}