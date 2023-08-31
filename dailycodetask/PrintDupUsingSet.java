package dailycodetask;

import java.util.Set;
import java.util.TreeSet;

public class PrintDupUsingSet {
         public static void main(String[] args) {
			int[] num= {1,2,3,4,5,5,6,6};
			
			Set<Integer> number=new TreeSet<Integer>();
			
			for (int i = 0; i < num.length; i++) {
				if (!number.add(num[i])) {
					System.out.println("Duplicate is "+num[i]);
				}
			}
		}
}
