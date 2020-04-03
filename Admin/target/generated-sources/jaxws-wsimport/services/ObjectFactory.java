
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
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

    private final static QName _ViewShowResponse_QNAME = new QName("http://services/", "viewShowResponse");
    private final static QName _Category_QNAME = new QName("http://services/", "category");
    private final static QName _UpdateShow_QNAME = new QName("http://services/", "updateShow");
    private final static QName _Shows_QNAME = new QName("http://services/", "shows");
    private final static QName _AddShowResponse_QNAME = new QName("http://services/", "addShowResponse");
    private final static QName _AddShow_QNAME = new QName("http://services/", "addShow");
    private final static QName _FindShow_QNAME = new QName("http://services/", "findShow");
    private final static QName _DeleteShowResponse_QNAME = new QName("http://services/", "deleteShowResponse");
    private final static QName _Type_QNAME = new QName("http://services/", "type");
    private final static QName _UpdateShowResponse_QNAME = new QName("http://services/", "updateShowResponse");
    private final static QName _ViewShow_QNAME = new QName("http://services/", "viewShow");
    private final static QName _DeleteShow_QNAME = new QName("http://services/", "deleteShow");
    private final static QName _FindShowResponse_QNAME = new QName("http://services/", "findShowResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateShowResponse }
     * 
     */
    public UpdateShowResponse createUpdateShowResponse() {
        return new UpdateShowResponse();
    }

    /**
     * Create an instance of {@link ViewShow }
     * 
     */
    public ViewShow createViewShow() {
        return new ViewShow();
    }

    /**
     * Create an instance of {@link DeleteShow }
     * 
     */
    public DeleteShow createDeleteShow() {
        return new DeleteShow();
    }

    /**
     * Create an instance of {@link FindShowResponse }
     * 
     */
    public FindShowResponse createFindShowResponse() {
        return new FindShowResponse();
    }

    /**
     * Create an instance of {@link Type }
     * 
     */
    public Type createType() {
        return new Type();
    }

    /**
     * Create an instance of {@link DeleteShowResponse }
     * 
     */
    public DeleteShowResponse createDeleteShowResponse() {
        return new DeleteShowResponse();
    }

    /**
     * Create an instance of {@link AddShowResponse }
     * 
     */
    public AddShowResponse createAddShowResponse() {
        return new AddShowResponse();
    }

    /**
     * Create an instance of {@link Shows }
     * 
     */
    public Shows createShows() {
        return new Shows();
    }

    /**
     * Create an instance of {@link FindShow }
     * 
     */
    public FindShow createFindShow() {
        return new FindShow();
    }

    /**
     * Create an instance of {@link AddShow }
     * 
     */
    public AddShow createAddShow() {
        return new AddShow();
    }

    /**
     * Create an instance of {@link Category }
     * 
     */
    public Category createCategory() {
        return new Category();
    }

    /**
     * Create an instance of {@link UpdateShow }
     * 
     */
    public UpdateShow createUpdateShow() {
        return new UpdateShow();
    }

    /**
     * Create an instance of {@link ViewShowResponse }
     * 
     */
    public ViewShowResponse createViewShowResponse() {
        return new ViewShowResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewShowResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "viewShowResponse")
    public JAXBElement<ViewShowResponse> createViewShowResponse(ViewShowResponse value) {
        return new JAXBElement<ViewShowResponse>(_ViewShowResponse_QNAME, ViewShowResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Category }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "category")
    public JAXBElement<Category> createCategory(Category value) {
        return new JAXBElement<Category>(_Category_QNAME, Category.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateShow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "updateShow")
    public JAXBElement<UpdateShow> createUpdateShow(UpdateShow value) {
        return new JAXBElement<UpdateShow>(_UpdateShow_QNAME, UpdateShow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Shows }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "shows")
    public JAXBElement<Shows> createShows(Shows value) {
        return new JAXBElement<Shows>(_Shows_QNAME, Shows.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddShowResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "addShowResponse")
    public JAXBElement<AddShowResponse> createAddShowResponse(AddShowResponse value) {
        return new JAXBElement<AddShowResponse>(_AddShowResponse_QNAME, AddShowResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddShow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "addShow")
    public JAXBElement<AddShow> createAddShow(AddShow value) {
        return new JAXBElement<AddShow>(_AddShow_QNAME, AddShow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindShow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findShow")
    public JAXBElement<FindShow> createFindShow(FindShow value) {
        return new JAXBElement<FindShow>(_FindShow_QNAME, FindShow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteShowResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "deleteShowResponse")
    public JAXBElement<DeleteShowResponse> createDeleteShowResponse(DeleteShowResponse value) {
        return new JAXBElement<DeleteShowResponse>(_DeleteShowResponse_QNAME, DeleteShowResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "type")
    public JAXBElement<Type> createType(Type value) {
        return new JAXBElement<Type>(_Type_QNAME, Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateShowResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "updateShowResponse")
    public JAXBElement<UpdateShowResponse> createUpdateShowResponse(UpdateShowResponse value) {
        return new JAXBElement<UpdateShowResponse>(_UpdateShowResponse_QNAME, UpdateShowResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewShow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "viewShow")
    public JAXBElement<ViewShow> createViewShow(ViewShow value) {
        return new JAXBElement<ViewShow>(_ViewShow_QNAME, ViewShow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteShow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "deleteShow")
    public JAXBElement<DeleteShow> createDeleteShow(DeleteShow value) {
        return new JAXBElement<DeleteShow>(_DeleteShow_QNAME, DeleteShow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindShowResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findShowResponse")
    public JAXBElement<FindShowResponse> createFindShowResponse(FindShowResponse value) {
        return new JAXBElement<FindShowResponse>(_FindShowResponse_QNAME, FindShowResponse.class, null, value);
    }

}
