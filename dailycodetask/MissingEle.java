package dailycodetask;



public class MissingEle {
        public static void main(String[] args) {
        	int[] num= {1,2,3,5,6};
        	int length = num.length+1;
        	
        	int sum=length*(length+1)/2;
        	
        	for (int i = 0; i < num.length; i++) {
				sum=sum-num[i];
				
			}
        	System.out.println(sum);
		}
        
}
