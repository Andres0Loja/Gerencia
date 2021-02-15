
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

    private final static QName _Divicion_QNAME = new QName("http://SOAP.ups.edu.ec/", "divicion");
    private final static QName _RestaResponse_QNAME = new QName("http://SOAP.ups.edu.ec/", "RestaResponse");
    private final static QName _Resta_QNAME = new QName("http://SOAP.ups.edu.ec/", "Resta");
    private final static QName _DivicionResponse_QNAME = new QName("http://SOAP.ups.edu.ec/", "divicionResponse");
    private final static QName _Suma_QNAME = new QName("http://SOAP.ups.edu.ec/", "Suma");
    private final static QName _Multiplicacion_QNAME = new QName("http://SOAP.ups.edu.ec/", "multiplicacion");
    private final static QName _MultiplicacionResponse_QNAME = new QName("http://SOAP.ups.edu.ec/", "multiplicacionResponse");
    private final static QName _SumaResponse_QNAME = new QName("http://SOAP.ups.edu.ec/", "SumaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.edu.ups.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Suma }
     * 
     */
    public Suma createSuma() {
        return new Suma();
    }

    /**
     * Create an instance of {@link Multiplicacion }
     * 
     */
    public Multiplicacion createMultiplicacion() {
        return new Multiplicacion();
    }

    /**
     * Create an instance of {@link SumaResponse }
     * 
     */
    public SumaResponse createSumaResponse() {
        return new SumaResponse();
    }

    /**
     * Create an instance of {@link MultiplicacionResponse }
     * 
     */
    public MultiplicacionResponse createMultiplicacionResponse() {
        return new MultiplicacionResponse();
    }

    /**
     * Create an instance of {@link Divicion }
     * 
     */
    public Divicion createDivicion() {
        return new Divicion();
    }

    /**
     * Create an instance of {@link DivicionResponse }
     * 
     */
    public DivicionResponse createDivicionResponse() {
        return new DivicionResponse();
    }

    /**
     * Create an instance of {@link Resta }
     * 
     */
    public Resta createResta() {
        return new Resta();
    }

    /**
     * Create an instance of {@link RestaResponse }
     * 
     */
    public RestaResponse createRestaResponse() {
        return new RestaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Divicion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SOAP.ups.edu.ec/", name = "divicion")
    public JAXBElement<Divicion> createDivicion(Divicion value) {
        return new JAXBElement<Divicion>(_Divicion_QNAME, Divicion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SOAP.ups.edu.ec/", name = "RestaResponse")
    public JAXBElement<RestaResponse> createRestaResponse(RestaResponse value) {
        return new JAXBElement<RestaResponse>(_RestaResponse_QNAME, RestaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Resta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SOAP.ups.edu.ec/", name = "Resta")
    public JAXBElement<Resta> createResta(Resta value) {
        return new JAXBElement<Resta>(_Resta_QNAME, Resta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivicionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SOAP.ups.edu.ec/", name = "divicionResponse")
    public JAXBElement<DivicionResponse> createDivicionResponse(DivicionResponse value) {
        return new JAXBElement<DivicionResponse>(_DivicionResponse_QNAME, DivicionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Suma }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SOAP.ups.edu.ec/", name = "Suma")
    public JAXBElement<Suma> createSuma(Suma value) {
        return new JAXBElement<Suma>(_Suma_QNAME, Suma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiplicacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SOAP.ups.edu.ec/", name = "multiplicacion")
    public JAXBElement<Multiplicacion> createMultiplicacion(Multiplicacion value) {
        return new JAXBElement<Multiplicacion>(_Multiplicacion_QNAME, Multiplicacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplicacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SOAP.ups.edu.ec/", name = "multiplicacionResponse")
    public JAXBElement<MultiplicacionResponse> createMultiplicacionResponse(MultiplicacionResponse value) {
        return new JAXBElement<MultiplicacionResponse>(_MultiplicacionResponse_QNAME, MultiplicacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SOAP.ups.edu.ec/", name = "SumaResponse")
    public JAXBElement<SumaResponse> createSumaResponse(SumaResponse value) {
        return new JAXBElement<SumaResponse>(_SumaResponse_QNAME, SumaResponse.class, null, value);
    }

}
