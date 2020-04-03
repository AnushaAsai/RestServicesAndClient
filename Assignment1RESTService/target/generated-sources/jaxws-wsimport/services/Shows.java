
package services;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for shows complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="shows">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cast" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categoryid" type="{http://services/}category" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="director" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="thumbnail" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeid" type="{http://services/}type" minOccurs="0"/>
 *         &lt;element name="yearOfRelease" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shows", propOrder = {
    "cast",
    "categoryid",
    "description",
    "director",
    "id",
    "thumbnail",
    "title",
    "typeid",
    "yearOfRelease"
})
public class Shows {

    protected String cast;
    protected Category categoryid;
    protected String description;
    protected String director;
    protected BigDecimal id;
    protected byte[] thumbnail;
    protected String title;
    protected Type typeid;
    protected String yearOfRelease;

    /**
     * Gets the value of the cast property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCast() {
        return cast;
    }

    /**
     * Sets the value of the cast property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCast(String value) {
        this.cast = value;
    }

    /**
     * Gets the value of the categoryid property.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getCategoryid() {
        return categoryid;
    }

    /**
     * Sets the value of the categoryid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setCategoryid(Category value) {
        this.categoryid = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the director property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirector() {
        return director;
    }

    /**
     * Sets the value of the director property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirector(String value) {
        this.director = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setId(BigDecimal value) {
        this.id = value;
    }

    /**
     * Gets the value of the thumbnail property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getThumbnail() {
        return thumbnail;
    }

    /**
     * Sets the value of the thumbnail property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setThumbnail(byte[] value) {
        this.thumbnail = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the typeid property.
     * 
     * @return
     *     possible object is
     *     {@link Type }
     *     
     */
    public Type getTypeid() {
        return typeid;
    }

    /**
     * Sets the value of the typeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Type }
     *     
     */
    public void setTypeid(Type value) {
        this.typeid = value;
    }

    /**
     * Gets the value of the yearOfRelease property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearOfRelease() {
        return yearOfRelease;
    }

    /**
     * Sets the value of the yearOfRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearOfRelease(String value) {
        this.yearOfRelease = value;
    }

}
