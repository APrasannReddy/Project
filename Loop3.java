
public class Loop3 
{

	public static void main(String[] args) 
	{
		/*//int i;
		for(int i = 5; i > 0; i--);
			System.out.println("loop" + i );
			System.out.println("main" + i );
		
*/
		/*int i,j;
		for(i = 0, j = 10; i < 5; i++,j--);
		{
			System.out.println(i + ":" + j);
		}  */
		
		
		
		/*boolean [] x = {false, true,false};
		for(boolean i : x){
			System.out.println(i);  */
		
		
		/*int i = 0;
		while(i<5)
	//	while((i = 2) < 5)
			
		{
			System.out.println(i);
			i++;
		
		}*/
		
		
		
		/* int i = 0;
		while(i < 5);//here it will check the condition it will check infinate times
			
		{
			
			i++;
		}
		System.out.println(i);//it is not printing any value*/
		
		
		
		/*int i = 10;
		do
		{
			System.out.println("body :"+i);
			i++;
		 	
		}
		while ( i < 10 );  */
		
		
		/*int i = 0;
		do
		{
			System.out.println("begin");
			i++;
			if(i > 3)
			{
				break;
				//continue;
			}
			System.out.println("end");
		}
		while (i < 10 ); */
		
		
		int i = 3;
		switch(i)
		{
		case 2:
			System.out.println("from 2");
			
		case 4:
			
			System.out.println("from 5");
		
		case 5:
			
			System.out.println("from 3");
			//if no case matches it will not dispaly any output
			default :
				System.out.println("default");
		
		}
		
	}
}
