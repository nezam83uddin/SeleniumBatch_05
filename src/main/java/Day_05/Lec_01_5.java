package Day_05;

import java.util.ArrayList;

public class Lec_01_5 {

	public static void main(String[] args) {

		ArrayList<ArrayList<String>> row_3 = new ArrayList<ArrayList<String>>();

		ArrayList<String> row_0 = new ArrayList<String>();
		row_0.add("Liton");
		row_0.add("Ridoy");
		row_0.add("Koly");

		ArrayList<String> row_1 = new ArrayList<String>();
		row_1.add("Liton");
		row_1.add("Ridoy");
		row_1.add("Koly");

		ArrayList<String> row_2 = new ArrayList<String>();
		row_2.add("Liton");
		row_2.add("Ridoy");
		row_2.add("Koly");

		row_3.add(row_0);
		row_3.add(row_1);
		row_3.add(row_2);

		int count = 0;
		for (ArrayList<String> Row : row_3) {
			if (count != 0) {
				for (String col : Row) {
					System.out.print(col + " ");
				}
			}
			System.out.println();
			count++;
		}

	}
}
