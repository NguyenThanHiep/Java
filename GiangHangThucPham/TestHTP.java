package GiangHangThucPham;
import java.util.Scanner;
public class TestHTP {

	public static void main(String[] args) throws Exception {
		System.out.println("\t\t\tCHUONG TRÌNH HÀNG THỰC PHẨM");
		HangThucPham h1 = new HangThucPham();
		
		Scanner sc = new Scanner(System.in);
		boolean kt = true;
		boolean th = true;
		System.out.println("Nhập mã hàng: ");
		h1.setMaHang(sc.nextInt());
		sc.nextLine();
		do{
			System.out.println("Nhập tên hàng: ");
			h1.setTenHang(sc.nextLine());
		}while (h1.kiemTranTenHang(kt));
		System.out.println("Nhập đơn giá: ");
		h1.setDonGia(sc.nextDouble());
		do{
			System.out.println("Ngày sản xuất: ");
			System.out.println("Ngày: ");
			int ngaySX = sc.nextInt();
			System.out.println("Tháng: ");
			int thanhSX = sc.nextInt();
			System.out.println("Năm: ");
			int namSX = sc.nextInt();
			h1.setNSX(namSX, thanhSX, ngaySX);
			System.out.println("Ngày hết hạn : ");
			System.out.println("Ngày: ");
			int ngayHH = sc.nextInt();
			System.out.println("Tháng: ");
			int thangHH = sc.nextInt();
			System.out.println("Năm: ");
			int namHH = sc.nextInt();
			h1.setHSD(namHH, thangHH, ngayHH);
		}while (h1.kiemTraNgay(th));
		h1.tieuDe();
		System.out.println(h1);
	}
}
