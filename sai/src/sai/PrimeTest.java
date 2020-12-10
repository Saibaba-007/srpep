public class PrimeTest 
{
	
	 public static int test(int n)
	{
			int i=1;
			int c=0;
			while(i<=n)
			{
				if(n%i==0)
					c++;
					
			}
			if(c==2)
				return 1;
			else
				return 0;
			
		
	}
}