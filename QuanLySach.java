import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLySach {
    private List<TaiLieu> danhSach134 = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    // Nhập tài liệu
    public void nhapTaiLieu134() {
        System.out.println("Chon loai tai lieu: 1.Sach  2.Tap chi  3.Bao");
        int chon = Integer.parseInt(sc.nextLine());

        System.out.print("Ma tai lieu: ");
        String ma = sc.nextLine();
        System.out.print("Ten NXB: ");
        String nxb = sc.nextLine();
        System.out.print("So ban phat hanh: ");
        int soBan = Integer.parseInt(sc.nextLine());

        TaiLieu tl;
        switch (chon) {
            case 1:
                System.out.print("Ten tac gia: ");
                String tg = sc.nextLine();
                System.out.print("So trang: ");
                int st = Integer.parseInt(sc.nextLine());
                tl = new Sach(ma, nxb, soBan, tg, st);
                break;
            case 2:
                System.out.print("So phat hanh: ");
                int soPh = Integer.parseInt(sc.nextLine());
                System.out.print("Thang phat hanh: ");
                int thang = Integer.parseInt(sc.nextLine());
                tl = new TapChi(ma, nxb, soBan, soPh, thang);
                break;
            case 3:
                System.out.print("Ngay phat hanh: ");
                String ngay = sc.nextLine();
                tl = new Bao(ma, nxb, soBan, ngay);
                break;
            default:
                System.out.println("Lua chon khong hop le!");
                return;
        }
        danhSach134.add(tl);
        System.out.println("Đa them tai lieu!");
    }

    // Tìm theo mã tài liệu
    public TaiLieu timTheoMa134(String ma) {
        for (TaiLieu tl : danhSach134) {
            if (tl.getMaTaiLieu().equalsIgnoreCase(ma)) {
                return tl;
            }
        }
        return null;
    }

    // Tìm theo loại
    public void timTheoLoai134(Class<?> loai) {
        for (TaiLieu tl : danhSach134) {
            if (loai.isInstance(tl)) {
                tl.hienThiThongTin();
                System.out.println("------");
            }
        }
    }

    // Hiển thị thông tin
    public void hienThiThongTin134(TaiLieu tl) {
        if (tl != null) {
            tl.hienThiThongTin();
        } else {
            System.out.println("Khong tim thay!");
        }
    }
}
