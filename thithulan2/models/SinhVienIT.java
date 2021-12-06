package thithulan2.models;
public class SinhVienIT extends QuanLiiSinhVien{
    private String ngonNguLapTrinh;
    private String khoa;
    public SinhVienIT() {
    }

    public SinhVienIT(String hoVaTen, int tuoi, String diaChi, String ngonNguLapTrinh, String khoa) {
        super(hoVaTen, tuoi, diaChi);
        this.ngonNguLapTrinh = ngonNguLapTrinh;
        this.khoa = khoa;
    }

    public String getNgonNguLapTrinh() {
        return ngonNguLapTrinh;
    }
    public void setNgonNguLapTrinh(String ngonNguLapTrinh) {
        this.ngonNguLapTrinh = ngonNguLapTrinh;
    }
    public String getKhoa() {
        return khoa;
    }
    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }
    @Override
    public String toString() {
        return
                getHoVaTen()+","+ getTuoi()+","+getDiaChi()+","+ ngonNguLapTrinh + "," + khoa;
    }
}
