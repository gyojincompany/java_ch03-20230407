package exer;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,30,20,50,80,456,456,121,465,456,45,1,5,1,54,51,5,15,15,15,3};
		//System.out.println(arr);
		int count = 0;
		
		for(int i=0;i<arr.length;i++ ) {
			System.out.println(arr[i]);
			count++;//count=count+1			
		}
		System.out.println("배열의 원소의 개수:"+count);
		
	}

}
