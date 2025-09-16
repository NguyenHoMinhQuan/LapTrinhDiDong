import java.util.ArrayList;
import java.util.Scanner;

public class KhachSan134 {
    private ArrayList<KhachTro> danhSach134 = new ArrayList<>();
    private Scanner sc134 = new Scanner(System.in);

    // Nhập thông tin khách trọ
    public void nhapKhachTro134() {
        System.out.print("Nhap ho ten: ");
        String hoTen134 = sc134.nextLine();
        System.out.print("Nhap ngay sinh: ");
        String ngaySinh134 = sc134.nextLine();
        System.out.print("Nhap so CMND: ");
        String cmnd134 = sc134.nextLine();
        System.out.print("Nhap so ngay tro: ");
        int soNgayTro134 = Integer.parseInt(sc134.nextLine());
        System.out.print("Nhap loai phong: ");
        String loaiPhong134 = sc134.nextLine();
        System.out.print("Nhap gia phong/ngay: ");
        double giaPhong134 = Double.parseDouble(sc134.nextLine());

        KhachTro kt134 = new KhachTro(hoTen134, ngaySinh134, cmnd134,
                                      soNgayTro134, loaiPhong134, giaPhong134);
        danhSach134.add(kt134);
        System.out.println("Them khach tro thanh cong!");
    }

    // Hiển thị toàn bộ danh sách khách trọ
    public void hienThiTatCa134() {
        if (danhSach134.isEmpty()) {
            System.out.println("Khong co khach tro nao.");
            return;
        }
        for (KhachTro kt134 : danhSach134) {
            kt134.hienThiThongTin134();
            System.out.println("--------------------------");
        }
    }

    // Xóa khách trọ theo CMND
    public void xoaKhachTro134() {
        System.out.print("Nhap CMND khach muon xoa: ");
        String cmnd134 = sc134.nextLine();
        KhachTro found134 = null;
        for (KhachTro kt134 : danhSach134) {
            if (kt134.getCmnd134().equalsIgnoreCase(cmnd134)) {
                found134 = kt134;
                break;
            }
        }
        if (found134 != null) {
            danhSach134.remove(found134);
            System.out.println("Đa xoa khach co CMND: " + cmnd134);
        } else {
            System.out.println("Khong tim thay khach co CMND nay!");
        }
    }

    // Tính tiền trả phòng theo CMND
    public void tinhTien134() {
        System.out.print("Nhap CMND khach tra phong: ");
        String cmnd134 = sc134.nextLine();
        for (KhachTro kt134 : danhSach134) {
            if (kt134.getCmnd134().equalsIgnoreCase(cmnd134)) {
                System.out.println("Khách " + kt134.getHoTen134() +
                                   " cần trả: " + kt134.tinhTien134());
                return;
            }
        }
        System.out.println("Khong tim thay khach co CMND nay!");
    }

    // Menu chương trình
    public void menu134() {
        int chon134;
        do {
            System.out.println("\n--- QUAN LY KHACH SAN ---");
            System.out.println("1. Nhap thong tin khach tro");
            System.out.println("2. Hien thi tat ca khach tro");
            System.out.println("3. Xoa khach tro theo CMND");
            System.out.println("4. Tính tien tra phong theo CMND");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            chon134 = Integer.parseInt(sc134.nextLine());

            switch (chon134) {
                case 1:
                    nhapKhachTro134();
                    break;
                case 2:
                    hienThiTatCa134();
                    break;
                case 3:
                    xoaKhachTro134();
                    break;
                case 4:
                    tinhTien134();
                    break;
                case 0:
                    System.out.println("Ket thu chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon134 != 0);
    }

    public static void main(String[] args) {
        KhachSan134 ks134 = new KhachSan134();
        ks134.menu134();
    }
}
