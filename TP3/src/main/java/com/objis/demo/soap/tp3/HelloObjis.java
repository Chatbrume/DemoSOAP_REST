package com.objis.demo.soap.tp3;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
public interface HelloObjis
{
	@WebResult(partName="reponse")
	String sayHello(String name);
}
