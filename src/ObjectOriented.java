class Person {
	private String name;
	private int age;
	static String race="chiness";
	
	public Person()
	{
		System.out.println("这里是无参的构造方法");
	}
	
	public Person(String name,int age)
	{
		this.age=age;
		this.name=name;
		System.out.println("这里是you参的构造方法");
	}
	
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
	public static String getRace() {
		return race;
	}
	public static void setRace(String race) {
		Person.race = race;
	}
	
}
class Student extends Person{
	private int score;
	private int classid;
	
	public Student()
	{
		super("borne",23);
	}
	public void setName(int name){
		this.score=name;
	}
	
	public Student(int score,int classid)
	{
		this.score=score;
		this.classid=classid;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getClassid() {
		return classid;
	}
	public void setClassid(int classid) {
		this.classid = classid;
	}
}
public class ObjectOriented {
	
   public static void main(String args[])
   {
         Student s=new Student();
         Student s1[]=new Student[10];
   }
}
