package GiangHangThucPham;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
public class HangThucPham {

	private int maHang;
	private String tenHang;
	private double donGia;
	private Date nSX, hSD;
	
	public int getMaHang(){
		return maHang;
	}
	public void setMaHang (int maHang){
		this.maHang = maHang;
	}
	
	public String getTenHang(){
		return tenHang;
	}
	public void setTenHang (String tenHang){
		this.tenHang = tenHang;
	}
	
	public double getDonGia (){
		return donGia;
	}
	public void setDonGia (double donGia){
		this.donGia = donGia;
	}
	
	public Date getnSX(){
		return nSX;
	}
	public void setnSX (Date nSX){
		this.nSX = nSX;
	}
	
	public Date gethSD(){
		return hSD;
	}
	public void sethSD (Date hSD){
		this.hSD = hSD;
	}
	
	public HangThucPham (){
		
	}
	public HangThucPham (int maHang, String tenHang, double donGia, Date nSX, Date hSD){
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.nSX = nSX;
		this.hSD = hSD;
	}
	
	public void setNSX (int year,  int month, int day){
		Calendar ngaySX = Calendar.getInstance();
		ngaySX.set(year, month - 1, day);
		this.nSX = ngaySX.getTime();
	}
	
	public void setHSD (int year, int month, int day){
		Calendar ngayHSD = Calendar.getInstance();
		ngayHSD.set(year, month - 1, day);
		this.hSD = ngayHSD.getTime();
	}
	
	public boolean kiemTranTenHang(boolean kt){
		if (this.tenHang == " " || this.tenHang.isEmpty()){
			System.out.println("Tên hàng không được để trống: ");
		}else {
			kt = false;
		}
		return kt;
	}
	
	public boolean kiemTraNgay (boolean kt){
		if(this.getnSX().compareTo(this.gethSD()) < 0){
			kt = false;
		}else {
			System.out.println("Ngày hết hạn không đc nhỏ hơn ngày sản xuất: ");
		}
		return kt;
	}
	
	public boolean testHSD(){
		Date ngayHT = new Date();
		ngayHT.getTime();
		SimpleDateFormat fn = new SimpleDateFormat("dd/MM/yyyy");
		String st = fn.format(ngayHT);
		if (this.gethSD().compareTo(ngayHT) < 0){
			return false;
		}else {
			return true;
		}
	}
	
	public void tieuDe(){
		System.out.println("\t\t\tCHƯƠNG TRÌNH HÀNG THỰC PHẨM\n");
		for (int i = 0; i < 94; i++){
			System.out.printf("-");
		}
		System.out.println();
		System.out.printf("|%-12s|%-30s|%-12s|%-12s|%-12s|%-12s|\n","Mã Hàng", "Tên Hàng", "Đơn Giá", "Ngày SX", "Ngày HH", "Trạng Thái");
		for (int i = 0; i < 94; i++){
			System.out.printf("-");
		}
		System.out.println();
	}
	@Override
	public String toString (){
		Locale localeVN = new Locale("vi", "VN");
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeVN);
		String str = numberFormat.format(donGia);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String str1 = simpleDateFormat.format(nSX);
		String str2 = simpleDateFormat.format(hSD);
		String tt = " ";
		
		if (testHSD() == true){
			tt = "Còn hạn";
		}else {
			tt = "Hết hạn";
		}
		String s = " ";
		s+=s.format("|%-12s|%-30s|%-12s|%-12s|%-12s|%-12s|",getMaHang(),getTenHang(),str,str1,str2,tt);
		return s;
		
	}
}
