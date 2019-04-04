package fr.eni.ecole.rest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import fr.eni.ecole.DAL.DALException;
import fr.eni.ecole.beans.ArticleVendu;
import fr.eni.ecole.beans.Enchere;
import fr.eni.ecole.beans.Utilisateur;
import fr.eni.ecole.bll.EncheresManager;
import fr.eni.ecole.rest.mo.getAccueil;

@Path("/utilisateur")
public class GestionEncheres {

	private static List<getAccueil> listeEncheres;
	
	static {
		listeEncheres = new ArrayList<>();
		listeEncheres.add(new getAccueil("pc gamer pour travailler", 
				LocalDateTime.of(2018, 4, 3, 23, 24).toString(), 2300, "ApoZLd", 2, 1));			
		listeEncheres.add(new getAccueil("Rocket stove pour riz et pates", 
				LocalDateTime.of(2018, 4, 3, 23, 26).toString(), 10, "Fcatin", 3, 2));		
	}
	
	@GET
	public List<getAccueil> getListeEncheres() {
		EncheresManager enchereManager = new EncheresManager();
		return enchereManager.getListeEncheresAccueil();
	}
	
	
}