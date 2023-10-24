package fit.iuh;

public class SanPham {
	private int id;
	private String tenSP;
	private float donGia;
	
	public SanPham(int id, String tenSP, float donGia) {
		this.id = id;
		this.tenSP = tenSP;
		this.donGia = donGia;
	}
	
	public SanPham(String tenSP, float donGia) {
		this.tenSP = tenSP;
		this.donGia = donGia;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public float getDonGia() {
		return donGia;
	}
	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}
	@Override
	public String toString() {
		return "SanPham [id=" + id + ", tenSP=" + tenSP + ", donGia=" + donGia + "]";
	}
}
