package thithulan2.services.impl;

import thithulan2.models.SinhVienIT;
import thithulan2.models.SinhVienNgoaiNgu;
import thithulan2.services.SinhVienITService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SinhVienITServiceImpl implements SinhVienITService {
    static List<SinhVienIT> sinhVienITS = new ArrayList<>();
    static {
        sinhVienITS.add(new SinhVienIT("CCCCCC", 31, "dfgh", "java", "kkk"));
        sinhVienITS.add(new SinhVienIT("DDDDDD", 28, "nmkl", "C", "xxx"));
    }
    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        SinhVienIT sinhVienIT = new SinhVienIT();
        System.out.println("Nhập họ và tên");
        sinhVienIT.setHoVaTen(scanner.nextLine());
        System.out.println("Nhập TUỔI");
        sinhVienIT.setTuoi(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập địa chỉ ");
        sinhVienIT.setDiaChi(scanner.nextLine());
        System.out.println("Nhập ngôn ngữ LẬP TRÌNH");
        sinhVienIT.setNgonNguLapTrinh(scanner.nextLine());
        System.out.println("Nhập KHOA");
        sinhVienIT.setKhoa(scanner.nextLine());
        sinhVienITS.add(sinhVienIT);
        display();
    }
    //    String hoVaTen, int tuoi, String diaChi, String ngonNguLapTrinh, String khoa) {
    @Override
    public void edit(String hoVaTen) {
        for (int i = 0; i < sinhVienITS.size(); i++) {
            if (sinhVienITS.get(i).getHoVaTen().contains(hoVaTen)) ;
            System.out.println("Nhập họ và tên");
            sinhVienITS.get(i).setHoVaTen(scanner.nextLine());
            System.out.println("Nhập tuổi");
            sinhVienITS.get(i).setTuoi(Integer.parseInt(scanner.nextLine()));
            System.out.println("Nhập địa chỉ");
            sinhVienITS.get(i).setDiaChi(scanner.nextLine());
            System.out.println("Nhập ngôn ngữ lập trình");
            sinhVienITS.get(i).setNgonNguLapTrinh(scanner.nextLine());
            System.out.println("Nhập khoa");
            sinhVienITS.get(i).setKhoa(scanner.nextLine());
        }
    }

    @Override
    public void delete(String hoVaTen) {
        for (int i = 0 ; i < sinhVienITS.size(); i++){
            if (checkHoVaTen(hoVaTen)){
                if (sinhVienITS.get(i).getHoVaTen().contains(hoVaTen)){
                    sinhVienITS.remove(sinhVienITS.get(i));
                }
            }
        }

    }

    @Override
    public void search(String search) {
        for (int i = 0 ; i <sinhVienITS.size() ; i++){
            if (checkHoVaTen(search) || checkDiaChi(search)){
                if (sinhVienITS.get(i).getHoVaTen().contains(search) ||
                        sinhVienITS.get(i).getDiaChi().contains(search)){
                    System.out.println(sinhVienITS.get(i));
                }
            }
        }

    }

    @Override
    public void display() {
        for (SinhVienIT sinhVienIT : sinhVienITS) {
            System.out.println(sinhVienIT);
        }

    }

    @Override
    public boolean checkHoVaTen(String hoVaTen) {
        for (SinhVienIT sinhVienIT:sinhVienITS){
            if (sinhVienIT.getHoVaTen().contains(hoVaTen)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean checkDiaChi(String diaChi) {
        for(SinhVienIT sinhVienIT: sinhVienITS){
            if (sinhVienIT.getHoVaTen().equals(diaChi)){
                return true;
            }
        }
        return false;
    }


}
