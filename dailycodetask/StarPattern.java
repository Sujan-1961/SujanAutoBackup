package dailycodetask;

public class StarPattern {
          public static void main(String[] args) {

			int num=6;
			for (int i = 0; i < num; i++) {
				for (int j = num-i; j >1; j--) {
					System.out.print(" ");
				}
				for (int j = 0; j <=i; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
}
