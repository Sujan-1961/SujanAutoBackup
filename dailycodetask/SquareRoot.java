package dailycodetask;

import java.util.Scanner;

public class SquareRoot {
            public static void main(String[] args) {
            	Scanner scan = new Scanner(System.in);
            	System.out.println("Enter the value");
            	int nextInt = scan.nextInt();
				//int x=4;
				double sqrt = Math.sqrt(nextInt);
				System.out.println(sqrt);
			}
}
