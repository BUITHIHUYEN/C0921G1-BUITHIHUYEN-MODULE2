package bai_tap_lam_them;

public class Student extends Person{
    private String maSinhVien;
    private String diemTrungBinh;
    private String email;

    public Student(String name, String gioiTinh, String ngaySinh, String diaChi, String maSinhVien, String diemTrungBinh, String email) {
        super(name, gioiTinh, ngaySinh, diaChi);
        this.maSinhVien = maSinhVien;
        this.diemTrungBinh = diemTrungBinh;
        this.email = email;
    }

    public Student(String maSinhVien, String diemTrungBinh, String email) {
        this.maSinhVien = maSinhVien;
        this.diemTrungBinh = diemTrungBinh;
        this.email = email;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(String diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", diemTrungBinh='" + diemTrungBinh + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public void display() {

    }

    @Override
    public void search() {

    }

    @Override
    public void upDate() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void view() {

    }

    @Override
    public void sort() {

    }
}
