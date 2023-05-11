package Circle;


public class ReferecePassing {

	public static void main(String[] args) {
		Circle c = new Circle(1);
		 
		System.out.println(c.getR());
		
		incre(c);
		
		System.out.println(c.getR()); 
	}
	public static void incre(Circle m) {
		
		int r = m.getR();
		r++;
		m.setR(r);
		
	}
	
	 

}
 