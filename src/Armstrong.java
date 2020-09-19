import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
	int n , r, sum = 0;
	Scanner sc11 = new Scanner(System.in);
	System.out.println("Please enter the number to check it's armstrong property");
	n = sc11.nextInt();
	int temp = n;
	while(temp>0) {
		r = temp%10;
		temp = temp/10;
		sum = sum + r*r*r;
	}
	if(sum==n) {
		System.out.println("The given number is armstrong");
	}
	else {
		System.out.println("The given number does not fulfill the property of armstrong");
	}
	
	}

}
