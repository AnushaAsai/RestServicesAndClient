
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateShow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateShow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="updateShow" type="{http://services/}shows" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateShow", propOrder = {
    "updateShow"
})
public class UpdateShow {

    protected Shows updateShow;

    /**
     * Gets the value of the updateShow property.
     * 
     * @return
     *     possible object is
     *     {@link Shows }
     *     
     */
    public Shows getUpdateShow() {
        return updateShow;
    }

    /**
     * Sets the value of the updateShow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Shows }
     *     
     */
    public void setUpdateShow(Shows value) {
        this.updateShow = value;
    }

}
