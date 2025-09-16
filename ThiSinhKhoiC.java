public class ThiSinhKhoiC extends ThiSinh {
    private final String monThi = "Van, Su, Dia";

    public ThiSinhKhoiC(String soBaoDanh, String hoTen, String diaChi, String uuTien) {
        super(soBaoDanh, hoTen, diaChi, uuTien);
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Khoi thi: C - Mon thi: " + monThi);
    }
}
