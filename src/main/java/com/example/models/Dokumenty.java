//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.06 at 11:26:52 PM CET 
//


package com.example.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.kedi}info"/>
 *         &lt;element ref="{http://www.kedi}kontrahenci"/>
 *         &lt;element ref="{http://www.kedi}towary"/>
 *         &lt;element ref="{http://www.kedi}faktury"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "info",
    "kontrahenci",
    "towary",
    "faktury"
})
@XmlRootElement(name = "dokumenty")
public class Dokumenty {

    @XmlElement(required = true)
    protected Info info;
    @XmlElement(required = true)
    protected Kontrahenci kontrahenci;
    @XmlElement(required = true)
    protected Towary towary;
    @XmlElement(required = true)
    protected Faktury faktury;

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link Info }
     *     
     */
    public Info getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link Info }
     *     
     */
    public void setInfo(Info value) {
        this.info = value;
    }

    /**
     * Gets the value of the kontrahenci property.
     * 
     * @return
     *     possible object is
     *     {@link Kontrahenci }
     *     
     */
    public Kontrahenci getKontrahenci() {
        return kontrahenci;
    }

    /**
     * Sets the value of the kontrahenci property.
     * 
     * @param value
     *     allowed object is
     *     {@link Kontrahenci }
     *     
     */
    public void setKontrahenci(Kontrahenci value) {
        this.kontrahenci = value;
    }

    /**
     * Gets the value of the towary property.
     * 
     * @return
     *     possible object is
     *     {@link Towary }
     *     
     */
    public Towary getTowary() {
        return towary;
    }

    /**
     * Sets the value of the towary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Towary }
     *     
     */
    public void setTowary(Towary value) {
        this.towary = value;
    }

    /**
     * Gets the value of the faktury property.
     * 
     * @return
     *     possible object is
     *     {@link Faktury }
     *     
     */
    public Faktury getFaktury() {
        return faktury;
    }

    /**
     * Sets the value of the faktury property.
     * 
     * @param value
     *     allowed object is
     *     {@link Faktury }
     *     
     */
    public void setFaktury(Faktury value) {
        this.faktury = value;
    }

}
