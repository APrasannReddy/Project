
public class A7 
{
	static int a = test1();
	static int b = test2();
	
	
	static 
	{
		System.out.println("Static block" );
		main(null);
		System.out.println("sib again");
		
	}
	
	
	public static int test1()
		{
			System.out.println("Static method:" );
			main(null);
			System.out.println("static method again: " );
			return a + b + 5;
		}
	
	public static int test2()
		{
			System.out.println("Static method:" + "a:" + a + "," +"b:" +b);
			main(null);
			System.out.println("static method again: " + "a:" + a + "," +"b:" +b);
			return a + b + 5;
		}
	

	public static void main(String[] args) 
	{
		System.out.println(" Hello java");
		a += 5;
		b += 8;
	}

}

