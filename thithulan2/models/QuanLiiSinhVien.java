package thithulan2.models;
public abstract class QuanLiiSinhVien {
    private String hoVaTen;
    private int tuoi;
    private String diaChi;
    public QuanLiiSinhVien() {
    }
    public QuanLiiSinhVien(String hoVaTen, int  tuoi, String diaChi) {
        this.hoVaTen = hoVaTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
    }
    public String getHoVaTen() {
        return hoVaTen;
    }
    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }
    public int getTuoi() {
        return tuoi;
    }
    public void setTuoi(int  tuoi) {
        this.tuoi = tuoi;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    @Override
    public String toString() {
        return
                hoVaTen +"," + tuoi +"," + diaChi;
    }
}
