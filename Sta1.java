
public class Sta1 
{
	public static int test()
	{
		return 20;
	}

	public static void main(String[] args) 
	{
		int i = test();
		int j = i + test();
		int k = i + j + test();
		
		System.out.println("from main");
		System.out.println("i =" +i);
		System.out.println("j =" +j);
		System.out.println("k = " +k);
		System.out.println("main end");
	}

}
