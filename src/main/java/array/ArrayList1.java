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
	}

}
