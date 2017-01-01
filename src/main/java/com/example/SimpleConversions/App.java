package com.example.SimpleConversions;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import com.example.controllers.STaxJAXBController;
import com.example.models.Dokumenty;

import javax.xml.bind.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        String pathClass = "C:/Users/EC/workspace/SimpleConversions/resources/class.xml";
        String pathFv = "C:/Users/EC/workspace/SimpleConversions/resources/fv.xml";
        String pathTowar = "C:/Users/EC/workspace/SimpleConversions/resources/towar.xml";
        String pathFV199030 = "C:/Users/EC/workspace/SimpleConversions/resources/FV199030.xml";
        String pathFV161237 = "C:/Users/EC/workspace/SimpleConversions/resources/FV161237.xml";
        String pathFV728963 = "C:/Users/EC/workspace/SimpleConversions/resources/FV728963.xml";
        String pathFV382546 = "C:/Users/EC/workspace/SimpleConversions/resources/FV382546.xml";
       
        
        
        
        STaxJAXBController ctr = new STaxJAXBController();
       
        try {
			ctr.readFV(pathFV161237);
			//ctr.readFV(pathFV199030);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }
}
