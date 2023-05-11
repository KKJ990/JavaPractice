package Circle;

public class CallByValue {

	public static void main(String[] args) {
		
		int n=10;
		System.out.println(n);
		n++;
		System.out.println(n);
		
		
		System.out.println(sum(n));
		

	} 

	
	public static int sum(int m) {
		
		
		m++;
		
		return m;
	}

}
