package Day_02;

public class Lec_01_1_Exrecise_06 {

	public static void main(String args[]) {

		String x = "4";
		if (x.contains("2")) {
			System.out.println("Dinajpur");
		} else if (x.contains("4")) {
			System.out.println("Korigram");
		} else if (x.contains("4")) {
			if (x.contains("2")) {
				System.out.println("Commila");
				if (x.contains("4")) {
					System.out.println("Feni");
					switch (x) {
					case "4":
						System.out.println("Feni");
						break;

					default:
						System.out.println("Nothing");
						break;
					}
				}
			}
		} else {
			System.out.println("Bangladesh");
		}
	}
}
