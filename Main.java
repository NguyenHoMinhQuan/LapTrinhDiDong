import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLySach ql134 = new QuanLySach();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Nhap tai lieu moi");
            System.out.println("2. Tim theo ma tai lieu");
            System.out.println("3. Tim theo loai tai lieu");
            System.out.println("4. Thoat");
            System.out.print("Chon: ");
            int chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    ql134.nhapTaiLieu134();
                    break;
                case 2:
                    System.out.print("Nhap ma: ");
                    String ma = sc.nextLine();
                    TaiLieu kq = ql134.timTheoMa134(ma);
                    ql134.hienThiThongTin134(kq);
                    break;
                case 3:
                    System.out.println("Chon loai: 1.Sach 2.Tap chí 3.Bao");
                    int loai = Integer.parseInt(sc.nextLine());
                    if (loai == 1) ql134.timTheoLoai134(Sach.class);
                    else if (loai == 2) ql134.timTheoLoai134(TapChi.class);
                    else if (loai == 3) ql134.timTheoLoai134(Bao.class);
                    else System.out.println("Sai lua chon!");
                    break;
                case 4:
                    System.out.println("Ket thuc.");
                    return;
                default:
                    System.out.println("Sai lua chon!");
            }
        }
    }
}
