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
 * Servlet implementation class FormLivre
 */
@WebServlet("/FormLivre")
public class FormLivre extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormLivre() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = "FormLivre";
		HttpSession session = request.getSession();
		String name= (String) session.getAttribute("nom");
				
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
				out.println("<p>Bonjour "+ name + " !</p>");

		out.println("<form method = \"POST\" action=\"CtLivre\"> Quel est son titre :<br>"
				+ " <input type=\"text\" name=\"bookTitle\"><br>"
				+ "Quelle est sa catégorie ?<br>"
				+ "  <input type=\"text\" name=\"category\" > <br><br>"
				+ "  <input type=\"submit\" value=\"Valider\"></form> ");
	}
}


