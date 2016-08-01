import java.io.File;


public class TraverseDirectory {
     public static void main(String args[])
     {
    	 File file=new File("C:/Users/lemon/Desktop/Œƒ È");
    	 printFiles(file,1);
     }
     public static void printFiles(File in,int tab)
     {
    	 File file[]=in.listFiles();
    	 for(int i=0;i<file.length;i++)
    	 {
    		 for (int j=0;j<tab;j++)
    			 System.out.print("|-");
    		 System.out.println(file[i].getName());
    		 if(file[i].isDirectory())
    		 {
    			 printFiles(file[i],tab+1);
    		 }
    	 }
     }
}
