
package ec.edu.ups.crud;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2021-02-15T02:06:51.439-05:00
 * Generated source version: 2.7.18
 * 
 */
public final class SirvePersona_SirvePersonaPort_Client {

    private static final QName SERVICE_NAME = new QName("http://CRUD.ups.edu.ec/", "sirvePersonaService");

    private SirvePersona_SirvePersonaPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = SirvePersonaService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        SirvePersonaService ss = new SirvePersonaService(wsdlURL, SERVICE_NAME);
        SirvePersona port = ss.getSirvePersonaPort();  
        
        {
        System.out.println("Invoking registrar...");
        ec.edu.ups.crud.Persona _registrar_arg0 = null;
        java.lang.String _registrar__return = port.registrar(_registrar_arg0);
        System.out.println("registrar.result=" + _registrar__return);


        }

        System.exit(0);
    }

}