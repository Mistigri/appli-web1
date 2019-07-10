package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Utilisateur;

/**
 * Servlet implementation class Authentification
 */
@WebServlet("/Authentification")
public class Authentification extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ServletContext ctx;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Authentification() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ctx = getServletContext();
		HttpSession session = request.getSession();
		String login = request.getParameter("login");
		String mdp = request.getParameter("mdp");

		ServletContext application = getServletContext();
		List<Utilisateur> listUser = (List<Utilisateur>) application
				.getAttribute("listUtilisateur");
		Utilisateur trouve = null;
		if (listUser != null && login != null && mdp != null) {
			for (Utilisateur utilisateur : listUser) {
				if (utilisateur.getLogin().equals(login)
						&& utilisateur.getMdp().equals(mdp)) {
					trouve = utilisateur;
				}
			}

		}
		if (trouve != null) {
			session.setAttribute("courant", trouve);
			session.removeAttribute("authError");
			println("<html><body>" + "<H1>Bonjour</H1>"
					+ session.getAttribute(login) + "<br>" + "</body></html>");

		} else {
			session.setAttribute("authError", "authError");
			response.sendRedirect("ControleurMaven");
		}
	}
	}

