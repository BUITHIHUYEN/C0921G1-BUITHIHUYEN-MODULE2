package thi_thu_lan_1.models;

public class SinhVienNgoaiNgu extends QuanLiSinhVien{
    private int soTheSinhvien;

    public SinhVienNgoaiNgu() {
    }

    public SinhVienNgoaiNgu(String maSinhVien, String tenSinhVien, String ngayNhapHoc, int soTheSinhvien) {
        super(maSinhVien, tenSinhVien, ngayNhapHoc);
        this.soTheSinhvien = soTheSinhvien;
    }

    public int getSoTheSinhvien() {
        return soTheSinhvien;
    }

    public void setSoTheSinhvien(int soTheSinhvien) {
        this.soTheSinhvien = soTheSinhvien;
    }


}
