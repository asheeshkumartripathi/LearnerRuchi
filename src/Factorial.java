import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to get the factorial");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			fact = fact*i;
			
		}
		System.out.println("The factorial of  " + n + " is " + fact);
	}

}
