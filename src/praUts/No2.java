package praUts;

import java.util.Scanner;

public class No2 {
	
static Karyawan [] arrKar = new Karyawan [10];
	
	public static void inputNilai() {
		Scanner sc = new Scanner (System.in);
		int id;
		String nama, jenis;
		int harga;
		
		for (int idx=0; idx < arrKar.length; idx++) {
			System.out.println("Masukan Barang ke-"+ (idx + 1));
			arrKar [idx] = new Karyawan();
			//inisalisasi setiap mengakses elemen array
			id= (idx + 1);
			System.out.print("Masukan Nama :");
			nama=sc.next();
			System.out.print("Masukan Jenis :");
			jenis=sc.next();
			System.out.print("Masukan Harga :");
			harga=sc.nextInt();
			
			arrKar[idx].inputNilai(id, nama, jenis, harga);
		}
	}
	public static void tampilNilai () {
		for (int idx=0; idx < arrKar.length; idx++) {
			System.out.println("Data Barang ke-"+(idx + 1));
			arrKar[idx].tampilNilai();
		}
	}
	public static void main(String[] args) {
		inputNilai();
		tampilNilai();
		
	}

}
