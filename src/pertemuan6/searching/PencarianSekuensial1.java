package pertemuan6.searching;

import java.util.Scanner;

public class PencarianSekuensial1 {

	/*
	 * pencarian sequensial = pencarian terurut
	 * kita membandingkan nilai dari satu ke satu hingga
	 * ketemu
	 * syarat array harus sudah terurut
	 */
	
	static int [] arrNilai = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
	public static void cariNilai() {
		Scanner sc = new Scanner(System.in);
		int cari;
		System.out.print("Masukan nilai yang anda cari: ");
		cari = sc.nextInt();
		for(int i = 0; i < arrNilai.length; i++) {
			if(arrNilai[i] == cari) {
				System.out.println(arrNilai[i]);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		cariNilai();
	}
	
}
