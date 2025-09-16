import java.util.ArrayList;
import java.util.Scanner;

public class Main134 {
    public static void main(String[] args) {
        Scanner sc134 = new Scanner(System.in);
        ArrayList<HSHocSinh134> danhSach134 = new ArrayList<>();

        System.out.print("Nhap so luong hoc sinh: ");
        int n134 = Integer.parseInt(sc134.nextLine());

        // Nhập danh sách học sinh
        for (int i = 0; i < n134; i++) {
            System.out.println("\n--- Nhap thong tin hoc sinh thu " + (i + 1) + " ---");
            HSHocSinh134 hs134 = new HSHocSinh134();
            hs134.nhap134(sc134);
            danhSach134.add(hs134);
        }

        // Hiển thị tất cả học sinh sinh năm 1985 và quê ở Thái Nguyên
        System.out.println("\n=== Hoc sinh sinh năm 1985 và que o Thai Nguyen ===");
        for (HSHocSinh134 hs134 : danhSach134) {
            if (hs134.getNgaySinh134().contains("1985") && 
                hs134.getQueQuan134().equalsIgnoreCase("Thai Nguyen")) {
                hs134.hienThi134();
            }
        }

        // Hiển thị tất cả học sinh lớp 10A1
        System.out.println("\n=== Hoc sinh lop 10A1 ===");
        for (HSHocSinh134 hs134 : danhSach134) {
            if (hs134.getLop134().equalsIgnoreCase("10A1")) {
                hs134.hienThi134();
            }
        }
    }
}
