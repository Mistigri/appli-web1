package com.gk.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PremiereServlet
 */
@WebServlet(urlPatterns = {"/gk.fr"},
	initParams = {
	@WebInitParam(name = "societe", value = "GK"),
	@WebInitParam(name = "login", value = "azerty")
})	

public class PremiereServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//d�finition variable p1 et p2 comme param�tres
	String p1,p2;
	
	//g�n�ration auto m�thod init et ctrl espace et choix m�thode avec param�tres
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		//on fait en sorte de r�cup�rer les param�tres des variable p1 et p2 pour pouvoir les afficher � la fin
		p1=config.getInitParameter("societe");
		p2=config.getInitParameter("login");
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PremiereServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//on affiche les r�sultats des param�tres de p1 et p2
		out.println("societe : "+p1 + "<br>login: "+p2);
		out.close();
	}

}


