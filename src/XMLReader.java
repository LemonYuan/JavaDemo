import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;



public class XMLReader {
public static void main(String args[])
{
	try {
		
		
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=factory.newDocumentBuilder();
		Document document= builder.parse(new File("Curiculums.xml"));
		Element root=document.getDocumentElement();
		NodeList list=root.getElementsByTagName("cur");
		for (int i = 0; i <list.getLength(); i++) {
			Element e=(Element) list.item(i);
			NodeList childlist=e.getChildNodes();
            for (int j = 0; j < childlist.getLength(); j++) {
				 Node c= childlist.item(j);
				 if (c instanceof Element)
				 {
					 System.out.println(c.getNodeName()+" "+c.getTextContent());
					 
				 }
			}
		}
		
		TransformerFactory tf=TransformerFactory.newInstance();
		Transformer ts=tf.newTransformer();
		StringWriter writer=new StringWriter();
		ts.transform(new DOMSource(document), new StreamResult(writer));
		
		org.dom4j.Document d=DocumentHelper.parseText(writer.toString());
		
		System.out.println(d.asXML());
		
		
	} catch (ParserConfigurationException e) {
		e.printStackTrace();
	} catch (SAXException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} catch (TransformerConfigurationException e) {
		e.printStackTrace();
	} catch (TransformerException e) {
		e.printStackTrace();
	} catch (DocumentException e) {
		e.printStackTrace();
	}
}
}
