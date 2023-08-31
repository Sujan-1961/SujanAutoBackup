package dailycodetask;

public class Armstrong {
        public static void main(String[] args) {
			int input=370;
			int x=0;
			int var=input;
			while (input>0) {
				int rem=input%10;
				x=x+(rem*rem*rem);
				input=input/10;
				System.out.println(var);
			}
			if (var==x) {
				System.out.println("it is Armstrong");
			} else {
				System.out.println("it is not a Armstrong");
			}
		}
}
