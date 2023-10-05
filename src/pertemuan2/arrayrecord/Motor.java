package pertemuan2.arrayrecord;

public class Motor {
	
	/*
	 * kelas record yang mewakili suatu objek
	 * 
	 * atribut :
	 * id
	 * merk
	 * jenis
	 * cc
	 * harga
	 * atribut menjadi variable
	 */
	
//	field adalah variable global yang bersifat private
//	private itu tidak bisa diakses langsung oleh kelas lain
	
	private String sId, sMerk, sJenis, sCc;
	private int iHarga;
	
	public void inputNilai(String id, String merk, String jenis, String cc, int harga) {
		sId = id;
		sMerk = merk;
		sJenis = jenis;
		sCc = cc;
		iHarga = harga;
	}
	
	public String tampilId() {
		return sId;
	}
	
	public String tampilMerk() {
		return sMerk;
	}
	
	public String tampilJenis() {
		return sJenis;
	}
	
	public String tampilCc() {
		return sCc;
	}
	
	public int tampilHarga() {
		return iHarga;
	}
}
