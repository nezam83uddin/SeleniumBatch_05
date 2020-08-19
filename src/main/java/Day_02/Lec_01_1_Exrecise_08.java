package Day_02;

public class Lec_01_1_Exrecise_08 {

	public static void main(String[] args) {

		int i=0;
		for ( i = 0; i <=15; i++) {
			if (i==4) {
				break;
			}
		}
		String x=String.valueOf(i);
		if (x.contains("2")) {
			System.out.println("AAAA");
		} else if (x.contains("4")) {
			if (x.contains("2")) {
				System.out.println("BBBB");
			} else {
				System.out.println("CCCC");
			}
		} else if (x.contains("4")) {
			if (x.contains("4")) {
				System.out.println("DDDD");
				if (x.contains("4")) {
					System.out.println("EEEE");
					switch (x) {
					case "1":
						System.out.println("FFFF");
						break;
					case "4":
						if (x.contains("2")) {
							System.out.println("GGGG");
						} else {
							System.out.println("HHHH");
						}
						break;
					default:
						System.out.println("Nothing");
						break;
					}
				}
			}
		} else {
			System.out.println("IIII");
		}

		System.out.println("Bangladesh");
	}

}
