package com.gk.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gk.model.Users;

/**
 * Servlet implementation class SaveServlet
 */
@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SaveServlet() {
		super();
	}

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Users courant = new Users((Users) request.getSession()
				.getAttribute("u"));
		/*
		 * ServletContext application = getServletContext(); List<Users>
		 * listUser = (List<Users>)
		 * application.getAttribute("listeUtilisateurs"); if (listUser == null)
		 * { listUser = new ArrayList<Users>(); }
		 * 
		 * //constructeur par copie pr éviter que l'utilisateur courant soit
		 * écrasé à chaque fois
		 * 
		 * listUser.add((Users) courant);
		 * application.setAttribute("listeUtilisateurs", listUser);
		 * 
		 * for (Users users : listUser) { System.out.println(users); }
		 * response.sendRedirect("SaveDataBase.jsp");
		 */
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection ctx;
		try {

			ctx = DriverManager.getConnection(getServletContext()
					.getInitParameter("dbURL"), getServletContext()
					.getInitParameter("dbUser"), getServletContext()
					.getInitParameter("dbPass"));
			Statement stmt = ctx.createStatement();
			String query = "insert into appliwebtest(name, lastname, login, password, address, phone) values ('"+courant.getNom()+"','"+
			courant.getPrenom()+"','"+courant.getPseudo()+"','"+courant.getPassword()+"','"+courant.getAdresse()+"',"+courant.getTelephone()+")";
			System.out.println(query);		
			int rs = stmt.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		response.sendRedirect("Controler");

	}
}
