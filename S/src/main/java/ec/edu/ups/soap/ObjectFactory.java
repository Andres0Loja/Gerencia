
package ec.edu.ups.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ec.edu.ups.soap package. 
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

    private final static QName _HaberResponse_QNAME = new QName("http://SOAP.ups.edu.ec/", "HaberResponse");
    private final static QName _Haber_QNAME = new QName("http://SOAP.ups.edu.ec/", "Haber");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.edu.ups.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Haber }
     * 
     */
    public Haber createHaber() {
        return new Haber();
    }

    /**
     * Create an instance of {@link HaberResponse }
     * 
     */
    public HaberResponse createHaberResponse() {
        return new HaberResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HaberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SOAP.ups.edu.ec/", name = "HaberResponse")
    public JAXBElement<HaberResponse> createHaberResponse(HaberResponse value) {
        return new JAXBElement<HaberResponse>(_HaberResponse_QNAME, HaberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Haber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SOAP.ups.edu.ec/", name = "Haber")
    public JAXBElement<Haber> createHaber(Haber value) {
        return new JAXBElement<Haber>(_Haber_QNAME, Haber.class, null, value);
    }

}
