package de.cwansart.test;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("hello")
@RequestScoped
@Produces(MediaType.TEXT_PLAIN)
public class HelloResource {

    @GET
    public Response getHello() {
        return Response.ok("Hello").build();
    }
}
