package com.example.controllers;

import java.io.FileReader;
import java.rmi.UnmarshalException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.*;
import javax.xml.stream.*;
import javax.xml.stream.events.*;

import com.example.models.Customer;
import com.example.models.Pozycja;
import com.example.models.Pozycje;
import com.example.models.Towar;


public class STaxJAXBController {
	
	
	//!!!!!!working!
	public void readFV(String filename) throws Exception {
		  XMLInputFactory factory = XMLInputFactory.newInstance();	
	        XMLStreamReader sr = factory.createXMLStreamReader(new FileReader(filename));
	        JAXBContext jaxbt = JAXBContext.newInstance(Towar.class);
	        JAXBContext jaxbp = JAXBContext.newInstance(Pozycja.class);
	        JAXBContext jaxbpp = JAXBContext.newInstance(Pozycje.class);
	        Unmarshaller umt = jaxbt.createUnmarshaller();
	        Unmarshaller ump = jaxbp.createUnmarshaller();
	        Unmarshaller umpp = jaxbpp.createUnmarshaller();
	        while (sr.hasNext()) {
	            int eventType = sr.next();
	            if (eventType == XMLStreamReader.START_ELEMENT && sr.getLocalName().equalsIgnoreCase("towar")) {
	                System.out.println("Start Element:  " + sr.getLocalName());
	                JAXBElement<Towar> jtowar = umt.unmarshal(sr, Towar.class);
	                Towar towar = jtowar.getValue();
	                System.out.println(towar.getNazwa());	
	                System.out.println(towar.getDawka());
	                System.out.println(towar.getIdTowaru());
	                System.out.println(towar.getIdTowaruKs());
	            }
	            else if (eventType == XMLStreamReader.START_ELEMENT && sr.getLocalName().equalsIgnoreCase("pozycje")) {
	            	System.out.println("Start Element:  " + sr.getLocalName());
	            	JAXBElement<Pozycje> jpozycje = umpp.unmarshal(sr,Pozycje.class);
	            	Pozycje pozycje = jpozycje.getValue();
	            	System.out.println("Ilosc pozycji: " + 		pozycje.getPozycja().size());
	            	for (Pozycja p : pozycje.getPozycja()) {
						System.out.println(p.getIdTowaru() + " Ilosc: " + p.getIlosc() + " Cena netto: " + p.getCenaNetto());
					}
				}
	        }
		}
	}

