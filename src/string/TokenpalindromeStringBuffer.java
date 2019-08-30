package string;
 import java.util.*;

public class TokenpalindromeStringBuffer {
	

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter input");
			
			String input=sc.next();
			
			StringBuffer bf=new StringBuffer(input);
			bf.reverse();
			
			if(input.equals(bf.toString()))
				System.out.println("Palindrome");
			else
				System.out.println("Not Palindrome");

}

	
}
