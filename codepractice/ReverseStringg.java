package codepractice;

import java.util.Scanner;

public class ReverseStringg {
         public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the input");
			String line = scan.nextLine();
			
			System.out.println(line);
			char[] text = line.toCharArray();
			for (int i = text.length-1; i >=0 ; i--) {
				System.out.println(text[i]);
			}
			
		}
}
