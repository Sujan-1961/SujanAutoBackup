package gigskycodes;

public class Armstrong {
      public static void main(String[] args) {
    	  int input = 153;
          int sum = 0;
          int var = input;
          while(input>0) {
        	  int remainder = input%10;
        	  sum = sum+(remainder*remainder*remainder);
        	  input=input/10;
        	  System.out.println(var);
          }
          if(var==sum) {
        	  System.out.println("the num is arm");
          }
          else {
        	  System.out.println("the given num is not arm");
          }
    }
	
}

