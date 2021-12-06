package thithulan2.models;
public class SinhVienNgoaiNgu extends QuanLiiSinhVien{
    private String ngonNgu;
    private String bangCap;
    public SinhVienNgoaiNgu() {
    }

    public SinhVienNgoaiNgu(String hoVaTen, int tuoi, String diaChi, String ngonNgu, String bangCap) {
        super(hoVaTen, tuoi, diaChi);
        this.ngonNgu = ngonNgu;
        this.bangCap = bangCap;
    }

    public String getNgonNgu() {
        return ngonNgu;
    }
    public void setNgonNgu(String ngonNgu) {
        this.ngonNgu = ngonNgu;
    }
    public String getBangCap() {
        return bangCap;
    }
    public void setBangCap(String bangCap) {
        this.bangCap = bangCap;
    }
    @Override
    public String toString() {
        return
                getHoVaTen()+","+getTuoi()+","+getDiaChi()+","+ ngonNgu +"," + bangCap ;
    }
}
