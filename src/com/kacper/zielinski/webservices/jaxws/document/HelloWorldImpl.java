package com.kacper.zielinski.webservices.jaxws.document;

import javax.jws.WebService;

@WebService(endpointInterface = "com.kacper.zielinski.webservices.jaxws.document.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    @Override
    public String getHelloWorldAsString(String name) {
        return "Hello JAX-WS: " + name;
    }
}
