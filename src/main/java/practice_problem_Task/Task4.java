package practice_problem_Task;

/*
Task 4
Store response times.
Print only values greater than 200. */

public class Task4 {

	public static void main(String[] args) {
		
		double[] time = {200, 300, 202, 134, 23, 453,365, 39, 79};
		
		for(double i : time) {
			if(i>200) {
				System.out.println(i);
			}
		}
		
	}
}
