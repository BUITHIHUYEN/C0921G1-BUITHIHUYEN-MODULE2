package thi_cuoi_module.controllers;

import thi_cuoi_module.services.TaiKhoanTietKiemService;
import thi_cuoi_module.services.impl.TaiKhoanThanhToanImpl;
import thi_cuoi_module.services.impl.TaiKhoanTietKiemImpl;

import java.util.Scanner;

public class Menu {
    public void displayMenu() {
        TaiKhoanThanhToanImpl taiKhoanThanhToanImpl = new TaiKhoanThanhToanImpl();
        TaiKhoanTietKiemImpl taiKhoanTietKiemImpl = new TaiKhoanTietKiemImpl();
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        menu:
        while (choice != 5) {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÍ TÀI KHOẢN NGÂN HÀNG--");
            System.out.println("Mời nhập từ 1 đến 5 để chọn chức năng");
            System.out.println("1. Thêm mới");
            System.out.println("2. Xóa");
            System.out.println("3. Xem danh sách tài khoản ngân hàng");
            System.out.println("4. Tìm kiếm");
            System.out.println("5. Thoát");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("=====================================");
                    taiKhoanThanhToanImpl.add();
                    taiKhoanTietKiemImpl.add();
                    System.out.println("======================================");
                    break;
                case 2:
                    System.out.println("======================================");

                    System.out.println("Mời nhập mã tài khoản cần tìm để xóa:");
                    Scanner scanner1 = new Scanner(System.in);
                    String taiKhoanTT = scanner1.nextLine();
                    taiKhoanThanhToanImpl.delete(taiKhoanTT);
                    taiKhoanTietKiemImpl.delete(taiKhoanTT);
                    System.out.println("========================================");
                    break;
                case 3:
                    System.out.println("========================================");
                    taiKhoanThanhToanImpl.display();
                    taiKhoanTietKiemImpl.display();
                    System.out.println("===================================");
                    break;
                case 4:
                    System.out.println("========================================");
                    Scanner scanner2 = new Scanner(System.in);
                    String taiKhoanTT1 = scanner2.nextLine();
                    System.out.println("Mời nhập tên cần tìm kiếm:");
                    taiKhoanThanhToanImpl.search(taiKhoanTT1);
                    taiKhoanTietKiemImpl.search(taiKhoanTT1);
                    System.out.println("===================================");
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhập lại đi");
                    break;
            }
        }

    }
}
