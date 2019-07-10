package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import metier.Compte;

@Path("/Banque")

public class BanqueRestService {
	@GET
	@Path("/conversion/{montant}")
	@Produces(MediaType.APPLICATION_JSON)
	public double conversion(@PathParam(value="montant")double mt) {
		return mt*1.15;
	}
	@GET
	@Path("/Compte/{code}")
	@Produces(value={MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Compte getCompte(@PathParam(value="code")Long code) {
		return new Compte (code, 7000, new Date());
	}
	@GET
	@Path("/Compte")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Compte> getComptes() {
		List<Compte>cptes=new ArrayList<Compte>();
		cptes.add(new Compte(1L,7000, new Date()));
		cptes.add(new Compte (2L,9000, new Date()));
		return cptes;
	}
}
