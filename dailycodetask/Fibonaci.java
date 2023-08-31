package dailycodetask;

import java.util.Scanner;

public class Fibonaci {
       @SuppressWarnings("resource")
	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		Scanner scan = new Scanner(System.in);
		int nextInt = scan.nextInt();
		System.out.println(n1);
		System.out.println(n2);
		//if we enter the count as 100 in fibonacci,
	    //it returns output in negative integers coz the 
		//generated output exceeded its limit
		int count =10;
		for (int i = 0; i < count; i++) {
			nextInt=n1+n2;
			System.out.println(nextInt);
			n1=n2;
			n2=nextInt;
		}
	}
}
