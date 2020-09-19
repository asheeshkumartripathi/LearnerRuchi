
public class SwapWithoutTemp {

	public static void main(String[] args) {
		String a = "ASHEESH kumar tripathi aaa";
		boolean res = a.equals("ASHEESH");
		System.out.println(res);
		String[] b = a.split(" ");
		for(int i=0; i < b.length; i++) {
			System.out.println(b[i]);
		}

	}

}
