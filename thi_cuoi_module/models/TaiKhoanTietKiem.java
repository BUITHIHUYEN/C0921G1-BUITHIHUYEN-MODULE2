package thi_cuoi_module.models;

public class TaiKhoanTietKiem extends TaiKhoanNganHang{
    private int soTienGuiTietKiem;
    private String ngayGuiTietKiem;
    private Double laiSuat;
    private String kiHan;

    public TaiKhoanTietKiem() {
    }

    public TaiKhoanTietKiem(String maTaiKhoan, String tenChuTaiKhoan, String ngayTaoTaiKhoan, int soTienGuiTietKiem, String ngayGuiTietKiem, Double laiSuat, String kiHan) {
        super(maTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan);
        this.soTienGuiTietKiem = soTienGuiTietKiem;
        this.ngayGuiTietKiem = ngayGuiTietKiem;
        this.laiSuat = laiSuat;
        this.kiHan = kiHan;
    }
    public int getSoTienGuiTietKiem() {
        return soTienGuiTietKiem;
    }

    public void setSoTienGuiTietKiem(int soTienGuiTietKiem) {
        this.soTienGuiTietKiem = soTienGuiTietKiem;
    }

    public String getNgayGuiTietKiem() {
        return ngayGuiTietKiem;
    }

    public void setNgayGuiTietKiem(String ngayGuiTietKiem) {
        this.ngayGuiTietKiem = ngayGuiTietKiem;
    }

    public Double getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(Double laiSuat) {
        this.laiSuat = laiSuat;
    }

    public String getKiHan() {
        return kiHan;
    }

    public void setKiHan(String kiHan) {
        this.kiHan = kiHan;
    }

    @Override
    public String toString() {
        return getMaTaiKhoan()+","+getTenChuTaiKhoan()+","+getNgayTaoTaiKhoan()+","+
                 soTienGuiTietKiem +","+
                ngayGuiTietKiem + ","+
                 + laiSuat +","
               + kiHan +","
               ;
    }
}
