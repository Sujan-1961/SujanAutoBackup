package dailycodetask;

public class NumHourglass {
          public static void main(String[] args) {
			for (int i = 1; i <=7; i++) {
				for (int j = i; j >0; j--) {
					System.out.print(" ");
				}
				for (int j = i; j <=7; j++) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
			for (int i = 7-1; i >0; i--) {
				for (int j = i-1; j >=0; j--) {
					System.out.print(" ");
				}
				for (int j = i; j <=7; j++) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
		}
}
