package com.kacper.zielinski.webservices.jaxws.rpc;

import javax.jws.WebService;

@WebService(endpointInterface = "com.kacper.zielinski.webservices.jaxws.rpc.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    @Override
    public String getHelloWorldAsString(String name) {
        return "Hello JAX-WS: " + name;
    }
}
