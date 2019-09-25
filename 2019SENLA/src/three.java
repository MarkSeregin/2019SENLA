import java.util.Scanner;
import java.util.Arrays;

public class three
{
	public static void main(String[] args)
    {  
		Scanner in = new Scanner (System.in);
		String line;
		System.out.print("Input text : ");
		line = in.nextLine();
		System.out.println("Number of words in a sentence " + length(line));
		System.out.println(toUP(line));
		
    }
	
	 public static int length (String line) 
	 {
		 int count = 0;
		 if(line.length() != 0)
		 {
			 count++;
             for (int i = 0; i < line.length(); i++) 
             {
            	 if(line.charAt(i) == ' ')
            	 {
            		 count++;
                 }
             }
         }
	 return count;
	 }
	
	 public static String toUP(String line)
	 { 
		 	String[] word = line.split("\\s+");
		 	Arrays.sort(word);
		 	System.out.println("The sorted text : " + Arrays.toString(word));
	        char[] result = line.toCharArray();
	        if(Character.isAlphabetic(result[0]))result[0]=Character.toUpperCase(result[0]);
	        String res=""+result[0];
	        System.out.print("The first letter of the title : ");
	        for(int i=1;i<result.length;i++)
	        {
		        if(Character.isAlphabetic(result[i]) && !Character.isAlphabetic(result[i-1]))result[i]=Character.toUpperCase(result[i]);
		        res+=result[i];
	        }
	        return res;
	 }
}
