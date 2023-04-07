package exer;

public class ForTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1~100까지의 합을 구하는 for문(1+2+3+4+5+6....+98+99+100)
		int sum = 0;
		int sum2 = 0;
		
		for(int i=1;i<=100;i++) {
			
			sum = sum + i;
		}
		
		for(int j=100;j>=1 ;j--) {//100,99,98,97....3,2,1
			sum2 = sum2 + j;
		}
		
		
//		int a=1;
//		if(a>10) {
//			int b;
//		}
		
		System.out.println(sum);
		System.out.println(sum2);
//		System.out.println(b);
	}

}
