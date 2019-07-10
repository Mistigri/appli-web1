
package service;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.PathParam;



@Path("/books")
public class BookResource {
	
	@GET
	public String getBooks() {
		return "Cuisine et moi / JavaEE 18 ";
	}
	@POST
	public String createBook(String livre) {
		return livre;
	}
	@GET
	@Path("{id}")
	public String getBookById(@PathParam("id") int id) {
		return "Java for life " + id ;
	}
	
	@PUT
	@Path("{id}")
	public void updateBookById(@PathParam("id") int id) {		
	}
	@DELETE
	@Path("{id}")
	public void deleteBookById(@PathParam("id") int id){		
	}
	
}