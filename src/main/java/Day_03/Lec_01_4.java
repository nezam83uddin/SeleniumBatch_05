package Day_03;

public class Lec_01_4 {
	
	public static void main(String[] args) {
		int [][] s= {{1,2,3},{4,5,6}, {7,8,9}};
//		System.out.println(s.length);
//		System.out.println(s[0].length);
		
		for (int row = 0; row < s.length; row++) {
			for (int col = 0; col < s[0].length; col++) {
				System.out.print(s[row][col]+" ");
			}
			
			System.out.println();
		}
	}

}
