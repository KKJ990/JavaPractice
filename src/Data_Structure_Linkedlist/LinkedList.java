package Data_Structure_Linkedlist;

public class LinkedList {

	private Node head;
	public Node tail;
	private int size=0;
	
	public class Node{
		
		private Object data;
		private Node next; 
		public Node tail;
	
		
		public Node(Object input) {
			
			this.data=input;
			this.next=null;
			
			 
		}
		public String toString() {
			
			
			return String.valueOf(this.data);
			
		}
	}
	public void addFirst(Object input) {
			
			Node NewNode = new Node(input);
			NewNode.next = head;
			head = NewNode;
			size++;
			
			if(head.next==null) {
				
				
				tail =head;
				
			}
			
			
		}

	public void addLast(Object input) {
			
			Node NewNode = new Node(input);
			
			if(size==0) {
				
				addFirst(input);
				
			}
			else {
				tail.next = NewNode;
				tail = NewNode;
				size++;
				
				
			}
			
		}
		
		
	
	
	 Node node(int index) {
		
			Node x = head;
			
			for(int i =0;i<index;i++) {
				
				x=x.next;
				
			}
			return x;
	 }
	

	 public void add(Object input,int index) {
		 
		 
		 
		Node x= new Node(input);   //추가할값
		
		Node x1 = node(index-1); //추가할 값의 전값
		
		Node x2 = node(index); // 추가할값에서 밀린값
		
		if(head ==null) {
			
			addFirst(input);  //배열에 추가된것이 없으니 addFirst
		}
		else {
		
		 x1.next =x;
		 x.next = x2;		//있으니 add
		 
		}
		
		size++;
		
		if(x.next==null) {
			
			tail = x;
		}
		 
	 }
	 
	 public Object removeFirst() {
		 
		 Node x = head;   //현재 제거할값을 담는 노드
		 head = x.next;   // 값지워지고 해드값을 갖는노드 (head.next)
		 
		 Object returnData = x.data;
		 x.data=null;
		 
		 size--;
		 return returnData;    //next만 지운다고해서 완전한 삭제 x 배열의 size를 감소시켜야함 그리고 지울데이터 x의 값을 null로 표시 ==> 완전한삭제
	 }
	 
	 
	
	 public Object remove(int index) {
		Node x1 = node(index-1);  //node ==> 현재값을 get하는 객 , Node는 data 와next를갖는 Node 선언 
		Node x2 = node(index+1); 
		Node x = node(index);
		
		if(x==tail) {
			
			tail=x1;
		}
		
		x1.next = x2;
		Object returnData = x.data;
		x.data=null;
		size--;	
		
		return returnData;
	 }
	 public Object removeLast() {
		 
		 	return remove(size-1);
	 }
	 

	 public String toString() {
		if(head ==null) {
			
			return "";
		}
		String str = "[";
		Node x =head ;
		
		while(x.next!=null) {
			
			str +=x.data +", ";
			x=x.next;
			
		}
		str += x.data; 
		 
		 
		 
		 return str +"]";
		 
	 }

	public int Size() {
		
		return size;
	}
	
	public Object get(int index) {
		
		
		return node(index).data;
	}
	
	public int indexOf(Object input) {
		
		int returnData = 0;
		
		for(int i=0;i<size; i++) {
			
			if(node(i).data.equals(input)) {
				
				returnData=i;
				
			} 
			
			
		}
		
		
		return returnData;
	}
	
	
	public ListIterator listiterator() {
		
		return new ListIterator();
	}
	class ListIterator{
	
		private Node next; 
		private Node LastReturned;
		private int nextIndex;
		public ListIterator() {
			next=head;
			
		}
		public Object next() {
			LastReturned=next;
			next = LastReturned.next;
			nextIndex++;
			
			return LastReturned.data;
		}
		
		public boolean hasNext() {
			
			
			return next!=null;
		}
		
		public void add(Object data) {
			
			Node NewNode = new Node(data);
			if(nextIndex==0) {
			head = NewNode;
			NewNode.next=next;
			
			nextIndex++;
			size++;
			}
			else  {
				
				
				
			LastReturned.next = NewNode;
			NewNode.next=next;
			LastReturned = NewNode;
			nextIndex++;
			size++;
			}
			
		
			
			
			
			
		}
		
		
		public void remove() {
			
			
		LinkedList.this.remove(nextIndex-1);
		}
	}
}

