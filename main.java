// Main.java
public class main {
    public static void main(String[] args) {
        PhanSo sp1_134 = new PhanSo(2, 3);
        PhanSo sp2_134 = new PhanSo(5, 7);
        PhanSo spTong_134;

        // Cộng
        spTong_134 = sp1_134.cong(sp2_134);
        System.out.println(sp1_134 + " + " + sp2_134 + " = " + spTong_134);

        // Trừ
        System.out.println(sp1_134 + " - " + sp2_134 + " = " + sp1_134.tru(sp2_134));

        // Nhân
        System.out.println(sp1_134 + " * " + sp2_134 + " = " + sp1_134.nhan(sp2_134));

        // Chia
        System.out.println(sp1_134 + " / " + sp2_134 + " = " + sp1_134.chia(sp2_134));

        // Kiểm tra tối giản
        System.out.println(sp1_134 + (sp1_134.laToiGian() ? " la phan so toi gian" : " chua toi gian"));

        // Rút gọn
        PhanSo psMoi = new PhanSo(6, 9);
        System.out.println(psMoi + " rut gon = " + psMoi.toiGian());
    }
}
