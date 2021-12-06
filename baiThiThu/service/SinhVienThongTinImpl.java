package baiThiThu.service;

import baiThiThu.models.SinhVienNgoaiNgu;
import baiThiThu.models.SinhVienThongTin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SinhVienThongTinImpl implements SinhVienService {
    static List<SinhVienThongTin> sinhVienThongTins = new ArrayList<>();

    static {
        sinhVienThongTins.add(new SinhVienThongTin("C0001", "TAI DOAN", "1", 4.5, "1"));
    }
    Scanner scanner = new Scanner(System.in);
    @Override
    public void them() {
        SinhVienThongTin sinhVienThongTin = new SinhVienThongTin();
        System.out.println("Nhập mã sinh viên");
        sinhVienThongTin.setMaSinhVien(scanner.nextLine());
        System.out.println("Nhập tên sinh viên");
        sinhVienThongTin.setTenSinhVien(scanner.nextLine());
        System.out.println("Nhập ngày nhập học ");
        sinhVienThongTin.setNgayNhapHoc(scanner.nextLine());
        System.out.println("Nhập tiền học phí");
        sinhVienThongTin.setTienHocPhi(Double.parseDouble(scanner.nextLine()));
        System.out.println("Nhập ngày ra trường ");
        sinhVienThongTin.setNgayRaTruong(scanner.nextLine());

        sinhVienThongTins.add(sinhVienThongTin);
    }

    @Override
    public void sua() {

    }

    @Override
    public void xoa(String maSinhVien) {
        for (int i = 0 ; i < sinhVienThongTins.size(); i++){
            if (checkMaSinhVien(maSinhVien)){
                if (sinhVienThongTins.get(i).getMaSinhVien().equals(maSinhVien)){
                    sinhVienThongTins.remove(sinhVienThongTins.get(i));
                }
            }
        }
    }

    @Override
    public void disPlay() {
        int id = 1;
        for (SinhVienThongTin sinhVienThongTin : sinhVienThongTins) {
            System.out.print(id++ + "--");
            System.out.println(sinhVienThongTin);
        }
    }

    @Override
    public void timKiem(String timKiem) {
            for (int i = 0 ; i < sinhVienThongTins.size() ; i++){
                if (checkMaSinhVien(timKiem) || checkTenSinhVien(timKiem)){
                    if (sinhVienThongTins.get(i).getTenSinhVien().contains(timKiem) ||
                    sinhVienThongTins.get(i).getMaSinhVien().contains(timKiem)){
                        System.out.println(sinhVienThongTins.get(i));
                    }
                }
            }
    }
    @Override
    public boolean checkMaSinhVien(String maSinhVien){
        for (SinhVienThongTin sinhVienThongTin : sinhVienThongTins){
            if(sinhVienThongTin.getMaSinhVien().equals(maSinhVien)){
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean checkTenSinhVien(String tenSinhVien){
        for (SinhVienThongTin sinhVienThongTin : sinhVienThongTins){
            if(sinhVienThongTin.getTenSinhVien().equals(tenSinhVien)){
                return true;
            }
        }
        return false;
    }
}

