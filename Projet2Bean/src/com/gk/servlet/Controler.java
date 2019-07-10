package com.gk.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Controler")
public class Controler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Controler() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext ctx = getServletContext();
		String page = request.getParameter("page");
		RequestDispatcher dispatch;
		if(page==null) {
			request.setAttribute("lang", "fr");
			dispatch=ctx.getRequestDispatcher("/Authentification.jsp");
			dispatch.forward(request, response);
		}
		else {
			if("1".equals(page)){
				dispatch=ctx.getRequestDispatcher("/ControlLogin");
				dispatch.forward(request, response);
			}
			else if ("2".equals(page)){
				dispatch=ctx.getRequestDispatcher("/Inscription.jsp");
				dispatch.forward(request, response);
			}
			else if ("3".equals(page)){
				dispatch=ctx.getRequestDispatcher("/Verification.jsp");
				dispatch.forward(request, response);
			}
			else if("4".equals(page)) {
					dispatch = ctx.getRequestDispatcher("/SaveServlet");
					dispatch.forward(request, response);
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
