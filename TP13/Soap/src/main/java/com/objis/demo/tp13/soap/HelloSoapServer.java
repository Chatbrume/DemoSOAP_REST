package com.objis.demo.tp13.soap;

import javax.jws.HandlerChain;
import javax.jws.WebService;

@WebService(endpointInterface="com.objis.demo.tp13.soap.IHello")
@HandlerChain(file="LogMessageHandler.xml")
public class HelloSoapServer implements IHello
{
	public String sayHello(String name)
	{
		return "Hello, " +  name + " !";
	}
}
