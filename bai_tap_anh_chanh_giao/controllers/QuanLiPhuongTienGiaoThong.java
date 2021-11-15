package bai_tap_anh_chanh_giao.controllers;

import java.util.Scanner;

public class QuanLiPhuongTienGiaoThong {
    public void menu() {
        int choice = 0;
        while (choice != 4) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Thêm mới phương tiện");
            System.out.println("2. Hiển thị phương thiện");
            System.out.println("3. Xóa phương tiện");
            System.out.println("4. Thoát");
            System.out.println("Nhấn từ 1 đến 4 để chọn chức năng");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    int choice1 = 0;
                    while (choice1 != 4) {
                        System.out.println("1. Thêm xe tải");
                        System.out.println("2. Thêm ô tô");
                        System.out.println("3. Thêm xe máy");
                        System.out.println("4. Trở về menu chính");
                        choice1 = scanner.nextInt();
                    }
                    break;
                case 2:
                    int choice2 = 0;
                    while (choice2 != 4) {
                        System.out.println("1. Hiển thị xe tải");
                        System.out.println("2. Hiển thị ô tô");
                        System.out.println("3. Hiển thị xe máy");
                        System.out.println("4. Trở về menu chính");
                        System.out.println("nhập từ 1 đến 4 để hiển thị");
                        choice2 = scanner.nextInt();
                    }
                    break;
                case 3:
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Nhập biển kiểm soát");
                    break;
            }

        }
    }
}
