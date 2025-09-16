import java.util.ArrayList;
import java.util.Scanner;

public class Main134 {
    public static void main(String[] args) {
        Scanner sc134 = new Scanner(System.in);
        ArrayList<CBGV134> ds134 = new ArrayList<>();

        System.out.print("Nhap so luong can bo giao vien: ");
        int n134 = Integer.parseInt(sc134.nextLine());

        for (int i = 0; i < n134; i++) {
            System.out.println("\n--- Nhap thong tin can bo giao vien thu " + (i + 1) + " ---");
            CBGV134 cb134 = new CBGV134();
            cb134.nhap134(sc134);
            ds134.add(cb134);
        }

        System.out.println("\n=== Danh sach can bo co luong thuc linh >= 8,000,000 ===");
        for (CBGV134 cb134 : ds134) {
            if (cb134.getLuongThucLinh134() >= 8000000) {
                cb134.hienThi134();
            }
        }
    }
}
