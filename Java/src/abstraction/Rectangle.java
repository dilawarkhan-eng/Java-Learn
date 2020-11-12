package abstraction;

public class Rectangle extends Shapes {
	
	

	@Override
	public void drawShape() {
		System.out.println("Drawing rectangle");
		
	}

	@Override
	public void colorShape() {
		System.out.println("Coloring rectangle");
		
	}

	@Override
	public void moveShape() {
		System.out.println("Moving rectangle");
		
	}

}
