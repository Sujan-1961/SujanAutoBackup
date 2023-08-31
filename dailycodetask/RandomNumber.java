package dailycodetask;

import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		Random ran=new Random();
		int num=ran.nextInt(20);
		System.out.println("Print Random Number 1-20 =" +num);
		
		
		int[] num1= {1,2,3,4,5,6};
		for (int i = 0; i < num1.length; i++) {
			if (i==3) {
				System.out.println(i);	
			}	
		}	
	}
}
