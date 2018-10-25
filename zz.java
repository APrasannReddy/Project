
public class zz {
	static int i;
	static float j;
	static char ch,c,c1;
	static String s;
	static double d;
	static boolean b;
	static byte k;
	static short sh;
	static long l;
	public void test()
	{
		int i = 10;
		System.out.println(i); //local veriable
		
	}

	public static void main(String[] args) {
		//System.out.println("main");
		//zz obj = new zz();
		//obj.test();
		System.out.println(i);
		System.out.println(j);
		System.out.println(ch +"," + c + "," + c1);
		System.out.println(s);
		System.out.println(d);
		System.out.println(b);
		System.out.println(k);
		System.out.println(sh);
		System.out.println(l);
		System.out.println("a\u0009b");
		

	}

}
