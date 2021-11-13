package QL.CD;


	import java.text.DecimalFormat;
	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.Date;

	public class CD 
	{	
		private int maCD;
		private String tuaCD;
		private String caSy;
		private Date ngayPH;
		private int soBH;
		private double giaThanh;
		
		public int getMaCD() 
		{
			return maCD;
		}
		public void setMaCD(int maCD) 
		{
			this.maCD = maCD;
		}
		public String getTuaCD() 
		{
			return tuaCD;
		}
		public void setTuaCD(String tuaCD) 
		{
			this.tuaCD = tuaCD;
		}
		public String getCaSy() 
		{
			return caSy;
		}
		public void setCaSy(String caSy)
		{
			this.caSy = caSy;
		}
		public Date getNgayPH() {
			return ngayPH;
		}
		public void setNgayPH(Date ngayPH) 
		{
			this.ngayPH = ngayPH;
		}
		public int getSoBH() 
		{
			return soBH;
		}
		public void setSoBH(int sb) 
		{
			try 
			{
				if (sb>0) 
				{
					this.soBH = sb;
				} 
			}
			catch (Exception e) 
			{
				System.out.println("sb>0");
			}
		}
		public double getGiaThanh() 
		{
			return giaThanh;
		}
		
		public void setGiaThanh(double g) 
		{
			if (g>0) 
			{
				this.giaThanh = g;
			}
			else 
			{
				System.out.println("Gia thanh >0");
			}
		}
		public CD(int maCD, String tuaCD, String caSy, Date ngayPH, int soBH, double giaThanh)
		{	
			this.maCD = maCD;
			this.tuaCD = tuaCD;
			this.caSy = caSy;
			this.ngayPH = ngayPH;
			this.soBH = soBH;
			this.giaThanh = giaThanh;
		}
		
		public CD() 
		{
			
		}
		
		public void tieuDe() 
		{
			System.out.println("\t\t\t Chuong Trinh Quan Li Dia CD");
			for (int i = 0; i < 126; i++) 
			{
				System.out.print("_");
			}
			System.out.println();
			System.out.printf("||%-12s|%-25s| %-35s|%-15s|%-15s|%-15s||\n", 
								"Ma CD", "Tua CD", "Ca sy", "Ngay phat hanh", 
								"So bai hat", "Gia thanh");
			for (int i = 0; i < 126; i++) 
			{
				System.out.print("-");
			}
			System.out.println();
		}
			
	@Override
		public String toString() 
		{
			String s="";
			SimpleDateFormat fd= new SimpleDateFormat("dd/MM/yyyy");
			DecimalFormat ft = new DecimalFormat("###,###.00 VND");
			s+=s.format("||%-12s|%-25s| %-35s|%15s| %15s| %12s||",
			getMaCD(), getTuaCD(), getCaSy(),
			fd.format(getNgayPH().getTime()),getSoBH(),ft.format(getGiaThanh()));
			return s;
		}
	}
		
