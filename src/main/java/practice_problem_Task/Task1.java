package practice_problem_Task;

/*
Task 1
Create an array of browser names.
Chrome
Firefox
Edge
------- Print all browser
*/
public class Task1 {

	public static void main(String[] args) {
		
		String[] browser = {"Chrome", "Firefox", "Edge"};
		
		for(String name : browser) {
			
			System.out.println(name);
		}
		
		System.out.println("\nPrint first browser name from array");
		
	     for(String name : browser) {
	    	 System.out.println(name);
	    	 break;
	     }
	}
}
