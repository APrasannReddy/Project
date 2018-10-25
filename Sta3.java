
public class Sta3 
{
	static double test(boolean b,int i, int k, char j)
	{
		System.out.println("from test");
		System.out.println(b);
		System.out.println(i);
		System.out.println(k);
		System.out.println(j);
		return 20;//post fix upcasting
		//we can't convert the higher to lower but we can convert the lower  to higher
		
	}
	

	public static void main(String[] args) 
	{
		System.out.println("from main");
		test(false,20,30,'p');
		System.out.println("main end");
		System.out.println(test(true,30,40,'s'));
		
	}

}
