package democ1;

import java.text.DecimalFormat;

public class demo {
	 private int maHoa;
	 
	 private String tenHoa;
	 
	 private int soLuong;
	 
	 private double giaThanh;
	 
	 
	 public void setMaHoa(int maHoa) {
		 
		 try {
			if (maHoa > 0) {
				
				this.maHoa = maHoa;
				
			}
		} catch (Exception e) {
			
			System.out.println("Mã hoa sai");
			
		}
	 }
	 public int getMaHoa() {
		 
		 return this.maHoa;
	 }
	 
	 public void setTenHoa(String tenHoa) {
		 
		 try {
			if(tenHoa != null) {
				
				this.tenHoa = tenHoa;
				
			}
		} catch (Exception e) {
			
			System.out.println("Tên hoa còn thiếu");
		}
	 }
	 public String getTenHoa() {
		 
		 return this.tenHoa;
		 
	 }
	 
	 public void setSoluong (int soLuong) {
		 
		 if (soLuong > 0) {
			 
			 this.soLuong = soLuong;
			 
		 }else {
			 
			 System.out.println("Không còn hàng");
		 }
	 }
	 public int getSoluong() {
		 
		 return this.soLuong = soLuong;
	 }
	 
	 public void setGiaThanh(double giaThanh) {
		 
		 this.giaThanh = giaThanh;
	 }
	 public double getGiaThanh() {
		 
		 return this.giaThanh;
		 
	 }
	 
	 public demo() {
		 
	 }
	 public demo(int maHoa, String tenHoa, int soLuong, double giaThanh ) {
		 
		 this.maHoa = maHoa;
		 this.tenHoa = tenHoa;
		 this.soLuong = soLuong;
		 this.giaThanh = giaThanh;
	 }
	 
	 public void tieuDe() {
		 System.out.println("\t\t\tCHƯƠNG TRÌNH BÁN HOA\n");
		 for (int i = 0 ; i < 90; i++) {
			 System.out.printf("-");
		 }
		 System.out.println();
		 System.out.printf("|%-12s|%-30s|%-12s|%-30s|\n", "Mã hoa", "Tên hoa", "Số lượng", "Giá thành");
		 
		 for (int i = 0 ; i < 90; i++) {
			 System.out.printf("-");
		 }
		 System.out.println();
	 }
	 
	 @Override
	 public String toString() {
		
		 String s="";
		 DecimalFormat ft = new DecimalFormat("###,###.00 VND");
		 s+=s.format("|%-12s|%-30s|%-12s|%-30s|\n", getMaHoa(), getTenHoa(), getSoluong(), ft.format(getGiaThanh()) );
		 return s;
	 }
}

