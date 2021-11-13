package PhongHoc102;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class TestPhongHoc 
{
	public static PhongHoc them() throws Exception 
	{
		String maPhong, dayNha, chuyenNganh = null;
		float dienTich;
		int soBongDen, sucChua = 0, soMayTinh;
		boolean coMayChieu, coBonRua;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thong tin cho phong hoc");
		System.out.println("Nhap ma phong: ");
		maPhong = sc.nextLine();
		System.out.println("Nhap day nha: ");
		dayNha = sc.nextLine();
		System.out.println("Dien tich phong: ");
		dienTich = sc.nextFloat();
		System.out.println("So bong den: ");
		soBongDen = sc.nextInt();
		int chon;
		System.out.println("Chon =1, nhap thong tin cho phong LT, Chon =2, " + 
						"nhap thong tin cho phong TH, con lai 3 cho phong thi nghiem");
		chon = sc.nextInt();
		PhongHoc pl=null;
		if (chon == 1) 
		{
			String coMC;
			System.out.println("Co may chieu = 1, Khong co may chieu = 0");
			coMC = sc.nextLine();
			if (coMC == "1")
			{
				coMayChieu = true;
			} 
			else
			{
				coMayChieu = false;
			}
		pl = new PhongLyThuyet(maPhong, dayNha, dienTich, soBongDen, coMayChieu);
		}
		if (chon == 2) 
		{
			String coBR;
			System.out.println("Co bon rua = 1, Khong co bon rua = 0");
			coBR = sc.nextLine();
			if (coBR == "1") 
			{
				coBonRua = true;
			} 
			else
			{
				coBonRua = false;
			}
			pl = new PhongThiNghiem(maPhong, dayNha, dienTich, soBongDen, chuyenNganh, sucChua, coBonRua);
		}
		if (chon == 3) 
		{
			int soMT;
			System.out.println("Nhap so may tinh: ");
			soMT = sc.nextInt();
			soMayTinh = soMT;
			pl = new PhongMayTinh(maPhong, dayNha, dienTich, soBongDen, soMayTinh);
		}
		return pl;
	}
	public static void main(String[] args) throws Exception 
	{
		Scanner SCANNER= new Scanner(System.in);
		DanhSachPhong ds= new DanhSachPhong();
		int luaChon=13;
		do
		{
			System.out.println("0. Nhap danh sach: ");
			System.out.println("1. Xuat danh sach phong hoc");
			System.out.println("2. Tim kiem phong hoc");
			System.out.println("3. Danh sach cac phong hoc dat chuan");
			System.out.println("4. Tong so phong hoc");
			System.out.println("5. Sap xep theo day nha");
			System.out. println("6. Sap xep theo dien tich");
			System.out.println("7. Sap xep theo so bong den");
			System.out.println("8.Cap nhat so may tinh");
			System.out.println("9. Danh sach cac phong ly thuyet co may chieu");
			System.out.println("10. Xoa phong hoc khi biet ma phong");
			System.out.println("11. Phong may tinh tren 60");
			System.out.println("12. Thoat");
			System.out.println("Menu Chuc nang chon (0 > 12): ");
			luaChon = SCANNER.nextInt();
		switch (luaChon) 
		{
		case 0:
			ds.themPhong(them());
			break;
		case 1:
			ds.inDanhSanhPhong();
			break;
		case 2:
			SCANNER.nextLine();
			System.out.println("Nhap ma phong can tim: ");
			String maPhong = SCANNER.nextLine();
			PhongHoc ph = ds.timkiem(maPhong);
			if(ph != null)
				System.out.println(ph);
			else
				System.out.println("Khong tim thay.");
			break;
		case 3:
			System.out.println("Danh sach phong dat chuan: ");
			ds.dsPhongDatChuan();
			break;
		case 4:
			System.out.println("So phong hoc: " + ds.tongSoPhongHoc());
			break;
		case 5:
			ds.sapXepDayNha();
			break;
		case 6:
			ds.sapXepDienTich();
			break;
		case 7:
			ds.sapXepTheoBongDen();
			break;
		case 8:
			SCANNER.nextLine();
			System.out.println("Nhap ma phong can cap nhat: ");
			SCANNER.nextLine();
			System.out.println("Nhap ma phong can cap nhat: ");
			maPhong = SCANNER.nextLine();
			System.out.println("Nhap so may tinh moi: ");
			int soMayTinh = SCANNER.nextInt();
			if(ds.capNhatSoMay(maPhong, soMayTinh))
			System.out.println("Cap nhat thanh cong.");
			else
			System.out.println("Khong cap nhat duoc");
			break;
		case 9:
			ds.xuatDanhSachPhongLyThuyetMayChieu();
			break;
		case 10:
			SCANNER.nextLine();
			System.out.println("Nhap ma phong can xoa: ");
			maPhong = SCANNER.nextLine();
			int hoi = JOptionPane.showConfirmDialog(null, "Chac chan xoa khong?", "Thong bao", 
																	JOptionPane.YES_NO_OPTION );
			if(hoi == JOptionPane.YES_OPTION)
			{
				if(ds.xoaPhongHoc(maPhong))
					System.out.println("Xoa thanh cong");
				else
					System.out.println("Khong xoa duoc");
			}
			break;
		case 11:
			ds.inPhongMayTinhTren60();
			break;
		default: luaChon=13;
			break;
		}
		}while(luaChon==12);
	}
}