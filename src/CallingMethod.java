
public class CallingMethod {

	public static void main(String[] args) {
		Method obj = new Method();
		obj.launchApp("https://www.facebook.com/");
		obj.elementAvailable("email", true);
		obj.elementAvailable("pass", true);
		obj.elementAvailable("u_0_b", false);
		obj.closeMethod();

	}

}
