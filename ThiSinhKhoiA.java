public class ThiSinhKhoiA extends ThiSinh {
    private final String monThi = "Toan, Ly, Hoa";

    public ThiSinhKhoiA(String soBaoDanh, String hoTen, String diaChi, String uuTien) {
        super(soBaoDanh, hoTen, diaChi, uuTien);
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Khoi thi: A - Mon thi: " + monThi);
    }
}
