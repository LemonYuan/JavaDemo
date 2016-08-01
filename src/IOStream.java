import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class IOStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
				try {
					FileInputStream fis=new FileInputStream("MyWriter.txt");
					InputStreamReader isr=new InputStreamReader(fis);
					FileReader fr=new FileReader("MyWriter.txt");
					BufferedReader br2=new BufferedReader(fr);
					BufferedReader br=new BufferedReader(isr);
					
					 String message;
					 while((message=br.readLine())!=null)
					 {
						 System.out.println(message);
					 }
					 
					 while ((message=br2.readLine())!=null)
					 {
						 System.out.println(message);
					 }
					 
					 
					 
					 
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}

		
	}

}
