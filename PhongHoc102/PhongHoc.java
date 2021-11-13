package PhongHoc102;

public abstract class PhongHoc {
	protected String maP, dayNha;
	
	protected float dienTich;
	
	protected int soBongDen;
	
	public abstract boolean datChuan();

	public String getMaP() {
		return maP;
	}

	public void setMaP(String maP) throws Exception {
		if(maP != null) {
			throw new Exception("mã phong khác rỗng");
		}else {
			this.maP = maP;
		}
	}

	public String getDayNha() {
		return dayNha;
	}

	public void setDayNha(String dayNha) {
		this.dayNha = dayNha;
	}

	public float getDienTich() {
		return dienTich;
	}

	public void setDienTich(float dienTich) throws Exception {
		if(dienTich > 0 ) {
			this.dienTich = dienTich;
		}else {
			throw new Exception("Lối diện tích > 0 ");
		}
	}

	public int getSoBongDen() {
		return soBongDen;
	}

	public void setSoBongDen(int soBongDen) throws Exception{
		if(soBongDen <0) {
			throw new Exception("Số bóng đèn >0");
		}else {
			this.soBongDen = soBongDen;
		}
	}
	
	public PhongHoc() {
		super();
	}
	
	public PhongHoc(String maP, String dayNha, float dienTich, int soBongDen) {
		super();
		this.maP = maP;
		this.dayNha = dayNha;
		this.dienTich = dienTich;
		this.soBongDen = soBongDen;
	}
	
	public boolean duAnhSach() {
		return (dienTich/soBongDen <= 10);
	}
	
	@Override
	public String toString() {
		String phongHocChuan = (datChuan()) ? "Dat chuan" : "Khong dat chuan";
		return String.format("|%-7s|%-5s|%7.2f|%5d|%-25s|", maP,dayNha, dienTich,soBongDen, phongHocChuan );
		
	}
	@Override
	public boolean equals(Object obj) {
		return this.maP.equalsIgnoreCase(((PhongHoc)obj).maP);
	}
}
