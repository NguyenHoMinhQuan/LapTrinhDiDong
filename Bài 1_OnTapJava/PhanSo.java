public class PhanSo {
    // Thuộc tính riêng
    private int tuSo;
    private int mauSo;

    // Constructor không tham số
    public PhanSo() {
        this.tuSo = 0;
        this.mauSo = 1; 
    }

    // Constructor có tham số
    public PhanSo(int tuSo, int mauSo) {
        if (mauSo == 0) {
            throw new IllegalArgumentException("Mau so khong duoc bang 0");
        }
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    // Getter và Setter
    public int getTuSo() {
        return tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public void setMauSo(int mauSo) {
        if (mauSo == 0) {
            throw new IllegalArgumentException("Mau so khong duoc bang 0");
        }
        this.mauSo = mauSo;
    }

    // Tính UCLN (Ước chung lớn nhất)
    public static int ucln(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    // Kiểm tra phân số tối giản
    public boolean laToiGian() {
        return ucln(tuSo, mauSo) == 1;
    }

    // Rút gọn phân số
    public PhanSo toiGian() {
        int u = ucln(tuSo, mauSo);
        return new PhanSo(tuSo / u, mauSo / u);
    }

    // Cộng hai phân số
    public PhanSo cong(PhanSo ps) {
        int tu = this.tuSo * ps.mauSo + ps.tuSo * this.mauSo;
        int mau = this.mauSo * ps.mauSo;
        return new PhanSo(tu, mau).toiGian();
    }

    // Trừ hai phân số
    public PhanSo tru(PhanSo ps) {
        int tu = this.tuSo * ps.mauSo - ps.tuSo * this.mauSo;
        int mau = this.mauSo * ps.mauSo;
        return new PhanSo(tu, mau).toiGian();
    }

    // Nhân hai phân số
    public PhanSo nhan(PhanSo ps) {
        int tu = this.tuSo * ps.tuSo;
        int mau = this.mauSo * ps.mauSo;
        return new PhanSo(tu, mau).toiGian();
    }

    // Chia hai phân số
    public PhanSo chia(PhanSo ps) {
        if (ps.tuSo == 0) {
            throw new ArithmeticException("Khong the chia cho phan so co tu so = 0");
        }
        int tu = this.tuSo * ps.mauSo;
        int mau = this.mauSo * ps.tuSo;
        return new PhanSo(tu, mau).toiGian();
    }

    // Hiển thị phân số
    @Override
    public String toString() {
        if (mauSo == 1) {
            return tuSo + "";
        }
        return tuSo + "/" + mauSo;
    }
}
