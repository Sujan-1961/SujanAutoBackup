package codepractice;

public class Palindromee {
     public static void main(String[] args) {
    	 //declare a string
		String name="modom";
		
		//declare a default variable
		String reverse="";
		
		//convert to array
		char[] c = name.toCharArray();
		
		//using for loop iteration
		for (int i = c.length-1; i >=0 ; i--) {
			reverse=reverse+c[i];
			System.out.println(reverse);
		}
		if (reverse.equals(name)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
		 
		
	}
}
