package array;

public class Array12 {

	public static void main(String[] args) {
		
		int [] marks = {70,40, 56, 87, 98};
		
		for(int i = 0; i<marks.length; i++) {
			
			System.out.println(marks[i]);
		}
		
		//using enhanced for loop
		System.err.println("Enhanced For Loop");
		
		for(int res : marks) {
			
			System.out.println(res);
		}
	}
}
