import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;


public class GsonPrac {
  public static void main (String args[])
  {
	  JsonObject js=new JsonObject();
	  js.addProperty("car", "LaFarary");
	  js.addProperty("price", 35888);
	  
	  
	 JsonArray ja=new JsonArray();

		JsonObject ij= new JsonObject();
		ij.addProperty("wheel", 4);
		
		JsonObject ij2= new JsonObject();
		ij2.addProperty("seat", 2);
		
		ja.add(ij);
		ja.add(ij2);
		
		js.add("furcilities", ja);
		
        System.out.println(js.toString());
        
        try {
			FileWriter fw=new FileWriter("jsontest.json");
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write(js.toString());
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        
  }
}
