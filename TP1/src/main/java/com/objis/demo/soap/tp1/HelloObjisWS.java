package com.objis.demo.soap.tp1;

import javax.jws.WebService;

@WebService(endpointInterface = "com.objis.demo.soap.tp1.HelloObjis")
public class HelloObjisWS implements HelloObjis
{
    @Override
    public String sayHello(String name) {
        return "Hello, "+name+" !";
    }
}