package PhongHoc102;

public class PhongThiNghiem extends PhongHoc{

	private String chuyenNganh;
	private int sucChua;
	private boolean coBonRua;
	public String getChuyenNganh() {
		return chuyenNganh;
	}
	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}
	public int getSucChua() {
		return sucChua;
	}
	public void setSucChua(int sucChua) {
		this.sucChua = sucChua;
	}
	public boolean isCoBonRua() {
		return coBonRua;
	}
	public void setCoBonRua(boolean coBonRua) {
		this.coBonRua = coBonRua;
	}
	
	public PhongThiNghiem(String maP, String dayNha, float dienTich, int soBongDen,String chuyenNganh, int sucChua, boolean coBonRua)throws Exception{
		super();
		this.chuyenNganh = chuyenNganh;
		this.sucChua = sucChua;
		this.coBonRua = coBonRua;
	}
	
	@Override
	public String toString() {
		String bonRua = (coBonRua) ? "Co bon rua" : "Khong co bon rua";
		return super.toString() + String.format("|%10s|%5d|%15s|", chuyenNganh, sucChua, bonRua);
	}
	
	@Override
	public boolean datChuan() {
		return (duAnhSach() && coBonRua);
	}
}
