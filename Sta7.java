
public class Sta7 
{
	static int i;
	int j;
	//j = 10;
	// we can not reinitlize the non static members
	//i = 20;

	public static void main(String[] args) 
	{
		int i = 40;
		System.out.println(Sta7.i);
		System.out.println(i);
		Sta7.i = 60;
		i = 80;
		System.out.println(Sta7.i);
		System.out.println(i);
	

	}

}
