package Day_06;

import java.util.ArrayList;
import java.util.HashSet;

public class Lec_01_3 {

	public static void main(String[] args) {

//*****************************************************************	
		/**
		 * Normal Single
		 */

		String arr0 = new String();
		;
		arr0 = "Nafiz";
//		System.out.println(arr0);

//*****************************************************************

		/**
		 * Array More than one value
		 */

		try {
			String[] arr1 = new String[4];
			arr1[0] = "Nafiz";
			arr1[1] = "Liton";
			arr1[2] = "Koly";
			arr1[3] = "Sabrin";

//****************************************
			int count = 0;
			for (String data : arr1) {
				if (count != 0) {
//			System.out.println(data);
				}
				count++;
			}

			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i].equals("Liton")) { //
//			System.out.println(arr1[i]);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

//*****************************************************************
		/**
		 * ArrayList More than one value
		 */

//		arr1[0]="Nafiz";  
//		arr1[1]="Liton";
//		arr1[2]="Koly";
//		arr1[3]="Sabrin";// Add

		HashSet<String> row_0 = new HashSet<String>();

		row_0.add("Nafiz");
		row_0.add("Liton");
		row_0.add("Ridoy");
		row_0.add("Koly");
		
		
		
		
		for (String list : row_0) {
			System.out.println(list);
		}

	}

}
