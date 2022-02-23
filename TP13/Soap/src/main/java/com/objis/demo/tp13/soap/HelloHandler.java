package com.objis.demo.tp13.soap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.codehaus.plexus.util.StringOutputStream;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.io.IOException;
import java.util.Set;

public class HelloHandler implements SOAPHandler<SOAPMessageContext>
{
    private static final Logger LOGGER = LogManager.getLogger(HelloHandler.class);
    @Override
    public Set<QName> getHeaders() {
        return null;
    }

    @Override
    public boolean handleMessage(SOAPMessageContext soapMessageContext) {
        SOAPMessage message = soapMessageContext.getMessage();
        try {
            //Block permettant de recuperer le nom de la méthode
            StringOutputStream output = new StringOutputStream();
            message.writeTo(output);
            String msg = output.toString();
            String methode = msg.substring(msg.indexOf("<ns2:")+5);
            methode = methode.substring(0, methode.indexOf(">"));

            String content = message.getSOAPBody().getTextContent();

            if( methode.contains("Response") )
                System.out.println("Response: "+content);
            else
                System.out.println("Request: "+methode+"("+content+")");
        }
        catch(SOAPException | IOException ex)
        {
            LOGGER.info(ex.getMessage(), ex);
            return false;
        }
        return true;
    }

    @Override
    public boolean handleFault(SOAPMessageContext soapMessageContext) {
        return false;
    }

    @Override
    public void close(MessageContext messageContext) {

    }
}
