package service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.Cookie;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.PathSegment;
import javax.ws.rs.core.UriInfo;

@Path("/books")
public class BookResource {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
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
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("queryparameters")
	public String getQueryParameterBook(
			@DefaultValue("all")@QueryParam("name") String name,
			@DefaultValue("true")@QueryParam("isReady") boolean isReady,
			@HeaderParam("User-Agent") String userAgent) {
				return "name = " + name +"ready=" + isReady + " Agent = "  + userAgent;
	}
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/uriInfo/{name}")
	public String uriInfo(@Context UriInfo uriInfo, @PathParam("name") String name) {
		System.out.println("getPath() : " + uriInfo.getPath());
		System.out.println("getAbsolutePath() : " + uriInfo.getAbsolutePath() );
		System.out.println("getBaseUri() : "+ uriInfo.getBaseUri());
		System.out.println("getRequestUri() : "+ uriInfo.getRequestUri());
		System.out.println("getPathSegments() :");
		List<PathSegment> pathSegments=uriInfo.getPathSegments();
		for(PathSegment ps : pathSegments)
			System.out.println(ps.getPath());
		System.out.println("getPathParameters()");
		MultivaluedMap<String, String> parameters=uriInfo.getPathParameters();
		for(String key : parameters.keySet())
			System.out.println(key + "=" + parameters.getFirst(key));
		return "OK";	
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("httpHeaders")
	public String getInformationFromHttpHeaders(@Context HttpHeaders httpheaders) {
		Map<String, javax.ws.rs.core.Cookie> cookies = httpheaders.getCookies();
		Set<String> currentKeySet = cookies.keySet();
		for(String currentCookie : currentKeySet){
			System.out.println(currentCookie + "=" + cookies.get(currentCookie));
		}
		MultivaluedMap<String, String> requestHeaders=httpheaders.getRequestHeaders();
		Set<String> requestHeadersSet = requestHeaders.keySet();
		for(String currentHeader : requestHeadersSet) {
			System.out.println(currentHeader + "=" + requestHeaders.getFirst(currentHeader));
		}
		return "ok";
	}
	
	
}
	
