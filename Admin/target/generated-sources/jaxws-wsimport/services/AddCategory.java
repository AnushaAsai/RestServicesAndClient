
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addCategory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cat" type="{http://services/}category" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addCategory", propOrder = {
    "cat"
})
public class AddCategory {

    protected Category cat;

    /**
     * Gets the value of the cat property.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getCat() {
        return cat;
    }

    /**
     * Sets the value of the cat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setCat(Category value) {
        this.cat = value;
    }

}
