package interfacee;

public class Circle implements Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		c.drawShape();
		c.colorShape();
		c.moveShape();
	//	Shapes s= new Shapes(); 		we can not instantiate the interface class
	}

	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
		System.out.println("Draw Circle");
		
	}

	@Override
	public void colorShape() {
		// TODO Auto-generated method stub
		System.out.println("Color circle");
		
	}

	@Override
	public void moveShape() {
		// TODO Auto-generated method stub
		System.out.println("Move circle");
		
	}

}
