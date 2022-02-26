
package com.objis.demo.tp13.client.wsimport;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.objis.demo.tp13.client.wsimport package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SayHello_QNAME = new QName("http://soap.tp13.demo.objis.com/", "sayHello");
    private final static QName _DisplayMessage_QNAME = new QName("http://soap.tp13.demo.objis.com/", "displayMessage");
    private final static QName _GetYamlSwaggerResponse_QNAME = new QName("http://soap.tp13.demo.objis.com/", "getYamlSwaggerResponse");
    private final static QName _GetJsonSwaggerResponse_QNAME = new QName("http://soap.tp13.demo.objis.com/", "getJsonSwaggerResponse");
    private final static QName _DisplayMessageResponse_QNAME = new QName("http://soap.tp13.demo.objis.com/", "displayMessageResponse");
    private final static QName _HomeResponse_QNAME = new QName("http://soap.tp13.demo.objis.com/", "homeResponse");
    private final static QName _SayHelloResponse_QNAME = new QName("http://soap.tp13.demo.objis.com/", "sayHelloResponse");
    private final static QName _GetYamlSwagger_QNAME = new QName("http://soap.tp13.demo.objis.com/", "getYamlSwagger");
    private final static QName _Home_QNAME = new QName("http://soap.tp13.demo.objis.com/", "home");
    private final static QName _GetJsonSwagger_QNAME = new QName("http://soap.tp13.demo.objis.com/", "getJsonSwagger");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.objis.demo.tp13.client.wsimport
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetJsonSwaggerResponse }
     * 
     */
    public GetJsonSwaggerResponse createGetJsonSwaggerResponse() {
        return new GetJsonSwaggerResponse();
    }

    /**
     * Create an instance of {@link GetYamlSwaggerResponse }
     * 
     */
    public GetYamlSwaggerResponse createGetYamlSwaggerResponse() {
        return new GetYamlSwaggerResponse();
    }

    /**
     * Create an instance of {@link DisplayMessage }
     * 
     */
    public DisplayMessage createDisplayMessage() {
        return new DisplayMessage();
    }

    /**
     * Create an instance of {@link SayHello }
     * 
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link DisplayMessageResponse }
     * 
     */
    public DisplayMessageResponse createDisplayMessageResponse() {
        return new DisplayMessageResponse();
    }

    /**
     * Create an instance of {@link HomeResponse }
     * 
     */
    public HomeResponse createHomeResponse() {
        return new HomeResponse();
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     * 
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link GetJsonSwagger }
     * 
     */
    public GetJsonSwagger createGetJsonSwagger() {
        return new GetJsonSwagger();
    }

    /**
     * Create an instance of {@link GetYamlSwagger }
     * 
     */
    public GetYamlSwagger createGetYamlSwagger() {
        return new GetYamlSwagger();
    }

    /**
     * Create an instance of {@link Home }
     * 
     */
    public Home createHome() {
        return new Home();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.tp13.demo.objis.com/", name = "sayHello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisplayMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.tp13.demo.objis.com/", name = "displayMessage")
    public JAXBElement<DisplayMessage> createDisplayMessage(DisplayMessage value) {
        return new JAXBElement<DisplayMessage>(_DisplayMessage_QNAME, DisplayMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetYamlSwaggerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.tp13.demo.objis.com/", name = "getYamlSwaggerResponse")
    public JAXBElement<GetYamlSwaggerResponse> createGetYamlSwaggerResponse(GetYamlSwaggerResponse value) {
        return new JAXBElement<GetYamlSwaggerResponse>(_GetYamlSwaggerResponse_QNAME, GetYamlSwaggerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetJsonSwaggerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.tp13.demo.objis.com/", name = "getJsonSwaggerResponse")
    public JAXBElement<GetJsonSwaggerResponse> createGetJsonSwaggerResponse(GetJsonSwaggerResponse value) {
        return new JAXBElement<GetJsonSwaggerResponse>(_GetJsonSwaggerResponse_QNAME, GetJsonSwaggerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisplayMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.tp13.demo.objis.com/", name = "displayMessageResponse")
    public JAXBElement<DisplayMessageResponse> createDisplayMessageResponse(DisplayMessageResponse value) {
        return new JAXBElement<DisplayMessageResponse>(_DisplayMessageResponse_QNAME, DisplayMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HomeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.tp13.demo.objis.com/", name = "homeResponse")
    public JAXBElement<HomeResponse> createHomeResponse(HomeResponse value) {
        return new JAXBElement<HomeResponse>(_HomeResponse_QNAME, HomeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.tp13.demo.objis.com/", name = "sayHelloResponse")
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse value) {
        return new JAXBElement<SayHelloResponse>(_SayHelloResponse_QNAME, SayHelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetYamlSwagger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.tp13.demo.objis.com/", name = "getYamlSwagger")
    public JAXBElement<GetYamlSwagger> createGetYamlSwagger(GetYamlSwagger value) {
        return new JAXBElement<GetYamlSwagger>(_GetYamlSwagger_QNAME, GetYamlSwagger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Home }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.tp13.demo.objis.com/", name = "home")
    public JAXBElement<Home> createHome(Home value) {
        return new JAXBElement<Home>(_Home_QNAME, Home.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetJsonSwagger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.tp13.demo.objis.com/", name = "getJsonSwagger")
    public JAXBElement<GetJsonSwagger> createGetJsonSwagger(GetJsonSwagger value) {
        return new JAXBElement<GetJsonSwagger>(_GetJsonSwagger_QNAME, GetJsonSwagger.class, null, value);
    }

}
