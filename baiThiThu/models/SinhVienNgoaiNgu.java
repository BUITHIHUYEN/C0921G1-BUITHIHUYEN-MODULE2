package baiThiThu.models;

public class SinhVienNgoaiNgu  extends SinhVien {
    private int soThe;

    public int getSoThe() {
        return soThe;
    }

    public void setSoThe(int soThe) {
        this.soThe = soThe;
    }

    public SinhVienNgoaiNgu() {
    }


    public SinhVienNgoaiNgu(String maSinhVien, String tenSinhVien, String ngayNhapHoc, int soThe) {
        super(maSinhVien, tenSinhVien, ngayNhapHoc);
        this.soThe = soThe;
    }

    @Override
    public String toString() {
        return getMaSinhVien()+","+getTenSinhVien()+","+getNgayNhapHoc()+","+soThe;
    }
}
