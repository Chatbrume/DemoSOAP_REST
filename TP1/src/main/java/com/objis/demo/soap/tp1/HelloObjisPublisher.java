package com.objis.demo.soap.tp1;

import javax.xml.ws.Endpoint;

public class HelloObjisPublisher
{
    public static final String URI = "http://localhost:8080/hello";

    public static void main(String[] args)
    {
        //Create an instance for the implements
        HelloObjis impl = new HelloObjisWS();

        //Make the instance unavailable
        Endpoint endpoint = Endpoint.publish(URI, impl);

        //Test if the endpoint is available
        boolean status = endpoint.isPublished();
        System.out.println("Web service "+(status ? "disponible" : "indisponible")+" !");
    }
}
