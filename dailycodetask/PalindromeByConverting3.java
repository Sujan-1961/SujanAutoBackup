package dailycodetask;

public class PalindromeByConverting3 {
            public static void main(String[] args) {
            	//declare input empty var
			    String s="";
			    //declare temp var
			    String rev="";
			   
			    //convert to chararray
			   char[] charArray = s.toCharArray();
			   //iterate to reverse the input var
			   for (int i = charArray.length-1; i >=0 ; i--) {
				rev=rev+charArray[i];
				//print the reversed var
				System.out.println(rev);
			}
			   //use boolean to prove true or false
			   boolean equals = s.equals(rev);
			   System.out.println(equals);
			   
			}
}
