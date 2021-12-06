package baiThiThu.service;

public interface SinhVienService {
    void them();
    void sua();
    void xoa(String maSinhVien);
    void disPlay();
    void timKiem(String timKiem);
    boolean checkTenSinhVien(String tenSinhVien);
    boolean checkMaSinhVien(String maSinhVien);
}
