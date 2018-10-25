
 class A8
{
	 static int i;
	 static 
	 {
		 int i = 10;
		 System.out.println("A8 :" + i);
		 System.out.println("A8 :" + A8.i);
		 i = 20;
		 A8.i = 200;
	 }

	}
	
  class A9
	{
	static 
	{
		System.out.println("A9");
	}

		public static void main(String[] args) 
		{
			System.out.println("main");
			System.out.println(A8.i);
			A8.i = 300;
			System.out.println("--------");
			System.out.println(A8.i);
			A8.i += 300;
			System.out.println("--------");
			System.out.println(A8.i);
			System.out.println("main end");

		}

}
