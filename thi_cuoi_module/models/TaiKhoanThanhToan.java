package thi_cuoi_module.models;



public class TaiKhoanThanhToan extends TaiKhoanNganHang {
    private int soThe;
    private int soTienTrongTaiKhoan;
    public TaiKhoanThanhToan() {
    }

    public TaiKhoanThanhToan(int soThe, int soTienTrongTaiKhoan) {
        this.soThe = soThe;
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    public TaiKhoanThanhToan(String maTaiKhoan, String tenChuTaiKhoan, String ngayTaoTaiKhoan, int soThe, int soTienTrongTaiKhoan) {
        super(maTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan);
        this.soThe = soThe;
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    public int getSoThe() {
        return soThe;
    }

    public void setSoThe(int soThe) {
        this.soThe = soThe;
    }

    public int getSoTienTrongTaiKhoan() {
        return soTienTrongTaiKhoan;
    }

    public void setSoTienTrongTaiKhoan(int soTienTrongTaiKhoan) {
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    @Override
    public String toString() {
        return getMaTaiKhoan()+","+getTenChuTaiKhoan()+","+getNgayTaoTaiKhoan()+","+
                 soThe + ","+ soTienTrongTaiKhoan ;
    }
}
