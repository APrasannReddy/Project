
public class Sta14 
{
	static int i = 10;
	static int j;
	static int k = j;
	//static int k = j + m;
	static int m = i;
	static int n = i + j + k + m;
	

	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(m);
		System.out.println(n);

	}

}
