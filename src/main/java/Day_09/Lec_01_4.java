package Day_09;

public class Lec_01_4 {

	public static void main(String[] args) {
		int [] arr = {1, 2, 3, 4};
		
		int i=0;
		for (int myArray : arr) {
			if (i!=0) {
				System.out.println(myArray);
			}
			
			i++;
		}
	}
	
}
