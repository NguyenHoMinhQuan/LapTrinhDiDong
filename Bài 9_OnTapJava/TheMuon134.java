import java.util.Scanner;

public class TheMuon134 {
    private String soPhieu134;
    private String ngayMuon134;
    private String hanTra134;
    private String soHieuSach134;
    private SinhVien134 sinhVien134;

    public void nhap134(Scanner sc134) {
        sinhVien134 = new SinhVien134();
        System.out.println("--- Nhap thong tin sinh vien ---");
        sinhVien134.nhap134(sc134);

        System.out.println("--- NNhap thong tin the muon ---");
        System.out.print("Nhap so phieu muon: ");
        soPhieu134 = sc134.nextLine();
        System.out.print("Nhap ngay muon (dd/mm/yyyy): ");
        ngayMuon134 = sc134.nextLine();
        System.out.print("Nhap han tra (dd/mm/yyyy): ");
        hanTra134 = sc134.nextLine();
        System.out.print("Nhap so hieu sach: ");
        soHieuSach134 = sc134.nextLine();
    }

    public void hienThi134() {
        sinhVien134.hienThi134();
        System.out.printf(" | So phieu: %s | Ngay muon: %s | Han tra: %s | So hieu sach: %s\n",
                          soPhieu134, ngayMuon134, hanTra134, soHieuSach134);
    }

    public String getHanTra134() {
        return hanTra134;
    }

    public String getSoHieuSach134() {
        return soHieuSach134;
    }

    public String getHoTenSinhVien134() {
        return sinhVien134.getHoTen134();
    }
}
