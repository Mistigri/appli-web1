package com.gk.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gk.model.Users;

/**
 * Servlet implementation class ControlLogin
 */
@WebServlet("/ControlLogin")
public class ControlLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControlLogin() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection ctx = null;
		ResultSet rs = null;

		RequestDispatcher dispatch;
		HttpSession session = request.getSession();
		String p = request.getParameter("pseudo");
		String mdp = request.getParameter("password");
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection connexion;
		try {

			connexion = DriverManager.getConnection(getServletContext()
					.getInitParameter("dbURL"), getServletContext()
					.getInitParameter("dbUser"), getServletContext()
					.getInitParameter("dbPass"));
			Statement stmt= connexion.createStatement();
			String query = "select * from appliwebtest where login='"+p+"' and password ='"+mdp+"'";
			System.out.println(query);		
			ResultSet res = stmt.executeQuery(query);
			Users courant = null;
			
			if(res.next()){
				courant = new Users(res.getString("lastname"),res.getString("name"),res.getString("login"),res.getString("password"),res.getString("address"),res.getInt("phone"));
				session.setAttribute("courant", courant);
				remplirList(session);
				getServletContext().getRequestDispatcher("/ListeUtilisateurs.jsp").forward(request,response);
			}
			
			else {
				getServletContext().getRequestDispatcher("/Controler").forward(request,response);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
		
//		ServletContext application = getServletContext();
//		List<Users> listUser = (List<Users>) application.getAttribute("listeUtilisateurs");
//		
//		if (listUser == null) {
//			listUser = new ArrayList<Users>();
//			dispatch=ctx.getRequestDispatcher("/Controler?page=2");
//			dispatch.forward(request, response);			
//		}
//		else {
//			for (Users users : listUser){
//				if (users.getPseudo().equals(p) && users.getPassword().equals(mdp)) { 
//					Users trouve = users;
//					dispatch=ctx.getRequestDispatcher("/Controler?page=3");
//					dispatch.forward(request, response);
//				}
//				else {
//
//				}
//			}
		
			
//		}

private void remplirList(HttpSession session) {
		Connection ctx = null;
		Statement smt = null;
		ResultSet rs = null;
			
		try {
			Class.forName("com.mysql.jdbc.Driver");

		} catch (Exception e) {
			e.printStackTrace();

		}
     
      try {

          ctx = DriverManager.getConnection(getServletContext()
                  .getInitParameter("dbURL"), getServletContext()
                  .getInitParameter("dbUser"), getServletContext()
                  .getInitParameter("dbPass"));
          smt = ctx.createStatement();
          String query = "select * from appliwebtest";
         rs = smt.executeQuery(query);
         Users courant = null;
         List<Users> listUser = new ArrayList<Users>();
         
	         while (rs.next()) {
				courant = new Users(rs.getString("lastname"),rs.getString("name"),rs.getString("login"),rs.getString("password"),rs.getString("address"),rs.getInt("phone"));  
				listUser.add(courant);
				session.setAttribute("listeUtilisateurs", listUser);		
	         }
      }
         catch (SQLException e) {   	
             e.printStackTrace();
             try {
  				rs.close();
  				smt.close();
  				ctx.close();
  			} catch (SQLException e1) {
  				// TODO Auto-generated catch block
  				e1.printStackTrace();
  			}
             
         }
         try {
  			rs.close();
  			smt.close();
  			ctx.close();
  			} 
         catch (SQLException e1) {
  			e1.printStackTrace();
  		}
}
}
