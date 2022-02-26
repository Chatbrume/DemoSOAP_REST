package com.objis.demo.tp13.soap;

import javax.xml.ws.Endpoint;

public class Publisher
{
	public static final String URI = "http://localhost:8888/demosoaprest";

	public static void main(String[] args)
	{
		SoapServer impl = new SoapServer();
		
		Endpoint endpoint = Endpoint.publish(URI, impl);
		
		boolean status = endpoint.isPublished();
		
		System.out.println("Web Service disponible ? " + status);
	}
}
