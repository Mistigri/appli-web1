package com.gk.exo;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SixiemeServlet
 */
@WebServlet("/SixiemeServlet")
public class SixiemeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SixiemeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// Recup Contexte d'execution de l'appli
		ServletContext sc = getServletContext();
		String info = sc.getServerInfo();
		String real = sc.getRealPath("/");
		String nomctx = sc.getServletContextName();
		ServletOutputStream out = response.getOutputStream();
		// écriture log
		sc.log("ECRIRE DANS LOG DE " + info);
		// création de la page HTML
		out.println("<HTML>");
		out.println("<HEAD><TITLE>Info Serveur</TITLE></HEAD>");
		out.println("<BODY> " + info + "<br>" + nomctx + "<br>" + real
				+ "</BODY></HTML>");
		// toujours fermer le flux d'écriture
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
