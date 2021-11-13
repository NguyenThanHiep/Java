package GiaoDich102;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
	 
	public class TestGD {
	 
	    public static void main(String[] args) throws Exception
	    {
	    	DecimalFormat ft = new DecimalFormat("###,###.00 VND");
	        ArrayList<GiaoDichNha> arrGiaoDichNha = new ArrayList<GiaoDichNha>();
	        ArrayList<GiaoDichDat> arrGiaoDichDat = new ArrayList<GiaoDichDat>();
	        int soGiaoDichDat = 0, soGiaoDichNha = 0;
	        long tongTienGiaoDichDat = 0, trungBinhThanhTien = 0;
	        Scanner scanner = new Scanner(System.in);
	        
	        for (int i = 0; i < 50; i++){
	        	System.out.printf("-");
	        }
	        System.out.println();
	        
	        System.out.print("-->> Nhập số giao dịch đất: ");
	        soGiaoDichDat = scanner.nextInt();
	        System.out.print("-->> Nhập số giao dịch nhà: ");
	        soGiaoDichNha = scanner.nextInt();
	        
	        for (int i = 0; i < 50; i++){
	        	System.out.printf("-");
	        }
	        System.out.println();
	        
	        System.out.println("-->> Nhập thông tin giao dịch đất:");
	        for (int i = 0; i < soGiaoDichDat; i++) {
	            System.out.println("-->> Nhập thông tin giao dịch đất thứ " + (i + 1) + ":");
	            GiaoDichDat giaoDichDat = new GiaoDichDat();
	            giaoDichDat.nhap();
	            arrGiaoDichDat.add(giaoDichDat);
	        }
	        
	        for (int i = 0; i < 50; i++){
	        	System.out.printf("-");
	        }
	        System.out.println();
	        
	        System.out.println("-->> Nhập thông tin giao dịch nhà:");
	        for (int i = 0; i < soGiaoDichNha; i++) {
	            System.out.println("-->> Nhập thông tin giao dịch nhà thứ " + (i + 1) + ":");
	            GiaoDichNha giaoDichNha = new GiaoDichNha();
	            giaoDichNha.nhap();
	            arrGiaoDichNha.add(giaoDichNha);
	        }
	         
	        for (int i = 0; i < 50; i++){
	        	System.out.printf("-");
	        }
	        System.out.println();
	        
	        System.out.println("---Thông tin các giao dịch đất---");
	        for (int i = 0; i < arrGiaoDichNha.size(); i++) {
	            System.out.println(arrGiaoDichDat.get(i).toString());
	        }
	         
	        System.out.println("---Thông tin các giao dịch nhà---");
	        for (int i = 0; i < arrGiaoDichNha.size(); i++) {
	            System.out.println(arrGiaoDichNha.get(i).toString());
	        }
	        for (int i = 0; i < arrGiaoDichDat.size(); i++) {
	            if (arrGiaoDichDat.get(i).getLoaiDat().equalsIgnoreCase("A")) {
	                tongTienGiaoDichDat += arrGiaoDichDat.get(i).getDienTich() * 
	                    arrGiaoDichDat.get(i).getDonGia() * 1.5;
	            } else if (arrGiaoDichDat.get(i).getLoaiDat().equalsIgnoreCase("B") || 
	                    arrGiaoDichDat.get(i).getLoaiDat().equalsIgnoreCase("C")) {
	                tongTienGiaoDichDat += arrGiaoDichDat.get(i).getDienTich() * 
	                    arrGiaoDichDat.get(i).getDonGia();
	            }
	        }
	        trungBinhThanhTien = tongTienGiaoDichDat / (arrGiaoDichDat.size());
	        System.out.println("Thành tiền giao dịch đất = " + ft.format(trungBinhThanhTien));
	    }
	
}
