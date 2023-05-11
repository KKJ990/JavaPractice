package Data_Structure_Arraylist;

public class Main {

	
	public static void main(String[] args) {
		
		
	MakeArraylist mk = new MakeArraylist();
	MakeArraylist.ListIterator li = mk.listIterator();
		mk.add(10);
		mk.add(20);
		mk.add(30);
		mk.add(40);
		mk.add(50);
		li.add(49);
		li.add(17);
		li.remove(30);
	
		while(li.hasNext()) {
		System.out.println(li.next());
		}
	
}
}
