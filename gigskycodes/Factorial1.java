package gigskycodes;

public class Factorial1 {
            public static void main(String[] args) {
				int fact = 1;
				for (int i = 5; i > 0; i--) {
					//multiply fact variable with range value
					fact = fact*i;
				}
				//print the value
				System.out.println(fact);
			}
}
