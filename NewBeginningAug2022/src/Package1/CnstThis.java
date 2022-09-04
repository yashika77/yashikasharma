package Package1;

public class CnstThis {
	public CnstThis()
	{
		this(1,2,3);
		
		System.out.println("Default Constructor");
	}
	public CnstThis(int a)
	{
		this();
		System.out.println("One Parameterized Constructor");
	}
	public CnstThis(int a, int b)
	{
		this(2);
		System.out.println("Two Parameterized Constructor");
	}
	public CnstThis(int a, int b,int c)
	{
		
		System.out.println("Three Parameterized Constructor");
	}
	public CnstThis(int a, int b,int c, int d)
	{
		this(2,3);
		System.out.println("Four Parameterized Constructor");
	}

	public static void main(String[] args) {
		CnstThis obj=new CnstThis(2,3,4,1);

	}

}
