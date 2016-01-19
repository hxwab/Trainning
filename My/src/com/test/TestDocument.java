package com.test;

import java.rmi.server.ObjID;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;









public class TestDocument {
	
	public static void main(String[] args) {
		
		Document doc =DocumentHelper.createDocument();
		Element root =doc.addElement("root");
		Element pepole = root.addElement("pepole");
		Element person = pepole.addElement("person");
		
		for(int i=0;i<5;i++){
			
			Element id = person.addElement("id");
			id.setText(Integer.toString(i));
			Element name = person.addElement("name");
			name.setText("test"+i);
		}
		
		Element  num = root.addElement("total");
		num.setText("5");
		
		String str = doc.asXML();
		System.out.println(str);
		
		Element e  = doc.getRootElement();
		Document  p = e.getDocument();
		Element po = p.getRootElement();
		Iterator it =e.elementIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		str = e.elementText("total");
		System.out.println(str);
	
	}

}
