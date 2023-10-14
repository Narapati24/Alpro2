package pertemuan5.matrix;

import java.util.Scanner;

public class LatihanMatrix1 {
	
	/*
	 * Matrix adalah array multidimensi
	 */
	public static int [][] matrix = new int[5][5];
	
	public static void setNilai() {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < matrix.length; i++) {
			for(int u = 0; u < matrix[i].length; u++) {
				System.out.print("Matrix [" + i + "][" + u + "]: ");
				matrix[i][u] = sc.nextInt();
			}
		}
	}
	
	public static void getNilai() {
		for(int i = 0; i < matrix.length; i++) {
			for(int u = 0; u < matrix[i].length; u++) {
				System.out.print(" | " +matrix[i][u]);
			}
			System.out.print(" |\n");
		}
	}
	
	public static void main(String[] args) {
		setNilai();
		getNilai();
	}
	
}
