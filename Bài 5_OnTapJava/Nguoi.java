public class Nguoi {
    private String hoTen134;
    private int namSinh134;
    private String ngheNghiep134;

    public Nguoi() {}

    public Nguoi(String hoTen, int namSinh, String ngheNghiep) {
        this.hoTen134 = hoTen;
        this.namSinh134 = namSinh;
        this.ngheNghiep134 = ngheNghiep;
    }

    public String getHoTen() {
        return hoTen134;
    }

    public void setHoTen(String hoTen) {
        this.hoTen134 = hoTen;
    }

    public int getNamSinh() {
        return namSinh134;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh134 = namSinh;
    }

    public String getNgheNghiep() {
        return ngheNghiep134;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep134 = ngheNghiep;
    }

    public int tinhTuoi(int namHienTai) {
        return namHienTai - namSinh134;
    }

    public void hienThiThongTin(int namHienTai) {
        System.out.println("Họ tên: " + hoTen134 + 
                           ", Năm sinh: " + namSinh134 + 
                           " (Tuổi: " + tinhTuoi(namHienTai) + ")" +
                           ", Nghề nghiệp: " + ngheNghiep134);
    }
}
