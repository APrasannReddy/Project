
public class Sta11 
{
	static void test()
	{
		System.out.println(i);
		i = 10;
		System.out.println(i);
	}
	static int i = 20;
	public static void main(String[] args) 
	{
		System.out.println("main :"+i);
		test();
		System.out.println("main end:" +i);
	
	}

}
