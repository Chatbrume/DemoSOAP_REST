package com.objis.demo.soap.tp1;

import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface HelloObjis
{
    @WebResult(partName="reponse")
    String sayHello(String name);
}
