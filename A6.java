
public class A6 
{
	static int a = test1();
	static int b = test2();
	
	
	static 
	{
		System.out.println("Static block:" + "a:" + a + "," +"b:" +b);
		a += 10;
		b += a;
		main(null);
		System.out.println("sib again: " + "a:" + a + "," +"b:" +b);
		a += 10;
		b += a;
	}
	
	
	public static int test1()
		{
			System.out.println("Static method:" + "a:" + a + "," +"b:" +b);
			a += 10;
			b += a;
			main(null);
			System.out.println("static method again: " + "a:" + a + "," +"b:" +b);
			a += 10;
			b += a;
			return a + b + 5;
		}
	
	public static int test2()
		{
			System.out.println("Static method:" + "a:" + a + "," +"b:" +b);
			a += 10;
			b += a;
			main(null);
			System.out.println("static method again: " + "a:" + a + "," +"b:" +b);
			a += 10;
			b += a;
			return a + b + 8;
		}
	

	public static void main(String[] args) 
	{
		System.out.println(" Hello java");
		a += 5;
		b += 8;
	}

}
/*output:
 * Static method:a:0,b:0
 Hello java
static method again: a:15,b:18
Static method:a:73,b:43
 Hello java
static method again: a:88,b:134
Static block:a:98,b:338
 Hello java
sib again: a:113,b:454
 Hello java
*/
