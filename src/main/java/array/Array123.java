package array;

public class Array123 {
	public static void main(String[] args) {
		
		String [] name = {"Shyam", "JDK", "Selenium", "API"};
		
		for(String s : name) {
			
			System.out.println(s);
		}
		
		//for loop
		System.out.println("for loop");
		
		for(int i = 0; i<name.length; i++)  
		{
			System.out.println(name[i]);
		}
		
		//city
		
		String[] city = {"Siwan", "Delhi", "Patna", "Hyderabad"};
		
		for(int i=0; i<city.length; i++) {
			
			System.out.println(city[i]);
		}
		
		//course 
		
		String[] course = {"selenium", "java", "c++"};
		
		for(String c : course) {
			
			System.out.println(c);
		}
	}

}
