
public class Sta9 {
	static int i = 10;
	static void test()
	{
		int i = 20;
		i = 60;
		System.out.println(i);
		Sta9.i = 40;
	}

	public static void main(String[] args) 
	{
		System.out.println("main:" + i); 
		test();
		System.out.println("main end:" +i);
		

	}

}
