
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
 *         <element name="TCKimlikNoDogrulaResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "tcKimlikNoDogrulaResult"
})
@XmlRootElement(name = "TCKimlikNoDogrulaResponse")
public class TCKimlikNoDogrulaResponse {

    @XmlElement(name = "TCKimlikNoDogrulaResult")
    protected boolean tcKimlikNoDogrulaResult;

    /**
     * Gets the value of the tcKimlikNoDogrulaResult property.
     * 
     */
    public boolean isTCKimlikNoDogrulaResult() {
        return tcKimlikNoDogrulaResult;
    }

    /**
     * Sets the value of the tcKimlikNoDogrulaResult property.
     * 
     */
    public void setTCKimlikNoDogrulaResult(boolean value) {
        this.tcKimlikNoDogrulaResult = value;
    }

}
