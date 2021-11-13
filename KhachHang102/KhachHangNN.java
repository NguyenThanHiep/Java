package KhachHang102;


	import java.util.Calendar;

	public class KhachHangNN extends KhachHang 
	{
		private String quocTich;

		public String getQuocTich() 
		{
			return quocTich;
		}
		
		public void setQuocTich(String quocTich) 
		{
			this.quocTich = quocTich;
		}
		
		public KhachHangNN()
		{
			
		}
		

		public KhachHangNN(String maKH, String hoTenKH, Calendar ngayLapHD, double donGia, double soKW,String qtnn)
		{
			super(maKH, hoTenKH, ngayLapHD, donGia, soKW);
			this.quocTich=qtnn;
		}
		
		@Override
		public double getThanhTien() 
		{
			return getSoKW()*getDonGia();
		}
		@Override
		public String toString() 
		{
			String s1="", s2="";
			s1=s1.format("%-10s|",getQuocTich());
			
			s2=s2.format("%15s]",super.date.format(getThanhTien()));
			
			return super.toString()+s1+s2;
		}
	
}
