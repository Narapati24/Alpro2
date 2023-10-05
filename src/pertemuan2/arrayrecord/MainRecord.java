package pertemuan2.arrayrecord;

import java.util.Scanner;

public class MainRecord {
	public static void main(String [] args) {
		Motor moto = new Motor();
		Scanner sc = new Scanner(System.in);
		String id, merk, jenis, cc;
		int harga;
		
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
		moto.inputNilai(id, merk, jenis, cc, harga);
		
		System.out.println("Merk Motor: " + moto.tampilMerk());
		System.out.println("Jenis Motor: " + moto.tampilJenis());
		System.out.println("CC Motor: " + moto.tampilCc());
		System.out.println("Harga Motor: " + moto.tampilHarga());
	}
}
