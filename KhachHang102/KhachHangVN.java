package KhachHang102;
	import java.util.Calendar;

	public class KhachHangVN extends KhachHang
	{
		protected String doiTuong;
		
		final double DMSH=50, DMKD=100, DMSX=200;
		
		public String getDoiTuong() 
		{
			return doiTuong;
		}
		
		public void setDoiTuong(String doiTuong) 
		{
			this.doiTuong = doiTuong;
		}
		public KhachHangVN() 
		{
			
		}
		
		public KhachHangVN(String maKH, String hoTenKH, Calendar ngayLapHD, double donGia, double soKW,String dtvn)
		{
			super(maKH, hotenKH, ngayLapHD, donGia, soKW);
			this.doiTuong=dtvn;
		}
		
		@Override
		public double getThanhTien() 
		{
			double tt=0;
			
			if (getDoiTuong()=="San xuat")
				
				if(getSoKW()>=DMSX)
					
					tt=getDonGia()*DMSX+(getSoKW()-DMSX)*getDonGia()*2.5;
				else
					
					tt=getDonGia()*getSoKW();
			
			if (getDoiTuong()=="Kinh doanh")
				
				if(getSoKW()>=DMKD)
					
					tt=getDonGia()*DMSX+(getSoKW()-DMKD)*getDonGia()*2.5; 
			
			return tt;
		}
	}
