package com.kacper.zielinski.webservices.jaxws.document;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface HelloWorld {

    @WebMethod
    String getHelloWorldAsString(String name);

}
