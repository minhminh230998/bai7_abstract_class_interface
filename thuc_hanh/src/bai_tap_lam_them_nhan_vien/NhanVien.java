package bai_tap_lam_them_nhan_vien;

abstract class NhanVien {
    protected String ten;
    protected int luong;

    public NhanVien() {
    }

    public NhanVien(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }


    public abstract int tinhLuong();
    public abstract String loaiNhanVien();
    public void xuatThongTin() {
        System.out.println("===== Nhân viên: " + ten + " =====");
        System.out.println("- Loại nhân viên: " + loaiNhanVien());
        System.out.println("- Lương: " + luong + " VND");
    }
}
