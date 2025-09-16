public class ThiSinhKhoiB extends ThiSinh {
    private final String monThi = "Toah, Hoa, Sinh";

    public ThiSinhKhoiB(String soBaoDanh, String hoTen, String diaChi, String uuTien) {
        super(soBaoDanh, hoTen, diaChi, uuTien);
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Khoi thi: B - Mon thi: " + monThi);
    }
}

