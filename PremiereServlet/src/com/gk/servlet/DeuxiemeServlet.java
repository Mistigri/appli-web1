package com.gk.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeuxiemeServlet
 */
@WebServlet("/DeuxiemeServlet")
public class DeuxiemeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeuxiemeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String title = "Deuxième servlet";

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>C'est ma première servlet ! </h1>");

		out.println("<BODY BGCOLOR=\"#FDF5E6\">\n" + "<H1 ALIGN=CENTER>"
				+ title + "</H1>\n" + "<B>RequestMethod: </B>"
				+ request.getMethod() + "<BR>\n" + "<B>RequestURI: </B>"
				+ request.getRequestURI() + "<BR>\n"
				+ "<B>RequestProtocol: </B>" + request.getProtocol()
				+ "<BR><BR>\n" + "<B>Adresse IP Client: </B>"
				+ request.getRemoteAddr() + "<BR>\n" + "<B>Nom Client: </B>"
				+ request.getRemoteHost() + "<BR>\n"
				+ "<TABLE BORDER=1 ALIGN=CENTER>\n"
				+ "<TH>Header Name<TH>Header Value");
		Enumeration headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String headerName = (String) headerNames.nextElement();
			out.println("<TR><TD>" + headerName);
			out.println(" <TD>" + request.getHeader(headerName));
		}
		out.println("</TABLE>\n</BODY></HTML>");
	}

}
