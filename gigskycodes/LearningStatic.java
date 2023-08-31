package gigskycodes;

public class LearningStatic {	
            	 static int a;
 				final int c=10;
 				private static void add() {
 					// TODO Auto-generated method stub
 	            	 System.out.println("addition of two numbers");
 					
 				}
 				static {
 					System.out.println("static block");
 				}
 				public LearningStatic() {
 					System.out.println("default constructor");
 				}
             
			public static void main(String[] args) {
           	 LearningStatic obj = new LearningStatic();
				
				final int b=20;
				System.out.println(a);
				System.out.println(obj.a);
				add();
			
            
}
			}
