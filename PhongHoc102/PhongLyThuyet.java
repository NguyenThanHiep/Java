package PhongHoc102;

public class PhongLyThuyet extends PhongHoc{

	private boolean coMayChieu;
	 
	public boolean datChuan() {
		return (duAnhSach() && coMayChieu);
	}
	
	public boolean isCoMayChieu() {
		return coMayChieu;
	}
	
	public void setCoMayChieu(boolean coMayChieu) {
		this.coMayChieu = coMayChieu;
	}
	
	public PhongLyThuyet(String maP, String dayNha, float dienTich, int soBongDen, boolean coMayChieu) {
		super(maP, dayNha, dienTich, soBongDen);
		this.coMayChieu = coMayChieu;
	}
	
	@Override
	public String toString() {
		String mayChieu = (coMayChieu) ? "Co may chieu" : "Khong co may chieu";
		return super.toString() + String.format("%20s", mayChieu);
	}
}
