package practice_problem_task;

/*
 
Store employee names.
Search for "Deepak".
If found,
Deepak found
then stop using break.
 
 */
public class Task6 {

	public static void main(String[] args) {
		
		String[] empName = {
				"Ghanshyam",
				"Shyam",
				"Deepak",
				"rahul"
		};
		
		for(int i = 0; i<empName.length; i++) {
			if(empName[i].equals("Deepak")) {
				System.out.println(empName[i]);
				break;
			}
		}
	}
}
