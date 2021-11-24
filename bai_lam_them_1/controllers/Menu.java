package bai_lam_them_1.controllers;

import java.util.Scanner;

public class Menu {
    public void displayMenu() {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        while (choice != 5) {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÍ TÀI KHOẢN NGÂN HÀNG--");
            System.out.println("Chọn chức năng theo số để tiếp tục : ");
            System.out.println("1. Thêm mới");
            System.out.println("2. Xóa ");
            System.out.println("3. Xem danh sách các tài khoản ");
            System.out.println("4. Tìm kiếm ");
            System.out.println("5. Thoát");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    int choice1 = 0;
                    while (choice1!=3){
                        System.out.println("Nhập 1 đến 3 để chọn mục hiển thị :");
                        System.out.println("1. Tài khoản thanh toán");
                        System.out.println("2. Tài khoản tiết kiệm");
                        System.out.println("3. Thoát");
                        choice1 = scanner.nextInt();
                        switch (choice1){
                            case 1:

                        }
                    }
                    break;
                case 2:
                    System.out.println("====================================================");
                    System.out.println("2. Xóa");
                    System.out.println("=====================================================");
                    break;
                case 3 :
                    System.out.println("======================================================");
                    System.out.println("3. Xem danh sách các tài khoản");
                    System.out.println("=======================================================");
                    break;
                case 4 :
                    System.out.println("=======================================================");
                    System.out.println("4. Tìm kiếm");
                    System.out.println("=========================================================");
                    break;
                case 5:
                    System.out.println("=========================================================");
                    System.out.println("5. Thoát");
                    System.out.println("=========================================================");
                    break;

            }


        }
    }
}
