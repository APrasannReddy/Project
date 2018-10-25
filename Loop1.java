
public class Loop1 
{
	public static int test()
	{
		System.out.println("test method");
		return 10;	// if we dont write return stast it will give complie time error
	}

	public static void main(String[] args) 
	{
		System.out.println("main method");
		int i = test();
		System.out.println("i = "+ i);
		test();

	}

}
