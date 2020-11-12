package encapsulation;

public class Common {
	
	private int length;
	private int width;
	private  int height;
	
	public void setBoxDimension(int l,int b, int h)
	{
		
		System.out.println("Box created with dimensions"+l+" "+b+" "+h+" ");
		
	}
	
	public int setlength(int l)
	{
		length=l;
		return length;
	}
	
	public int setwidth(int b)
	{
		width=b;
		return width;
	}	
	
	public int setheight(int h)
	{
		height=h;
		return height;
	}
	
	public int getLength() {
		
		return length;
	}
	public int getWidth() {
		
		return width;
	}
public int getHeight() {
		
		return height;
	}

}
