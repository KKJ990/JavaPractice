package Data_Structure_Arraylist;

public class MakeArraylist {
	
	 int size=0;
	 Object[] ArrayOne = new Object[100];
	 int[] ArrayTwo= new int[30];
	
	
	
	
	public boolean add(Object a) {
		
		ArrayOne[size]=a;
		size++;
		
		return true;
	}
	
	
	public boolean add(int Index , Object a ) {
		
		
		for(int i =size-1;i>=Index;i--) {
			
			ArrayOne[i+1]=ArrayOne[i];
			
		}
		
		ArrayOne[Index] = a;
		size++;
		
		return true;
		
	}
	
	public Object remove(int Index) {
		
		
		for(int i = Index+1;i<=size-1;i++) {
			
			
			ArrayOne[i-1]=ArrayOne[i];
			
		}
		size--;
		
		
		return Index;
	}
	public void toString1() {
		
		
		for(int i=0; i<size;i++) {
			
			
			System.out.print("["+ArrayOne[i]+"]");
			
		}
		
		
	}
	

	public int SizeOf() {
		
		
		
		
		return size;
		
	}
	
	public Object get(int a) {
		
		
		
		
		return ArrayOne[a];
	}
	
//	public Object exchange() {
//		
//		for(int i=0;i<size;i++) {
//			
//			ArrayTwo[i]=(int)ArrayOne[i];
//			
//		}
//		
//		
//		
//		return true;
//	}
//	
	
	
	public boolean sort() {
		
		for(int i = 0; i<size;i++) {
			
			for(int j=i+1; j<size;j++) {
				
				if((int)ArrayOne[i]>(int)ArrayOne[j]) {
					
					Object temp=0;
					
					temp = ArrayOne[i];
					ArrayOne[i]=ArrayOne[j];
					ArrayOne[j]=temp;
	
				}
				
			}
		}
		
		return true;		
	}
	
	public int indexOf(int p) {
		int j =0;
		
		for(int i =0; i<size;i++) {
			
			
			if(get(i).equals(p)) {
				
				
				j=i;
				
				
			}
			
			
			
		}
		
		
		
		return j;
	}
	
	

	public ListIterator listIterator() {
		
		
		return new ListIterator();
	}
	
	class ListIterator{
		
		int nextIndex=0;
		
		public Object next() {
			
			
			return ArrayOne[nextIndex++];
		}
		
		
		public boolean hasNext() {
			
			
			
			
			return nextIndex<size;
			
			
		}
		
		public Object Previous() {

			return ArrayOne[--nextIndex];
		}

		public boolean hasPrevious() {
			
			
			
			return nextIndex>0;
		}
		
		public Object add(int a) {   //그냥 add를해도 숫자 값 사이를 찾아서 add
			
			for(int i=0;i<size;i++) {
				
				
				if((int)get(i)<a&&a<(int)get(i+1)) {
					
					
					MakeArraylist.this.add(i+1, a);
				
					
				}
				
					
				
			}
			
			
			
			return 1;
		}
		
		public Object remove(int a) {
			
			
			MakeArraylist.this.remove(MakeArraylist.this.indexOf(a));
			
			
			return MakeArraylist.this.indexOf(a);
		}
	}

	
	
}
