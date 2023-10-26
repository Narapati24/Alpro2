package praUts;

public class No1 {
		public static String[][] arrNilai = new String[5][5];

		public static void getNilai() {
			for(int i = 0; i < arrNilai.length; i++) {
				for(int o = 0; o < arrNilai[0].length; o++) {
					System.out.print(o == 2 && i == 2 ? "x" : "+");
				}
				System.out.println();
			}
		}
		
		public static void main(String[] args) {
			getNilai();
		}
	}
