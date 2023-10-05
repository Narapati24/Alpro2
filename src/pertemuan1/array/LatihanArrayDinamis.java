package pertemuan1.array;

import java.util.Scanner;

public class LatihanArrayDinamis {
	
	public static Scanner sc = new Scanner(System.in);
	public static double [] arrNilai;
	
	public static void inputIndex() {
		System.out.println("Masukan Jumlah Index:");
		int index = sc.nextInt();
		arrNilai = new double [index];
	}
	
	public static void inputNilai() {
		for(int idx=0; idx < arrNilai.length; idx++) {
			System.out.println("Masukan Nilai Ke-"+idx);
			arrNilai[idx] = sc.nextDouble();
		}
	}
	
	public static void tampilNilai() {
		for(int idx=0; idx < arrNilai.length; idx++) {
			System.out.println(arrNilai[idx]);
		}
	}
	
	public static void main(String [] args) {
		inputIndex();
		inputNilai();
		tampilNilai();
	}
}
