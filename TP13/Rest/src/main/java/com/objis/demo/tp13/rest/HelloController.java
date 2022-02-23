package com.objis.demo.tp13.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloController
{
    @GET
    @Path("/{param}")
    public Response sayHello(@PathParam("param") String name)
    {
        String output = "Hello " + name + "!";
        return Response.status(200).entity(output).build();
    }
}