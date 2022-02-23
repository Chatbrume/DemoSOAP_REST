package com.objis.demo.rest.tp11;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class JerseyClient
{
    private static final Logger LOGGER = LogManager.getLogger(JerseyClient.class);

    /*public static void getTP9()
    {
        try {
            Client client = Client.create();

            WebResource webResource = client
                    .resource("http://localhost:8080/restfulexample/rest/json/metallica/get");

            ClientResponse response = webResource.accept("application/json")
                    .get(ClientResponse.class);

            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatus());
            }

            String output = response.getEntity(String.class);

            LOGGER.info("Output from Server .... \n");
            LOGGER.info(output);

        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
    }

    public static void postTP9()
    {
        try {
            Client client = Client.create();

            WebResource webResource = client
                    .resource("http://localhost:8080/RESTfulExample/rest/json/metallica/post");

            String input = "{\"singer\":\"Metallica\",\"title\":\"Fade To Black\"}";

            ClientResponse response = webResource.type("application/json")
                    .post(ClientResponse.class, input);

            if (response.getStatus() != 201) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatus());
            }

            LOGGER.info("Output from Server .... \n");
            String output = response.getEntity(String.class);
            LOGGER.info(output);

        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
    }*/

    public static void main(String[] args)
    {
        LOGGER.info("JerseyClient");
        //getTP9();
        //postTP9();
    }
}
