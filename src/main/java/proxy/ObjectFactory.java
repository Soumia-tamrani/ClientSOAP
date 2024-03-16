
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _ConversionMontantEuroToDH_QNAME = new QName("http://ws/", "ConversionMontantEuroToDH");
    private static final QName _ConversionMontantEuroToDHResponse_QNAME = new QName("http://ws/", "ConversionMontantEuroToDHResponse");
    private static final QName _GetCompteDetails_QNAME = new QName("http://ws/", "getCompteDetails");
    private static final QName _GetCompteDetailsResponse_QNAME = new QName("http://ws/", "getCompteDetailsResponse");
    private static final QName _ListCpts_QNAME = new QName("http://ws/", "listCpts");
    private static final QName _ListCptsResponse_QNAME = new QName("http://ws/", "listCptsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConversionMontantEuroToDH }
     * 
     * @return
     *     the new instance of {@link ConversionMontantEuroToDH }
     */
    public ConversionMontantEuroToDH createConversionMontantEuroToDH() {
        return new ConversionMontantEuroToDH();
    }

    /**
     * Create an instance of {@link ConversionMontantEuroToDHResponse }
     * 
     * @return
     *     the new instance of {@link ConversionMontantEuroToDHResponse }
     */
    public ConversionMontantEuroToDHResponse createConversionMontantEuroToDHResponse() {
        return new ConversionMontantEuroToDHResponse();
    }

    /**
     * Create an instance of {@link GetCompteDetails }
     * 
     * @return
     *     the new instance of {@link GetCompteDetails }
     */
    public GetCompteDetails createGetCompteDetails() {
        return new GetCompteDetails();
    }

    /**
     * Create an instance of {@link GetCompteDetailsResponse }
     * 
     * @return
     *     the new instance of {@link GetCompteDetailsResponse }
     */
    public GetCompteDetailsResponse createGetCompteDetailsResponse() {
        return new GetCompteDetailsResponse();
    }

    /**
     * Create an instance of {@link ListCpts }
     * 
     * @return
     *     the new instance of {@link ListCpts }
     */
    public ListCpts createListCpts() {
        return new ListCpts();
    }

    /**
     * Create an instance of {@link ListCptsResponse }
     * 
     * @return
     *     the new instance of {@link ListCptsResponse }
     */
    public ListCptsResponse createListCptsResponse() {
        return new ListCptsResponse();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     * @return
     *     the new instance of {@link Compte }
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionMontantEuroToDH }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionMontantEuroToDH }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ConversionMontantEuroToDH")
    public JAXBElement<ConversionMontantEuroToDH> createConversionMontantEuroToDH(ConversionMontantEuroToDH value) {
        return new JAXBElement<>(_ConversionMontantEuroToDH_QNAME, ConversionMontantEuroToDH.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionMontantEuroToDHResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionMontantEuroToDHResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ConversionMontantEuroToDHResponse")
    public JAXBElement<ConversionMontantEuroToDHResponse> createConversionMontantEuroToDHResponse(ConversionMontantEuroToDHResponse value) {
        return new JAXBElement<>(_ConversionMontantEuroToDHResponse_QNAME, ConversionMontantEuroToDHResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteDetails }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompteDetails }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCompteDetails")
    public JAXBElement<GetCompteDetails> createGetCompteDetails(GetCompteDetails value) {
        return new JAXBElement<>(_GetCompteDetails_QNAME, GetCompteDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteDetailsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompteDetailsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCompteDetailsResponse")
    public JAXBElement<GetCompteDetailsResponse> createGetCompteDetailsResponse(GetCompteDetailsResponse value) {
        return new JAXBElement<>(_GetCompteDetailsResponse_QNAME, GetCompteDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCpts }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListCpts }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listCpts")
    public JAXBElement<ListCpts> createListCpts(ListCpts value) {
        return new JAXBElement<>(_ListCpts_QNAME, ListCpts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCptsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListCptsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listCptsResponse")
    public JAXBElement<ListCptsResponse> createListCptsResponse(ListCptsResponse value) {
        return new JAXBElement<>(_ListCptsResponse_QNAME, ListCptsResponse.class, null, value);
    }

}
