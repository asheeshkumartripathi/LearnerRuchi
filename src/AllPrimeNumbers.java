import java.util.Scanner;

public class AllPrimeNumbers {
	
	public static void listofAllPrimeNumbers(int number) {
		for(int i = 2; i<= number ; i++) {
			if(IsGivenNumberPrime.isPrimeNumber(i)) {
				System.out.println(i);
			}
		}		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value");
		int number = sc.nextInt();
		
		
		
		listofAllPrimeNumbers(number);	
	}

}
