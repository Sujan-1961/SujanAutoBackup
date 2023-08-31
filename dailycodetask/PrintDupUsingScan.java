package dailycodetask;

import java.util.Scanner;

public class PrintDupUsingScan {
          @SuppressWarnings("resource")
		public static void main(String[] args) {
        	  int[] num = new int[7];
	       Scanner scan = new Scanner(System.in);
	       System.out.println("Enter input");
	       for (int i = 0; i < num.length; i++) {
	    	   num[i] = scan.nextInt();
		}
	       for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if (num[i]==num[j]) {
					System.out.println(num[i]);
				}
			}
		}
		}
}
