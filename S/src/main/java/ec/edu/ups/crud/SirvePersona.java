package ec.edu.ups.crud;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2021-02-15T02:06:51.470-05:00
 * Generated source version: 2.7.18
 * 
 */
@WebService(targetNamespace = "http://CRUD.ups.edu.ec/", name = "sirvePersona")
@XmlSeeAlso({ObjectFactory.class})
public interface SirvePersona {

    @WebMethod
    @RequestWrapper(localName = "registrar", targetNamespace = "http://CRUD.ups.edu.ec/", className = "ec.edu.ups.crud.Registrar")
    @ResponseWrapper(localName = "registrarResponse", targetNamespace = "http://CRUD.ups.edu.ec/", className = "ec.edu.ups.crud.RegistrarResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String registrar(
        @WebParam(name = "arg0", targetNamespace = "")
        ec.edu.ups.crud.Persona arg0
    );
}