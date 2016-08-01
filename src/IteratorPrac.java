import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;



public class IteratorPrac {
	
	public static void main(String args[])
	{
	       Set<Integer> set=new TreeSet<Integer>();
	       set.add(7);
	       set.add(1);
	       set.add(3);
	       set.add(4);
	       set.add(6);
	       set.add(9);
	       set.add(10);
	       Iterator<Integer> it=set.iterator();
	       while(it.hasNext())
	       {
	    	   System.out.println(it.next());
	       }
	}

       
       
}
