// main method inside static method
public class A4 
{
	//static int a;
	static int a = test();
	public static int test()
	{
		System.out.println("static test method:" + a);
		a = 90;
		main(null); //we can call the main method before executing the main method
		return 10; //it will call the main method and this return value is stored into the a
		
	}
	public static void main(String args[])
	{
		System.out.println("main begin:" + a);
		a = 30;
		System.out.println("main end:" + a);
	}

}
 