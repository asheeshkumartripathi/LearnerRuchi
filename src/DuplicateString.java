package practiceone;

public class DuplicateString {

	public static void main(String[] args) {
		// one array is given to you, and in that there are duplicate element(s), 
		
		String a[] = {"Java", "JavaScript", "Ruby" ,  "C", "Python", "Java" , "Donnet", "JavaScript", "C"};
		for(int i = 0; i<a.length; i++) {		//java
			for(int j =i+1; j<a.length; j++) {
				
				if(a[i].equals(a[j])) {
					System.out.println("Duplicate element is :::" +a[i]);
				}
				
			}
			
			
			
		}
		

	}

}
