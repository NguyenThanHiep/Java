package KhachHang102;

	import java.util.Calendar;
	import java.text.DecimalFormat;
	import java.text.SimpleDateFormat;
	import java.util.Scanner;

	public abstract class KhachHang 
	{
		protected String maKH;
		
		protected static String hotenKH;
		
		protected Calendar ngaylapHD;
		
		protected double donGia, soKW;
		
		public String getMaKH() 
		{
			return maKH;
		}
		public void setMaKH(String maKH) 
		{
			this.maKH = maKH;
		}
		
		public String getHoTenKH() 
		{
			return hotenKH;
		}
		public void setHoTenKH(String hotenKH) 
		{
				this.hotenKH = hotenKH;
		}
		
		public Calendar getNgaylapHD() 
		{
			return ngaylapHD;
		}
		public void setNgaylapHD(Calendar ngaylapHD) 
		{
			this.ngaylapHD = ngaylapHD;
		}
		public double getDonGia() 
		{
			return donGia;
		}
		public void setDonGia(double donGia) 
		{
			this.donGia = donGia;
		}
		public double getSoKW() 
		{
			return soKW;
		}
		public void setSoKW(double kW) 
		{
			this.soKW = soKW;
		}
		
		public KhachHang()
		{
			
		}
		
		public KhachHang(String maKH, String hotenKH, Calendar ngaylapHD, double donGia, double soKW) 
		{	
			this.maKH = maKH;
			
			this.hotenKH = hotenKH;
			
			this.ngaylapHD = ngaylapHD;
			
			this.donGia = donGia;
			
			this.soKW = soKW;
		}
		
		public abstract double getThanhTien();
		
		public SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
		
		public DecimalFormat decimal = new DecimalFormat("#,###.00 VND");
		
		public void tieuDeNN()
		{
			for(int i=0; i<125; i++)
				System.out.print("_");
			System.out.println();
			
			System.out.printf("|%-14s|%-25s|%-16s|%-15s|%-10s|%-10s|%-15s|\n", "Ma khach Hang", "Ten khach hang",
					"Ngay lap hop dong", "Don gia","So Kw","Quoc tich","Thanh tien");
			
			for(int i=0; i<125; i++)
				System.out.print("-");
			System.out.println();
		}
		public void tieuDeVN()
		{
			for(int i=0; i<125; i++)
				System.out.print("_");
			System.out.println();
			
			System.out.printf("||%-14s|%-25s|%-16s|%-15s|%-10s|%-10s|%-15s||\n", "Ma khach Hang", "Ten khach hang",
					"Ngay lap hop dong", "Don gia","So Kw","Doi tuong","Thanh tien");
			
			for(int i=0; i<125; i++)
				System.out.print("-");
			System.out.println();
		}
		
		public String toString() 
		{
			String s="";
			SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
			
			DecimalFormat dec = new DecimalFormat("#,###.00 VND");
			
			s+=s.format("||%-14s|%-25s|%-15s|%-10s||%-15s||",
					getMaKH(), getHoTenKH(), getDonGia(), getSoKW(), dec.format(getThanhTien()));
			return s;
		}	

}
