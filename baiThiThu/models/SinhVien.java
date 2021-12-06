package baiThiThu.models;

public abstract class SinhVien {
    private String maSinhVien;
    private String tenSinhVien;
    private String ngayNhapHoc;

    public SinhVien() {
    }

    public SinhVien(String maSinhVien,
                    String tenSinhVien, String ngayNhapHoc) {
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.ngayNhapHoc = ngayNhapHoc;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public String getNgayNhapHoc() {
        return ngayNhapHoc;
    }

    public void setNgayNhapHoc(String ngayNhapHoc) {
        this.ngayNhapHoc = ngayNhapHoc;
    }

    @Override
    public String toString() {
        return  maSinhVien + "," +tenSinhVien + ","  + ngayNhapHoc;
    }
}
