package com.objis.demo.tp13.client;

import com.objis.demo.tp13.client.wsimport.SoapServer;
import com.objis.demo.tp13.client.wsimport.SoapServerService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyClient
{
	private static final Logger LOGGER = LogManager.getLogger(MyClient.class);

	public static void main(String[] args)
	{
		SoapServerService monService = new SoapServerService();
		SoapServer port = monService.getSoapServerPort();

		String resultat = port.sayHello("Objis");
		LOGGER.info(resultat);

		resultat = port.displayMessage("Test post response").toString();
		LOGGER.info(resultat);
	}
}