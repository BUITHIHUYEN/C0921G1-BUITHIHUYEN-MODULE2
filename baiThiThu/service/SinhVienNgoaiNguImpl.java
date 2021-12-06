package baiThiThu.service;

import baiThiThu.DocGhiFile.GhiFile;
import baiThiThu.models.SinhVienNgoaiNgu;
import baiThiThu.models.SinhVienThongTin;
import case_study.models.Customer;
import case_study.readwrite.FileWriterReader;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SinhVienNgoaiNguImpl implements SinhVienService{
    public static final String PATH = "D:\\CODEGYMMODULE2\\C0921G1-BUITHIHUYEN-MODULE2\\src\\baiThiThu\\data\\SinhVienNgoaiNgu.csv";
    List<SinhVienNgoaiNgu> sinhVienNgoaiNgus = new ArrayList<>();
    {

        sinhVienNgoaiNgus = covertStringToCustomer();
    }
    Scanner scanner = new Scanner(System.in);
    @Override
    public void them() {
        SinhVienNgoaiNgu sinhVienNgoaiNgu = new SinhVienNgoaiNgu();
        System.out.println("Nhập mã sinh viên");
        sinhVienNgoaiNgu.setMaSinhVien(scanner.nextLine());
        System.out.println("Nhập tên sinh viên");
        sinhVienNgoaiNgu.setTenSinhVien(scanner.nextLine());
        System.out.println("Nhập ngày nhập học ");
        sinhVienNgoaiNgu.setNgayNhapHoc(scanner.nextLine());
        System.out.println("Nhập số thẻ");
        sinhVienNgoaiNgu.setSoThe(Integer.parseInt(scanner.nextLine()));

        sinhVienNgoaiNgus.add(sinhVienNgoaiNgu);
        List<String> stringList = covertToString();
        GhiFile.writeFile(PATH, stringList, true);
    }

    @Override
    public void sua() {

    }

    @Override
    public void xoa(String maSinhVien) {
            for (int i = 0 ; i < sinhVienNgoaiNgus.size(); i++){
                if (checkMaSinhVien(maSinhVien)){
                    if (sinhVienNgoaiNgus.get(i).getMaSinhVien().equals(maSinhVien)){
                        sinhVienNgoaiNgus.remove(sinhVienNgoaiNgus.get(i));
                    }
                }
            }
    }

    @Override
    public void disPlay() {
        int id = 1 ;
            for (SinhVienNgoaiNgu sinhVienNgoaiNgu : sinhVienNgoaiNgus){
                System.out.print(id++ + "--");
                System.out.println(sinhVienNgoaiNgu);
            }
    }

    @Override
    public void timKiem(String timKiem) {
        for (int i = 0 ; i < sinhVienNgoaiNgus.size() ; i++){
            if (checkMaSinhVien(timKiem) || checkTenSinhVien(timKiem)){
                if (sinhVienNgoaiNgus.get(i).getTenSinhVien().contains(timKiem) ||
                        sinhVienNgoaiNgus.get(i).getMaSinhVien().contains(timKiem)){
                    System.out.println(sinhVienNgoaiNgus.get(i));
                }
            }
        }
    }
    @Override
    public boolean checkMaSinhVien(String maSinhVien){
        for (SinhVienNgoaiNgu sinhVienNgoaiNgu : sinhVienNgoaiNgus){
                if(sinhVienNgoaiNgu.getMaSinhVien().equals(maSinhVien)){
                    return true;
                }
        }
        return false;
    }
    @Override
    public boolean checkTenSinhVien(String tenSinhVien){
        for (SinhVienNgoaiNgu sinhVienNgoaiNgu : sinhVienNgoaiNgus){
            if(sinhVienNgoaiNgu.getTenSinhVien().equals(tenSinhVien)){
                return true;
            }
        }
        return false;
    }

    public List<SinhVienNgoaiNgu> covertStringToCustomer() {
        List<String> stringList = GhiFile.readFile(PATH);
        List<SinhVienNgoaiNgu> sinhVienNgoaiNgus = new ArrayList<>();
        String[] arrSinhVienNgoaiNgu;
        for (String line : stringList) {
            arrSinhVienNgoaiNgu = line.split(",");
            sinhVienNgoaiNgus.add(new SinhVienNgoaiNgu(arrSinhVienNgoaiNgu[0], arrSinhVienNgoaiNgu[1], arrSinhVienNgoaiNgu[2],
                    Integer.parseInt(arrSinhVienNgoaiNgu[3])));
        }
        return sinhVienNgoaiNgus;
    }
    public List<String> covertToString() {
        List<String> listString = new ArrayList<>();
        for (SinhVienNgoaiNgu sinhVienNgoaiNgu: sinhVienNgoaiNgus) {
            listString.add(sinhVienNgoaiNgu.toString());
        }
        return listString;
    }

}
