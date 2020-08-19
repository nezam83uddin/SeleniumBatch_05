package Day_02;

public class Lec_01_1_Exrecise_07 {
	public static void main(String[] args) {


		String x = "4";
		if (x.contains("2")) {
			System.out.println("Dinajpur");
		} else if (x.contains("4")) {
			if (x.contains("2")) {
				System.out.println("K");
			} else {
				System.out.println("R");
			}
		} else if (x.contains("4")) {
			if (x.contains("4")) {
				System.out.println("Commila");
				if (x.contains("4")) {
					switch (x) {
					case "1":
						System.out.println("a");
						break;
					case "2":
						System.out.println("b");
						break;
					case "3":
						System.out.println("c");
						break;
					case "4":
						if (x.contains("2")) {
							System.out.println("d");
						} else {
							System.out.println("e");
						}
						break;
					default:
						System.out.println("Nothing");
						break;
					}
				}
			}
		} else {
			System.out.println("Dhaka");
		}

		System.out.println("Bangladesh");
	
	}

}
