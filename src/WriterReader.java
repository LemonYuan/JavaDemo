import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;


public class WriterReader {
        public static void main(String args[] )
        {
        	File file=new File("MyWriter.txt");
        	try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
        	writer(file);
        	reader(file);
        }
        public static void writer(File out){
        	try{
        	FileOutputStream fis=new FileOutputStream(out);
        	OutputStreamWriter osr=new OutputStreamWriter(fis);
        	BufferedWriter bw=new BufferedWriter(osr);
        	Scanner input=new Scanner(System.in);
        	String message=input.next();
        	while(!message.equals("\\end"))
        	{
        		
        		bw.write(message+'\n');
        		message=input.next();  		
        	}
        	bw.close();
        	osr.close();
        	fis.close();
        	
        }
        	catch(IOException e)
        	{
        		System.out.println(e);
        	}
        }
        
        public static void reader(File in){
        	try{
        	FileInputStream fis=new FileInputStream(in);
        	InputStreamReader isr=new InputStreamReader(fis);
        	BufferedReader br=new BufferedReader(isr);
        	String message=br.readLine();
        	while(message!=null)
        	{ 		
        		System.out.println(message); 	
        		message=br.readLine();
        	}
        	br.close();
        	isr.close();
        	fis.close();
        	
        }
         catch(IOException e)
          	{
        		System.out.println(e);
        	}
        }
}
