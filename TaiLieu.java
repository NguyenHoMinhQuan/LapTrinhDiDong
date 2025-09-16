public class TaiLieu {
    private String maTaiLieu;
    private String tenNhaXuatBan;
    private int soBanPhatHanh;

    public TaiLieu(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    // Getter, Setter
    public String getMaTaiLieu() { return maTaiLieu; }
    public void setMaTaiLieu(String maTaiLieu) { this.maTaiLieu = maTaiLieu; }

    public String getTenNhaXuatBan() { return tenNhaXuatBan; }
    public void setTenNhaXuatBan(String tenNhaXuatBan) { this.tenNhaXuatBan = tenNhaXuatBan; }

    public int getSoBanPhatHanh() { return soBanPhatHanh; }
    public void setSoBanPhatHanh(int soBanPhatHanh) { this.soBanPhatHanh = soBanPhatHanh; }

    public void hienThiThongTin() {
        System.out.println("Ma tai lieu: " + maTaiLieu);
        System.out.println("Nha xuat ban: " + tenNhaXuatBan);
        System.out.println("So ban phat hanh: " + soBanPhatHanh);
    }
}
