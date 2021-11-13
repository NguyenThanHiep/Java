package GiaoDich102;


import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

	public class GiaoDich {
		
		private String maGD, ngayGD;
	    private long donGia;
	    private float dienTich;
	    Scanner scanner = new Scanner(System.in);
	     
	    public GiaoDich() {
	        super();
	    }
	 
	    public GiaoDich(String maGiaoDich, String ngayGiaoDich, long donGia, float dienTich) {
	        super();
	        this.maGD = maGD;
	        this.ngayGD = ngayGD;
	        this.donGia = donGia;
	        this.dienTich = dienTich;
	    }
	 
	    public String getMaGD() {
	        return maGD;
	    }
	 
	    public void setMaGiaoDich(String maGD) {
	        this.maGD = maGD;
	    }
	 
	    public String getNgayGD() {
	        return ngayGD;
	    }
	 
	    public void setNgayGD(String ngayGD) {
	        this.ngayGD = ngayGD;
	    }
	 
	    public long getDonGia() {
	        return donGia;
	    }
	 
	    public void setDonGia(long donGia) {
	        this.donGia = donGia;
	    }
	 
	    public float getDienTich() {
	        return dienTich;
	    }

	    public void nhap() {
	        System.out.print("Nhập mã giao dịch: ");
	        maGD = scanner.nextLine();
	        System.out.print("Nhập ngày giao dịch (ngày/tháng/năm): ");
	        ngayGD = scanner.nextLine();
	        System.out.print("Nhập đơn giá: ");
	        donGia = Long.parseLong(scanner.nextLine());
	        System.out.print("Nhập diện tích: ");
	        dienTich = Float.parseFloat(scanner.nextLine());
	    }
	    public void tieuDe(){
			System.out.println("\t\t\t CHƯƠNG TRÌNH QUẢN LÝ MUA BAN");
			for (int i = 0; i < 115; i++){
				System.out.printf("-");
			}
			System.out.println();
			System.out.printf("|%-12s|%-25s|%-30s|%-12s|\n", "Mã GD", "Ngày GD", "Đơn Giá", "Dientich");
			for (int i = 0; i < 115; i++){
				System.out.printf("-");
			}
			System.out.println();
		}
	    @Override
	    public String toString() {
	    	String s ="";
			SimpleDateFormat fd = new SimpleDateFormat("dd/MM/yyyy");
			DecimalFormat ft = new DecimalFormat("###,###.00 VND");
			System.out.println("\t\t\t CHƯƠNG TRÌNH QUẢN LÝ MUA BAN");
			for (int i = 0; i < 115; i++){
				System.out.printf("-");
			}
			System.out.println();
			System.out.printf("|%-12s|%-25s|%-30s|%-12s|\n", "Mã GD", "Ngày GD", "Đơn Giá", "Dientich");
			for (int i = 0; i < 115; i++){
				System.out.printf("-");
			}
			System.out.println();
			s+=s.format("|%-12s|%-25s|%-30s|%-12s|", getMaGD(),getNgayGD(),ft.format(getDonGia()), getDienTich() );
			return s;
	    }
	   

		
	

}
