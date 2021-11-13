package QLxe;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Dangkyxe {

	
	private int maXe;
	
	private String tenXe;
	
	private String mauXe;
	
	private int phanKhoi;
	
	private String ngayDk;
	
	private  double giaXe;
	
	Scanner sc = new Scanner (System.in);

	public int getMaXe() {
		return maXe;
	}

	public void setMaXe(int maXe) {
		try {
			if(maXe > 0) {
				this.maXe = maXe;
			}
		} catch (Exception e) {
			System.out.println("Lối mã xe xin nhập lại.");
		}
	}

	public String getTenXe() {
		return tenXe;
	}

	public void setTenXe(String tenXe) {
		try {
			if(tenXe != null) {
				this.tenXe = tenXe;
			}
		} catch (NullPointerException e) {
			System.out.println("Xin nhập tên xe vào !!");
		}
	}

	public String getMauXe() {
		return mauXe;
	}

	public void setMauXe(String mauXe) {
		try {
			if(mauXe != null) {
				this.mauXe = mauXe;
			}
		} catch (Exception e) {
			System.out.println("Xin nhập màu xe vào !!");
		}
	}

	public int getPhanKhoi() {
		return phanKhoi;
	}

	public void setPhanKhoi(int phanKhoi) {
		try {
			if(phanKhoi >= 50) {
				this.phanKhoi = phanKhoi;
			}
		} catch (Exception e) {
			System.out.println("Xin nhập phân khối lớn hơn 50 !!");
		}
	}

	public String getNgayDk() {
		return ngayDk;
	}

	public void setNgayDk(String ngayDk) {
		this.ngayDk = ngayDk;
	}
	
	public double getGiaXe() {
		return giaXe;
	}

	public void setGiaXe(double giaXe) {
		try {
			if (giaXe > 0 ) {
				this.giaXe = giaXe;
			}
		} catch (Exception e) {
			System.out.println("Nhập lại giá xe!!");
		}
	}
	
	public Dangkyxe() {
		
	}
	public Dangkyxe (int maXe, String tenXe,String mauXe, int phanKhoi,String ngayDk, double giaXe ) {
		this.maXe = maXe;
		this.tenXe = tenXe;
		this.mauXe = mauXe;
		this.phanKhoi = phanKhoi;
		this.ngayDk = ngayDk;
		this.giaXe =giaXe;
	}
	
	 public void nhap() {
	        System.out.print("Nhập mã xe: ");
	        maXe = sc.nextInt();
	        System.out.println("Nhập tên xe: ");
	        tenXe = sc.next();
	        System.out.println("Nhập màu xe: ");
	        mauXe = sc.next();
	        System.out.println("Nhập phân khối: ");
	        phanKhoi = sc.nextInt();
	        System.out.print("Nhập ngày đăng ký (ngày/tháng/năm): ");
	        ngayDk = sc.next();
	        System.out.print("Nhập giá xe: ");
	        giaXe = sc.nextDouble();
	 }
	public void tieuDe() {
		System.out.println("\t\t CHƯƠNG TRÌNH QUẢN LÝ XE");
		
		for (int i = 0; i < 126; i++) {
			
			System.out.print("-");
		}
		System.out.println();
		
		System.out.printf("|%-12s|%-30s|%-15s|%-8s|%-12S|%-30s|\n","Mã Xe", "Tên xe","Màu xe", "Phân Khối","Ngày đăng ký","Giá xe");
		
		for (int i = 0; i < 126; i++) {
			
			System.out.print("-");
		}
		System.out.println();
	}
	
	@Override
	public String toString () {
		String s = "";
		
		DecimalFormat ft = new DecimalFormat("###,###.00 VND");
for (int i = 0; i < 126; i++) {
			
			System.out.print("-");
		}
		System.out.println();
		
		System.out.printf("|%-12s|%-30s|%-15s|%-12s|%-12S|%-30s|\n","Mã Xe", "Tên xe","Màu xe", "Phân Khối","Ngày đăng ký","Giá xe");
		
		
		s+=s.format("|%-12s|%-30s|%-15s|%-12s|%-12S|%-30s|\n",getMaXe(),getTenXe(),getMauXe(),getPhanKhoi(),getNgayDk(),ft.format(getGiaXe()));
		
		return s;
		
	}

	
}