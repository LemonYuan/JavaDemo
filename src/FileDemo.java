import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main( String args [])
     {
    	 File file=new File("bin/curiculums.txt");
    	 if (file.exists())
    	 {
    		 System.out.println("文件已经存在");
    		 System.out.println("路径为："+file.getAbsolutePath());
    	 }
    	 else
    	 {
    		 try{
    			 file.createNewFile();
    			 System.out.println("创建成功，路径为："+file.getAbsolutePath());
    		 }
    		 catch(IOException e)
    		 {
    			 System.out.println("创建文件失败");
    		 }
    	 }
     }
}
		