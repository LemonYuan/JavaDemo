import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main( String args [])
     {
    	 File file=new File("bin/curiculums.txt");
    	 if (file.exists())
    	 {
    		 System.out.println("�ļ��Ѿ�����");
    		 System.out.println("·��Ϊ��"+file.getAbsolutePath());
    	 }
    	 else
    	 {
    		 try{
    			 file.createNewFile();
    			 System.out.println("�����ɹ���·��Ϊ��"+file.getAbsolutePath());
    		 }
    		 catch(IOException e)
    		 {
    			 System.out.println("�����ļ�ʧ��");
    		 }
    	 }
     }
}
		