package dailycodetask;

public class Add2Nos {
        public static void main(String[] args) {
			int[] num= {1,2,3,4,5,6,7};
			int b=9;
			for (int i = 0; i < num.length; i++) {
				for (int j = i+1; j < num.length; j++) {
					if (num[i]+num[j]==b) {
						System.out.println(num[i]+" "+num[j]);
					}
				}
			}
		}
}
