import java.time.Year;
import java.util.ArrayList;
import java.util.Scanner;

public class KhuPho {
    private ArrayList<HoDan> danhSachHoDan134 = new ArrayList<>();
    private Scanner sc134 = new Scanner(System.in);

    public void nhapDanhSachHoDan() {
        System.out.print("Nhap so họ dan trong khu pho: ");
        int n = Integer.parseInt(sc134.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\n=== Nhap thong tin ho dan " + (i + 1) + " ===");
            HoDan ho = new HoDan();
            ho.nhapThongTin(sc134);
            danhSachHoDan134.add(ho);
        }
    }

    public void hienThiHoCoNguoi80Tuoi() {
        int namHienTai134 = Year.now().getValue();
        System.out.println("\n--- Danh sach ho dan co nguoi >= 80 tuoi ---");
        boolean timThay134 = false;
        for (HoDan ho : danhSachHoDan134) {
            if (ho.coNguoi80Tuoi(namHienTai134)) {
                ho.hienThiThongTin(namHienTai134);
                System.out.println("---------------------------");
                timThay134 = true;
            }
        }
        if (!timThay134) {
            System.out.println("Khong co ho nao co nguoi mung thuong tho.");
        }
    }

    public static void main(String[] args) {
        KhuPho kp134 = new KhuPho();
        kp134.nhapDanhSachHoDan();
        kp134.hienThiHoCoNguoi80Tuoi();
    }
}
