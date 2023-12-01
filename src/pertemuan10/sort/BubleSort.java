package pertemuan10.sort;

public class BubleSort {
	public static int [] arrNilai = {64, 21, 88, 1, 20, 12, 70, 46, 33, 51, 99};
	
	public static void setSort() {
		int loop, cek, temp, next;
		for(loop = 0; loop < arrNilai.length; loop++) {
			for(cek = 0; cek < (arrNilai.length-(loop+1));cek++){
				next = cek + 1;
				if(arrNilai[cek] > arrNilai[next]) {
					temp = arrNilai[cek];
					arrNilai[cek] = arrNilai[next];
					arrNilai[next] = temp;
				}
			}
		}
	}
	
	public static void getArrNilai() {
		for(int i = 0; i < arrNilai.length; i++) {
			System.out.println(arrNilai[i]);
		}
	}
	public static void main(String[]args) {
		setSort();
		getArrNilai();
	}
}
