import java.util.Scanner;

public class IsGivenNumberPrime {
	
	public static boolean isPrimeNumber (int num) {
		if( num<=1) {
			return false;
		}
		for(int i =2; i<num; i++) {
			if(num % i == 0) {
		return false;
		}			
	}
		return true;		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number");
		int num = sc.nextInt();
		
		
		System.out.println(isPrimeNumber(num));	
	}

}
