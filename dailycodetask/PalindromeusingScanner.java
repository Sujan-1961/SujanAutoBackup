package dailycodetask;

import java.util.Scanner;

public class PalindromeusingScanner {
           public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter input");
			String nextLine = scan.nextLine();
			
			String reverse="";
			
			char[] charArray = nextLine.toCharArray();
			
			for (int i = charArray.length-1; i >=0 ; i--) {
				reverse=reverse+charArray[i];
				System.out.println(reverse);
			}
			if (reverse.equals(charArray)) {
				System.out.println("Palindrome");
			} else {
                       System.out.println("Not Palindrome");
			}
			
		}
}
