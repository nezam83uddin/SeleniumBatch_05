package Day_07;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Lec_01_1 {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Sajib");
		map.put(2, "Rajib");
		map.put(3, "Koly");
		map.put(4, "Sabrin");
		map.put(5, "Nafiz");
		map.put(6, "Sohel");
		
		
		
		
		for (Entry<Integer, String> ma : map.entrySet()) {
			System.out.println(ma.getKey());
		}
		
		
	
		 
		for ( Map.Entry obj : map.entrySet() ) {
			System.out.println(obj.getKey() + " : " + obj.getValue());
		}
		
	
	}

}
