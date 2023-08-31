package dailycodetask;

public class CharOccurance {
         public static void main(String[] args) {
			String name="Sinister";
			
			int count=0;
			
			char[] charArray = name.toCharArray();
			
			for (int i = 0; i < charArray.length; i++) {
				if (charArray[i]=='i') {
					count++;			
				}
			}
			System.out.println("Char Occurance is"+count);
		}
}
