package gigskycodes;

import java.util.HashSet;

public class HappyNumbers {
        public static boolean isHappy(int n) {
        	HashSet<Integer> set=new HashSet<Integer>();
        	while(n!=1&&!set.contains(n)) {
        		set.add(n);
        		n=getNextNumber(n);
        	}
			return n==1;
        	
        }
        public static int getNextNumber(int n) {
        	int sum=0;
        	while (n>0) {
				int digit=n%10;
				sum+=digit*digit;
				n/=10;
			}
			return sum;
        }
		public static void main(String[] args) {
			int num=100;
			if (isHappy(num)) {
				System.out.println("happy! indru mudhal happy!");
			} else {
                System.out.println("Not a happy number");
			}
		}
}
