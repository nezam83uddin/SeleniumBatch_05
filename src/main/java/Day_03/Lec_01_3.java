package Day_03;

public class Lec_01_3 {

	public static void main(String[] args) {
		
		int arr[] = {4, 6, 7, 9};
		int temp;
		
		temp=arr[0];
		arr[0]=arr[3];// x= arr[0] and y= arr[1]
		arr[3]=temp;
		
		
		for (int value : arr) {
			if (value==7) {
				System.out.println(value);
			}
		}
		
		
		
	}
	
}
