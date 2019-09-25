import java.util.Scanner;
 
public class six
{
	public static void main (String[] args) 
    {
        Scanner in = new Scanner(System.in);
        six backp = new six();
        System.out.println("Enter the number of things : ");
        int n = in.nextInt();
        int[] we = new int[n + 1];
        int[] value = new int[n + 1];
        System.out.println("Enter weight for "+ n +" things");
        for (int i = 1; i <= n; i++)
        {
            we[i] = in.nextInt();
        }
        System.out.println("Enter a price for "+ n +" things");
        for (int i = 1; i <= n; i++)
        {
            value[i] = in.nextInt();
        }
        System.out.println("Enter the weight that the backpack can withstand : ");
        int W = in.nextInt();
        backp.solv(we, value, W, n);
    }
	
    public void solv(int[] we, int[] value, int W, int N)
    {
        int NEGATIVE_INFINITY = Integer.MIN_VALUE;
        int[][] s = new int[N + 1][W + 1];
        int[][] m = new int[N + 1][W + 1];
        for (int i = 1; i <= N; i++)
        {
            for (int j = 0; j <= W; j++)
            {
                int m1 = m[i - 1][j];
                int m2 = NEGATIVE_INFINITY; 
                if (j >= we[i])
                {
                    m2 = m[i - 1][j - we[i]] + value[i];
                }
                m[i][j] = Math.max(m1, m2);
                s[i][j] = m2 > m1 ? 1 : 0;
            }
        }        
        
        int[] selected = new int[N + 1];
        for (int n = N, w = W; n > 0; n--)
        {
            if (s[n][w] != 0)
            {
                selected[n] = 1;
                w = w - we[n];
            }
            else
                selected[n] = 0;
        }
        System.out.println("Selected things under the numbers : ");
        for (int i = 1; i < N + 1; i++) 
        {
            if (selected[i] == 1)
            {
                System.out.print(i +" ");
            }
        }
        System.out.println();
    }
}

