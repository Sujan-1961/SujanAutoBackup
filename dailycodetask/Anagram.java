package dailycodetask;

import java.util.Arrays;

public class Anagram {
       public static void main(String[] args) {
		String name1="kalim";
		String name2="mikil";
		
		if (name1.length()==name2.length()) {
			char[] charArray = name1.toCharArray();
			char[] charArray2 = name2.toCharArray();
			
			Arrays.sort(charArray);
			System.out.println(charArray);
			Arrays.sort(charArray2);
			
			
			System.out.println(charArray2);

			
			//boolean a = charArray.equals(charArray2);
			
			if (Arrays.equals(charArray2, charArray)) {
				System.out.println("Anagram");
			} else {
				System.out.println("not anagram");
			}
		}else {
                  System.out.println("Not a Anagram");
			}
		}
	
}
