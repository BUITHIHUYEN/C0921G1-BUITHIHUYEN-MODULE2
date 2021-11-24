package bai_lam_them_1.models;

public class TaiKhoanThanhToan extends TaiKhoanNganHang{
    private String soThe;
    private int soTienTrongThe;

    public TaiKhoanThanhToan() {
    }

    public TaiKhoanThanhToan( String maTaiKhoan, String tenChuTaiKhoan, String ngayTaoTaiKhoan, String soThe, int soTienTrongThe) {
        super(maTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan);
        this.soThe = soThe;
        this.soTienTrongThe = soTienTrongThe;
    }

    public String getSoThe() {
        return soThe;
    }

    public void setSoThe(String soThe) {
        this.soThe = soThe;
    }

    public int getSoTienTrongThe() {
        return soTienTrongThe;
    }

    public void setSoTienTrongThe(int soTienTrongThe) {
        this.soTienTrongThe = soTienTrongThe;
    }

    @Override
    public String toString() {
        return "TaiKhoanThanhToan{" +
                "maTaiKhoan = "+ getMaTaiKhoan()+
                "tenChuTaiKhoan="+ getTenChuTaiKhoan()+
                "ngayTaoTaiKhoan="+getNgayTaoTaiKhoan()+
                "soThe="+getSoThe()+
                "soTienTrongThe="+getSoTienTrongThe()+
                "soThe='" + soThe + '\'' +
                ", soTienTrongThe=" + soTienTrongThe +
                '}';
    }
}
