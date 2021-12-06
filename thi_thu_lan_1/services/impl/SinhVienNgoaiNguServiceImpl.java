//package thi_thu_lan_1.services.impl;
//import bai_tap_cuoi_tuan_4.services.ManageCandidatesServices;
//import case_study.readwrite.FileWriterReader;
//import thi_cuoi_module.models.TaiKhoanThanhToan;
//import thi_thu_lan_1.models.SinhVienNgoaiNgu;
//import thi_thu_lan_1.models.SinhVienThongTin;
//import thi_thu_lan_1.services.SinhVienNgoaiNguService;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class SinhVienNgoaiNguServiceImpl implements SinhVienNgoaiNguService {
//    static List<SinhVienNgoaiNgu> sinhVienNgoaiNgus = new ArrayList<>();
//    static {
//        sinhVienNgoaiNgus.add(new SinhVienNgoaiNgu("1","a","12",23));
//        sinhVienNgoaiNgus.add(new SinhVienNgoaiNgu("2","b","13",24));
//        sinhVienNgoaiNgus.add(new SinhVienNgoaiNgu("3","c","14",25));
//    }
//    Scanner scanner = new Scanner(System.in);
//
//    @Override
//    public void add() {
//        SinhVienNgoaiNgu sinhVienNgoaiNgu = new SinhVienNgoaiNgu();
//        System.out.println("Nhập mã sinh viên");
//        sinhVienNgoaiNgu.setMaSinhVien(scanner.nextLine());
//        System.out.println("Nhập tên sinh viên");
//        sinhVienNgoaiNgu.setTenSinhVien(scanner.nextLine());
//        System.out.println("Nhập ngày nhập học");
//        sinhVienNgoaiNgu.setNgayNhapHoc(scanner.nextLine());
//        System.out.println("Nhập số thẻ Sinh viên");
//        sinhVienNgoaiNgu.setSoTheSinhvien(Integer.parseInt(scanner.nextLine()));
//        sinhVienNgoaiNgus.add(sinhVienNgoaiNgu);
//        display();
//    }
////    maSinhVien, String tenSinhVien, String ngayNhapHoc, int soTheSinhvien
//    @Override
//    public void edit(String maSinhVien) {
//        for (int i = 0; i < sinhVienNgoaiNgus.size(); i++) {
//            if (sinhVienNgoaiNgus.get(i).getMaSinhVien().equals(maSinhVien)) {
//                System.out.println("Mã sinh viên");
//                sinhVienNgoaiNgus.get(i).setMaSinhVien(scanner.nextLine());
//                System.out.println("Tên sinh viên");
//                sinhVienNgoaiNgus.get(i).setTenSinhVien(scanner.nextLine());
//                System.out.println("Ngày nhập học");
//                sinhVienNgoaiNgus.get(i).setNgayNhapHoc(scanner.nextLine());
//                System.out.println("Số thẻ sinh viên");
//                sinhVienNgoaiNgus.get(i).setSoTheSinhvien(Integer.parseInt(scanner.nextLine()));
//            }
//        }
//    }
//
//    @Override
//    public void display() {
//        int maID = 1;
//
//        for (SinhVienNgoaiNgu sinhVienNgoaiNgu:sinhVienNgoaiNgus) {
//            System.out.print(maID++ + "--");
//            System.out.println(sinhVienNgoaiNgu);
//        }
//    }
//
//    @Override
//    public void delete(String maSinhVien) {
//        for (int i = 0; i < sinhVienNgoaiNgus.size(); i++) {
//            if (sinhVienNgoaiNgus.get(i).getMaSinhVien().equals(maSinhVien)) {
//                sinhVienNgoaiNgus.remove(sinhVienNgoaiNgus.get(i));
//            }
//        }
//    }
//
//    @Override
//    public void search() {
//
//    }
//    public List<SinhVienNgoaiNgu> covertStringToSinhVienNgoaiNgu() {
//        List<String> stringList = FileWriterReader.readFile(PATH);
//        List<SinhVienThongTin> sinhVienThongTinList = new ArrayList<>();
//        String[] arrSinhVienThongTin;
//        for (String line : stringList) {
//            arrSinhVienThongTin = line.split(",");
//            sinhVienThongTinList.add(new TaiKhoanThanhToan(arrSinhVienThongTin[0], arrSinhVienThongTin[1], arrSinhVienThongTin[2],
//                    Integer.parseInt(arrSinhVienThongTin[3]),arrSinhVienThongTin[4]));
//        }
//        return sinhVienThongTinList;
//    }
//
//
//    public List<String> covertSinhVienThongTinToString() {
//        List<String> listString = new ArrayList<>();
//        for (SinhVienThongTin sinhVienThongTin : sinhVienThongTins) {
//            listString.add(sinhVienThongTin.toString());
//        }
//        return listString;
//    }
//
//    }
//
