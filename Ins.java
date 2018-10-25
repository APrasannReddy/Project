
public class Ins 
{
	
	int i;
	String s = "prasu";
	void ins()
	{
		System.out.println("ins method");
	}
	{
		System.out.println("Ins block");
	}
	static void test()
	{
		Ins obj = new Ins();
		obj.ins(); // we can not call non static method in static method
		obj.i = 10; // we can not initilize non static variables in static method or block
		
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Ins obj = new Ins();
		obj.ins();
		System.out.println("main end");
		/*System.out.println(obj.i);
		Ins obj1 = new Ins();
		System.out.println(obj1.i);
		System.out.println(obj.s); */
		
	
	}

}
