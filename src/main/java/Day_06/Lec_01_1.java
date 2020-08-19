package Day_06;

public class Lec_01_1 {
	
	public static void main(String[] args) {
		
//		Batch Name	Student Name	Course Name	Phone Number	Country
//		1	Sajib	Selenium	5714034587	Germany
//		2	Nafiz	Selenium	5714034587	Japan
//		3	Ridoy	Selenium	5714034587	Austria
//		4	Koly	Selenium	5714034587	UK
//		5	Tahim	Selenium	5714034587	Canada
//		6	Sabrin	Selenium	5714034587	Italy
//		7	Shohel	Selenium	5714034587	Italy
//		8	Ridoy	Java	5714034587	Canada

		
		
		String [][] data= {{"BN", "SN", "CN"},{"01", "Sa", "Se"},{"02", "Ko", "Ja"}};
		
		for (String[] Row : data) {
			for (String col : Row) {
				if (col.equals("Sa")) {
					System.out.println(col);
				}
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
}
