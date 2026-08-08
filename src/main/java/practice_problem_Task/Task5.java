package practice_problem_task;

/*
Store status codes.
Print only
200
201
using an if condition. */

public class Task5 {
    public static void main(String[] args) {
	
	int[] statusCode = {200, 201, 404, 500, 301, 400};
	
	for(int i : statusCode) {
		
		if(i ==200 || i==201) {
			System.out.println(i);
		}
	}
}
}
