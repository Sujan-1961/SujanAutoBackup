package codepractice;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDup {
    public static void main(String[] args) {
		int[] num = {1,2,3,4,5,6,5,6,7};
		
		Set<Integer> value = new TreeSet <Integer>();
		for (int i = 0; i < num.length; i++) {
			value.add(num[i]);
		}
		System.out.println(value);
	}
}
