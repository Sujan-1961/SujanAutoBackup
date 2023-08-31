package dailycodetask;

import java.util.Scanner;

public class Factorial {
       public static void main(String[] args) {
    	 //declare a variable with int input as 1
       	Scanner scan=new Scanner(System.in);
       	System.out.println("Enter fact Number");
			int fact = scan.nextInt();
			
			//iterate the values with range as 5
			for (int i = 5; i > 0; i--) {
				//multiply fact variable with range value
				fact = fact*i;
			}
			//print the value
			System.out.println(fact);
	}
       
}
