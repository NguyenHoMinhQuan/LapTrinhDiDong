import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh134 {
    private ArrayList<ThiSinh> danhSachThiSinh = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void nhapThiSinh() {
        System.out.print("Nhap so bao danh: ");
        String sbd = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        String hoTen = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        String diaChi = sc.nextLine();
        System.out.print("Nhap dien uu tien: ");
        String uuTien = sc.nextLine();

        System.out.print("Chon khoi (A/B/C): ");
        String khoi = sc.nextLine().toUpperCase();

        ThiSinh ts;
        switch (khoi) {
            case "A":
                ts = new ThiSinhKhoiA(sbd, hoTen, diaChi, uuTien);
                break;
            case "B":
                ts = new ThiSinhKhoiB(sbd, hoTen, diaChi, uuTien);
                break;
            case "C":
                ts = new ThiSinhKhoiC(sbd, hoTen, diaChi, uuTien);
                break;
            default:
                System.out.println("Khoi khong hop le!");
                return;
        }
        danhSachThiSinh.add(ts);
        System.out.println("Them thi sinh thanh cong!");
    }

    public void hienThiThiSinhTheoSBD() {
        System.out.print("Nhap so bao danh can tim: ");
        String sbd = sc.nextLine();
        for (ThiSinh ts : danhSachThiSinh) {
            if (ts.getSoBaoDanh().equalsIgnoreCase(sbd)) {
                ts.hienThiThongTin();
                return;
            }
        }
        System.out.println("Khong tim thay thi sinh co SBD: " + sbd);
    }

    public void hienThiTatCa() {
        for (ThiSinh ts : danhSachThiSinh) {
            ts.hienThiThongTin();
            System.out.println("---------------------------");
        }
    }

    public static void main(String[] args) {
        TuyenSinh134 ts134 = new TuyenSinh134();
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("\n--- QUAN LY TUYEN SINH ---");
            System.out.println("1. Nhap thi sinh moi");
            System.out.println("2. Hien thi tat ca thi sinh");
            System.out.println("3. Tim kiem thi sinh theo so bao danh");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    ts134.nhapThiSinh();
                    break;
                case 2:
                    ts134.hienThiTatCa();
                    break;
                case 3:
                    ts134.hienThiThiSinhTheoSBD();
                    break;
                case 0:
                    System.out.println("Ket thuc chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 0);
    }
}
