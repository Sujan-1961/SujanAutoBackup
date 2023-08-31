package codepractice;

public class MisssingElements {
        public static void main(String[] args) {
			int[] num = {1,2,5,6};
			
			int n = num.length+1;
			
			int sum = n*(n+1)/2;
			
			for (int i = 1; i < num.length; i++) {
				sum=sum-num[i];
			}
			System.out.println(sum);
		}
}
