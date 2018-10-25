
class Sta15
{
	static int i = 10;
	static int j;
	static int k = j;
	static int m = i;
	static int n = i + j + k + m;
	
}
public class Sta13
{
	public static void main (String args[])
	{
		System.out.println(Sta15.i);
	}
}