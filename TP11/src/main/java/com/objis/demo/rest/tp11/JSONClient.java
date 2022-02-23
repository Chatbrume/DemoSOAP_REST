package com.objis.demo.rest.tp11;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class JSONClient
{
    private static final Logger LOGGER = LogManager.getLogger(JSONClient.class);

    /*public static void getTP9()
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
        String response = target.request().get(String.class);
        LOGGER.info("Response : "+response);

        String customer = ClientUtil.createCustomerInJSON("Alyssa William"
                , "1021 Hweitt Street"
                , "343-343-3433");
        String response = target.request()
                .post(Entity.entity(customer, MediaType.APPLICATION_JSON)
                        , String.class);
        System.out.println("customer created with id: "+response);
    }*/

    public static void main(String[] args)
    {
        LOGGER.info("JSONClient");
        //getTP9();
        //postTP9();
    }
}
