package pertemuan1.array;

import java.util.Scanner;

public class LatihanArray1 {
/*
 * kita akan buat program array untuk menampung
 * nama mahasiswa, yang terdiri dari 5 nama
 * mahasiswa	
 */
	
	public static String [] arrNama = new String[5];
	
	public static void inputNilai () {
		Scanner sc = new Scanner(System.in);
		for (int idx=0; idx < arrNama.length; idx++) {
			System.out.println("Masukan nama ke-" + idx);
			arrNama[idx] = sc.nextLine();
		}
	}
	
	public static void tampilNilai() {
		for (int idx=0; idx < arrNama.length; idx++) {
			System.out.println(arrNama[idx]);
		}
	}
	
	public static void main(String [] args) {
		inputNilai();
		tampilNilai();
	}
}
