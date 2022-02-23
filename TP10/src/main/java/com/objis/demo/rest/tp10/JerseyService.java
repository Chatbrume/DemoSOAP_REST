package com.objis.demo.rest.tp10;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/message")
public class JerseyService
{
    @GET
    public String getMsg()
    {
        return "Hello World !! - Jersey 2";
    }
}
