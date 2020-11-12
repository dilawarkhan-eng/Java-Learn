package methodOverloading;

public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void Login(String s, String p) {
		
		System.out.println("Login successful using username and password");
		
	}
	
public void Login(int s, String p) {		//same method name but different signatures type.
		
		System.out.println("Login successful using username and password");
		
	}
public void Login(int s, String p ,int t) {		//same method name but different signatures type and number
	
	System.out.println("Login successful using username and password");
	
}
	

}