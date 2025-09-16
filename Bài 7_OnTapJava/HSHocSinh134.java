import java.util.Scanner;   
class HSHocSinh134 extends Nguoi134 {
    private String lop134;
    private String khoaHoc134;
    private String kyHoc134;

    @Override
    public void nhap134(Scanner sc134) {
        super.nhap134(sc134);
        System.out.print("Nhap lop: ");
        lop134 = sc134.nextLine();
        System.out.print("Nhap khoa hoc: ");
        khoaHoc134 = sc134.nextLine();
        System.out.print("Nhap ky hoc: ");
        kyHoc134 = sc134.nextLine();
    }

    @Override
    public void hienThi134() {
        super.hienThi134();
        System.out.printf(" | Lop: %s | Khaa hoc: %s | Ky hoc: %s\n", 
                           lop134, khoaHoc134, kyHoc134);
    }

    public String getLop134() {
        return lop134;
    }
}