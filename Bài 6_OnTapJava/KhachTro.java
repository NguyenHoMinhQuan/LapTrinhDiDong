public class KhachTro extends Nguoi {
    private int soNgayTro134;
    private String loaiPhong134;
    private double giaPhong134;

    public KhachTro(String hoTen134, String ngaySinh134, String cmnd134,
                    int soNgayTro134, String loaiPhong134, double giaPhong134) {
        super(hoTen134, ngaySinh134, cmnd134);
        this.soNgayTro134 = soNgayTro134;
        this.loaiPhong134 = loaiPhong134;
        this.giaPhong134 = giaPhong134;
    }

    public int getSoNgayTro134() {
        return soNgayTro134;
    }

    public void setSoNgayTro134(int soNgayTro134) {
        this.soNgayTro134 = soNgayTro134;
    }

    public String getLoaiPhong134() {
        return loaiPhong134;
    }

    public void setLoaiPhong134(String loaiPhong134) {
        this.loaiPhong134 = loaiPhong134;
    }

    public double getGiaPhong134() {
        return giaPhong134;
    }

    public void setGiaPhong134(double giaPhong134) {
        this.giaPhong134 = giaPhong134;
    }

    public double tinhTien134() {
        return soNgayTro134 * giaPhong134;
    }

    @Override
    public void hienThiThongTin134() {
        super.hienThiThongTin134();
        System.out.println("So ngay to: " + soNgayTro134 +
                           ", Loai phong: " + loaiPhong134 +
                           ", Gia phong/ngay: " + giaPhong134 +
                           ", Tong tien: " + tinhTien134());
    }
}
