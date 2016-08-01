import java.io.File;

public class DeleteMove {
           public static void main(String args[])
           {
        	  File textfile =new File("moved.txt");
        	  System.out.println(textfile.getAbsolutePath());	  
        	  File file2=new File("../moved.txt");
        	  textfile.renameTo(file2);
        	  System.out.println(textfile.getAbsolutePath());
           }
}
