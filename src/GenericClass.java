import java.util.ArrayList;
import java.util.List;

class MyList<T>{
	List<T> list=new ArrayList<T>();
	public void add(T t){
		list.add(t);
	}
	public T get(int i)
	{
		return list.get(i);
	}
}

 class GenericClass {
	
    public static void main(String args[])
    {
    	MyList<Person> p=new MyList<Person>();
    	p.add(new Person("¶þ»¢",34));
    	p.add(new Person("´ó¹·",34));
        System.out.println(p.get(0).getName());
    }
 
}
