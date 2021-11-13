package KhachHang102;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Collections;
	import java.util.Comparator;
	public class ListKH 
	{
		List<KhachHang> ls;
		public ListKH() 
		{
			ls= new ArrayList<KhachHang>(2);
		}
		
		public boolean themKH(KhachHang kh)
		{
			if (ls.contains(kh)) 
				return false;
			else
				return ls.add(kh);
		}
		
		public boolean xoaKH(String maKH)
		{
			for (KhachHang k : ls) 
			{
				if (k.getMaKH().equalsIgnoreCase(maKH)==true) 
				{
					ls.remove(k);
					return true;
				}
			}
				 return false;
		}
		public KhachHang timKH(String maKH) 
		{
			for (KhachHang k : ls)
			{
				if (k.getMaKH().equalsIgnoreCase(maKH)==true) 
				{
					return k;
				}
			}	
			return null;
		}
		
		public void sapXep() 
		{
			Collections.sort(ls, new Comparator<KhachHang>() 
			{
				@Override
				public int compare(KhachHang o1, KhachHang o2) 
				{
					String x= new String(o1.getMaKH());
					String y= new String(o2.getMaKH());
					return x.compareToIgnoreCase(y);
				}
			});
		}
		
			
		public boolean capNhatTenKH(String maKH, String hotenKH) 
		{
			KhachHang k=timKH(maKH);
			int viTri=-1;
			if (k!=null) 
			{
				if (k instanceof KhachHang) 
				{
					((KhachHang) k).setHoTenKH(hotenKH);
					viTri=ls.indexOf(k);
					ls.set(viTri, k);
					return true;
				}
			}
			return false; 
		}
		public void inKQ() 
		{
			for (KhachHang kh : ls) 
			{
				if (kh!=null)
				{
					System.out.println(kh);
				}
			}
		}
	}


