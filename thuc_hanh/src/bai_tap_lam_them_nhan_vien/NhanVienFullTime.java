package bai_tap_lam_them_nhan_vien;

import java.util.Scanner;

public class NhanVienFullTime extends NhanVien {
    protected int lamThem = 1;
    protected int loaiChucVu;

    public NhanVienFullTime() {
    }

    public NhanVienFullTime(String ten) {
        super(ten);
    }

    public NhanVienFullTime(int lamThem, int loaiChucVu) {
        this.lamThem = lamThem;
        this.loaiChucVu = loaiChucVu;
    }

    public NhanVienFullTime(String ten, int lamThem, int loaiChucVu) {
        super(ten);
        this.lamThem = lamThem;
        this.loaiChucVu = loaiChucVu;
    }

        @Override
    public int tinhLuong() {

            if (loaiChucVu == Configs.NHAN_VIEN_LINH) {
                luong = (int) (Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH + lamThem * Configs.LUONG_LAM_THEM_MOI_NGAY);
            } else if (loaiChucVu == Configs.NHAN_VIEN_SEP) {
                luong = (int) (Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP + lamThem * Configs.LUONG_LAM_THEM_MOI_NGAY);
            }
            return luong;
        }
    @Override
    public String loaiNhanVien() {
        if (loaiChucVu==Configs.NHAN_VIEN_SEP) {
            return "Lính toàn thời gian" + (lamThem > 0 ? " (có làm thêm ngày)":"");
        } else {
            return "Sếp toàn thời gian" + (lamThem > 0 ? " (có làm thêm ngày)":"");
        }
    }

    public int getLamThem() {
        return lamThem;
    }

    public void setLamThem(int lamThem) {
        this.lamThem = lamThem;
    }

    public int luongLamThem(){
        return lamThem*80;
    }


    public static void main(String[] args) {
        // Kêu người dùng nhập vào số lượng nhân viên trong công ty
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập số lượng nhân viên: ");
        int tongNhanVien = Integer.parseInt(scanner.nextLine());
        NhanVien[] mangNhanVien = new NhanVien[tongNhanVien];
        for (int i = 0; i < tongNhanVien; i++) {
            System.out.print("Tên nhân viên " + (i + 1) + ": ");
            String ten = scanner.nextLine();
            System.out.print("Là nhân viên (1-Toàn thời gian; 2-Bán thời gian): ");
            int laNhanVien = Integer.parseInt(scanner.nextLine());
            if (laNhanVien == 1) {

                System.out.print("Chức vụ nhân viên (1-Sếp; 2-Lính): ");
                int chucVu = Integer.parseInt(scanner.nextLine());
                System.out.print("Ngày làm thêm (nếu có): ");
                int ngayLamThem = Integer.parseInt(scanner.nextLine());
                mangNhanVien[i] = new NhanVienFullTime(ten, ngayLamThem, chucVu);
            }
        }
        System.out.println("\nKết quả tính lương\n");
        for (NhanVien nhanVien : mangNhanVien) {
            nhanVien.tinhLuong();
            nhanVien.xuatThongTin();
        }
    }
}
