package dailycodetask;

public class Countwords {
        public static void main(String[] args) {
			String words = "What the hell?";
			
			String[] split = words.split(" ");
			
			
			int length = split.length;
			System.out.println(length);
		}
}
