package pertemuan10.sort;

public class BubleSortString {
	public static String [] arrNama = {"Fauzan", "Yoga", "Vina", "Viane", "Daffa", "Yogi", "Adam", "Audi"};
	public static void setSort() {
		int loop, cek, next;
		String temp;
		for(loop = 0; loop < arrNama.length; loop++) {
			for(cek = 0; cek < (arrNama.length-(loop+1)); cek++) {
				next = cek + 1;
				if(arrNama[cek].compareToIgnoreCase(arrNama[next]) > 0) {
					temp = arrNama[cek];
					arrNama[cek] = arrNama[next];
					arrNama[next] = temp;
				}
			}
		}
	}
	public static void getArrNama() {
		for(int i = 0; i < arrNama.length; i++) {
			System.out.println(arrNama[i]);
		}
	}
	public static void main(String[]args) {
		setSort();
		getArrNama();
	}
}
