import java.util.Scanner;

public class KhachHang134 {
    private String hoTenChuHo134;
    private String soNha134;
    private String maCongTo134;

    public void nhap134(Scanner sc134) {
        System.out.print("Nhap ho ten chu ho: ");
        hoTenChuHo134 = sc134.nextLine();
        System.out.print("Nhap so nha: ");
        soNha134 = sc134.nextLine();
        System.out.print("Nhap ma cong to: ");
        maCongTo134 = sc134.nextLine();
    }

    public void hienThi134() {
        System.out.printf("Ho ten: %s | So nha: %s | Ma cong to: %s", 
                          hoTenChuHo134, soNha134, maCongTo134);
    }
}
