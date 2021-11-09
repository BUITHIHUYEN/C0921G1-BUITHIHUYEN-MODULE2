package bai_tap_lam_them;

public class Teacher extends Person{
    private String display;
    private String luongMotGioDay;
    private String soGioDayTrongThang;

    public Teacher(String name, String gioiTinh, String ngaySinh, String diaChi, String display, String luongMotGioDay, String soGioDayTrongThang) {
        super(name, gioiTinh, ngaySinh, diaChi);
        this.display = display;
        this.luongMotGioDay = luongMotGioDay;
        this.soGioDayTrongThang = soGioDayTrongThang;
    }

    public Teacher(String display, String luongMotGioDay, String soGioDayTrongThang) {
        this.display = display;
        this.luongMotGioDay = luongMotGioDay;
        this.soGioDayTrongThang = soGioDayTrongThang;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getLuongMotGioDay() {
        return luongMotGioDay;
    }

    public void setLuongMotGioDay(String luongMotGioDay) {
        this.luongMotGioDay = luongMotGioDay;
    }

    public String getSoGioDayTrongThang() {
        return soGioDayTrongThang;
    }

    public void setSoGioDayTrongThang(String soGioDayTrongThang) {
        this.soGioDayTrongThang = soGioDayTrongThang;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "display='" + display + '\'' +
                ", luongMotGioDay='" + luongMotGioDay + '\'' +
                ", soGioDayTrongThang='" + soGioDayTrongThang + '\'' +
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
