package encapsulation;

public class CreateBox {

	public static void main(String[] args) {
		Common cm =new Common();
		//int h=	cm.height=10;
		//int l=	cm.length=20;
		//int b =	cm.width=30;
		
		
	int b =	cm.setwidth(10);
	int l =	cm.setlength(30);
	int h =	cm.setheight(50);
	cm.setBoxDimension(l, b, h);
	System.out.println(cm.getLength());
	System.out.println(cm.getWidth());
	System.out.println(cm.getHeight());
	}
	

}
