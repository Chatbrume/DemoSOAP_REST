package com.objis.demo.rest.tp12;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class JSONClient
{
    private static final Logger LOGGER = LogManager.getLogger(JSONClient.class);

    public static void getTP9()
    {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:8080/restfulexample/rest/json/metallica/get");
        String response = target.request().get(String.class);
        LOGGER.info("Response : "+response);
    }

    public static void postTP9()
    {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:8080/restfulexample/rest/json/metallica/post");

        String customer = "{\"singer\":\"Metallica\",\"title\":\"Fade To Black\"}";
        String response = target.request()
                .post(Entity.entity(customer, MediaType.APPLICATION_JSON)
                        , String.class);
        LOGGER.info("Response : "+response);
    }

    public static void main(String[] args)
    {
        LOGGER.info("JSONClient");
        getTP9();
        postTP9();
    }
}
