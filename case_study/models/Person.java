package case_study.models;

public abstract class Person {
    private String maID;
    private String hoVaTen;
    private String ngaySinh;
    private String gioiTinh;
    private int soCMND;
    private String soDienThoai;
    private String email;

    public Person() {
    }

    public Person(String maID, String hoVaTen, String ngaySinh, String gioiTinh,
                  int soCMND, String soDienThoai, String email) {
        this.maID = maID;
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soCMND = soCMND;
        this.soDienThoai = soDienThoai;
        this.email = email;
    }

    public String getMaID() {
        return maID;
    }

    public void setMaID(String maID) {
        this.maID = maID;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(int soCMND) {
        this.soCMND = soCMND;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "maID='" + maID + '\'' +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", soCMND=" + soCMND +
                ", soDienThoai=" + soDienThoai +
                ", email='" + email + '\'' +
                '}';
    }
}
