
public class T 
{

	public static void main(String[] args) 
	{
		/*int a = 10; // static int a = 10 in static method we can not give 
		// static keyword for the variable
		System.out.println(a);*/
		
		
		
		
		int i; //if we not declare here we can not call the i out side of the loop
		for(i = 0;i<10;i++)
		{
			System.out.println("loop:" +i);
		}
		System.out.println("main:" +i); // we can not call the i variable out
		// side the loop
	}

}
