package Account102;

import java.text.DecimalFormat;

public class Account {

	 private long soTK;
	 
     private String tenTK;
     
     private double tienTK =50000;
     
     public final double LAISUAT = 0.35;
     
     public long getSoTK(){
       return soTK;
     }
     public void setSoTK(long soTK){
    	 
       this.soTK = soTK;
       
     }
     
     
     public String getTenTK(){
    	 
       return tenTK;
       
     }
     public void setTenTK(String tenTK){
    	 
       this.tenTK = tenTK;
       
     }
     
     public double getTienTK(){
    	 
       return tienTK;
       
     }
     public void setTienTK(double tien){
    	 
       this.tienTK = this.tienTK +tien;
       
     }
     
     public Account(long soTK, String tenTK, double tienTK){
    	 
       this.soTK = soTK;
       
       this.tenTK = tenTK;
       
       this.tienTK = this.tienTK + tienTK;
       
     }
     
     public void naptien(Account acc, double tienNap){
    	 
       if(tienNap > 0){
    	   
         acc.tienTK = acc.getTienTK()+tienNap;
         
       }else {
    	   
         System.out.println("Tiền nạp lớn hơn 0");
         
       }
     }
     
     public double rutTien(Account acc, double tienRut){
    	 
       if(acc.tienTK > tienRut +50000){
    	   
         acc.tienTK = acc.tienTK - tienRut;
         
         return tienRut;
         
       }else {
    	   
         return 0;
         
       }
     }
     
     public void chuyenTien(Account ac1, Account ac2, double tienChuyen){
    	 
       if (ac1.tienTK > tienChuyen + 50000){
    	   
         ac2.naptien(ac2,rutTien(ac1, tienChuyen));
         
       }else {
    	   
         System.out.println("Lỗi chuyển tiền");
         
       }
     }
     
     public static void inTieuDe(){
    	 
       for (int i = 0; i < 65; i++){
    	   
         System.out.print("-");
       }
       System.out.println();
       
       System.out.printf("|%12s|%-30s|%-20s|\n", "Số tài khoản", "Tên tài khoản", "Tiền tài khoản");
       
       for (int i = 0; i < 65; i++){
    	   
         System.out.print("-");
         
       }
       System.out.println();
     }
    
     @Override
      public String toString(){
       DecimalFormat dt = new DecimalFormat("###,###.00 VND");
       String s=" ";
       s += s.format("|%-12s|%-30s|%20s|", getSoTK(), getTenTK(), dt.format(getTienTK()));
       return s;
    }
   
     public static void main(String[] args) throws Exception{
    	 
       inTieuDe();
       
       Account ac1 = new Account (123456,"Nguyễn Thành Hiệp", 50000);
       
       System.out.println(ac1);
       
       ac1.naptien(ac1, 50000);
       
       System.out.println(ac1);
       
       ac1.rutTien(ac1, 20000);
       
       System.out.println(ac1);
       
       Account ac2 = new Account (283339,"Nguyễn Thị Mỹ Duyên", 40000);
       
       System.out.println(ac2);
       
       ac1.chuyenTien(ac1,ac2, 10000);
       
       System.out.println(ac1);
       
       System.out.println(ac2);
       
     }

}
