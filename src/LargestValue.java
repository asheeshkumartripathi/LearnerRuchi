
public class LargestValue {

	public static void main(String[] args) {
		
		int a[]  = {10,20,30,54,44,520,21,785,852};
	int smallest = a[0];
		int largest = a[0];
		int i;
		
		for( i = 0; i< a.length; i++) {
			
			if(a[i]>largest) {
				largest = a[i];
			}
			else if (a[i]<smallest) {
				smallest = a[i];
			}
			
		}
		System.out.println("largest is +" + largest);
		System.out.println("Smallest is " + smallest);
		

	}

}
