//package thi_thu_lan_1.controllers;
//
//import thi_thu_lan_1.models.SinhVienNgoaiNgu;
//import thi_thu_lan_1.services.impl.SinhVienNgoaiNguServiceImpl;
//import thi_thu_lan_1.services.impl.SinhVienThongTinServiceImpl;
//
//import java.util.Scanner;
//
//public class Menu {
//    public void displayMenu() {
//        SinhVienThongTinServiceImpl sinhVienThongTinServiceImpl = new SinhVienThongTinServiceImpl();
//        SinhVienNgoaiNguServiceImpl sinhVienNgoaiNguServiceImpl = new SinhVienNgoaiNguServiceImpl();
//
//        int choice= 0;
//        Scanner scanner = new Scanner(System.in);
//        while (choice != 6) {
//            System.out.println("CHƯƠNG TRÌNH QUẢN LÍ SINH VIÊN--");
//            System.out.println("Mời nhập từ 1 đến 5 để chọn chức năng");
//            System.out.println("1. Thêm mới");
//            System.out.println("2. Sửa");
//            System.out.println("3. Xóa");
//            System.out.println("4. Tìm kiếm");
//            System.out.println("5. Hiển Thị");
//            System.out.println("6. Thoát");
//            choice = scanner.nextInt();
//            switch (choice) {
//                case 1:
//                    System.out.println("=====================================");
//                    sinhVienNgoaiNguServiceImpl.add();
//                    sinhVienThongTinServiceImpl.add();
//                    System.out.println("=====================================");
//                    break;
//                case 2:
//                    System.out.println("=====================================");
//                    System.out.println("Nhập mã sinh viên để tìm");
//                    Scanner scanner1 = new Scanner(System.in);
//                    String maSinhVien1 = scanner1.nextLine();
//                    sinhVienNgoaiNguServiceImpl.edit(maSinhVien1);
//                    sinhVienThongTinServiceImpl.edit(maSinhVien1);
//                    System.out.println("=====================================");
//                    break;
//                case 3:
//                    System.out.println("=====================================");
//                    System.out.println("Nhập mã sinh viên");
//                    Scanner scanner2 = new Scanner(System.in);
//                    String maSinhVien = scanner2.nextLine();
//                    sinhVienNgoaiNguServiceImpl.delete(maSinhVien);
//                    sinhVienThongTinServiceImpl.delete(maSinhVien);
//                    System.out.println("=====================================");
//                    break;
//                case 4:
//                    System.out.println("=====================================");
//                    System.out.println("4. Tìm kiếm");
//                    System.out.println("=====================================");
//                    break;
//                case 5:
//                    System.out.println("=====================================");
//                    sinhVienThongTinServiceImpl.display();
//                    sinhVienNgoaiNguServiceImpl.display();
//                    System.out.println("=====================================");
//                    break;
//                case 6:
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.println("Chọn 1 đến 6 thôi ba");
//                    break;
//
//
//            }
//        }
//    }
//}
