import java.util.Scanner;

public class four
{
	 public static void main(String [] args) 
	 {
	        String s;
	        Scanner in = new Scanner (System.in);
	        s = in.nextLine();
	        String pattern;
	        pattern = in.nextLine();
	        System.out.println(searchWord(s, pattern));
	 }
	 
	 public static int searchWord(String message, String word) 
	 {
		 message = message.toLowerCase();
         word = word.toLowerCase();
         int i = message.indexOf(word);
         int count = 0;
         while (i >= 0)
         {
             count++;
             i = message.indexOf(word, i + 1);
         }
         return count;
    }
}
