package Day_06;

import java.util.ArrayList;

public class Lec_01_5 {
	
	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> r3 = new ArrayList<ArrayList<String>>();
		ArrayList<String> r0 = new ArrayList<String>();
		r0.add("1");
		r0.add("2");
		r0.add("3");
		ArrayList<String> r1 = new ArrayList<String>();
		r1.add("4");
		r1.add("5");
		r1.add("6");
		ArrayList<String> r2 = new ArrayList<String>();
		r2.add("7");
		r2.add("8");
		r2.add("9");
		
		r3.add(r0);
		r3.add(r1);
		r3.add(r2);
		
		
		for (ArrayList<String> Row : r3) {
			for (String col : Row) {
				System.out.print(col+ " ");
			}
			System.out.println();
		}
		
		
		
	}

}
