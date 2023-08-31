package codepractice;

public class Superdigit {
         public static int num(int n) {
        	 int sum=0;
     		while (n>0) {
     			int rem=n%10;
     			sum=sum+rem;
     			n=n/10;
     		}
     		return sum;
		}
         public static void main(String[] args) {
			int n=560;
			//int value=n;
			while (n>9) {
				n=num(n);
			}
			
			if (n<9) {
				System.out.println(n);
		}
		}
}
