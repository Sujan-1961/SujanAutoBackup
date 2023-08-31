package gigskycodes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {
	public static void main(String[] args) {
		List<String> employeeName=new ArrayList<String>();
		boolean empty = employeeName.isEmpty();
		System.out.println(empty);
		//To add the values in list
		employeeName.add("Gokul");
		employeeName.add("Madhavan");
		employeeName.add("Sujan");
		
		System.out.println(employeeName);
		//To check whether the list is empty or not
		boolean empty2 = employeeName.isEmpty();
		System.out.println(empty2);
		//To get the count in list
		System.out.println(employeeName.size());
		//To check existing values is available or not
		boolean contains = employeeName.contains("sujan");
		System.out.println(contains);
		
		employeeName.add(0, "Ul");
		System.out.println(employeeName);
		
		//to remove particular element in list
		boolean remove = employeeName.remove("Gokul");
		System.out.println(remove);
		
		//size(),add(),isEmpty(),clear(),remove(),contains()
		//employeeName.removeAll(employeeName);
		//employeeName.clear();
		System.out.println(employeeName);
		
		Collections.sort(employeeName);
		System.out.println(employeeName);
		Collections.reverse(employeeName);
		System.out.println(employeeName);
		
		//To print particular element in list
		String string2 = employeeName.get(2);
		System.out.println("Index 2 is "+string2);
		for (int i = 0; i < employeeName.size(); i++) {
			String string = employeeName.get(i);
			System.out.println(string);
		}
	}

}
