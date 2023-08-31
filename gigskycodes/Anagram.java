package gigskycodes;

import java.util.Arrays;

public class Anagram {
             public static void main(String[] args) {
            	 //declare two variables with inputs
				String name1 = "rasputin";
				String name2 = "nitsupra";
				
				//add a condition to compare length of both variables
				if(name1.length()==name2.length()) {
					//convert to chararray
					char[] character1 = name1.toCharArray();
					char[] character2 = name2.toCharArray();
					
					//sort the values
					Arrays.sort(character1);
					Arrays.sort(character2);
					
					//set a boolean method to find whether they are equal
					//boolean b = Arrays.equals(character1, character2);
					
					//condition to prove if it a anagram
					if (Arrays.equals(character1, character2)) {
						System.out.println("It is Anagram");
					} else {
                              System.out.println("not a anagram");
					}
				}
			}
}
