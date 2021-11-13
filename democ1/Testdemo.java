package democ1;
import java.util.Scanner;
public class Testdemo {

	public static void main(String[] args) throws Exception {
	
		demo d = new demo();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập mã hoa: ");
		int maHoa = sc.nextInt();
		d.setMaHoa(maHoa);
		
		System.out.println("Nhập tên hoa: ");
		String tenHoa = sc.next();
		d.setTenHoa(tenHoa);
		
		System.out.println("Nhập số lượng: ");
		int soLuong = sc.nextInt();
		d.setSoluong(soLuong);
		
		System.out.println("Nhập giá tiền: ");
		double giaThanh = sc.nextDouble();
		d.setGiaThanh(giaThanh);
		
		d.tieuDe();
		System.out.println(d);

	}

}
