package exer;

public class ForForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<4;j++) {
				for(int k=0;k<3;k++) {
					System.out.println("반복실행!!!");
					count++;
				}
			}
		}
		
		System.out.println(count);
	}

}
