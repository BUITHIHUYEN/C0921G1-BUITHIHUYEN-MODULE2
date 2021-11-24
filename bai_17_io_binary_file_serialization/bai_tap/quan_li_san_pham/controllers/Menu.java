package bai_17_io_binary_file_serialization.bai_tap.quan_li_san_pham.controllers;

import bai_17_io_binary_file_serialization.bai_tap.quan_li_san_pham.services.BycleServiceImpl;

import java.util.Scanner;

public class Menu {
    public void displayNenu() {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        while (choice != 4) {
            System.out.println("Nhập 1 đến 4 để chọn chức năng:");
            System.out.println("1. Thêm");
            System.out.println("2. Hiển thị");
            System.out.println("3. Tìm kiếm thông tin");
            System.out.println("4. Thoát");
            choice = scanner.nextInt();
            BycleServiceImpl myBycleSerivices = new BycleServiceImpl();
            switch (choice) {
                case 1:
                    System.out.println("==================================");
                    myBycleSerivices.add();
                    System.out.println("===================================");
                    break;
                case 2:
                    System.out.println("====================================");
                    myBycleSerivices.display();
                    System.out.println("=====================================");
                    break;
                case 3:
                    System.out.println("========================================");
//                    myBycleSerivices.search();
                    System.out.println("=======================================");
                    break;
                default:
                    break;

            }


        }
    }
}
