package Practice_calculate;

import java.util.Arrays;

public abstract class test05 {

	public static void main(String[] args) {
		int []back = new int[] {7,3,3,6,1,2,10};
		int []back1= new int[10];
		back1=jungbok(back);
		

			System.out.println(Arrays.toString(back1));
					}
	
	
	public static int []jungbok(int jungbok[]) {
		
		int gogo[]=new int[jungbok.length];
		int count =0;
		for(int i=0;i<=jungbok.length;i++) {
			boolean a = false;
			for(int j=i;j<=jungbok.length;j++) {
				
				if(jungbok[i]!=jungbok[i+1]) {
					 a = true;
					
					
				}
					
			}
			if(a==true) {
				
				
				gogo[count]=jungbok[i];
				count++;
				
			}
			
		}
		return gogo;
	}
	

			}

	
	