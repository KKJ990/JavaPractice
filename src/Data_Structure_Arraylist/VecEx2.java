package Data_Structure_Arraylist;

import java.util.Iterator;
import java.util.Vector;

public class VecEx2 {

	public static void main(String[] args) {
		Vector<String> vec1= new Vector<String>();
		vec1.add("ABC");
		vec1.add("fuck"); 
		
		Iterator<String> iter = vec1.iterator();
		while(iter.hasNext()) {
			
		System.out.println(iter.next());
			
		}
		
		Vector<Integer> vec2 = new Vector<Integer>();
		Iterator<Integer> iter1 = vec2.iterator();
		vec2.add(Integer.valueOf(1));
		vec2.add(3);
		while(iter1.hasNext()) {
			
			System.out.println(iter1.next());
		}
	}
}
