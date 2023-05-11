package Circle;

public class Circle {
	
	public static int r;
	public static String name;
	
	public Circle(int r) {
		
		this.r=r;
		
	}
	public Circle() {
		
		
	}
	public static int getR() {
		
		
		return r;
	}
	public static int setR(int p) {
		
		r=p;
		
		
		return r;
	}
	
	
	public double radius() {
		
		
		return r*r*3.14;
	}
	
	public Circle returnr(Circle r) {
		
		
		
		
		return r;
	}
	public Circle returnname(Circle name) {
		
		
		
		return name;
	}
	

}
