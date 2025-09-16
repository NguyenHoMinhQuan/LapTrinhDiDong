import java.util.ArrayList;
import java.util.Scanner;

public class Main134 {
    public static void main(String[] args) {
        Scanner sc134 = new Scanner(System.in);
        ArrayList<TheMuon134> ds134 = new ArrayList<>();

        System.out.print("Nhap so luong the muon: ");
        int n134 = Integer.parseInt(sc134.nextLine());

        for (int i = 0; i < n134; i++) {
            System.out.println("\n=== Nhap thon tin the muon thu " + (i + 1) + " ===");
            TheMuon134 tm134 = new TheMuon134();
            tm134.nhap134(sc134);
            ds134.add(tm134);
        }

        System.out.println("\n=== Danh sach sinh vien phai tra sach vao ngay cuoi thang ===");
        for (TheMuon134 tm134 : ds134) {
            // Kiểm tra hạn trả có phải ngày 30 hoặc 31
            if (tm134.getHanTra134().startsWith("30/") || tm134.getHanTra134().startsWith("31/")) {
                System.out.printf("Sinh vien: %s | Sach muon(so hieu): %s | Han tra: %s\n",
                                  tm134.getHoTenSinhVien134(), tm134.getSoHieuSach134(), tm134.getHanTra134());
            }
        }
    }
}
