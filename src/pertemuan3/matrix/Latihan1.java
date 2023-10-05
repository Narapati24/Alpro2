package pertemuan3.matrix;

import java.util.Scanner;

public class Latihan1 {
	int[][] a,b,c;
	Scanner bc = new Scanner(System.in);
	
	void inisial(int baris, int kolom) {
		a = new int[baris][kolom];
		b = new int[baris][kolom];
		c = new int[baris][kolom];
	}
	
	void insert_nilai_matriks() {
		a[0][0] = bc.nextInt();
		a[0][1] = bc.nextInt();
		a[1][0] = bc.nextInt();
		a[1][1] = bc.nextInt();

		b[0][0] = bc.nextInt();
		b[0][1] = bc.nextInt();
		b[1][0] = bc.nextInt();
		b[1][1] = bc.nextInt();
	}
	
	void operasi_perkalian() {
		for (int index = 0; index < c.length; index++) {
            for (int index2 = 0; index2 < c[index].length; index2++) {
                c[index][index2] = 0;
                for (int index3 = 0; index3 < a[index].length; index3++) {
                    c[index][index2] += a[index][index3] * b[index3][index2];
                }
            }
        }
	}
	
	void operasi_tambahan() {
		for (int index = 0; index < c.length; index++) {
			for (int index2 = 0; index2 < c[index].length; index2++) {
				c[index][index2] = a[index][index2] + b[index][index2];
			}
		}
	}
	
	void operasi_pengurangan() {
		for (int index = 0; index < c.length; index++) {
			for (int index2 = 0; index2 < c[index].length; index2++) {
				c[index][index2] = a[index][index2] - b[index][index2];
			}
		}
	}
	
	void tampil() {
		for (int index = 0; index < c.length; index++) {
            System.out.print("|");
            for (int index2 = 0; index2 < c[index].length; index2++) {
                System.out.print(" " + c[index][index2] + " ");
            }
            System.out.println("|");
        }
	}
	
	public static void main(String[]args) {
		Latihan1 m = new Latihan1();
		m.inisial(2, 2);
		m.insert_nilai_matriks();
		m.operasi_perkalian();
		System.out.println("Perkalian:");
		m.tampil();
		m.operasi_tambahan();
		System.out.println("Pertambahan:");
		m.tampil();
		m.operasi_pengurangan();
		System.out.println("Pengurangan:");
		m.tampil();
	}
}
