package Day_04;

import java.util.ArrayList;

public class Lec_01_5 {
	
	public static void main(String[] args) {
		
		
		// Array Multiple variable
		ArrayList<String> list= new ArrayList<String>();
		list.add("Rashed");
		list.add("Rashed");
		list.add("forhad");
		list.add("tuhin");
		
		System.out.println(list.size());
		
		
		for (int i = 0; i <= list.size()-1; i++) {
			if (list.get(i).equals("forhad")) {
				System.out.println(list.get(i));
			}
			
		}
		
		
		
		
		
		
		
	}
	

}
