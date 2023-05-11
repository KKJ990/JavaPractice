package Data_Structure_Linkedlist;

import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList numbers = new LinkedList();
		numbers.addFirst(10);
		numbers.addFirst(20);
		numbers.addFirst(30);
		numbers.addFirst(40);
		
		
		LinkedList.ListIterator i = numbers.listiterator();
		i.next();
		
		i.next();
		i.remove();
		i.next();
		i.next();
		System.out.println(numbers);
		
	}

}
