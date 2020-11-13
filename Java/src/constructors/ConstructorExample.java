package constructors;

public class ConstructorExample {
	
	public  ConstructorExample(){
		
		System.out.println("No Argument constructor");
	}	//No return type such that Void and same name as class name.
	
	public  ConstructorExample(int i){
		
		System.out.println("Integer constructor");
	}
public  ConstructorExample(String i){
		
		System.out.println("String constructor");
	}

	public static void main(String[] args) {
		ConstructorExample ce = new ConstructorExample("Hello");

	}
}
