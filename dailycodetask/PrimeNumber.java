package dailycodetask;

public class PrimeNumber {
           public static void main(String[] args) {
			int count;
			
			for (int i = 1; i < 20; i++) {
				count=0;
				for (int j = 1; j <=i; j++) {
					if (i%j==0) {
					count++;	
					}
				}
				if (count==2) {
					System.out.println("Palindrome"+ " number is " +i);
				} else {
	                  System.out.println("Not a palindrome"+  " number is " +i);
				}	
			}
		}
}
