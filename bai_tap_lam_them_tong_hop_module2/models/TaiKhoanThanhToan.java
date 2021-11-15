package bai_tap_lam_them_tong_hop_module2.models;

public class TaiKhoanThanhToan extends TaiKhoanNganHang{
    private int soThe;
    private double soTienTrongTaiKhoan;

    public TaiKhoanThanhToan() {
    }

    public TaiKhoanThanhToan(int maIDTaiKhoan, String tenChuTaiKhoan, String ngayTaoTaiKhoan, int soThe, double soTienTrongTaiKhoan) {
        super(maIDTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan);
        this.soThe = soThe;
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    public int getSoThe() {
        return soThe;
    }

    public void setSoThe(int soThe) {
        this.soThe = soThe;
    }

    public double getSoTienTrongTaiKhoan() {
        return soTienTrongTaiKhoan;
    }

    public void setSoTienTrongTaiKhoan(double soTienTrongTaiKhoan) {
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    @Override
    public String toString() {
        return "TaiKhoanThanhToan{" +"maIDTaiKhoan =" +
                getMaIDTaiKhoan() +
                "tenChuTaiKhoan = " + getTenChuTaiKhoan() + "ngayTaoTaiKhoan = " + getNgayTaoTaiKhoan()+
                "soThe=" + soThe +
                ", soTienTrongTaiKhoan=" + soTienTrongTaiKhoan +
                "} ";
    }
}
