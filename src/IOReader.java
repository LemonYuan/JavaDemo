import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;


public class IOReader {

	public static void main(String[] args) {
             try {
				File file =new File("MyWriter.txt");
				 FileInputStream fis=new FileInputStream(file);
				 InputStreamReader isr=new InputStreamReader(fis);
				 char chars[]=new char[100];
				 while(isr.read(chars)!=-1)
				 {
					 System.out.println(chars);
				 }
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

}
