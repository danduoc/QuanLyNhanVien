import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> a = new ArrayList<>();

        System.out.print("Nhập số lượng nhân viên: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
			System.out.println("Nhập thông tin của nhân viên thứ " + (i + 1) + " :");
			 System.out.print("Nhập loại nhân viên (1 - Lập trình viên, 2 - Kiểm chứng viên): ");
	            int loaiNhanVien = sc.nextInt();
	            sc.nextLine();

	            System.out.print("Nhập mã nhân viên: ");
	            String maNV = sc.nextLine();

	            System.out.print("Nhập họ tên: ");
	            String hoTen = sc.nextLine();

	            System.out.print("Nhập tuổi: ");
	            int tuoi = sc.nextInt();
	            sc.nextLine();

	            System.out.print("Nhập số điện thoại: ");
	            String soDienThoai = sc.nextLine();

	            System.out.print("Nhập email: ");
	            String email = sc.nextLine();

	            System.out.print("Nhập lương cơ bản: ");
	            double luongCoBan = sc.nextDouble();
	            sc.nextLine();

	            if (loaiNhanVien == 1) {
	                System.out.print("Nhập số giờ overtime: ");
	                int gioLamThem = sc.nextInt();
	                sc.nextLine();

	                LapTrinhVien lapTrinhVien = new LapTrinhVien(maNV, hoTen, tuoi, soDienThoai, email, luongCoBan, gioLamThem);
	                a.add(lapTrinhVien);
	            } else if (loaiNhanVien == 2) {
	                System.out.print("Nhập số lỗi phát hiện được: ");
	                int soLoiPhatHien = sc.nextInt();
	                sc.nextLine();

	                KiemChungVien kiemChungVien = new KiemChungVien(maNV, hoTen, tuoi, soDienThoai, email, luongCoBan, soLoiPhatHien);
	                a.add(kiemChungVien);
	            }
        }
        System.out.println();
        System.out.println("Danh sách nhân viên:");
        System.out.println("===============================");
        for (NhanVien s : a) {
        	System.out.println("Mã NV: " + s.getId());
            System.out.println("Họ tên: " + s.getHoTen());
            System.out.println("Tuổi: " + s.getTuoi());
            System.out.println("Số điện thoại: " + s.getSoDienThoai());
            System.out.println("Email: " + s.getEmail());
            System.out.println("Lương cơ bản: " + s.getLuongCoBan());
            System.out.println("Lương: " + s.tinhLuong());
            System.out.println("===============================");
        }
    }
}