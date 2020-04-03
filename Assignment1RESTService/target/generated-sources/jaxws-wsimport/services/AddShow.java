
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addShow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addShow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="showsAdd" type="{http://services/}shows" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addShow", propOrder = {
    "showsAdd"
})
public class AddShow {

    protected Shows showsAdd;

    /**
     * Gets the value of the showsAdd property.
     * 
     * @return
     *     possible object is
     *     {@link Shows }
     *     
     */
    public Shows getShowsAdd() {
        return showsAdd;
    }

    /**
     * Sets the value of the showsAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Shows }
     *     
     */
    public void setShowsAdd(Shows value) {
        this.showsAdd = value;
    }

}
