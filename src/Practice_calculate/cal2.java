package Practice_calculate;

import java.util.Scanner;

public class cal2 {

	public static void main(String[] args) {
		
		String n1,n2,n3;	//n1,n2 는 숫자입력 값   n3는 결과값
		Double in1,in2,in3;	//in1,in2,in3 위에 String을 double로 치환하기위한변수
		boolean a,b;
		
		String cal; // 연산기호값
		
		Scanner num1 = new Scanner(System.in); //첫번째입력값
		System.out.println("숫자를입력하세요");
		n1= num1.nextLine();
		
		try {
		
			in1=Double.parseDouble(n1);
			a=true;
		
		} catch (Exception e) {
			// TODO: handle exception
			a=false;
		}
		
		
		
			if(a==true) {
				in1=Double.parseDouble(n1);
				Scanner cal1 =new Scanner(System.in);    //부호확인
				System.out.println("+"+"-"+"*"+"/"+"골라주세요");
				cal= cal1.nextLine();
				
				if(cal.equals("+")) {
					Scanner num2 = new Scanner(System.in); //두번째입력값
					System.out.println("숫자를입력하세요");
					n2= num2.nextLine();
					
					//두번째 값 확인
					try {
						
						in2=Double.parseDouble(n2);
						b=true;
					
					} catch (Exception e) {
						// TODO: handle exception
						b=false;
					}
					if(b==true) {
						in2=Double.parseDouble(n2);
						System.out.println(in1+in2);
					}
					else if(b==false) {
						System.out.println("잘못된수입니다");
					}
				}
				
			else if(cal.equals("-")) {
				
				Scanner num2 = new Scanner(System.in); //두번째입력값
				System.out.println("숫자를입력하세요");
				n2= num2.nextLine();
				try {
					
					in2=Double.parseDouble(n2);
					b=true;
				
				} catch (Exception e) {
					// TODO: handle exception
					b=false;
				}
				if(b==true) {
					in2=Double.parseDouble(n2);
					System.out.println(in1-in2);
				}
				else if(b==false) {
					System.out.println("잘못된수입니다");
				}
			}
			
			
			else if(cal.equals("*")) {
				
				Scanner num2 = new Scanner(System.in); //두번째입력값
				System.out.println("숫자를입력하세요");
				n2= num2.nextLine();
				try {
					
					in2=Double.parseDouble(n2);
					b=true;
				
				} catch (Exception e) {
					// TODO: handle exception
					b=false;
				}
				if(b==true) {
					in2=Double.parseDouble(n2);
					System.out.println(in1*in2);
				}
				else if(b==false) {
					System.out.println("잘못된수입니다");
				}
			
			}
			
			else if(cal.equals("/")) {
				
				Scanner num2 = new Scanner(System.in); //두번째입력값
				System.out.println("숫자를입력하세요");
				n2= num2.nextLine();
				try {
					
					in2=Double.parseDouble(n2);
					b=true;
				
				} catch (Exception e) {
					// TODO: handle exception
					b=false;
				}
				if(b==true) {
					in2=Double.parseDouble(n2);
					System.out.println(in1/in2);
				}
				else if(b==false) {
					System.out.println("잘못된수입니다");
				}
			}
			
			else System.out.println("부호를입력해주세요");
			
			
	}
				
		
		else if(a==false) {
			System.out.println("잘못된수");
		}
			
			
				
	}

}