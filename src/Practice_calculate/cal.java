package Practice_calculate;

import java.util.Scanner;

public class cal {

	public static void main(String[] args) {
		
		double n1,n2,n3;	//n1,n2 는 숫자입력 값   n3는 결과값
		
		String cal; // 연산기호값
		
		Scanner num1 = new Scanner(System.in); //첫번째입력값
		System.out.println("숫자를입력하세요");
		n1= num1.nextDouble();
		
		
			
		
			if(n1%2>=-2 && n1%2<=2) {
				
				Scanner cal1 =new Scanner(System.in);    //부호확인
				System.out.println("+"+"-"+"*"+"/"+"골라주세요");
				cal= cal1.nextLine();
				
				if(cal.equals("+")) {
					Scanner num2 = new Scanner(System.in); //두번째입력값
					System.out.println("숫자를입력하세요");
					n2= num2.nextDouble();
					System.out.println(n1+n2);
				}
				
			else if(cal.equals("-")) {
				
				Scanner num2 = new Scanner(System.in); //두번째입력값
				System.out.println("숫자를입력하세요");
				n2= num2.nextDouble();
				System.out.println(n1-n2);
				
			}
			
			else if(cal.equals("*")) {
				
				Scanner num2 = new Scanner(System.in); //두번째입력값
				System.out.println("숫자를입력하세요");
				n2= num2.nextDouble();
				System.out.println(n1*n2);
				
			}
			
			else if(cal.equals("/")) {
				
				Scanner num2 = new Scanner(System.in); //두번째입력값
				System.out.println("숫자를입력하세요");
				n2= num2.nextDouble();
				System.out.println(n1/n2);				
			}
			else if(cal.equals("%")) {
				
				Scanner num2 = new Scanner(System.in); //두번째입력값
				System.out.println("숫자를입력하세요");
				n2= num2.nextDouble();
				System.out.println(n1%n2);		
				
			}
			else System.out.println("부호를입력해주세요");
			
			
		} 
			
		
				
			
				
	}
	}
