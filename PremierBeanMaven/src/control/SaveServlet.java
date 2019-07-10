package control;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Utilisateur;

/**
 * Servlet implementation class SaveServlet
 */
@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext application=getServletContext();
		List<Utilisateur> listUser=(List<Utilisateur>) application.getAttribute("listUtilisateur");
		if(listUser==null)
			listUser=new ArrayList<Utilisateur>();
		Utilisateur courant=new Utilisateur((Utilisateur) request.getSession().getAttribute("util"));
		listUser.add(courant);
		application.setAttribute("listUtilisateur", listUser);
		for (Utilisateur utilisateur : listUser) {
			System.out.println(utilisateur);
		}
		response.sendRedirect("ControleurMaven");
	}

}
