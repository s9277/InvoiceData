package com.example.SimpleConversions;

import com.example.controllers.STaxJAXBController;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	
	public void testApp() {
		String pathClass = "C:/Users/EC/workspace/SimpleConversions/resources/class.xml";
        String pathFv = "C:/Users/EC/workspace/SimpleConversions/resources/fv.xml";
        String pathTowar = "C:/Users/EC/workspace/SimpleConversions/resources/towar.xml";
        String pathFV199030 = "C:/Users/EC/workspace/SimpleConversions/resources/FV199030.xml";
        String pathFV161237 = "C:/Users/EC/workspace/SimpleConversions/resources/FV161237.xml";
        String pathFV728963 = "C:/Users/EC/workspace/SimpleConversions/resources/FV728963.xml";
        String pathFV382546 = "C:/Users/EC/workspace/SimpleConversions/resources/FV382546.xml";
       
        STaxJAXBController ctr = new STaxJAXBController();
       
        try {
			//ctr.readFV(pathFV161237);
			ctr.readFV(pathFV199030);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
