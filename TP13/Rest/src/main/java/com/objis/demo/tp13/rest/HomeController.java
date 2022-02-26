package com.objis.demo.tp13.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@Path("/")
public class HomeController
{
    @GET
    @Path("/home")
    @Operation(
        method = "GET",
        summary = "Home page",
        description="Sert a rien pour l'instant",
        responses = @ApiResponse(
            description = "The sentence",
            content = @Content(mediaType = "text/plain")
        )
    )
    public Response home()
    {
        String output = "Here is the home !";
        return Response.status(200).entity(output).build();
    }

	@GET
    @Path("/hello/{name}")
    @Operation(
            method = "GET",
            summary = "Say hello to ...",
            description="Say hello to the name in parameters",
            responses = @ApiResponse(
                    description = "The sentence",
                    content = @Content(mediaType = "text/plain")
            )
    )
    public Response sayHello(@Parameter(description = "Votre prenom", required = true)@PathParam("name") String name)
    {
        String output = "Hello " + name + "!";
        return Response.status(200).entity(output).build();
    }

    @POST
    @Path("/message")
    @Operation(
            method = "POST",
            summary = "Display the message",
            description="Display the message in parameter",
            responses = @ApiResponse(
                    description = "The message",
                    content = @Content(mediaType = "text/plain")
            )
    )
    public Response displayMessage(@Parameter(description = "message", required = true)@PathParam("message") String message)
    {
        String output = "Message reçu !";
        return Response.status(200).entity(output).build();
    }
}
