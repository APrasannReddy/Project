
public class Loop 
{

	public static void main(String[] args) 
	{
		for(int i = 0; i <= 10; i++)
		{
			System.out.println("loop:" + i);
		} 
		System.out.println("main:"); 
		// we can not call the for loop 'i' after that statement terminates.
	}

}
