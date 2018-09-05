package br.com.db1.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("cidade")
public class CidadeRest {

	@GET
	@Path("alo/{parametro}")
	public Response helloWorld(@PathParam("parametro") String nome){
		return Response.status(200).entity("CABE%C7A%20DE%20MARKINHOS" + nome).build();
	}
}
