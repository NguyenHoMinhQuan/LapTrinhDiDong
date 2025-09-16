import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class CanBo {
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String diaChi;

    public CanBo() {}

    public CanBo(String hoTen, String ngaySinh, String gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    // Getter và Setter
    public String getHoTen() { return hoTen; }
    public void setHoTen(String hoTen) { this.hoTen = hoTen; }

    public String getNgaySinh() { return ngaySinh; }
    public void setNgaySinh(String ngaySinh) { this.ngaySinh = ngaySinh; }

    public String getGioiTinh() { return gioiTinh; }
    public void setGioiTinh(String gioiTinh) { this.gioiTinh = gioiTinh; }

    public String getDiaChi() { return diaChi; }
    public void setDiaChi(String diaChi) { this.diaChi = diaChi; }

    // Hiển thị thông tin cơ bản
    public void hienThiThongTin() {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("Đia chi: " + diaChi);
    }
}

// Lớp Công nhân kế thừa từ CanBo
class CongNhan extends CanBo {
    private String bac;

    public CongNhan(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String bac) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.bac = bac;
    }

    public String getBac() { return bac; }
    public void setBac(String bac) { this.bac = bac; }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Bậc: " + bac);
    }
}

// Lớp Kỹ sư kế thừa từ CanBo
class KySu extends CanBo {
    private String nganhDaoTao;

    public KySu(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() { return nganhDaoTao; }
    public void setNganhDaoTao(String nganhDaoTao) { this.nganhDaoTao = nganhDaoTao; }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Nganh dao tao: " + nganhDaoTao);
    }
}

// Lớp Nhân viên phục vụ kế thừa từ CanBo
class NhanVien extends CanBo {
    private String congViec;

    public NhanVien(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String congViec) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public String getCongViec() { return congViec; }
    public void setCongViec(String congViec) { this.congViec = congViec; }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Cong viec: " + congViec);
    }
}

// Lớp Quản lý Cán bộ
class QLCB {
    private List<CanBo> danhSach134 = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    // Nhập cán bộ mới
    public void nhapCanBo134() {
        System.out.println("Chon loai can bo: 1.Cong nhan  2.Ky su  3.Nhan vien");
        int chon = Integer.parseInt(sc.nextLine());

        System.out.print("Ho ten ");
        String hoTen = sc.nextLine();
        System.out.print("Ngay sinh: ");
        String ngaySinh = sc.nextLine();
        System.out.print("Gioi tinh: ");
        String gioiTinh = sc.nextLine();
        System.out.print("Đia chi: ");
        String diaChi = sc.nextLine();

        CanBo cb;
        switch (chon) {
            case 1:
                System.out.print("Bac: ");
                String bac = sc.nextLine();
                cb = new CongNhan(hoTen, ngaySinh, gioiTinh, diaChi, bac);
                break;
            case 2:
                System.out.print("Nganh dao tao: ");
                String nganh = sc.nextLine();
                cb = new KySu(hoTen, ngaySinh, gioiTinh, diaChi, nganh);
                break;
            case 3:
                System.out.print("Cong viec: ");
                String cv = sc.nextLine();
                cb = new NhanVien(hoTen, ngaySinh, gioiTinh, diaChi, cv);
                break;
            default:
                System.out.println("Lua chon khong hop le!");
                return;
        }
        danhSach134.add(cb);
        System.out.println("Đa them can bo!");
    }

    // Tìm kiếm theo họ tên
    public CanBo timKiemTheoTen134(String ten) {
        for (CanBo cb : danhSach134) {
            if (cb.getHoTen().equalsIgnoreCase(ten)) {
                return cb;
            }
        }
        return null;
    }

    // Hiển thị thông tin
    public void hienThiThongTin134(CanBo cb) {
        if (cb != null) {
            cb.hienThiThongTin();
        } else {
            System.out.println("Khong tim thay can bo!");
        }
    }
}

// Chương trình chính
public class Main {
    public static void main(String[] args) {
        QLCB qlcb134 = new QLCB();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Nhap can bo moi");
            System.out.println("2. Tim kiem theo ten");
            System.out.println("3. Thoat");
            System.out.print("Chon: ");
            int chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    qlcb134.nhapCanBo134();
                    break;
                case 2:
                    System.out.print("Nhậap ten can tim: ");
                    String ten = sc.nextLine();
                    CanBo kq = qlcb134.timKiemTheoTen134(ten);
                    qlcb134.hienThiThongTin134(kq);
                    break;
                case 3:
                    System.out.println("Ket thuc chuong trinh.");
                    return;
                default:
                    System.out.println("Lua chon sai!");
            }
        }
    }
}
