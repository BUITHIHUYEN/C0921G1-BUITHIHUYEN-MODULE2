package baiThiThu.controllers;

import baiThiThu.service.SinhVienNgoaiNguImpl;
import baiThiThu.service.SinhVienThongTinImpl;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        SinhVienThongTinImpl sinhVienThongTin = new SinhVienThongTinImpl();
        SinhVienNgoaiNguImpl sinhVienNgoaiNgu = new SinhVienNgoaiNguImpl();
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        while (choice != 6) {
            System.out.println("Nhập từ 1 đến 6 để chọn chức năng: ");
            System.out.println("1. thêm");
            System.out.println("2. sửa");
            System.out.println("3. xóa");
            System.out.println("4. hiển thị");
            System.out.println("5. tìm kiếm");
            System.out.println("6. exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    int choice1 = 0;
                    while (choice1 != 3) {
                        System.out.println("Nhập từ 1 đến 3 để chọn chức năng: ");
                        System.out.println("1. thêm thông tin");
                        System.out.println("2. thêm ngoại ngữ");
                        System.out.println("3. return menu");
                        choice1 = Integer.parseInt(scanner.nextLine());
                        switch (choice1) {
                            case 1:
                                System.out.println("========================================");
                                sinhVienThongTin.them();
                                System.out.println("=========================================");
                                break;
                            case 2:
                                System.out.println("===========================================");
                                sinhVienNgoaiNgu.them();
                                System.out.println("=============================================");
                                break;
                            case 3:
                                break;
                        }

                    }
                    break;
                case 2:
                    int choice2 = 0;
                    while (choice2 != 3) {
                        System.out.println("Nhập từ 1 đến 3 để chọn chức năng: ");
                        System.out.println("1. sửa thông tin");
                        System.out.println("2. sữa ngoại ngữ");
                        System.out.println("3. return menu");
                        choice2 = Integer.parseInt(scanner.nextLine());
                        switch (choice2) {
                            case 1:
                                System.out.println("========================================");
                                System.out.println("1. sửa thông tin");
                                System.out.println("=========================================");
                                break;
                            case 2:
                                System.out.println("===========================================");
                                System.out.println("2. sữa ngoại ngữ");
                                System.out.println("=============================================");
                                break;
                            case 3:
                                break;
                        }

                    }
                    break;
                case 3:
                    int choice3 = 0;
                    while (choice3 != 3) {
                        System.out.println("Nhập từ 1 đến 3 để chọn chức năng: ");
                        System.out.println("1. xóa thông tin");
                        System.out.println("2. xóa ngoại ngữ");
                        System.out.println("3. return menu");
                        choice3 = Integer.parseInt(scanner.nextLine());
                        switch (choice3) {
                            case 1:
                                System.out.println("========================================");
                                Scanner scanner2 = new Scanner(System.in);
                                System.out.println("Nhập mã sinh viên cần xóa");
                                String maSinhVien = scanner2.nextLine();
                                System.out.println("1.yes");
                                System.out.println("2.no");
                                String choice9 = scanner2.nextLine();
                                if (choice9.equals( "yes")){
                                    sinhVienThongTin.xoa(maSinhVien);
                                    System.err.println("Đã Xóa Thành Công");
                                    break;
                                }else if (choice9.equals( "no")){
                                    break;
                                }
                                System.out.println("=========================================");
                                break;
                            case 2:
                                System.out.println("===========================================");

                               Scanner scanner1 = new Scanner(System.in);
                                System.out.println("Nhập mã sinh viên cần xóa");
                               String maSinhVien1 = scanner1.nextLine();
                                System.out.println("1.yes");
                                System.out.println("2.no");
                                String choice10 = scanner1.nextLine();
                                if (choice10.equals( "yes")){
                                    sinhVienNgoaiNgu.xoa(maSinhVien1);
                                    System.err.println("Đã Xóa Thành Công");
                                    break;
                                }else if (choice10.equals( "no")){
                                    break;
                                }

                                System.out.println("=============================================");
                                break;
                            case 3:
                                break;
                        }

                    }
                    break;
                case 4:
                    System.out.println("Sinh Viên Ngoại NGữ");
                   sinhVienNgoaiNgu.disPlay();
                    System.out.println("Sinh Viên Thông tin");
                    sinhVienThongTin.disPlay();
                    break;
                case 5:
                    int choice4 = 0;
                    while (choice4 != 3) {
                        System.out.println("Nhập từ 1 đến 3 để chọn chức năng: ");
                        System.out.println("1. tìm kiếm thông tin");
                        System.out.println("2. tìm kiếm ngoại ngữ");
                        System.out.println("3. return menu");
                        choice4 = Integer.parseInt(scanner.nextLine());
                        switch (choice4) {
                            case 1:
                                System.out.println("========================================");
                                Scanner scanner1 = new Scanner(System.in);
                                System.out.println("Nhập tên hoặc mã sinh viên cần tìm kiếm ");
                                String timKiem = scanner1.nextLine();
                                sinhVienThongTin.timKiem(timKiem);
                                System.out.println("=========================================");
                                break;
                            case 2:
                                System.out.println("===========================================");
                                Scanner scanner2 = new Scanner(System.in);
                                System.out.println("Nhập tên hoặc mã sinh viên cần tìm kiếm ");
                                String timKie2 = scanner2.nextLine();
                                sinhVienThongTin.timKiem(timKie2);
                                System.out.println("=============================================");
                                break;
                            case 3:
                                break;
                        }

                    }
                    break;

                case 6 :
                    System.exit(0);
                    break;
            }
        }
    }
}

