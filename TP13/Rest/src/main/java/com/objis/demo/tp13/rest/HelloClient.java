package com.objis.demo.tp13.rest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class HelloClient
{
    private static final Logger LOGGER = LogManager.getLogger(HelloClient.class);

    public static int getServerIsRunning()
    {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:8080/demosoaprest");
        return target.request().get().getStatus();
    }

    public void sayHello(String value)
    {
        if( getServerIsRunning() == 0 )
        {
            Client client = ClientBuilder.newClient();
            WebTarget target = client.target("http://localhost:8080/demosoaprest/hello/" + value);
            String response = target.request().get(String.class);
            LOGGER.info("Response : " + response);
        }
    }
}
