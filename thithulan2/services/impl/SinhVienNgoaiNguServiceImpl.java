package thithulan2.services.impl;
import thithulan2.models.SinhVienNgoaiNgu;
import thithulan2.services.SinhVienNgoaiNguService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SinhVienNgoaiNguServiceImpl implements SinhVienNgoaiNguService {
    static List<SinhVienNgoaiNgu> sinhVienNgoaiNgus = new ArrayList<>();
    static {
        sinhVienNgoaiNgus.add(new SinhVienNgoaiNgu("AAAA", 28, "aaaaaaa", "nnnnn", "hhhhh"));
        sinhVienNgoaiNgus.add(new SinhVienNgoaiNgu("BBBB", 26, "bbbbbbb", "mmmmm", "kkkkk"));
    }
    Scanner scanner = new Scanner(System.in);
    @Override
    public void add() {
        SinhVienNgoaiNgu sinhVienNgoaiNgu = new SinhVienNgoaiNgu();
        System.out.println("Nhập họ và tên");
        sinhVienNgoaiNgu.setHoVaTen(scanner.nextLine());
        System.out.println("Nhập TUỔI");
        sinhVienNgoaiNgu.setTuoi(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập địa chỉ ");
        sinhVienNgoaiNgu.setDiaChi(scanner.nextLine());
        System.out.println("Nhập ngôn ngữ");
        sinhVienNgoaiNgu.setNgonNgu(scanner.nextLine());
        System.out.println("Nhập bằng cấp");
        sinhVienNgoaiNgu.setBangCap(scanner.nextLine());
        sinhVienNgoaiNgus.add(sinhVienNgoaiNgu);
        display();
    }
    @Override
    public void edit(String hoVaTen) {
        //    String hoVaTen, String tuoi, String diaChi, String ngonNgu, String bangCap)
        for (int i = 0; i < sinhVienNgoaiNgus.size(); i++) {
                if (sinhVienNgoaiNgus.get(i).getHoVaTen().equals(hoVaTen)) ;
            System.out.println("Nhập họ và tên");
            sinhVienNgoaiNgus.get(i).setHoVaTen(scanner.nextLine());
            System.out.println("Nhập tuổi");
            sinhVienNgoaiNgus.get(i).setTuoi(Integer.parseInt(scanner.nextLine()));
            System.out.println("Nhập địa chỉ");
            sinhVienNgoaiNgus.get(i).setDiaChi(scanner.nextLine());
            System.out.println("Nhập ngôn ngữ");
            sinhVienNgoaiNgus.get(i).setNgonNgu(scanner.nextLine());
            System.out.println("Nhập bằng cấp");
            sinhVienNgoaiNgus.get(i).setBangCap(scanner.nextLine());
        }
    }
    @Override
    public void delete(String hoVaTen) {
        for (int i = 0 ; i < sinhVienNgoaiNgus.size(); i++){
            if (checkHoVaTen(hoVaTen)){
                if (sinhVienNgoaiNgus.get(i).getHoVaTen().equals(hoVaTen)){
                    sinhVienNgoaiNgus.remove(sinhVienNgoaiNgus.get(i));
                } else {
                    System.err.println("MÀY NHẬP NGU NHƯ BÒ");
                }
            }
        }
    }
    @Override
    public void search(String search) {
        for (int i = 0 ; i <sinhVienNgoaiNgus.size() ; i++){
            if (checkHoVaTen(search) || checkDiaChi(search)){
                if (sinhVienNgoaiNgus.get(i).getHoVaTen().contains(search) ||
                        sinhVienNgoaiNgus.get(i).getDiaChi().contains(search)){
                    System.out.println(sinhVienNgoaiNgus.get(i));
                }
            }
        }
    }
    @Override
    public void display() {
        for (SinhVienNgoaiNgu sinhVienNgoaiNgu:sinhVienNgoaiNgus) {
            System.out.println(sinhVienNgoaiNgu);
        }

    }

    @Override
    public boolean checkHoVaTen(String hoVaTen) {
        for (SinhVienNgoaiNgu sinhVienNgoaiNgu:sinhVienNgoaiNgus){
            if (sinhVienNgoaiNgu.getHoVaTen().contains(hoVaTen)){
                return  true;
            }
        }
        return false;
    }

    @Override
    public boolean checkDiaChi(String diaChi) {
        for(SinhVienNgoaiNgu sinhVienNgoaiNgu: sinhVienNgoaiNgus){
            if (sinhVienNgoaiNgu.getHoVaTen().equals(diaChi)){
                return true;
            }
        }
        return false;
    }
}




