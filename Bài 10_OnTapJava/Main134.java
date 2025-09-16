import java.util.ArrayList;
import java.util.Scanner;

public class Main134 {
    public static void main(String[] args) {
        Scanner sc134 = new Scanner(System.in);
        ArrayList<BienLai134> ds134 = new ArrayList<>();

        System.out.print("Nhap so ho su dung dien: ");
        int n134 = Integer.parseInt(sc134.nextLine());

        for (int i = 0; i < n134; i++) {
            System.out.println("\n=== Nhap thong tin bien lai thu " + (i + 1) + " ===");
            BienLai134 bl134 = new BienLai134();
            bl134.nhap134(sc134);
            ds134.add(bl134);
        }

        System.out.println("\n=== Danh sach cac bien lai dien ===");
        for (BienLai134 bl134 : ds134) {
            bl134.hienThi134();
        }
    }
}
