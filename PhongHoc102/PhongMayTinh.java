package PhongHoc102;

public class PhongMayTinh extends PhongHoc {
	
	private int soMayTinh;

	public int getSoMayTinh() {
		return soMayTinh;
	}

	public void setSoMayTinh(int soMayTinh) throws Exception {
		if (soMayTinh > 0) {
			this.soMayTinh = soMayTinh;
		}else {
			throw new Exception("Số máy tính > 0");
		}
	}
	
	public PhongMayTinh(String maP, String dayNha, float dienTich, int soBongDen,int soMayTinh) {
		super();
		this.soMayTinh = soMayTinh;
		
		
	}
	
	@Override
	public String toString () {
		return super.toString() + String.format("%20d", soMayTinh);
	}
	
	@Override
	public boolean datChuan() {
		return (duAnhSach() && (dienTich/soMayTinh >= 1.5f));
	}
}
