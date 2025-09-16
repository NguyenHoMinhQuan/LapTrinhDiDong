public class Nguoi {
    private String hoTen134;
    private String ngaySinh134;
    private String cmnd134;

    public Nguoi() {}

    public Nguoi(String hoTen134, String ngaySinh134, String cmnd134) {
        this.hoTen134 = hoTen134;
        this.ngaySinh134 = ngaySinh134;
        this.cmnd134 = cmnd134;
    }

    public String getHoTen134() {
        return hoTen134;
    }

    public void setHoTen134(String hoTen134) {
        this.hoTen134 = hoTen134;
    }

    public String getNgaySinh134() {
        return ngaySinh134;
    }

    public void setNgaySinh134(String ngaySinh134) {
        this.ngaySinh134 = ngaySinh134;
    }

    public String getCmnd134() {
        return cmnd134;
    }

    public void setCmnd134(String cmnd134) {
        this.cmnd134 = cmnd134;
    }

    public void hienThiThongTin134() {
        System.out.println("Ho ten: " + hoTen134 + 
                           ", Ngay sinh: " + ngaySinh134 + 
                           ", CMND: " + cmnd134);
    }
}
