package bai_lam_them_1.models;

public class TaiKhoanTietKiem extends TaiKhoanNganHang{
    private int soTienGuiTietKiem;
    private String ngayGuiTietKiem;
    private double laiSuat;
    private double kiHan;

    public TaiKhoanTietKiem() {
    }

    public TaiKhoanTietKiem(String maTaiKhoan, String tenChuTaiKhoan, String ngayTaoTaiKhoan,
                            int soTienGuiTietKiem, String ngayGuiTietKiem, double laiSuat, double kiHan) {
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

    public double getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(double laiSuat) {
        this.laiSuat = laiSuat;
    }

    public double getKiHan() {
        return kiHan;
    }

    public void setKiHan(double kiHan) {
        this.kiHan = kiHan;
    }

    @Override
    public String toString() {
        return "TaiKhoanTietKiem{" +
                "maTaiKhoan="+ getMaTaiKhoan()+
                "tenChuTaiKhoan="+getTenChuTaiKhoan()+
                "ngayTaoTaiKhoan="+ getNgayTaoTaiKhoan()+
                "soTienGuiTietKiem"+ getSoTienGuiTietKiem()+
                "ngayGuiTietKiem="+getNgayGuiTietKiem()+
                "laiSuat="+getLaiSuat()+
                "kiHan="+getKiHan()+
                "soTienGuiTietKiem=" + soTienGuiTietKiem +
                ", ngayGuiTietKiem='" + ngayGuiTietKiem + '\'' +
                ", laiSuat=" + laiSuat +
                ", kiHan=" + kiHan +
                '}';
    }
}
