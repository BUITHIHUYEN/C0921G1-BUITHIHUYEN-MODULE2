package thi_thu_lan_1.models;

public class SinhVienThongTin extends QuanLiSinhVien {
    private int tienHocPhi;
    private String ngayRaTruong;

    public SinhVienThongTin() {
    }

    public SinhVienThongTin(String maSinhVien, String tenSinhVien, String ngayNhapHoc, int tienHocPhi, String ngayRaTruong) {
        super(maSinhVien, tenSinhVien, ngayNhapHoc);
        this.tienHocPhi = tienHocPhi;
        this.ngayRaTruong = ngayRaTruong;
    }

    public int getTienHocPhi() {
        return tienHocPhi;
    }

    public void setTienHocPhi(int tienHocPhi) {
        this.tienHocPhi = tienHocPhi;
    }

    public String getNgayRaTruong() {
        return ngayRaTruong;
    }

    public void setNgayRaTruong(String ngayRaTruong) {
        this.ngayRaTruong = ngayRaTruong;
    }

    @Override
    public String toString() {
        return getMaSinhVien()+","+getTenSinhVien()+","+getNgayNhapHoc()+","+
               tienHocPhi +","+ ngayRaTruong;

    }
}
