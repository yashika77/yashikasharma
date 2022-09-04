package Package1;
public class Aug28 
{
	public int sum(int a, int b){
		int c;
		c = a+b;
		return c;	}
	public int sub(int x, int y)	{
		int z;
		z= x-y;
		return z;	}
	public int mul(int e, int f)	{
		int g;
		g= e*f;
		return g;	}
	public void div(int h, int i)	{
		int j;
		j=h/i;
		System.out.println("The result is "+j);	}
	public static void main(String[] args) 
	{
		Aug28 obj = new Aug28();
		int sumResult= obj.sum(10,2);
		int sumResult2= obj.sum(sumResult,2);
		int mulResult= obj.mul(sumResult2,2);
		int subResult= obj.sub(mulResult,2);
		obj.div(subResult, 2);
		int mulResult1=obj.mul(10, 2);
		int subResult1=obj.sub(mulResult1,2);
		int sumResult1=obj.sum(subResult1, 2);
		int subResult2=obj.sub(sumResult1, 2);
		obj.div(subResult2, 2);	
	}
}
