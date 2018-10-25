class A11
{
	static int i;
	static 
	{
		System.out.println("A11.sb:");
		System.out.println("i:" + i);
	}
	static void test()
	{
		System.out.println("A11.test()");
		i = 20;
	}
	
}
public class A10 
{
	static 
	{
		System.out.println("A10.sb");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("A10.main begain");
		A11.test();
		System.out.println("--------");
		System.out.println(A11.i);
		System.out.println("-------");
		A11.test();
		System.out.println(A11.i);
		System.out.println("-------");
		A11.test();
		System.out.println("main begain");
		
	}

}
