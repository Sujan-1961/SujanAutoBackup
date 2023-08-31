package dailycodetask;

import java.util.Scanner;

public class PalindromeNumbers {
         public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			
			 int int1 = scan.nextInt();
			
			//int parseInt = Integer.parseInt(next);
			
			int num = int1;
			int sum=0;			
			while (int1>0) {
				int rem = int1%10;
				sum = sum*10+rem;
				int1=int1/10;
			}
			if (sum==num) {
				System.out.println("Palindrome");
			} else {
                  System.out.println("not");
			}
		}
}
