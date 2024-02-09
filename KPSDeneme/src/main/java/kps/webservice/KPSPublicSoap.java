
package kps.webservice;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 * 
 */
@WebService(name = "KPSPublicSoap", targetNamespace = "http://tckimlik.nvi.gov.tr/WS")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface KPSPublicSoap {


    /**
     * 
     * @param ad
     * @param dogumYili
     * @param soyad
     * @param tcKimlikNo
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "TCKimlikNoDogrula", action = "http://tckimlik.nvi.gov.tr/WS/TCKimlikNoDogrula")
    @WebResult(name = "TCKimlikNoDogrulaResult", targetNamespace = "http://tckimlik.nvi.gov.tr/WS")
    @RequestWrapper(localName = "TCKimlikNoDogrula", targetNamespace = "http://tckimlik.nvi.gov.tr/WS", className = "kps.webservice.TCKimlikNoDogrula")
    @ResponseWrapper(localName = "TCKimlikNoDogrulaResponse", targetNamespace = "http://tckimlik.nvi.gov.tr/WS", className = "kps.webservice.TCKimlikNoDogrulaResponse")
    public boolean tcKimlikNoDogrula(
        @WebParam(name = "TCKimlikNo", targetNamespace = "http://tckimlik.nvi.gov.tr/WS")
        long tcKimlikNo,
        @WebParam(name = "Ad", targetNamespace = "http://tckimlik.nvi.gov.tr/WS")
        String ad,
        @WebParam(name = "Soyad", targetNamespace = "http://tckimlik.nvi.gov.tr/WS")
        String soyad,
        @WebParam(name = "DogumYili", targetNamespace = "http://tckimlik.nvi.gov.tr/WS")
        int dogumYili);

}