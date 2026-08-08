package practice_problem_Task;

/*
Task 2
Store URLs.
Print them.
 */
public class task2 {
	
	public static void main(String[] args) {
		
		String[] urls = {   "https://www.google.com\"",
				            "https://www.fb.com\\",
				            "https://www.youtube\\",
				            "https://www.instagram.com\\"
				        };
		for(String i : urls) {
			System.out.println(i);
		}
	}

}
