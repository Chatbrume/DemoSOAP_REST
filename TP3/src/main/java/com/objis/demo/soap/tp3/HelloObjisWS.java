package com.objis.demo.soap.tp3;

import javax.jws.HandlerChain;
import javax.jws.WebService;

@WebService(endpointInterface="com.objis.demo.soap.tp3.HelloObjis")
@HandlerChain(file="LogMessageHandler.xml")
public class HelloObjisWS implements HelloObjis
{
	public String sayHello(String name) {
		return "Hello, " +  name + " !";
	}
}
