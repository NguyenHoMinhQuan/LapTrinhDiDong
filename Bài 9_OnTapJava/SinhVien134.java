import java.util.Scanner;

public class SinhVien134 {
    private String hoTen134;
    private String maSV134;
    private String ngaySinh134;
    private String lop134;

    public void nhap134(Scanner sc134) {
        System.out.print("Nhap ho ten: ");
        hoTen134 = sc134.nextLine();
        System.out.print("Nhap ma sinh vien: ");
        maSV134 = sc134.nextLine();
        System.out.print("Nhap ngay sinh (dd/mm/yyyy): ");
        ngaySinh134 = sc134.nextLine();
        System.out.print("Nhap lop: ");
        lop134 = sc134.nextLine();
    }

    public void hienThi134() {
        System.out.printf("Ho ten: %s | MSV: %s | Ngay sinh: %s | Lớp: %s", 
                          hoTen134, maSV134, ngaySinh134, lop134);
    }

    public String getHoTen134() {
        return hoTen134;
    }
}
