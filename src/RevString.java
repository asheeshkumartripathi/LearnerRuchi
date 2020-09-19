
public class RevString {

	public static void main(String[] args) {
	String a = "ASHEESH";
	int len = a.length();
	String rev = " ";
	for(int i=len-1; i>=0;i--) {
	rev = rev + a.charAt(i);
	}
	System.out.println("Revverse String is " + rev);

	}
	
	
	

}
