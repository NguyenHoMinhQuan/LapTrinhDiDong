public class ThiSinh {
    private String soBaoDanh;
    private String hoTen;
    private String diaChi;
    private String uuTien;

    public ThiSinh() {}

    public ThiSinh(String soBaoDanh, String hoTen, String diaChi, String uuTien) {
        this.soBaoDanh = soBaoDanh;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.uuTien = uuTien;
    }

    public String getSoBaoDanh() {
        return soBaoDanh;
    }

    public void setSoBaoDanh(String soBaoDanh) {
        this.soBaoDanh = soBaoDanh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getUuTien() {
        return uuTien;
    }

    public void setUuTien(String uuTien) {
        this.uuTien = uuTien;
    }

    public void hienThiThongTin() {
        System.out.println("SBD: " + soBaoDanh + 
                           ", Ho ten: " + hoTen + 
                           ", Đia chi: " + diaChi + 
                           ", Uu tien: " + uuTien);
    }
}
