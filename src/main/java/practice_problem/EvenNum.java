package practice_problem;

public class EvenNum {
             public static void main(String[] args) {
				int [] number = {1,2,3,4,5,6,7,8,5,3,4,6,7,5,4,71,18,20};
				
				for(int even : number) {
					
					if(even % 2 == 0) {
						System.out.println(even);
					}
				}
				
				// print all even number from an array and print 
				System.out.println("\nFind even number");
				
				int [] arr = {3,4,2,3,4,5,6,7};
				
				for(int i=0; i<arr.length; i++) {
					
					if(arr[i]%2==0) {
						System.out.println(arr[i]);
					}
				}
				
				System.out.println("\nFind first even from array");
				for(int i=0; i<arr.length; i++) {
					
					if(arr[i]%2==0) {
						System.out.println(arr[i]);
						break;
					}
				}
				
			}
}
 