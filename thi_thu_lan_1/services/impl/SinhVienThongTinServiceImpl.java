//package thi_thu_lan_1.services.impl;
//
//import thi_cuoi_module.models.TaiKhoanThanhToan;
//import thi_thu_lan_1.common.FileWriterReader;
//import thi_thu_lan_1.models.SinhVienThongTin;
//import thi_thu_lan_1.services.SinhVienThongTinService;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class SinhVienThongTinServiceImpl implements SinhVienThongTinService {
//    final String PATH = "D:\\CODEGYMMODULE2\\C0921G1-BUITHIHUYEN-MODULE2\\src\\thi_thu_lan_1\\common\\data\\sinhvienthongtin.csv";
//    static List<SinhVienThongTin> sinhVienThongTins = new ArrayList<>();
//
//    {
//        sinhVienThongTins = covertStringToSinhVienThongTin();
////        sinhVienThongTins.add(new SinhVienThongTin("11","22","33",245,"44"));
////        sinhVienThongTins.add(new SinhVienThongTin("12","23","34",246,"45"));
////        sinhVienThongTins.add(new SinhVienThongTin("14","24","35",255,"44"));
//    }
//
//    Scanner scanner = new Scanner(System.in);
//
//    //    String maSinhVien, String tenSinhVien, String ngayNhapHoc, int tienHocPhi, String ngayRaTruong)
//    @Override
//    public void add() {
//        SinhVienThongTin sinhVienThongTin = new SinhVienThongTin();
//        System.out.println("Nhập mã sinh viên");
//        sinhVienThongTin.setMaSinhVien(scanner.nextLine());
//        System.out.println("Nhập tên sinh viên");
//        sinhVienThongTin.setTenSinhVien(scanner.nextLine());
//        System.out.println("Nhập ngày nhập học");
//        sinhVienThongTin.setNgayNhapHoc(scanner.nextLine());
//        System.out.println("Nhập tiền học phí");
//        sinhVienThongTin.setTienHocPhi(Integer.parseInt(scanner.nextLine()));
//        System.out.println("Nhập ngày ra trường");
//        sinhVienThongTin.setNgayRaTruong(scanner.nextLine());
//        sinhVienThongTins.add(sinhVienThongTin);
//        display();
//        List<String> stringList = covertSinhVienThongTinToString();
//        FileWriterReader.writeFile(PATH, stringList, false);
//    }
//
//    @Override
//    public void edit(String maSinhVien) {
//        for (int i = 0; i < sinhVienThongTins.size(); i++) {
//            if (sinhVienThongTins.get(i).getMaSinhVien().equals(maSinhVien)) {
//                System.out.println("Mã sinh viên");
//                sinhVienThongTins.get(i).setMaSinhVien(scanner.nextLine());
//                System.out.println("Tên sinh viên");
//                sinhVienThongTins.get(i).setTenSinhVien(scanner.nextLine());
//                System.out.println("Ngày nhập học");
//                sinhVienThongTins.get(i).setNgayNhapHoc(scanner.nextLine());
//                System.out.println("Tiền học phí");
//                sinhVienThongTins.get(i).setTienHocPhi(Integer.parseInt(scanner.nextLine()));
//                System.out.println("Ngày ra trường");
//                sinhVienThongTins.get(i).setNgayRaTruong(scanner.nextLine());
//            }
//        }
//    }
//
//    @Override
//    public void display() {
//        int maID = 1;
//
//        for (SinhVienThongTin sinhVienThongTin : sinhVienThongTins) {
//            System.out.print(maID++ + "--");
//            System.out.println(sinhVienThongTin);
//        }
//
//    }
//
//    @Override
//    public void delete(String maSinhVien) {
//        for (int i = 0; i < sinhVienThongTins.size(); i++) {
//            if (sinhVienThongTins.get(i).getMaSinhVien().equals(maSinhVien)) {
//                sinhVienThongTins.remove(sinhVienThongTins.get(i));
//            }
//        }
//    }
//
//    @Override
//    public void search() {
//
//    }
//
//    public List<SinhVienThongTin> covertStringToSinhVienThongTin() {
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
//}
