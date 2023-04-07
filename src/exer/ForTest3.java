package exer;

public class ForTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		
		//for문 내에 if문을 삽입하여 짝수만 출력하는 프로그램을 작성하시오 
		for(int i=0;i<=100;i++) {
			if(i % 2 == 0) {
				System.out.println(i);
				count++;//count=count+1
			}
		}
		
		System.out.println(count);
	}

}
