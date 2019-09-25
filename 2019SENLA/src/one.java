import java.util.Scanner;

public class one {
	public static void main(String[] args)
    {  
    	Scanner in = new Scanner (System.in);
    	float n;
    	System.out.println("Enter an integer : ");	
    	n = in.nextFloat();
		if (n != (int)n) 
		{
			System.out.println("You entered incorrect data");
		}
		else 
		{
	    	if (simple(n) == true)
	    	{
	    		System.out.println("Simple");
	    	} 
	    	else
	    		System.out.println("Ñomposite");
	    	if (chet(n) == true) 
	    	{
	    		System.out.println("Even");
	    	}
	    	else
	    		System.out.println("Odd");
		}
    }

	public static boolean simple(float n)  
	{ 
		Boolean f = true;
		for (int i = 2; Math.pow(i,2) <= n; i++)
		{
			for (int j = i; j <= n; j += i)
			{
					if (j == n) 
					{
						f = false;
						break;
					}
			}
		}
	 return f;
	}
	
	public static boolean chet(float n)  
	{ 
		Boolean f = true;
		if (n % 2 == 0) 
		{
			f = true;
		} 
		else 
			f = false;
	 return f;
	}
}
