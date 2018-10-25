
public class A3 
{
	static int a = test();  
	static 
	{
		System.out.println("static block" + " " + a );
		a = 10;
	}
	static int test()
	{
		System.out.println("static method" +a);
		return 80;
	}
	public static void main(String args[])
	{
		System.out.println("main:" + a );
		a = 30;
		System.out.println(test());
		System.out.println("main1: " + a);
	}
	

}
