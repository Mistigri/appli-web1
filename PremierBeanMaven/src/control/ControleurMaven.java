package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controleur
 */
@WebServlet("/ControleurMaven")
public class ControleurMaven extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControleurMaven() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext ctx;
		String page = "";
		ctx = getServletContext();

		RequestDispatcher dispatch;
		page = request.getParameter("page");
		// Aiguillage en fonction de la demande de l'utilisateur
		if (page == null) {
			// On vient de nulle part --> Formulaire de login
			dispatch = ctx.getRequestDispatcher("/PageAuthentification.jsp");
			dispatch.forward(request, response);
		} else {
			if ("1".equals(page)) {
				// on vient du login --> vérification
				dispatch = ctx.getRequestDispatcher("/Authentification");
				dispatch.forward(request, response);
			} else {
				if ("2".equals(page)) {
					// on s'inscrit
					dispatch = ctx.getRequestDispatcher("/PageInscription.jsp");
					dispatch.forward(request, response);
				} else {
					if ("3".equals(page)) {
						// on s'inscrit
						dispatch = ctx.getRequestDispatcher("/PageVerification.jsp");
						dispatch.forward(request, response);
					}
					else {
						if ("4".equals(page)) {
							// on s'inscrit
							dispatch = ctx.getRequestDispatcher("/SaveServlet");
							dispatch.forward(request, response);
						}
					}
				}
			}
		}
	}
}
