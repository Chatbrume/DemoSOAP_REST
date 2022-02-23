package com.objis.demo.soap.tp2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "HelloObjis", targetNamespace = "http://tp3.demo.soap.objis.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface HelloObjis
{
    @WebMethod
    @WebResult(partName = "reponse")
    public String sayHello(@WebParam(name = "arg0", partName = "arg0") String arg0);
}
