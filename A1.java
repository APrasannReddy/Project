
public class A1 
{
	static //jvm 1st give preferance to the static variables or methods 
	//or blocks so here it will display 1st static block values then it will 
	// display main method.
	{
		System.out.println("sib");
	}

	public static void main(String[] args) 
	{
		System.out.println("main");

	}
	static 
	{
		System.out.println("static after main ");
	}

}
