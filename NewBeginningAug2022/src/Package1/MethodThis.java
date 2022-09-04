package Package1;

public class MethodThis {
	
	public void method()
	{
		System.out.println("Default method");
		this.method2(2, 4);
	}
	public void method1(int a)
	{
		System.out.println("One parameterized method");
	}
	public void method2(int a, int b)
	{
		System.out.println("Two parameterized method");
		this.method4(1, 2, 3, 4);
	}
	public void method3(int a, int b, int c)
	{
		System.out.println("Three parameterized method");
		this.method();
	}
	public void method4(int a, int b,int c, int d)
	{
		System.out.println("Four parameterized method");
		this.method1(5);
	}

	public static void main(String[] args) {
		MethodThis obj= new MethodThis();
		obj.method3(1,2,3);

	}

}
