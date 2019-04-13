package com.kacper.zielinski.webservices.jaxws.rpc;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class HelloWorldClient {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:7779/ws/hello?wsdl");
        // from WSDL
        // targetNamespace="http://rpc.jaxws.webservices.zielinski.kacper.com/"
        // name="HelloWorldImplService"
        QName qname = new QName("http://rpc.jaxws.webservices.zielinski.kacper.com/",
                "HelloWorldImplService");
        Service service = Service.create(url, qname);
        HelloWorld hello = service.getPort(HelloWorld.class);
        System.out.println(hello.getHelloWorldAsString("RPC Works! :)"));
    }
}
