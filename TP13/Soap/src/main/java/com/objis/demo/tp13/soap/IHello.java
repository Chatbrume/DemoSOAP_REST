package com.objis.demo.tp13.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(name = "IHello", targetNamespace = "http://soap.tp13.demo.objis.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface IHello
{
	@WebMethod
	@WebResult(partName = "reponse")
	public String sayHello(@WebParam(name = "arg0", partName = "arg0") String name);
}
