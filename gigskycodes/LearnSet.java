package gigskycodes;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
public static void main(String[] args) {
	
	int[] num= {10, 20, 40, 50, 70, 90, 200,20, 40, 50};
	//20,40,50
	
	Set<Integer> val=new TreeSet<Integer>();
	
	for (int i = 0; i < num.length; i++) {
		if(!val.add(num[i])){
	System.out.println(num[i]);
	}
	}
	System.out.println(val);
	
List<Integer> index=new ArrayList<Integer>(val);
	
Integer integer = index.get(0);
	System.out.println(integer);
	
	System.out.println(index.get(index.size()-1));
	
}
}
