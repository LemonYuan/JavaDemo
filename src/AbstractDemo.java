interface People<T>
{
	 public void speak(T t);
}
abstract class Worker
{
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public abstract void howToWork();
}

 class Physician extends Worker implements People<String>{

	@Override
	public void howToWork() {
		
		System.out.println("���ǃȿ��t�������T����");
	}


	public void doSurgery(){
		System.out.println("����������");
	}


	@Override
	public void speak(String t) {
		
		System.out.println(t);
	}
 }

 
 class surgeon extends Worker{

	@Override
	public void howToWork() {
		System.out.println("��������t�������T�����g");
	}
	 
 }
 
public class AbstractDemo {
  public static void main(String args[])
  {
	  Physician p=new Physician();
	  p.doSurgery();
	p.speak("�˽�");
  }
}
