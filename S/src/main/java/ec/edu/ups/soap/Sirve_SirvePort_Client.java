
package ec.edu.ups.soap;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.swing.JOptionPane;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2021-02-08T18:35:34.312-05:00
 * Generated source version: 2.7.18
 * 
 */
public final class Sirve_SirvePort_Client {

    private static final QName SERVICE_NAME = new QName("http://SOAP.ups.edu.ec/", "sirveService");

    private Sirve_SirvePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = SirveService.WSDL_LOCATION;
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
      
        SirveService ss = new SirveService(wsdlURL, SERVICE_NAME);
        Sirve port = ss.getSirvePort();  
        
        {
        System.out.println("Invoking haber...");
        java.lang.String _haber__return = port.haber();
        System.out.println("haber.result=" + _haber__return);
            JOptionPane.showMessageDialog(null, _haber__return);


        }

        System.exit(0);
    }

}