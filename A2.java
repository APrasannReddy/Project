
public class A2 
{
	static int a;
	static int b  = test();
	static 
	{
		System.out.println("static block" + " " + b );
		b = 10;
	}

	public static void main(String args[])
	{
		System.out.println("main");
		test();
		System.out.println(a);
		System.out.println(b);
		System.out.println(test());
	}
	static int test()
	{
		System.out.println("static method" +a);
		return 80;
	}

}
