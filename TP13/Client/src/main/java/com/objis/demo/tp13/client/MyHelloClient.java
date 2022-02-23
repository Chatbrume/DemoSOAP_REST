package com.objis.demo.tp13.client;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyHelloClient
{
	private static final Logger LOGGER = LogManager.getLogger(MyHelloClient.class);

	public static void main(String[] args)
	{
		HelloSoapServerService monService = new HelloSoapServerService();
		IHello port = monService.getHelloSoapServerPort();

		String resultat = port.sayHello("Objis");
		LOGGER.info(resultat);
	}
}