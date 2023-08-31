package dailycodetask;


public class PrintDuplicate {
          public static void main(String[] args) {
			int[] num= {1,2,3,4,4,5,6,7,8,8};
			
              int length = num.length;
              for (int i = 0; i < length; i++) {
				for (int j = i+1; j < length; j++) {
					if (num[i]==num[j]) {
						System.out.println(num[i]);
					}
				}
			}
          }
}
		
