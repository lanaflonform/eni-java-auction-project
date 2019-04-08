package fr.eni.ecole.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import fr.eni.ecole.*;
import fr.eni.ecole.DAL.DALException;
import fr.eni.ecole.beans.Utilisateur;
import fr.eni.ecole.bll.CredentialManager;
import fr.eni.ecole.util.Constantes;
/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       Boolean log = false;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		this.getServletContext().getRequestDispatcher(Constantes.PAGE_REGISTER).forward(request, response);
		
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			Utilisateur new_user = new Utilisateur();
			new_user.setEmail(request.getParameter("inputEmail"));
			new_user.setMotDePasse(request.getParameter("inputPassword"));
			new_user.setPseudo(request.getParameter("inputPseudo"));
			new_user.setRue(request.getParameter("inputRue"));
			new_user.setVille(request.getParameter("inputVille"));
			new_user.setCodePostal(request.getParameter("inputCodePostal"));
			new_user.setNom(request.getParameter("inputNom"));
			new_user.setPrenom(request.getParameter("inputPrenom"));
			new_user.setTelephone(request.getParameter("inputTelephone"));
			
			CredentialManager credMgr = new CredentialManager();

			int result = credMgr.register(new_user);
			if (result > 0) {
				new_user = credMgr.connexion(new_user.getPseudo(), new_user.getMotDePasse());
				if (new_user != null) {
					request.getSession().setAttribute(Constantes.SESS_PSEUDO, new_user.getPseudo());
					request.getSession().setAttribute(Constantes.SESS_NUM_UTILISATEUR, new_user.getNoUtilisateur());
					request.getRequestDispatcher(Constantes.PAGE_INDEX).forward(request, response);
				}
			}
			else {
				request.setAttribute("erreur", "Une erreur s'est produite durant l'enregistrement. Le pseudo est peut-�tre d�j� pris.");
				request.getRequestDispatcher(Constantes.PAGE_REGISTER).forward(request, response);
			}
				
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
