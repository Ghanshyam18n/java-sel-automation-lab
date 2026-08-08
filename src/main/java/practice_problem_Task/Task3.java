package practice_problem_task;

/*
Store test case IDs.
Print them using both:
normal for
enhanced for */

public class Task3 {
	public static void main(String[] args) {
		
		String[] ID = {
				  
				"TS01", "TS02", "TS03"
		};
		
		System.out.println("\nNormal for loop");
		
		for(int i=0; i<ID.length; i++) {
			
			System.out.println(ID[i]);
		}
		
		System.out.println("\nEnhanced for loop");
		
		for(String test : ID) {
			System.out.println(test);
		}
	}

}
