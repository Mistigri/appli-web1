package com.gk.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class QuatriemeServlet
 */
@WebServlet("/QuatriemeServlet")
public class QuatriemeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuatriemeServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = "Quatrième servlet";

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<form method = \"POST\" action=\"CtlLivre\"> Quel est son titre :<br>"
				+ " <input type=\"text\" name=\"bookTitle\"><br>"
				+ "Quelle est sa catégorie ?<br>"
				+ "  <input type=\"text\" name=\"category\" > <br><br>"
				+ "  <input type=\"submit\" value=\"Valider\"></form> ");
	}
}
