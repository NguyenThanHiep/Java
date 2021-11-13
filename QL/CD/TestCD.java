package QL.CD;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestCD {

	
	
		public static void main(String[] args) throws Exception 
		{
			CD cd = new CD();
			cd.tieuDe(); 
			String ngayS="7/9/2021";
			SimpleDateFormat df= new SimpleDateFormat("dd/MM/yyyy");
			DecimalFormat dt = new DecimalFormat("###,###.00 VND");
			Date ngayPH=null;
			ngayPH=df.parse(ngayS);
			CD d1 = new CD(111111, "test1", "test1", ngayPH, 10, 90000);
			CD d2 = new CD(222222, "test2", "test2", ngayPH, 9, 70000);
			CD d3 = new CD(333333, "test2", "test2", ngayPH, 9, 70000);
			CD d4 = new CD(444444, "test2", "test2", ngayPH, 9, 70000);
			ListCD ls= new ListCD(4);
			ls.themCD(d1);
			ls.themCD(d2);
			ls.themCD(d3);
			ls.themCD(d4);
			ls.inKetQua();
			System.out.println("So CD phat hanh la: "+ ls.demCD());
			System.out.println("Tong tien cac CD la: "+ dt.format(ls.thanhTien()));
		}
	

}
