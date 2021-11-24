package bai_lam_them_1.services.impl;

import bai_lam_them_1.models.TaiKhoanThanhToan;
import bai_lam_them_1.services.TaiKhoanNganHangServices;
import introduction_to_java.thuc_hanh.SystemTime;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Validate;

import java.util.ArrayList;
import java.util.Scanner;

public class TaiKhoanThanhToanServiceImpl implements TaiKhoanNganHangServices {

    static ArrayList<TaiKhoanThanhToan> taiKhoanThanhToans = new ArrayList<>();

    static {
        taiKhoanThanhToans.add(new TaiKhoanThanhToan("003456783", "Nguyen Van Binh", "04/05/2020", "9704230370093591", 5000000));
        taiKhoanThanhToans.add(new TaiKhoanThanhToan("003456791", "Tran Xuan Hao", "01/05/2020", "9704230370093777", 7000000));
        taiKhoanThanhToans.add(new TaiKhoanThanhToan("003254862", "Nguyen Thai Hai", "12/07/2020", "97442430370293592", 11500000));
        taiKhoanThanhToans.add(new TaiKhoanThanhToan("002547891", "Tran Thi Xuan", "01/06/2020", "9712233377793779", 70000000));
    }

    Scanner sc = new Scanner(System.in);

    @Override
    public void add() {
        TaiKhoanThanhToan taiKhoanThanhToan = new TaiKhoanThanhToan();
        System.out.println("Mời bạn nhập mã thanh toán");
        taiKhoanThanhToan.setMaTaiKhoan(sc.nextLine());
        System.out.println("Mời bạn nhập tên chủ tài khoản ");
        taiKhoanThanhToan.setTenChuTaiKhoan(sc.nextLine());

    }

    @Override
    public void delete() {

    }

    @Override
    public void display() {
        int iD = 0;
        for (int i= 0; i<taiKhoanThanhToans.size();i++){
            System.out.println(iD++);
        }
        for (TaiKhoanThanhToan taikhoanthahtoan:taiKhoanThanhToans) {
            System.out.println(taikhoanthahtoan);

        }

    }

    @Override
    public void search() {

    }

    @Override
    public void exit() {

    }
}
