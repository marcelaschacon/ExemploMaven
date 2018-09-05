package br.com.db1.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("cidade")
public class CidadeRest {

	@GET
	@Path("alo")
	public Response helloWorld(){
		return Response.status(200).entity("CABE%C7A%20DE%20MARKINHOS").build();
	}
}
