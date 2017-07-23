package com.example.controllers;

import java.io.FileReader;
import javax.xml.bind.*;
import javax.xml.stream.*;
import com.example.models.Pozycja;
import com.example.models.Pozycje;
import com.example.models.Towar;
import com.example.models.Towary;


public class STaxJAXBController {
	
	
	//!!!!!!working!
	public void readFV(String filename) throws Exception {
		  XMLInputFactory factory = XMLInputFactory.newInstance();	
	        XMLStreamReader sr = factory.createXMLStreamReader(new FileReader(filename));
	        JAXBContext jaxbt = JAXBContext.newInstance(Towary.class);
	        JAXBContext jaxbpp = JAXBContext.newInstance(Pozycje.class);
	        Unmarshaller umt = jaxbt.createUnmarshaller();
	        Unmarshaller umpp = jaxbpp.createUnmarshaller();
	        Towary towary = new Towary();
	        Pozycje pozycje = new Pozycje();
	        
	        while (sr.hasNext()) {
	            int eventType = sr.next();
	            if (eventType == XMLStreamReader.START_ELEMENT && sr.getLocalName().equalsIgnoreCase("towary")) {
	                JAXBElement<Towary> jtowary = umt.unmarshal(sr, Towary.class);
	                towary = jtowary.getValue();
	            }
	            else if (eventType == XMLStreamReader.START_ELEMENT && sr.getLocalName().equalsIgnoreCase("pozycje")) {
	            	JAXBElement<Pozycje> jpozycje = umpp.unmarshal(sr,Pozycje.class);
	            	pozycje = jpozycje.getValue();
				}	            
	        }
	        
	        System.out.println("Ilosc towarow: " + towary.getTowar().size());
            for (Towar t : towary.getTowar()) {
                System.out.println("Nazwa: " + t.getNazwa() +	
                " Dawka: " + t.getDawka() +
                " Bloz: " + t.getIdTowaruKs() +
                " Id towaru: " + t.getIdTowaru());
                for (Pozycja p : pozycje.getPozycja()) {
                	if (p.getIdTowaru() == t.getIdTowaru()) {
                		System.out.println(" Ilosc: " + p.getIlosc() + " Cena netto: " + p.getCenaNetto() + 
        						" Seria: " + p.getSeria() +
        						" Data wazności: " + p.getDataWaznosci().toString());
					}
    				
    			}
                
			}
		}
	}

