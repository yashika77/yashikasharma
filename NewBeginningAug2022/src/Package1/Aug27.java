package Package1;
public class Aug27 
{
	int age;
	int rollno;
	
	public void display1()
	{
		System.out.println("Welcome all of you!!!");
	}
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	public static void main(String[] args) 
	{
		Aug27 obj = new Aug27();
		obj.age=23;
		obj.rollno=12;
		System.out.println("The age is "+obj.age);
		System.out.println("The roll number is "+obj.rollno);
		obj.display1();
		obj.display2();
	}
}
