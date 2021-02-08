package ec.edu.ups.soap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2021-02-08T18:35:34.350-05:00
 * Generated source version: 2.7.18
 * 
 */
@WebServiceClient(name = "sirveService", 
                  wsdlLocation = "file:/C:/Users/aloja/AppData/Local/Temp/tempdir18104517051204415288.tmp/sirve_1.wsdl",
                  targetNamespace = "http://SOAP.ups.edu.ec/") 
public class SirveService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://SOAP.ups.edu.ec/", "sirveService");
    public final static QName SirvePort = new QName("http://SOAP.ups.edu.ec/", "sirvePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/aloja/AppData/Local/Temp/tempdir18104517051204415288.tmp/sirve_1.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SirveService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/aloja/AppData/Local/Temp/tempdir18104517051204415288.tmp/sirve_1.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SirveService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SirveService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SirveService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SirveService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SirveService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SirveService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns Sirve
     */
    @WebEndpoint(name = "sirvePort")
    public Sirve getSirvePort() {
        return super.getPort(SirvePort, Sirve.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Sirve
     */
    @WebEndpoint(name = "sirvePort")
    public Sirve getSirvePort(WebServiceFeature... features) {
        return super.getPort(SirvePort, Sirve.class, features);
    }

}
