package inheritance;

public class Truck extends VehicleCommon {

	public static void main(String[] args) {
		
		Truck tk = new Truck();
		tk.start();
		tk.stop();
	}
	
	public void LoadCapacity() {
		
		System.out.println("Load capacity");
		
		
	}
}
