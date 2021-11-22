package bai_tap_cuoi_tuan_4.services;

public interface ManageCandidatesServices {
    void add();
    void display();
    void edit(String firstName);
    void search(String lastName);
    void delete(String email);
}
