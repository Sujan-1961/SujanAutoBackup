package dailycodetask;

public class PalindromeByConverting {
         public static void main(String[] args) {
        	 //declare input variable
			String s = "A man, a plan, a canal: Panama";
			//temporary variable
			String reverse="";
			
			//convert to lowercase
			String lowerCase = s.toLowerCase();
			System.out.println(lowerCase);
			
			//remove comma and colon
		    String all = lowerCase.replaceAll(",", "").replaceAll(":", "");
		    
		    System.out.println(all);
		    
		    //remove white space
		    String all2 = all.replaceAll("\\s+", "");
		    System.out.println(all2);
		    
		    //convert from string to charArray
		    char[] charArray = all2.toCharArray();
			
		    //iterate with for loop
             for (int i =  charArray.length-1; i >=0; i--) {
            	 reverse = reverse+charArray[i];
 				
			}
           //print the reversed string
             System.out.println(reverse);
             
             boolean equals = all2.equals(reverse);
             System.out.println(equals);
         
         }
}
