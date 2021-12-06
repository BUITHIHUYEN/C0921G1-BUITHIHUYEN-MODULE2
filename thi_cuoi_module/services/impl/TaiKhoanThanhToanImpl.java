package thi_cuoi_module.services.impl;


import case_study.readwrite.FileWriterReader;
import thi_cuoi_module.common.writeread.ReadWrite;
import thi_cuoi_module.models.TaiKhoanThanhToan;
import thi_cuoi_module.services.TaiKhoanThanhToanService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaiKhoanThanhToanImpl implements TaiKhoanThanhToanService {
    final String PATH ="D:\\CODEGYMMODULE2\\C0921G1-BUITHIHUYEN-MODULE2\\src\\thi_cuoi_module\\common\\data\\taikhoanthanhtoan.csv";
    static List<TaiKhoanThanhToan> taiKhoanThanhToans = new ArrayList<>();

     {
        taiKhoanThanhToans = covertStringToTaiKhoanThanhToan();
//        taiKhoanThanhToans.add(new TaiKhoanThanhToan("003456783", "Nguyen Van Binh", "04/05/2020", 9704230, 5000000));
//        taiKhoanThanhToans.add(new TaiKhoanThanhToan("003456791", "Tran Xuan Hao", "01/05/2020", 97042303, 7000000));
//        taiKhoanThanhToans.add(new TaiKhoanThanhToan("003254862", "Nguyen Thai Hai", "12/07/2020", 97442430, 11500000));
//        taiKhoanThanhToans.add(new TaiKhoanThanhToan("002547891", "Tran Thi Xuan", "01/06/2020", 9712233, 70000000));

    }

    Scanner scanner = new Scanner(System.in);

    //    String maTaiKhoan, String tenChuTaiKhoan, String ngayTaoTaiKhoan, String soThe, int soTienTrongTaiKhoan
    @Override
    public void add() {
        TaiKhoanThanhToan taiKhoanThanhToan = new TaiKhoanThanhToan();
        System.out.println("Nhap ma tai khoan");
        taiKhoanThanhToan.setMaTaiKhoan(scanner.nextLine());
        System.out.println("Nhap tên chủ tài khoản");
        taiKhoanThanhToan.setTenChuTaiKhoan(scanner.nextLine());
        System.out.println("Nhap NGÀY tạo tài khoản");
        taiKhoanThanhToan.setNgayTaoTaiKhoan(scanner.nextLine());
        System.out.println("Nhap số thẻ");
        taiKhoanThanhToan.setSoThe(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhap số tiền trong tài khoản");
        taiKhoanThanhToan.setSoTienTrongTaiKhoan(Integer.parseInt(scanner.nextLine()));
        taiKhoanThanhToans.add(taiKhoanThanhToan);
        display();
        List<String> stringList = covertTaiKhoanThanhToanToString();
        ReadWrite.writeFile(PATH, stringList, false);
    }

    @Override
    public void display() {
        int maID = 1;
        for (TaiKhoanThanhToan taiKhoanThanhToan : taiKhoanThanhToans) {
            System.out.print(maID++ + "--");
            System.out.println(taiKhoanThanhToan);
        }

    }

    @Override
    public void delete(String maTaiKhoan) {
        for (int i = 0; i < taiKhoanThanhToans.size(); i++) {
            if (taiKhoanThanhToans.get(i).getMaTaiKhoan().equals(maTaiKhoan)) {
                taiKhoanThanhToans.remove(taiKhoanThanhToans.get(i));
            }
        }

    }
//    public void checkTaiKhoanThanhToan(String maTaiKhoan){
//        for (TaiKhoanThanhToan taiKhoanThanhToan:taiKhoanThanhToans) {
//            if (taiKhoanThanhToan.getMaTaiKhoan())
//
//        }

//    }

    @Override
    public void search(String maTaiKhoan) {
        for (int i = 0; i < taiKhoanThanhToans.size(); i++) {
            if (taiKhoanThanhToans.get(i).getMaTaiKhoan().equals(maTaiKhoan)) {
                System.out.println(taiKhoanThanhToans.get(i));
            }

        }
    }
    public List<TaiKhoanThanhToan> covertStringToTaiKhoanThanhToan() {
        List<String> stringList = FileWriterReader.readFile(PATH);
        List<TaiKhoanThanhToan> taiKhoanThanhToanList = new ArrayList<>();
        String[] arrTaiKhoanThanhToan;
        for (String line : stringList) {
            arrTaiKhoanThanhToan = line.split(",");
            taiKhoanThanhToanList.add(new TaiKhoanThanhToan(arrTaiKhoanThanhToan[0], arrTaiKhoanThanhToan[1], arrTaiKhoanThanhToan[2],
                    Integer.parseInt(arrTaiKhoanThanhToan[3]), Integer.parseInt(arrTaiKhoanThanhToan[4])));
        }
        return taiKhoanThanhToanList;
    }


    public List<String> covertTaiKhoanThanhToanToString() {
        List<String> listString = new ArrayList<>();
        for (TaiKhoanThanhToan taiKhoanThanhToan : taiKhoanThanhToans) {
            listString.add(taiKhoanThanhToan.toString());
        }
        return listString;
    }
}
