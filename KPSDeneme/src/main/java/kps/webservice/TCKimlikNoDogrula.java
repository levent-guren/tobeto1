
package kps.webservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TCKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="Ad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Soyad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DogumYili" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tcKimlikNo",
    "ad",
    "soyad",
    "dogumYili"
})
@XmlRootElement(name = "TCKimlikNoDogrula")
public class TCKimlikNoDogrula {

    @XmlElement(name = "TCKimlikNo")
    protected long tcKimlikNo;
    @XmlElement(name = "Ad")
    protected String ad;
    @XmlElement(name = "Soyad")
    protected String soyad;
    @XmlElement(name = "DogumYili")
    protected int dogumYili;

    /**
     * Gets the value of the tcKimlikNo property.
     * 
     */
    public long getTCKimlikNo() {
        return tcKimlikNo;
    }

    /**
     * Sets the value of the tcKimlikNo property.
     * 
     */
    public void setTCKimlikNo(long value) {
        this.tcKimlikNo = value;
    }

    /**
     * Gets the value of the ad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAd() {
        return ad;
    }

    /**
     * Sets the value of the ad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAd(String value) {
        this.ad = value;
    }

    /**
     * Gets the value of the soyad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoyad() {
        return soyad;
    }

    /**
     * Sets the value of the soyad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoyad(String value) {
        this.soyad = value;
    }

    /**
     * Gets the value of the dogumYili property.
     * 
     */
    public int getDogumYili() {
        return dogumYili;
    }

    /**
     * Sets the value of the dogumYili property.
     * 
     */
    public void setDogumYili(int value) {
        this.dogumYili = value;
    }

}
