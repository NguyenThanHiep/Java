package SinhVien102;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class testsv {

	  public static void main(String[] args) throws Exception {
	    
		  SinhVien cd = new SinhVien();
			SinhVien d1 = new SinhVien();
			SinhVien d2 = new SinhVien();
			SinhVien d3 = new SinhVien();
			SinhVien d4 = new SinhVien();
			Listsv ls= new Listsv(4);
			ls.themSV(d1);
			ls.themSV(d2);
			ls.themSV(d3);
			ls.themSV(d4);
			ls.inKetQua();
			System.out.println("Số sinh viên là: "+ ls.demSV());
	     }
}
