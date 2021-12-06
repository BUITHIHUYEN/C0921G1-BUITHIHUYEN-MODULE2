package thithulan2.services;

public interface QuanLiSinhVienService {
    void add ();
    void edit(String hoVaTen);
    void delete(String hoVaTen);
    void search(String search);
    void display();
    boolean checkHoVaTen(String hoVaTen);
    boolean checkDiaChi(String diaChi);


}
