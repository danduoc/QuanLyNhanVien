class LapTrinhVien extends NhanVien {
    private int gioLamThem;

    public LapTrinhVien() {
	}
    
    public LapTrinhVien(String id, String hoTen, int tuoi, String soDienThoai, String email, double luongCoBan, int gioLamThem) {
        super(id, hoTen, tuoi, soDienThoai, email, luongCoBan);
        this.gioLamThem = gioLamThem;
    }

    public int getOverTime() {
        return gioLamThem;
    }

    @Override
    public double tinhLuong() {
        return getLuongCoBan() + gioLamThem * 200;
    }
}