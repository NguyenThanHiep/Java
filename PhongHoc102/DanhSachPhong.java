package PhongHoc102;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DanhSachPhong {

	List<PhongHoc> ls;
	
	public DanhSachPhong() {
		ls = new ArrayList<PhongHoc>();
	}
	public boolean themPhong(PhongHoc ph) {
		if (ls.contains(ph)) {
			return false;
		}else {
			return ls.add(ph);
		}
	}
	public void inDanhSanhPhong() {
		for (PhongHoc ph : ls) {
			if(ph != null) {
				System.out.println(ph);
			}
		}
	}
	
	public void sapXep() {
		Collections.sort(ls, new Comparator<PhongHoc>() {

			@Override
			public int compare(PhongHoc ph1, PhongHoc ph2) {
				String x = new String(ph1.getMaP());
				String y = new String(ph2.getMaP());
				return x.compareToIgnoreCase(y);
			}
			
			 
		});
	}
	
	public void xuatDanhSachPhongLyThuyetMayChieu() {
		for(PhongHoc ph : ls)
			if(ph instanceof PhongLyThuyet) {
				PhongLyThuyet p = (PhongLyThuyet)ph;
				if(p.isCoMayChieu()) {
					System.out.println(ph);
				}
			}
	}
	
	public boolean xoaPhongHoc(String maP) {
		for(PhongHoc ph : ls ) {
			if(ph.getMaP().equalsIgnoreCase(maP)) {
				ls.remove(ph);
			}
		}
		return false;
	}
	
	public void inPhongMayTinhTren60() {
		for(PhongHoc ph : ls) {
			if (ph instanceof PhongMayTinh && ((PhongMayTinh)ph).getSoMayTinh() >= 60)
				System.out.println(ph);
		}
	}
	
	public int tongSoPhongHoc() {
		int tong = 0;
		for(PhongHoc ph : ls) {
			if(ph != null)
				tong = tong +1;
			
		}
		return tong;
	}
	
	public PhongHoc timkiem(String maP) {
		for (PhongHoc ph : ls)
			if(ph.getMaP().equalsIgnoreCase(maP))
				return ph;
		return null;
	}
	
	public void dsPhongDatChuan() {
		for (PhongHoc ph : ls)
			if(ph.datChuan())
				System.out.println(ph);
	}
	
	public void sapXepDayNha() {
		Collections.sort(ls, new Comparator<PhongHoc>() {

			@Override
			public int compare(PhongHoc o1, PhongHoc o2) {
				
				return o1.getDayNha().compareToIgnoreCase(o2.getDayNha());
			}
		});
	}
	
	public void sapXepDienTich() {
		Collections.sort(ls,new Comparator<PhongHoc>() {

			@Override
			public int compare(PhongHoc o1, PhongHoc o2) {
				Float f1 = new Float(o1.getDienTich());
				Float f2 = new Float(o2.getDienTich()); 
				return f1.compareTo(f2);
			}
		});
	}
	
	public void sapXepTheoBongDen() {
		Collections.sort(ls, new Comparator<PhongHoc>() {

			@Override
			public int compare(PhongHoc o1, PhongHoc o2) {
				Integer b1 = new Integer(o1.getSoBongDen());
				Integer b2 = new Integer(o2.getSoBongDen());
				return b1.compareTo(b2);
			}
		});
	}
	
	public boolean capNhatSoMay(String maP, int soMay)throws Exception{
		for(PhongHoc ph :ls)
			if(maP.equalsIgnoreCase(ph.getMaP()) && ph instanceof PhongMayTinh) {
				((PhongMayTinh)ph).setSoMayTinh(soMay);
				return true;
			}
		return false;
	}
	
	public boolean capNhatSoBDen(String maP, int soBDen) throws Exception{
		for(PhongHoc ph : ls)
			if(maP.equalsIgnoreCase(ph.getMaP())) {
				ph.setSoBongDen(soBDen);
				return true;
			}
		return false;
	}
	
}

