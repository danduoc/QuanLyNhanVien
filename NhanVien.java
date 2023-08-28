import java.util.ArrayList;
import java.util.Scanner;
class NhanVien {
    private String id;
    private String hoTen;
    private int tuoi;
    private String soDienThoai;
    private String email;
    private double luongCoBan;

    public NhanVien() {
	}
    public NhanVien(String id, String hoTen, int tuoi, String soDienThoai, String email, double luongCoBan) {
        this.id = id;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.luongCoBan = luongCoBan;
    }
    

    public String getId() {
        return id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public double tinhLuong() {
        return luongCoBan;
    }
    public  void display(){
        System.out.println("Thong tin cua nhan vien: ");
        System.out.println("Ma NV = " + this.id);
        System.out.println("Ten = " + this.hoTen);
        System.out.println("Tuoi = " + this.tuoi);
        System.out.println("SĐT = " + this.soDienThoai);
        System.out.println("Email = " + this.email);
        System.out.println("Luong co ban = " + this.luongCoBan);
        System.out.println("Luong co ban = " + this.tinhLuong());
        System.out.println("===============================");
    }
}
