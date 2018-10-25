// main method inside static block
public class A5 
{
	static int a = test();
	static 
	{
		System.out.println("Static block:" + a);
		a = 40;
		main(null); // inside the static block we can call the main method
		System.out.println("sib again: " + a);
		a = 20;
	}
	public static int test()
	{
		System.out.println("static test method:" + a);
		a = 90;
		main(null); 
		System.out.println(" test again:" + a);
		return 10; 
		
	}
	public static void main(String args[])
	{
		System.out.println("main begin:" + a);
		a = 30;
		System.out.println("main end:" + a);
	}
}
