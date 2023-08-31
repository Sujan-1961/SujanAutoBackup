package gigskycodes;

import org.jsoup.select.Evaluator.ContainsText;

public class Buffer {
              public static void main(String[] args) {
            	String a="racer";
				StringBuffer buffer = new StringBuffer(a);
				StringBuffer reverse = buffer.reverse();
				System.out.println(reverse);
				if (a.contains(reverse)) {
					System.out.println("Palindrome");
				} else {
                     System.out.println("not");
				}
				
			}
}