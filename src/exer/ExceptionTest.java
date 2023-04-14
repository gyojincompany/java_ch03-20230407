package exer;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 1개를 입력하세요 : ");
		
		int b = scanner.nextInt();
		
		int a = 100;
		
		int c = 0;
		
		try {
			
			c = a / b;
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("모든 수는 0으로 나눌수 없습니다.");
		} finally {
			System.out.println("저는 에러와 관계없이 실행이 됩니다!"); 
		}
		
		
		System.out.println("몫 : "+ c);

	}

}
