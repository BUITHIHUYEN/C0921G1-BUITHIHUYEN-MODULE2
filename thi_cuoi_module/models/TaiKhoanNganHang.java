package thi_cuoi_module.models;

public abstract  class TaiKhoanNganHang {
    private String maTaiKhoan;
    private String tenChuTaiKhoan;
    private String ngayTaoTaiKhoan;

    public TaiKhoanNganHang() {
    }

    public TaiKhoanNganHang(String maTaiKhoan, String tenChuTaiKhoan, String ngayTaoTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
        this.tenChuTaiKhoan = tenChuTaiKhoan;
        this.ngayTaoTaiKhoan = ngayTaoTaiKhoan;
    }

    public String getMaTaiKhoan() {
        return maTaiKhoan;
    }

    public void setMaTaiKhoan(String maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
    }

    public String getTenChuTaiKhoan() {
        return tenChuTaiKhoan;
    }

    public void setTenChuTaiKhoan(String tenChuTaiKhoan) {
        this.tenChuTaiKhoan = tenChuTaiKhoan;
    }

    public String getNgayTaoTaiKhoan() {
        return ngayTaoTaiKhoan;
    }

    public void setNgayTaoTaiKhoan(String ngayTaoTaiKhoan) {
        this.ngayTaoTaiKhoan = ngayTaoTaiKhoan;
    }

    @Override
    public String toString() {
        return
                maTaiKhoan + "," + tenChuTaiKhoan + ","+ ngayTaoTaiKhoan;
    }
}
