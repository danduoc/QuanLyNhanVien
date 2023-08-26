class KiemChungVien extends NhanVien {
    private int soLoiPhatHien;

    public KiemChungVien() {
	}
    
    public KiemChungVien(String id, String hoTen, int tuoi, String soDienThoai, String email, double luongCoBan, int soLoiPhatHien) {
        super(id, hoTen, tuoi, soDienThoai, email, luongCoBan);
        this.soLoiPhatHien = soLoiPhatHien;
    }

    public int getSoLoiPhatHien() {
        return soLoiPhatHien;
    }

    @Override
    public double tinhLuong() {
        return getLuongCoBan() + soLoiPhatHien * 50;
    }
}