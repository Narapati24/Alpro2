package pertemuan2.arrayrecord;

import java.util.Scanner;

public class MainArrayRecord {

	/*
	 * buatlah program terkait array of record dari kelas motor,
	 * dimana jumlah motor yang dikelola sebanyak 5 motor.
	 * buatlah prosedur untuk menginputkan nilai ke dalam array
	 * dan prosedur untuk menampilkan nilai dari array tersebut
	 */
	
	static Motor [] arrMotor = new Motor [5];
	
	public static void inputNilai() {
		Scanner sc = new Scanner(System.in);
		String id, merk, jenis, cc;
		int harga;
		
		for (int idx = 0; idx < arrMotor.length; idx++) {
			System.out.println("Motor Ke: " + (idx + 1));
			arrMotor[idx] = new Motor();
			
			System.out.print("Masukan ID :");
			id = sc.next();
			System.out.print("Masukan MERK :");
			merk = sc.next();
			System.out.print("Masukan Jenis :");
			jenis = sc.next();
			System.out.print("Masukan CC :");
			cc = sc.next();
			System.out.print("Masukan Harga :");
			harga = sc.nextInt();
			arrMotor[idx].inputNilai(id, merk, jenis, cc, harga);
			System.out.println();
		}
	}
	
	public static void tampilNilai() {
		for (int idx = 0; idx < arrMotor.length; idx++) {
			System.out.println("Merek: " + arrMotor[idx].tampilMerk());
			System.out.println("Jenis: " + arrMotor[idx].tampilJenis());
			System.out.println("Harga: " + arrMotor[idx].tampilHarga());
		}
	}
	
	public static void main(String [] args) {
		inputNilai();
		tampilNilai();
	}
	
}
