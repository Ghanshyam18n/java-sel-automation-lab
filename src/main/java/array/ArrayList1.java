package array;

import java.util.ArrayList;

public class ArrayList1 {
	
	public static void main(String[] args) {
		
		// ArrayList a = new ArrayList();
		// create object of class object.method
		
		ArrayList<String> a = new ArrayList<String>();
		//now we can dynamically add value anytime in out test
		
		a.add("shyam");
		a.add("sharma");
		a.add("selenium");
		a.add("automation");
		a.remove(2);
		
		System.out.println(a.get(2));
		
		// retrieval using enhanced for loop
		
		System.out.println("\nAdded for loop for retrieval ");
		
		for(String value : a) {
			System.out.println(value);
		}
		
		System.out.println("----------------------");
		
	//	-------------------------------------------------
		
		// retrieval using for loop
		
		//in arrayList to get the size cannot use length
		for(int i = 0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
		
		System.out.println("------------------------------");
		
		// check item is present in arraylist 
		// in normal array we don't have contains method
		
		System.out.println(a.contains("shyam"));
			
	}

}
