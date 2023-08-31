package codepractice;

public class HappyNoAnotherMethod {
	public static int numbers(int num) {
		int sum=0;
		while (num>0) {
			int rem=num%10;
			sum=sum+(rem*rem);
			num=num/10;
		}
	return sum;
	
	}
	
	public static void main(String[] args) {
		int num=49;
		int value=num;
		while (value!=1 && value!=4) {
			value=numbers(value);
		}
		if (value==1) {
			System.out.println("happy no");
			
		} else {
             System.out.println("not happy");
		}
		
	}

}
