package dailycodetask;

public class PalindromeByConverting2 {
           public static void main(String[] args) {
        	   //declare variable
			String text = "race a car";
			//declare temp variable
			String rev="";
			
			//using replace all remove white space
			String all = text.replaceAll("\\s+", "");
			//print without white space
			System.out.println(all);
			
			//convert to chararray
			char[] charArray = all.toCharArray();
			
			//iterate using for loop 
			for (int i =charArray.length-1; i>=0 ; i--) {
				//reverse the variable
				rev=rev+charArray[i];
				//print them
				System.out.println(rev);
			}
			//using boolean compare the values
		boolean equals = rev.equals(all);
		//print whether the condition is true or false
		System.out.println(equals);
			
           }
}
