import java.util.Scanner;
class Nguoi134 {
    protected String hoTen134;
    protected String ngaySinh134;
    protected String queQuan134;

    public void nhap134(Scanner sc134) {
        System.out.print("Nhap ho ten: ");
        hoTen134 = sc134.nextLine();
        System.out.print("Nhap ngay sinh (dd/mm/yyyy): ");
        ngaySinh134 = sc134.nextLine();
        System.out.print("Nhap que quan: ");
        queQuan134 = sc134.nextLine();
    }

    public void hienThi134() {
        System.out.printf("Ho ten: %s | Ngay sinh: %s | Que quan: %s", 
                           hoTen134, ngaySinh134, queQuan134);
    }

    public String getNgaySinh134() {
        return ngaySinh134;
    }

    public String getQueQuan134() {
        return queQuan134;
    }
}