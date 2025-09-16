import java.util.Scanner;

public class CBGV134 extends Nguoi134 {
    private double luongCung134;
    private double thuong134;
    private double phat134;
    private double luongThucLinh134;

    @Override
    public void nhap134(Scanner sc134) {
        super.nhap134(sc134);
        System.out.print("Nhap luong cung: ");
        luongCung134 = Double.parseDouble(sc134.nextLine());
        System.out.print("Nhap tien thuong: ");
        thuong134 = Double.parseDouble(sc134.nextLine());
        System.out.print("Nhap tien phat: ");
        phat134 = Double.parseDouble(sc134.nextLine());
        tinhLuong134();
    }

    private void tinhLuong134() {
        luongThucLinh134 = luongCung134 + thuong134 - phat134;
    }

    @Override
    public void hienThi134() {
        super.hienThi134();
        System.out.printf(" | Luong cứng: %.2f | Thuong: %.2f | Phat: %.2f | Luong thuc linh: %.2f\n", 
                          luongCung134, thuong134, phat134, luongThucLinh134);
    }

    public double getLuongThucLinh134() {
        return luongThucLinh134;
    }
}
