package com.objis.demo.soap.tp2;

public class MonCodeClient
{
	public static void main(String[] args)
	{
		HelloObjisWSService monService = new HelloObjisWSService();
		HelloObjis port = monService.getHelloObjisWSPort();

		String resultat = port.sayHello("Objis");
		System.out.println(resultat);
	}
}