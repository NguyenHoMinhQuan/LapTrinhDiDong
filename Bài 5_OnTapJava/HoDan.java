import java.util.ArrayList;
import java.util.Scanner;

public class HoDan {
    private int soThanhVien134;
    private String soNha134;
    private ArrayList<Nguoi> thanhVien134 = new ArrayList<>();

    public HoDan() {}

    public HoDan(int soThanhVien, String soNha) {
        this.soThanhVien134 = soThanhVien;
        this.soNha134 = soNha;
    }

    public void nhapThongTin(Scanner sc) {
        System.out.print("Nhap so nha: ");
        soNha134 = sc.nextLine();
        System.out.print("Nhap so thanh vien: ");
        soThanhVien134 = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < soThanhVien134; i++) {
            System.out.println("  -- Nhap thong tin thanh vien " + (i + 1));
            System.out.print("  Ho ten: ");
            String hoTen134 = sc.nextLine();
            System.out.print("  Nam sinh: ");
            int namSinh134 = Integer.parseInt(sc.nextLine());
            System.out.print("  Nghe nghiep: ");
            String nghe134 = sc.nextLine();

            Nguoi n = new Nguoi(hoTen134, namSinh134, nghe134);
            thanhVien134.add(n);
        }
    }

    public void hienThiThongTin(int namHienTai) {
        System.out.println("So nha: " + soNha134 + ", So thanh vien: " + soThanhVien134);
        for (Nguoi n : thanhVien134) {
            n.hienThiThongTin(namHienTai);
        }
    }

    public boolean coNguoi80Tuoi(int namHienTai) {
        for (Nguoi n : thanhVien134) {
            if (n.tinhTuoi(namHienTai) >= 80) {
                return true;
            }
        }
        return false;
    }
}
