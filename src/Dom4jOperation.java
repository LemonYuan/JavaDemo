import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;



public class Dom4jOperation {

	public static void main(String[] args) {
		String xml="<root><car><name>Lafarary</name></root>";
                try {
                	SAXReader reader=new SAXReader();
					Document d=reader.read(new File("newxml.xml"));
                    System.out.println(d.asXML());
					
					
					
				} catch (DocumentException e) {
					e.printStackTrace();
				}
                
	} 

}
