package praUts;

import java.util.Scanner;

public class No3 {
	public static String [] arrNama = new String [10];

	public static void inputNama () {
		Scanner sc = new Scanner (System.in);
		for(int idx=0; idx < arrNama.length ; idx++) {
			System.out.println("Masukan nama ke-" + (idx + 1));
			arrNama[idx] = sc.nextLine();
		}
	}
	public static void cariNama () {
		Scanner sc = new Scanner(System.in);
		String cari;
		String pesan = "Tidak ditemukan";
		System.out.print("Masukan nama yang anda cari :");
		cari = sc.nextLine();
		
		//Proses melihat (mengakses elemen satu persatu)
		for (int idx=0;idx<arrNama.length;idx++) {
			//proses membandingkan (Nilai elemen dengan nilai cari)
			if(arrNama[idx].equalsIgnoreCase(cari)) {
				//proses memutuskan
				pesan = "Ditemukan";
				break;
			}
			
		}
		System.out.println(pesan);
	}
	
	
	public static void main(String[] args) {
		inputNama();
		cariNama();
	}
}
