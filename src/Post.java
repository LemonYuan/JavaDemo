import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;



public class Post {
          public static void main(String args[])
          {
        	    PostTest p=new PostTest();
        	    p.start();
          }
}
class PostTest extends Thread{
	@Override
	public void run() {
		try {
  		  
			  URL url=new URL("http://fanyi.youdao.com/openapi.do");
			  HttpURLConnection connection=(HttpURLConnection)url.openConnection();
			  connection.setRequestMethod("POST");
			  connection.addRequestProperty("encoding", "UTF-8");
             connection.setDoInput(true);
             connection.setDoOutput(true);
            
            InputStream is=connection.getInputStream();
            InputStreamReader isr=new InputStreamReader(is);
            BufferedReader br=new BufferedReader(isr);
            
            OutputStream os=connection.getOutputStream();
            OutputStreamWriter osw=new OutputStreamWriter(os);
            BufferedWriter bw=new BufferedWriter(osw);
            
            bw.write("?keyfrom=postmethodtest&key=46330477&type=data&doctype=xml&version=1.1&q=fuck");
            bw.flush();
			  
	          String line;
	          StringBuilder builder=new StringBuilder();
	          while((line=br.readLine())!=null)
	          {
	        	  builder.append(line);
	          }
			  
	          System.out.println(builder.toString());
	          
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}