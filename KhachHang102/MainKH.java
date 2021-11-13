package KhachHang102;

	import java.util.GregorianCalendar;
	import java.text.SimpleDateFormat;
	import java.util.Calendar;
	import java.util.Scanner;
	import java.util.Date;

	public class MainKH 
	{
		public static KhachHang nhap() throws Exception
		{
			Scanner sc = new Scanner(System. in);
			String maKH, hoTenKH;
			String ngay;
			double donGia, soKW;
			int dt;
			String doiTuong=null;
			String quocTich;
			System.out.println("Nhap thong tin cho khach hang:");
			System.out.println("Ma Khach hang: ");
			maKH=sc.nextLine();
			System.out.println("Ho ten khach hang: ");
			hoTenKH=sc.nextLine();
			System.out.println("Ngay lap hoa don: ");
			ngay = sc.nextLine();
			SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
			Calendar ngayLapHD = new GregorianCalendar();
			try 
			{
				Date d= date.parse(ngay);
				ngayLapHD.setTime(d);
			} 
			catch (Exception ex) 
			{
				System.out.println("`");
			}
			int chon;
			System.out.println("Chon loai khach hang:(1 = trong nuoc, 2 = nuoc ngoai)");
			chon=sc.nextInt();
			if (chon==1) 
			{
				System.out.println("Doi tuong: 1 = Gia dinh, 2 = Kinh doanh, 3 = San xuat");
				dt = sc.nextInt();
				if (dt==1) 
				{
					doiTuong="Gia dinh";
					donGia=1000;
					System.out.println("Don gia: "+ donGia +" VND" );
				}
				else
					if (dt==2) 
					{
						doiTuong="Kinh doanh";
						donGia=2000;
						System.out.println("Don gia: "+ donGia +" VND" );
					}
					else 
					{
						doiTuong="San xuat";
						donGia=3000;
						System.out.println("Don gia: "+ donGia +" VND" );
					}
				System.out.println("So kw dung dien:");
				soKW=sc.nextDouble();
				KhachHang khvn= new KhachHangVN(maKH, hoTenKH, ngayLapHD, donGia, soKW, doiTuong);
				return khvn;
			}
			else 
			{
				System.out.println("Quoc tich:");
				quocTich = sc.nextLine();
				System.out.println("Don gia:");
				donGia=sc.nextDouble();
				System.out.println("So kw dung dien:");
				soKW=sc.nextDouble();
				KhachHang khnn = new KhachHangNN(maKH, hoTenKH, ngayLapHD, donGia, soKW, quocTich);
				return khnn;
			}
		}	
		public static void main(String[] args) throws Exception
		{
			KhachHang kh= new KhachHangNN();
			Calendar ngay1, ngay2, ngay3, ngay4, ngay5, ngay6;
			Calendar c = Calendar.getInstance();
			c.set(Calendar.MONTH, 12);
			c.roll(Calendar.MONTH,-1);
			c.set(Calendar.DAY_OF_MONTH,31);
			c.set(Calendar.YEAR, 2019);
			ngay2= new GregorianCalendar(2019,5,8);
			ngay2.roll(Calendar.MONTH,-1);
			ngay3= new GregorianCalendar(2019,7,10);
			ngay3.roll(Calendar.MONTH,-1);
			ngay4= new GregorianCalendar(2019,10,12);
			ngay4.roll(Calendar.MONTH, -1);
			ngay5= new GregorianCalendar(2019,9,18);
			ngay5.roll(Calendar.MONTH,-1);
			ngay6= new GregorianCalendar(2019,11,13);
			ngay6.roll(Calendar.MONTH,-1);
			
			KhachHang kh1= new KhachHangNN("86", "Lil Beep",c,1000, 12, "China");
			KhachHang kh2= new KhachHangNN("81", "Lil Ten",ngay2,1000, 120, "Japan");
			KhachHang kh3= new KhachHangNN("89", "Lil Pump",ngay3,1000, 50, "American");
			KhachHang kh4= new KhachHangVN("84", "Chu Muoi",ngay4,1000, 120, "Sinh hoat");
			KhachHang kh5= new KhachHangVN("83", "Onii Thach",ngay5,5000, 100, "San Xuat");
			KhachHang kh6= new KhachHangVN("88", "Phu thuy tinh yeu",ngay6,10000, 20, "Kinh doanh");
			
			kh.tieuDeNN();
			System.out.println(kh1);
			System.out.println(kh2);
			System.out.println(kh3);
			
			kh.tieuDeVN();
			System.out.println(kh4);
			System.out.println(kh5);
			System.out.println(kh6);
			
			int chon;
			Scanner sc = new Scanner(System.in);
			ListKH khachhang = new ListKH();
			do
			{
				System.out.println("Chon chuc nang menu: (1-3)");
				System.out.println("1. Them khach hang");
				System.out.println("2. Xuat ket qua");
				chon=sc.nextInt();
				switch (chon) 
				{
					case 1: khachhang.themKH(nhap());break;
					case 2: kh.tieuDeVN();khachhang.inKQ();break;
					default:chon=3;
						break;
				}
			}
			while (chon!=3);
		
		}
	}



