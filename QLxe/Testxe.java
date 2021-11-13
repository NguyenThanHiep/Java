package QLxe;

import java.util.ArrayList;
import java.util.Scanner;


public class Testxe {

	public static void main (String[] args) throws Exception {
		 ArrayList<Dangkyxe> arrDangkyxe = new ArrayList<Dangkyxe>();
		 Scanner sc = new Scanner(System.in);
		 int Dangkyxe = 0;
		 for (int i = 0; i < 50; i++){
	        	System.out.printf("-");
	        }
	        System.out.println();
	        
	        System.out.print("-->> Nhập số lượng xe cần nhập : ");
	        Dangkyxe = sc.nextInt();
	        
	        for (int i = 0; i < 50; i++){
	        	System.out.printf("-");
	        }
	        System.out.println();
	        
	        System.out.println("-->> Nhập thông tin xe:");
	        for (int i = 0; i < Dangkyxe; i++) {
	            System.out.println("-->> Nhập thông tin xe thứ " + (i + 1) + ":");
	            Dangkyxe x = new Dangkyxe();
	            x.nhap();
	            arrDangkyxe.add(x);
	        }
	        
	        for (int i = 0; i < 50; i++){
	        	System.out.printf("-");
	        }
	        System.out.println();
	        
	        System.out.println("---Thông tin lượng xe---");
	        for (int i = 0; i < arrDangkyxe.size(); i++) {
	            System.out.println(arrDangkyxe.get(i).toString());
	            
	        }
	        
	}
}
