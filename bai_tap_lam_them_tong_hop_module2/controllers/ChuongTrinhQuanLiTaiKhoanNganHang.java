package bai_tap_lam_them_tong_hop_module2.controllers;

import java.util.Scanner;

public class ChuongTrinhQuanLiTaiKhoanNganHang {
    public void menu () {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        while (choice!=5) {
            System.out.println("1. Thêm mới");
            System.out.println("2. Xóa");
            System.out.println("3. Xem danh sách các tài khoản ngân hàng");
            System.out.println("4. Tìm kiếm");
            System.out.println("5. Thoát");
            System.out.println("Nhập từ 1 đến 5 để chọn chức năng");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    int choice1 = 0;
                    while (choice1 !=3) {
                        System.out.println("thêm tài khoản tiết kiệm");
                        System.out.println("thêm tài khoản thanh toán");
                        System.out.println("quay lại menu chính");
                        System.out.println("nhập từ 1 đến 3 để thực hiện");
                        choice1 = scanner.nextInt();
                        switch (choice1){
                        }
                        break;
                    }
                    break;
                case 2:
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("nhập mã tài khoản ngân hàng cần xóa");

            }
        }
    }
}
