package SinhVien102;
import java.util.Scanner;
public class SinhVien {

	 	private int msv;
	    private String name;
	    private double DLT;
	    private double DTH;
	    
	    public void setMSV(int a){
	      if (a > 0){
	        this.msv = a;
	      }else{
	        System.out.println("lỗi msv");
	      }
	    }
	    public int getMSV(){
	      return this.msv;
	    }
	    public void setName(String name){
	      this.name = name;
	    }
	    public String getName(){
	      return this.name;
	    }
	    public void setdlt(double c){
	      if(c >= 0 && c <= 10){
	        this.DLT = c;
	      }else{
	        System.out.println("lỗi điểm");
	      }
	    }
	    public double getdlt(){
	      return this.DLT;
	    }
	    public void setdth(double d){
	      if (d >= 0 && d <= 10){
	        this.DTH = d;
	      }else{
	        System.out.println("lỗi điểm");
	      }
	    }
	    public double getdth(){
	      return this.DTH;
	    }
	    
	    public SinhVien() {
	    	
	    }
	    public SinhVien(double c,double d ){
	      this.DLT = c;
	      this.DTH = d;
	    }
	    public double diemtb(double c, double d){
	      return (c + d)/2;
	    }
	    public String toString(){
	      String s ="";
	      s+=s.format("Msv: %4s, Tên: %4s, Điểm lí thuyết: %4s, Điểm thực hành: %4s, Điểm trung bình: %4s",getMSV(),getName(),getdlt(),getdth(),diemtb(getdlt(),getdth()));
	      return s;
	    }
}
