package pertemuan5.matrix;

public class LatihanMatrix2 {

	public static String[][] matrix = new String[5][5];
	
	public static void setInput() {
		int n = matrix.length; // Menentukan ukuran matriks, asumsikan matriks persegi
		for (int baris = 0; baris < n; baris++) {
		    for (int kolom = 0; kolom < n; kolom++) {
		    	matrix[baris][kolom] = (baris == kolom || baris + kolom == n - 1) ? "X" : "1";
		    }
		}

	}
	
	public static void getInput() {
		for(int i = 0; i < matrix.length; i++) {
			for(int u = 0; u < matrix[i].length; u++) {
				System.out.print(" | " +matrix[i][u]);
			}
			System.out.print(" |\n");
		}
	}
	
	public static void main(String[] args) {
		setInput();
		getInput();
	}
	
}
