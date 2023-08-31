package dailytask;

public class ArmstrongNumber {
public static void main(String[] args) {
	int num=153;
	//1*1*1  5*5*5  3*3*3
	//1   +125+27
	//153
	int temp=num;
	int sum=0;
	while(num>0){
	
	int remainder=num%10;
	 sum=sum+remainder*remainder*remainder;
	num=num/10;
	System.out.println(sum);
	}
	System.out.println(sum);
	if(temp==sum) {
		System.out.println("The given number is Armstrong number");
	}else {
		System.out.println("The given number is  not Armstrong number");
	}
}
}
