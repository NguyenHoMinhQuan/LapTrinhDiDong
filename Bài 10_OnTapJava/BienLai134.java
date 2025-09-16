import java.util.Scanner;

public class BienLai134 {
    private KhachHang134 khachHang134;
    private int chiSoCu134;
    private int chiSoMoi134;
    private double soTien134;

    public void nhap134(Scanner sc134) {
        khachHang134 = new KhachHang134();
        System.out.println("--- Nhap thong tin khach hang ---");
        khachHang134.nhap134(sc134);

        System.out.print("Nhap chi so cu: ");
        chiSoCu134 = Integer.parseInt(sc134.nextLine());
        System.out.print("Nhap chi so moi: ");
        chiSoMoi134 = Integer.parseInt(sc134.nextLine());

        tinhTien134();
    }

    private void tinhTien134() {
        soTien134 = (chiSoMoi134 - chiSoCu134) * 750;
    }

    public void hienThi134() {
        khachHang134.hienThi134();
        System.out.printf(" | Chi so cu: %d | Chi so moi: %d | So tien phai tra: %.0f\n",
                          chiSoCu134, chiSoMoi134, soTien134);
    }
}
