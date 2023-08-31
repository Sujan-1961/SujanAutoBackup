package dailycodetask;

public class PrintTheinputwithoutmodifyingit {
         public static void main(String[] args) {
			String num = "\"a\"\"b\"\"c\"";
			String replaceAll = num.replaceAll("\"", "");
		    System.out.println(replaceAll);			
		}
}
