package pertemuan6.searching;

import java.util.Scanner;

public class PencarianBinary1 {
	
	static int [] arrNilai = {14, 23, 38, 47, 56, 66, 70,84};
	
	public static void cariNilai(int x) {
		int awal = 0;
		int akhir = arrNilai.length - 1;
		String pesan = "tidak ditemukan";
		while (awal <= akhir) {
			int tengah = (awal + akhir) / 2;
			
			if (arrNilai[tengah] == x) {
				pesan = "Ditemukan";
				break;
			}
			else if (arrNilai[tengah] < x) awal = tengah + 1;
			else if(arrNilai[tengah] > x) akhir = tengah - 1;
		}
		System.out.println(pesan);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Cari data: ");
		int x = sc.nextInt();
		cariNilai(x);
	}
}
