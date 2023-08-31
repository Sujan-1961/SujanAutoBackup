package dailycodetask;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDupUsingScan {
        public static void main(String[] args) {
        	int[] num= new int[6];
			Scanner scan = new Scanner(System.in);
			for (int i = 0; i < num.length; i++) {
				num[i]=scan.nextInt();
			}
			Set <Integer> val = new TreeSet <Integer> ();
			for (int i = 0; i < num.length; i++) {
				val.add(num[i]);	
			}
			System.out.println(val);
			}
}
