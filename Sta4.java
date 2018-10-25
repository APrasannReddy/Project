
public class Sta4 {
		public static void test(int i)
	{
		System.out.println("void test: " + i);
		return; // we can write wrriten statm without any arguments
	}

	public static void main(String[] args) 
	{
		System.out.println("main method");
		test(100);
		
		//System.out.println(test()); //if we create the method with void we can
				//not call that method inside the sop stamt it wiil show compile time erro

	}

}
