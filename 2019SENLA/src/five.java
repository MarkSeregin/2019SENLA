import java.util.Scanner;

public class five
{
	public static void main(String[] args)
    {  
		Scanner in = new Scanner (System.in);
		int n;
		System.out.print("Enter an integer : ");
		n = in.nextInt();
		System.out.print("All numbers are palindromes : ");
		for (int i = 0; i <= n; i++)
		{
			if (i < 10 || i / 10 == i % 10) 
			{
				System.out.print(i + " ");
			}
		}
    }
}
