package thi_cuoi_module.utils;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {
    Scanner scanner = new Scanner(System.in);
    public Integer soTienGuiTietKiem() {
        while (true) {
            try {
                System.out.println("Mời nhập số tiền gửi tiết kiệm");
                int soTienGuiTietKiem = Integer.parseInt(scanner.nextLine());
                if (soTienGuiTietKiem > 0) {
                    return soTienGuiTietKiem;
                }else if (soTienGuiTietKiem<1){
                    System.out.println("nhập số lớn hơn 0");
                } else {
                    throw new Exception();
                }
            } catch (Exception exception) {
                System.out.println("Không được nhập chữ");
            }
        }
    }
    public Integer soThe() {
        while (true) {
            try {
                System.out.println("Mời nhập số thẻ");
                int soThe = Integer.parseInt(scanner.nextLine());
                if (soThe > 0) {
                    return soThe;
                } else if (soThe < 1) {
                    System.out.println("nhập số lớn hơn 0");
                } else {
                    throw new Exception();
                }
            } catch (Exception exception) {
                System.out.println("Không được nhập chữ");
            }
        }
    }
    public Integer soTienTrongTaiKhoan() {
        while (true) {
            try {
                System.out.println("Mời nhập số tiền trong tài khoản");
                int soThe = Integer.parseInt(scanner.nextLine());
                if (soThe > 0) {
                    return soTienTrongTaiKhoan();
                } else if (soTienTrongTaiKhoan() < 1) {
                    System.out.println("nhập số lớn hơn 0");
                } else {
                    throw new Exception();
                }
            } catch (Exception exception) {
                System.out.println("Không được nhập chữ");
            }
        }
    }

}
