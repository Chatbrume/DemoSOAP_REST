package com.objis.demo.tp13.soap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.jws.*;
import javax.jws.soap.SOAPBinding;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

@WebService(name = "SoapServer", targetNamespace = "http://soap.tp13.demo.objis.com/")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
@HandlerChain(file="LogMessageHandler.xml")
public class SoapServer
{
	private static final Logger LOGGER = LogManager.getLogger(SoapServer.class);
	private static final String url = "http://localhost:8080/demosoaprest";

	@WebMethod
	public String home()
	{
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(url+"/home");
		String response = target.request().get(String.class);
		LOGGER.info("Response : " + response);
		return response;
	}

	@WebMethod
	public String sayHello(@WebParam(name = "name") String name)
	{
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(url+"/hello/"+name);
		String response = target.request().get(String.class);
		LOGGER.info("Response : " + response);
		return response;
	}

	@WebMethod
	public String displayMessage(@WebParam(name = "message") String message)
	{
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(url+"/message");
		String response = target.request().post(Entity.entity(message, MediaType.TEXT_PLAIN), String.class);
		LOGGER.info("Response : " + response);
		return response;
	}

	@WebMethod
	public String getJsonSwagger()
	{
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(url+"/api");
		String response = target.request().get(String.class);
		LOGGER.info("Response : " + response);
		return response;
	}

	@WebMethod
	public String getYamlSwagger()
	{
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(url+"/api/openapi.yaml");
		String response = target.request().get(String.class);
		LOGGER.info("Response : " + response);
		return response;
	}
}
