package com.gk.exo;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FormLogin
 */
@WebServlet("/FormLogin")
public class FormLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = "FormLogin";

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<form method = \"POST\" action=\"Controller?page=1\"> Quel est votre pseudo :<br>"
				+ " <input type=\"text\" name=\"pseudo\"><br>"
				+ "Quelle est votre mot de passe ?<br>"
				+ "  <input type=\"text\" name=\"mdp\" > <br><br>"
				+ "  <input type=\"submit\" value=\"Valider\"></form> ");
	}

}
